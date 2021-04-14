package com.company.pintuk.Methods.accessModifiers;

public class Cricket2020Format extends Cricket{

    public String play2020Fromat(){

        Cricket cricket = new Cricket2020Format();

        System.out.println("called via Proctected Bowling");
        cricket.bowling();
        System.out.println("Proctected Bowling");
        return "";
    }
}
