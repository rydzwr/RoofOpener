package com.kodilla.cabrio;


import java.util.ArrayList;

public class CabrioApplication
{

    public static void main(String[] args)
    {
        while (true)
        {
            Cabrio cabrio = new Cabrio("Random Brand", "Random Model");
            System.out.println(cabrio);
            cabrio.setRoofOpen(cabrio.isRoofOpen());
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

}
