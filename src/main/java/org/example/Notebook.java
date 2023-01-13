package org.example;

import java.util.Objects;

public class Notebook {
    /**
     * Каталожный номер ноутбука
     */
    private int catalogNumber;
    /**
     * Модель ноутбука
     */
    private String model;
    /**
     * Диагональ экрана
     */
    private double screenDiagonal;
    /**
     * Процессор
     */
    private String cpu;
    /**
     * Оперативная память
     */
    private int ram;
    /**
     * Накопитель
     */
    private String storageDevice;

    public Notebook(int catalogNumber, String model, double screenDiagonal, String cpu, int ram, String storageDevice) {
        this.catalogNumber = catalogNumber;
        this.model = model;
        this.screenDiagonal = screenDiagonal;
        this.cpu = cpu;
        this.ram = ram;
        this.storageDevice = storageDevice;
    }

    public int getCatalogNumber() {
        return catalogNumber;
    }

    public String getModel() {
        return model;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public String getStorageDevice() {
        return storageDevice;
    }

    @Override
    public String toString() {
        return "Ноутбук: " +
                "каталожный номер: " + catalogNumber +
                ", модель: ='" + model + '\'' +
                ", диагональ экрана: =" + screenDiagonal +
                ", процессор: '" + cpu + '\'' +
                ", оперативная память: " + ram +
                ", накопитель: '" + storageDevice + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return catalogNumber == notebook.catalogNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogNumber);
    }
}

