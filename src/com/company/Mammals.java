package com.company;

public class Mammals extends  Animal {
    private String type;

    public Mammals(Mainlands mainlands) {
        super(mainlands);
    }

    public Mammals(Mainlands mainlands, String type) {
        super(mainlands);
        this.type = type;
    }

    public Mammals() {

    }

    public String getType() {
        return type;

    }
    public   final void birth( ){
        System.out.println("Cезон рождения: "+"Весна");
        System.out.println("Год рождения: "+"2014 год");
    }

    public void birth(String season, String year){
            System.out.println("Cезон рождения: "+season );
            System.out.println("Год рождения: "+year );
    }

    public String getInfo() {
        return "Место обитания:  " + getMainlands() + "  Вид животного:" +getType();
    }
}