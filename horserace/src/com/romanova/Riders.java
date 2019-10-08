package com.romanova;

public class Riders {
    String name;
    private int age;
    private String  gender; // мужчина, женщина - man, woman

    public Riders (String name, int age, String gender) {
        this.name = name;
        setAge(age);
        setGender(gender);

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)this.age = age;
    }

    public String getGender () {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equals("man")||gender.equals("woman")) this.gender = gender;
    }
}
