package com.cts.mockito;

import static org.mockito.Mockito.inOrder;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class OrderManagerTest {

    @Test
    void testInteractionOrder() {

        // Create mock
        OrderService mockService = Mockito.mock(OrderService.class);

        // Create manager
        OrderManager manager = new OrderManager(mockService);

        // Call methods
        manager.processOrder();

        // Verify order
        InOrder order = inOrder(mockService);

        order.verify(mockService).stepOne();
        order.verify(mockService).stepTwo();
    }
}