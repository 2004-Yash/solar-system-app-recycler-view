package com.android.solarsystem;

public class ClickedModel {

    private int core;
    private String distance;
    private String mass;
    private  String temperature;
    private String revolution;
    private String diameter;

    public int getCore() {
        return core;
    }

    public String getDistance() {
        return distance;
    }

    public String getMass() {
        return mass;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getRevolution() {
        return revolution;
    }

    public String getDiameter() {
        return diameter;
    }

    public ClickedModel(int core, String distance, String mass, String temperature, String revolution, String diameter) {
        this.core = core;
        this.distance = distance;
        this.mass = mass;
        this.temperature = temperature;
        this.revolution = revolution;
        this.diameter = diameter;
    }
}
