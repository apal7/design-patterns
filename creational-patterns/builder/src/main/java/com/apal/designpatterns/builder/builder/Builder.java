package com.apal.designpatterns.builder.builder;


import com.apal.designpatterns.builder.car.Type;
import com.apal.designpatterns.builder.component.Engine;
import com.apal.designpatterns.builder.component.GPSNavigator;
import com.apal.designpatterns.builder.component.Transmission;
import com.apal.designpatterns.builder.component.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
