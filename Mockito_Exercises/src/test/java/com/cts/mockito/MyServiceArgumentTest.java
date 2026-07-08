package com.cts.mockito;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceArgumentTest {

    @Test
    void testArgumentMatching() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        when(mockApi.getData(anyString())).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);

        service.fetchData("John");

        verify(mockApi).getData(anyString());
    }
}