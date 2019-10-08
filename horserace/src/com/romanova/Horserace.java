package com.romanova;

public class Horserace {

    public static void main(String[] args) {
        Horses horseMylady = new Horses("Mylady",  13, "mare",  50, 150, 100);
        Horses horseRubin = new Horses("Rubin", 19, "gelding", 35, 90, 70);
        horseMylady.setAge(14);
        horseMylady.printDataHorse();
        horseRubin.printDataHorse();

        Pony ponyPaprika = new Pony("Paprika", 7);
        ponyPaprika.printDataHorse();
        System.out.println("Count of horses: " + Horses.horseCount);

    }
}
