package com.romanova;

public class Horses {
    protected String name;
    private int age;
    private String gender; // кобыла, мерин, жеребец - mare, gelding, stallion
    private int speed;
    private int jumpLong;
    private int jumpHigh;
    public static int horseCount;

    public Horses() {
        horseCount++;
    }

    public Horses(String name) {
        this.name = name;
        horseCount++;
    }

    public Horses (String name, int age, String  gender, int speed, int jumpLong, int jumpHigh) {
        this.name = name;
        setAge(age);
        setGender(gender);
        setSpeed(speed);
        setJumpLong(jumpLong);
        setJumpHigh(jumpHigh);
        horseCount++;
    }

    public void printDataHorse (){
        System.out.println("Name: " + name + " , Age: " + age + " , Gender: " + gender + " , Speed: " + speed
                + " , Long Jump: " + jumpLong + " , High Jump: " + jumpHigh);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age;
    }

    public String getGender (){
        return gender;
    }

    public  void   setGender(String gender) {
        if (gender.equals("mare")|| gender.equals("gelding")|| gender.equals("stallion"))
        this.gender = gender;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed){
        if (this.speed > 0) this.speed = this.speed;
    }

    public int getJumpHigh() {
        return jumpHigh;
    }

    public void setJumpHigh(int jumpHigh) {
        if (jumpHigh > 0) this.jumpHigh = jumpHigh;
    }

    public int getJumpLong() {
        return jumpLong;
    }

    public void setJumpLong(int jumpLong) {
        if (jumpLong > 0) this.jumpLong = jumpLong;
    }
}

