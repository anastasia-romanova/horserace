package com.romanova;


public class Pony extends Horses {

    Pony (String name) {
        super(name);
    }

    Pony(String name, int age){
        this.name = name;
        setAge(age);
    }

    public Pony (String name, int age, String  gender, int speed, int jumpLong, int jumpHigh) {
        super(name, age, gender, speed, jumpLong, jumpHigh);
    }
}
