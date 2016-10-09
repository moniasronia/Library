package Overloading;

/**
 * Created by Moniałkę on 2016-10-09.
 */
public class Car {
    int year;
    String brand;
    String model;
    String color;

    Car(int y, String b, String m, String c){
        year=y;
        brand=b;
        model=m;
        color=c;
    }
    Car(int y, String b, String m){
        year=y;
        brand=b;
        model=m;
    }
}
