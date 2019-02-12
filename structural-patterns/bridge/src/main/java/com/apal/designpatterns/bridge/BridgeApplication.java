package com.apal.designpatterns.bridge;

import com.apal.designpatterns.bridge.device.Device;
import com.apal.designpatterns.bridge.device.Radio;
import com.apal.designpatterns.bridge.device.Tv;
import com.apal.designpatterns.bridge.remote.AdvancedRemote;
import com.apal.designpatterns.bridge.remote.BasicRemote;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class BridgeApplication {

	public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
	}


	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();

		System.out.println("Tests with advanced remote.");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}

}

