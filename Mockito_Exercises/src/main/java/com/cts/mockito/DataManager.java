package com.cts.mockito;

public class DataManager {

    private DataService dataService;

    public DataManager(DataService dataService) {
        this.dataService = dataService;
    }

    public String fetchData() {
        return dataService.getData();
    }
}