package org.mytechexp.creational.creational.prototype;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EmailWriterProxyTest {
    @Test
    void testShallowCloneReference() throws CloneNotSupportedException {
        EmailWriterProxy original = new EmailWriterProxy(true);
        original.setContent("Test Content");
        EmailWriterProxy clone = (EmailWriterProxy) original.clone();



        // Check that both proxies refer to different proxy objects
        assertNotSame(original, clone);
        assertSame(original.getContent(),clone.getContent());

        // Check that both proxies refer to different realEmailWriter objects (if deep clone is not implemented, this will fail)
        // If shallow clone, both will refer to the same realEmailWriter

    }
}