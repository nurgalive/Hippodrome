package com.javarush.task.task21.task2113;

public class Horse {
    String name;
    double speed;
    double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void move() {
        distance = distance + speed * Math.random();
    }

//Метод print должен выводить на экран строку состоящую из точек и имени лошади.
// Количество точек равно целой части distance.

    public void print() {
        String tochki = "";
        for (int i = 0; i < (int) Math.floor(distance); i++) {
            tochki = tochki + ".";
        }
        tochki = tochki + getName();
        System.out.println(tochki);
    }
}
