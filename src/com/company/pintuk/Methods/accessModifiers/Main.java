package com.company.pintuk.Methods.accessModifiers;

public class Main {

    public static void main(String[] args){

        //For Badminton Playing
        Badminton badminton = new Badminton();
        badminton.fourPlayerGame();
        //For Hockey Playing
        Hockey hockey = new Hockey();
        hockey.playHockey();
        //For Cricket Playing
        Cricket cricket = new Cricket();
        cricket.Batting();


        //For 2020 Format Cricket
        Cricket2020Format cricket2020Format = new Cricket2020Format();
        cricket2020Format.play2020Fromat();
    }
}

