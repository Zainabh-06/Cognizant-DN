package com.cts.mockito;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationManagerTest {

    @Test
    void testVoidMethod() {

        // Create mock
        NotificationService mockService =
                Mockito.mock(NotificationService.class);

        // Stub void method
        doNothing().when(mockService).sendNotification("Hello");

        // Create manager
        NotificationManager manager =
                new NotificationManager(mockService);

        // Call method
        manager.notifyUser("Hello");

        // Verify interaction
        verify(mockService).sendNotification("Hello");
    }
}