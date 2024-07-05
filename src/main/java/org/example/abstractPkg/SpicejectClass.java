package org.example.abstractPkg;

public class SpicejectClass extends ParentAirCraft
{
    public static void main(String[] args)
    {
        SpicejectClass sClass = new SpicejectClass();
        sClass.engine();
        sClass.safety();
        sClass.engine();

    }

    @Override
    public void bodyColour() {
        System.out.println("Body Color is Blue");
    }
}
