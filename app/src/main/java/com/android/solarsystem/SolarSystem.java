package com.android.solarsystem;

public class SolarSystem {

    private String planet;
    private String moons;
     private int planetImg;

    public SolarSystem(String planet, String moons, int planetImg) {
        this.planet = planet;
        this.moons = moons;
        this.planetImg = planetImg;
    }

    public String getPlanet() {
        return planet;
    }

    public String getMoons() {
        return moons;
    }

    public int getPlanetImg() {
        return planetImg;
    }
}
