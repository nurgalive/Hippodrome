package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public static void main(String[] args) throws InterruptedException {
        List<Horse> list = new ArrayList<Horse>();
        list.add(new Horse("Hor1", 3, 0));
        list.add(new Horse("Hor2", 3, 0));
        list.add(new Horse("Hor3", 3, 0));
        game = new Hippodrome(list);
        game.run();
        game.printWinner();
    }

    public Hippodrome(List<Horse> list) {
        this.horses = list;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public Horse getWinner() {
        Horse winner = null;
        List<Horse> list = getHorses();
        double distance = 0.0;

        for (int i = 0; i <list.size(); i++) {
            if(list.get(i).getDistance() > distance) {
                distance = list.get(i).getDistance();
                winner = list.get(i);
            }
        }
        return winner;
    }

    public void printWinner() {
        String winner = getWinner().getName();
        System.out.println("Winner is " + winner + "!");
    }

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }
    }

    void print() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
