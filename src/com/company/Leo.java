package com.company;

public final class Leo extends Mammals {
    private int age;
    private String gender;
    private String nickName;

    public Leo(Mainlands mainlands, String type, int age, String nickName, String gender) {
        super(mainlands, type);
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;

    }


    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getNickName() {
        return nickName;
    }


    public String getInfo() {
        return super.getInfo() + "Возраст животного:" + getAge() + " Имя животного: " + getNickName() + " Пол животного:  " + getGender();
    }
}