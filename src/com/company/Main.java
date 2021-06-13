package com.company;


public class Main
{
    public static void main(String[] args)
    {
        Human human1 = new Human("Stefan", "Czarnecki", "Lekarz", 28, 73, 2500 );

        human1.Get_Salary();
        human1.Set_Salary(4000);
        human1.Get_Salary();
        human1.Set_Salary(-200);
    }
}