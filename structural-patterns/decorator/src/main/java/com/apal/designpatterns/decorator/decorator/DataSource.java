package com.apal.designpatterns.decorator.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}

