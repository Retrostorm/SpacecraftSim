package com.spacecraftsimtest;

import javafx.geometry.Point2D;

public class SpacecraftTests {
	public static final double EPSILON = 0.0001;
	public static void main(String args[]) {
		System.out.println("Running constructorTest . . .\n" + constructorTest());
		System.out.println("Running settersTest . . .\n" + settersTest());
	}
	
	public static String constructorTest() {
		Spacecraft b = new Spacecraft(10.0, 1.0, 1.0, 1.0, 1.0);
		String testStr = "";
		
		if (Math.abs(b.getMass() - 10.0) > EPSILON) {
			testStr += "constructorTest: Mass is wrong. Expected 10.0 got " + b.getMass() + "\n";
		}
		if (Math.abs(b.getVelocity().getX() - 1.0) > EPSILON) {
			testStr += "constructorTest: VelocityX is wrong. Expected 1.0 got " + b.getVelocity().getX() + "\n";
		}
		if (Math.abs(b.getVelocity().getY() - 1.0) > EPSILON) {
			testStr += "constructorTest: VelocityY is wrong. Expected 1.0 got " + b.getVelocity().getY() + "\n";
		}
		if (Math.abs(b.getPosition().getX() - 1.0) > EPSILON) {
			testStr += "constructorTest: PositionX is wrong. Expected 1.0 got " + b.getPosition().getX() + "\n";
		}
		if (Math.abs(b.getPosition().getY() - 1.0) > EPSILON) {
			testStr += "constructorTest: PositionY is wrong. Expected 1.0 got " + b.getPosition().getY() + "\n";
		}
		
		testStr += "constructorTest complete";
		
		return testStr;
	}
	
	public static String settersTest() {
		Spacecraft b = new Spacecraft(9.0, 0.0, 0.0, 0.0, 0.0);
		String testStr = "";
		b.setMass(10.0);
		b.setVelocity(new Point2D(1.0, 1.0));
		b.setPosition(new Point2D(1.0, 1.0));
		
		if (Math.abs(b.getMass() - 10.0) > EPSILON) {
			testStr += "settersTest: Mass is wrong. Expected 10.0 got " + b.getMass() + "\n";
		}
		if (Math.abs(b.getVelocity().getX() - 1.0) > EPSILON) {
			testStr += "settersTest: VelocityX is wrong. Expected 1.0 got " + b.getVelocity().getX() + "\n";
		}
		if (Math.abs(b.getVelocity().getY() - 1.0) > EPSILON) {
			testStr += "settersTest: VelocityY is wrong. Expected 1.0 got " + b.getVelocity().getY() + "\n";
		}
		if (Math.abs(b.getPosition().getX() - 1.0) > EPSILON) {
			testStr += "settersTest: PositionX is wrong. Expected 1.0 got " + b.getPosition().getX() + "\n";
		}
		if (Math.abs(b.getPosition().getY() - 1.0) > EPSILON) {
			testStr += "settersTest: PositionY is wrong. Expected 1.0 got " + b.getPosition().getY() + "\n";
		}
		
		testStr += "settersTest complete";
		
		return testStr;
	}
}
