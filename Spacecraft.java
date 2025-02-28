package com.spacecraftsimtest;

import javafx.geometry.Point2D;

/**
 * @author Retrostorm
 */
public class Spacecraft {
    /**
     * Mass of the spacecraft. Cannot be changed in this simulator.
     */
    private double mass;

    /**
     * Velocity of the spacecraft represented by a vector stored in a point 2d (x component, y component).
     */
    private Point2D velocity;

    /**
     * Position of the spacecraft.
     */
    private Point2D position;

    /**
     * Constructs new spacecraft with given mass, given x and y components for velocity, 
     * and given x and y coordinates for position.
     */
    public Spacecraft(double mass, double velocityX, double velocityY, double positionX, double positionY) {
        this.mass = mass;
        this.velocity = new Point2D(velocityX, velocityY);
        this.position = new Point2D(positionX, positionY);
    }

    /**
     * Gets the mass of this spacecraft.
     * @return mass of spacecraft
     */
    public double getMass() {
        return mass;
    }

    /**
     * Gets the velocity of this spacecraft.
     * @return velocity vector of spacecraft
     */
    public Point2D getVelocity () {
        return new Point2D(velocity.getX(), velocity.getY());
    }

    /**
     * Gets the position of this spacecraft.
     * @return position point of spacecraft
     */
    public Point2D getPosition() {
        return new Point2D(position.getX(), position.getY());
    }

    /**
     * Sets the mass of this spacecraft to given value.
     * @param mass Desired mass of spacecraft
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * Sets the velocity of this spacecraft to given vector.
     * @param velocity Desired velocity vector of spacecraft
     */
    public void setVelocity(Point2D velocity) {
        this.velocity = velocity;
    }

    /**
     * Sets the position of this spacecraft to given point.
     * @param position Desired position point of spacecraft
     */
    public void setPosition(Point2D position) {
        this.position = position;
    }
    
    /**
     * Spacecraft trajectory is simulated for one hour.
     * Gravity of planets and sun, previous velocity, mass of spacecraft, and previous position accounted for.
     */
    public void simulateSpacecraft() {
    	//TODO
    }
}
