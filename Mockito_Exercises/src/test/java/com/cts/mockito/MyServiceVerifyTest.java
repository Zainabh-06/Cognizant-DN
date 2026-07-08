package com.cts.mockito;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceVerifyTest {

    @Test
    void testVerifyInteraction() {

        // Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Inject mock into service
        MyService service = new MyService(mockApi);

        // Call the service method
        service.fetchData();

        // Verify that getData() was called
        verify(mockApi).getData();
    }
}