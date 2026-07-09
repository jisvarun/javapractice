package org.example;

public class Day1 {
    static void myMethod(){
        myMethod(20);
    }
    static void myMethod(int age){
        System.out.println("My Method " + age);
    }
    public static void main(String[] args)
    {
        myMethod();
        myMethod(33);
        System.out.println("Java Variables");
//        String
        String myName = "Varun";
        char myNameFirstLetter = 'V';
        int age = 29;
        float salary = 25000.00f;
        boolean smoke = false;

        byte myNum = 12;
        var hello = 'D';
        System.out.println(myNum);

//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for(String car : cars){
//            System.out.println("Car = " + car);
//        }

        Second myCar = new Second();
        myCar.fullThrottle();
        myCar.speed(20);
    }
}
