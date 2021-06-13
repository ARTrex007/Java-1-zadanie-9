package com.company;

public class Phone
{
    public String MODEL, MARKA;
    public double MASA;
    public static int counter=0;

    public Phone(String model, String marka, double masa)
    {
        MODEL = model;
        MARKA = marka;
        MASA = masa;
        System.out.println("Utworzono obiekt PHONE numer: " + counter);
        counter++;
    }

    public String toString()
    {
        return MODEL+" "+MARKA+" "+MASA;
    }
}
