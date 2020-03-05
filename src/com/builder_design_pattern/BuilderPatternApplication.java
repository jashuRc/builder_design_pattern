package com.builder_design_pattern;

public class BuilderPatternApplication {
	// Using builder to get the object in a single line of code and
	// without any inconsistent state or arguments management issues
	Computer computer = new Computer.ComputerBuilder("500 GB", "12 GB").setBluetoothEnabled(false)
			.setGraphicsCardEnabled(true).build();
}
