package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Data[] base = new Data[]{new Data( "Ручка", "Писать","Cross, Parker, Waterman","Джон Дж. Горм","1907","Офисная принадлежность"),
                new Data("Doom, Дум", "Развлечения", "Playstation, Xbox, PC, Nintendo", "Bethesda, id Software", "1993, 1994, 1996, 1997, 2004, 2016,2020", "Видеоигра, игра"),
                new Data( "Сoca-cola, cola, кока-кола, кола", "Утолить жажду", "The coca-cola company", "Джон Стит Пембертон", "1886", "Напиток")};

        System.out.print("Пойск:");
        int cs=0;
        try {
            String f= sc.nextLine();
            for(int j=0; j< base.length; j++){
                int n2,n1=0;
                for(int i=0; i<5; i++) {
                    n2 = base[j].toMain().indexOf(",",n1);
                    if(base[j].toMain().substring(n1, n2).trim().equalsIgnoreCase(f)){
                        System.out.println(base[j].toString());
                        cs++;
                    }
                    n1=n2+1;
                }
            }
            if(cs==0){
                System.out.println("По запросу "+ f+ " ничего не найдено");
            }
        }
        catch (InputMismatchException ex){
            System.out.println("Произошла ощибка!");
        }
    }
}