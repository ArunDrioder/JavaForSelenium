package org.example.abstractPkg;

public abstract class ParentAirCraft
{
    public void engine()
    {
        System.out.println("Follow Engine guidelines");
    }

    public void safety()
    {
        System.out.println("Follow Safety Guidelines");
    }

    public abstract void bodyColour();

}
