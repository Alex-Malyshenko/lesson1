package ru.geekbrains.lesson1;

public class BottleOfBeer extends Product {

    private double volume; // объем
    private int alcogolСontent; // Содержание спирта

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getAlcogolСontent() {
        return alcogolСontent;
    }

    public void setAlcogolСontent(int fatСontent) {
        this.alcogolСontent = alcogolСontent;
    }

    public BottleOfBeer(String brand, String name, double price, double volume, int alcogolСontent) {
        super(brand, name, price);
        this.volume = volume;
        this.alcogolСontent = alcogolСontent;
    }
    
    @Override
    public String displayInfo() {
        return String.format("[Бутылка] %s - %s - %f [объем: %f; содержание спирта: %d]", brand, name, price, volume, alcogolСontent);
    }

}
