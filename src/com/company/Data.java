package com.company;

public class Data {
    private      String name,
            target,
            brand,
            creature,
            year,
            discription;


    public Data(String name, String target, String brand, String creature, String year, String discription) {
        this.name = name;
        this.target = target;
        this.brand = brand;
        this.creature= creature;
        this.year = year;
        this.discription= discription;
    }
    public String toMain(){
        return name+", "+ target+", "+ brand+", "+ creature +", "+ year +", " + discription;
    }
    @Override
    public String toString() {
        return "Найдено\n" +
                "Название:" + name +
                ", Цель:'" + target + '\'' +
                ", Бренд='" +brand + '\'' +
                ", Создатель='" + creature + '\'' +
                ", Год создания:'" + year + '\''+
                ", Описание:" + discription+'}';
    }
}