package com.kodilla.cabrio;

import java.util.Random;

public class Cabrio
{
    Random random = new Random();

    private String brand;
    private String model;
    private boolean isMoving = random.nextBoolean();
    private boolean roofOpen;

    public Cabrio(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public boolean isMoving()
    {
        return isMoving;
    }

    public void setMoving(boolean moving)
    {
        isMoving = random.nextBoolean();
    }

    public boolean isRoofOpen()
    {
        return roofOpen;
    }

    public void setRoofOpen(boolean roofOpen)
    {
        if (isMoving)
        {
            System.out.println("You Can't Open Roof While Moving!");
        }
        else
        {
            System.out.println("Opening Roof...");
            this.roofOpen = roofOpen;
        }
    }

    public String toString()
    {
        String s = brand + " " + model + " " + "Is Moving: " + isMoving + " " + "Roof Open: " + roofOpen;
        return s;
    }
}