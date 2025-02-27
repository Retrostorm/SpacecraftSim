package com.spacecraftsim;

import javafx.geometry.Point2D;

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

    public Spacecraft(double mass, double velocityX, double velocityY, double positionX, double positionY) {
        this.mass = mass;
        this.velocity = new Point2D(velocityX, velocityY);
        this.position = new Point2D(positionX, positionY);
    }

    public double getMass() {
        return mass;
    }

    public Point2D getVelocity () {
        return new Point2D(velocity.getX(), velocity.getY());
    }

    public Point2D getPosition() {
        return new Point2D(position.getX(), position.getY());
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setVelocity(Point2D velocity) {
        this.velocity = velocity;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }
}
