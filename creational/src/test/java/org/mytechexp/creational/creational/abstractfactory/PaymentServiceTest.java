package org.mytechexp.creational.creational.abstractfactory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class PaymentServiceTest {

    @Mock
    private GlobalFactory mockGlobalFactory;

    @Mock
    private Invoice mockInvoice;

    private PaymentService paymentService;

    private static final double TEST_AMOUNT = 199.99;


    @BeforeEach
    void setUp() {
        // Create a new instance of the class under test before each test run,
        // injecting the mocks and the test data.
        paymentService = new PaymentService(mockGlobalFactory, mockInvoice, TEST_AMOUNT);
    }

    @Test
    @DisplayName("processCheckout should call factory to set payment and invoice to generate")
    void processCheckout_shouldDelegateToFactoryAndInvoice() {
        // Act: Call the method we want to test.
        paymentService.processCheckout();

        // Assert: Verify the expected interactions with the mock objects.

        // 1. Verify that the factory's setPayment method was called exactly once
        //    with the amount provided in the constructor.
        verify(mockGlobalFactory).setPayment(TEST_AMOUNT);

        // 2. Verify that the invoice's generate method was called exactly once.
        verify(mockInvoice).generate();

        // 3. (Optional but good practice) Verify that no other methods were called
        //    on our mocks, ensuring there are no side effects.
        verifyNoMoreInteractions(mockGlobalFactory, mockInvoice);
    }

}