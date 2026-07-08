package com.cts.mockito;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    // Used in Exercises 1 & 2
    public String fetchData() {
        return api.getData();
    }

    // Used in Exercise 3
    public String fetchData(String name) {
        return api.getData(name);
    }
}