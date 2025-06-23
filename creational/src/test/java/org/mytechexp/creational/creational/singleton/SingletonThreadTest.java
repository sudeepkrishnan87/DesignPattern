package org.mytechexp.creational.creational.singleton;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.*;

class SingletonThreadTest {
    @Test
    //@DisplayName("getInstance() should return the same instance when called from multiple threads")
    void testGetInstance_isThreadSafe() throws Exception {
        // Arrange: A task that simply gets the singleton instance
        Callable<SingletonThread> task = SingletonThread::getInstance;

        // Create a list of these tasks to be executed concurrently
        int threadCount = 100;
        List<Callable<SingletonThread>> tasks = Collections.nCopies(threadCount, task);

        // Use a thread pool to execute the tasks
        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);

        // Act: Invoke all tasks and wait for them to complete
        List<Future<SingletonThread>> futures = executorService.invokeAll(tasks);

        // Assert: Verify that every thread received the exact same instance
        assertEquals(threadCount, futures.size(), "Should have one future result per task");

        // Get the first instance to use as the reference for comparison
        SingletonThread expectedInstance = futures.get(0).get();
        assertNotNull(expectedInstance, "The first instance should not be null");

        // Loop through the rest of the results and assert they are the same
        for (int i = 1; i < futures.size(); i++) {
            SingletonThread actualInstance = futures.get(i).get();
            assertSame(expectedInstance, actualInstance,
                    "All threads must receive the same singleton instance. Mismatch found at index " + i);
        }

        executorService.shutdown();
    }

}