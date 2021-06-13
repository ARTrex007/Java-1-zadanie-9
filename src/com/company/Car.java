package com.company;

public class Car
{
    public enum marki
    {
        Ford, Mitsubishi, Opel, Peugeot
    }

    public final String model, producer;
    public String rejestracja;
    public int ilosc_drzwi, pojemnosc;

    public static int counter=0;

    public Car(String model, String producer,String rejestracja, int ilosc_drzwi, int pojemnosc)
    {
        this.model = model;
        this.producer = producer;
        this.rejestracja = rejestracja;
        this.ilosc_drzwi = ilosc_drzwi;
        this.pojemnosc = pojemnosc;

        System.out.println("Utworzono obiekt CAR numer: " + counter);
        counter++;
    }

    public String toString()
    {
        return model+" "+producer+" "+rejestracja+" "+ilosc_drzwi+" "+pojemnosc;
    }

    void Czy_Marka(marki f)
    {
        switch(f)
        {
            case Ford:
            {
                if(this.producer == "Ford")
                    System.out.println("Tak, podany samochód to " + f);
                else
                    System.out.println("Nie, podany samochód to nie " + f);
                break;
            }

            case Mitsubishi:
            {
                if(this.producer == "Mitsubishi")
                    System.out.println("Tak, podany samochód to " + f);
                else
                    System.out.println("Nie, podany samochód to nie " + f);
                break;
            }

            case Opel:
            {
                if(this.producer == "Opel")
                    System.out.println("Tak, podany samochód to " + f);
                else
                    System.out.println("Nie, podany samochód to nie " + f);
                break;
            }

            case Peugeot:
            {
                if(this.producer == "Peugeot")
                    System.out.println("Tak, podany samochód to " + f);
                else
                    System.out.println("Nie, podany samochód to nie " + f);
                break;
            }

            default:
                {
                System.out.println("Nie ma takiej marki w bazie");
                break;
            }
        }
    }
}
