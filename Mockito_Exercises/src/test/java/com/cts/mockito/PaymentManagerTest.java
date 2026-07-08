package com.cts.mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PaymentManagerTest {

    @Test
    void testVoidMethodWithException() throws Exception {

        // Create mock
        PaymentService mockService = Mockito.mock(PaymentService.class);

        // Stub the void method to throw an exception
        doThrow(new Exception("Payment Failed"))
                .when(mockService)
                .processPayment();

        // Create manager
        PaymentManager manager = new PaymentManager(mockService);

        // Verify exception is thrown
        assertThrows(Exception.class, () -> {
            manager.makePayment();
        });

        // Verify interaction
        verify(mockService).processPayment();
    }
}