package model;

import java.util.ArrayList;

public class Squads {
    private String name;
    private String cause;
    private int maxSize;
    private ArrayList<Heroes> heroes;
    private static ArrayList<Squads> squadInstances = new ArrayList<>();
    private int id;

    public Squads(String name, String cause, int size, ArrayList<Heroes> heroes){
        this.name =name;
        this.cause=cause;
        this.maxSize=size;
        this.heroes=heroes;
        squadInstances.add(this);
        this.id = squadInstances.size();
    }

    public String getName() {
        return this.name;
    }

    public String getCause() {
        return this.cause;
    }

    public int getSize() {
        return this.maxSize;
    }
