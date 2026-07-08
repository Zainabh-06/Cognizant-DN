package com.cts.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DataManagerTest {

    @Test
    void testMultipleReturns() {

        // Create mock
        DataService mockService = Mockito.mock(DataService.class);

        // Stub multiple return values
        when(mockService.getData())
                .thenReturn("Data 1", "Data 2", "Data 3");

        // Create manager
        DataManager manager = new DataManager(mockService);

        // Verify consecutive returns
        assertEquals("Data 1", manager.fetchData());
        assertEquals("Data 2", manager.fetchData());
        assertEquals("Data 3", manager.fetchData());
    }
}