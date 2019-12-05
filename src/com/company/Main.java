package com.company;

public class Main {

    public static void main(String[] args) {
 Mammals objectA=new Mammals();
Leo objectB=new Leo(Mainlands.AFRICA,"Африканский лев ",6 ,"Нала ","Самка \uD83D\uDC2F");
objectB.birth();
System.out.println(objectB.getInfo());
Leo objectС=new Leo(Mainlands.AFRICA,"Африканский лев ",5,"Симба","Самец  \uD83E\uDD81");
        objectС.birth("Лето","2015 год");
        System.out.println(objectС.getInfo());
    }
}
