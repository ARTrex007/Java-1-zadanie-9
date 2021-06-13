package com.company;

import java.time.LocalDateTime;;

public class Human
{
    public boolean equals(Object obj)
    {
        return this.wiek == ((Human)obj).wiek;
    }

    public int hashCode()
    {
        return this.wiek;
    }

    public String imie, nazwisko, zawod, animal_pet;
    public int wiek;
    public double masa;
    public String samochod;
    public static int counter=0;

    private double salary;

    void Get_Salary()
    {
        System.out.println("Obecne wynagrodzenie: " + salary);
        System.out.println("Data operacji: " + LocalDateTime.now());
    }

    void Set_Salary(double salary)
    {
        if(salary>0)
        {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Prosimy o odebranie aneksu do umowy od Pani Katarzyny z kadr");
            System.out.println("ZUS i US już wiedzą...");
            this.salary = salary;
        }
        else
            System.out.println("Wypłata nie może być ujemna!");
    }

    public Human(String imie, String nazwisko, String zawod, int wiek, double masa, double salary) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.zawod = zawod;
        this.wiek = wiek;
        this.masa = masa;
        this.salary = salary;


        //this.animal_pet = animal_pet;
        System.out.println("Utworzono obiekt HUMAN numer: " + counter);
        counter++;
    }

    public String toString()
    {
        return imie+" "+nazwisko+" "+zawod+" "+wiek+" "+masa;
    }

    void Rejestracja_Samochodu(String samochod)
    {
        this.samochod = samochod;
        System.out.println(imie + " " + nazwisko + " posiadł samochód o rejestracji: " + this.samochod);
    }
}
