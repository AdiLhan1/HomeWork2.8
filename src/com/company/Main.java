package com.company;

public class Main {

    public static void main(String[] args) {
        Box<Double, Integer> numberBox = new Box<>(10.0d, 7);
        Box<Float, Float> numberBox2 = new Box<>(3.4f, 2.3f);
        addition(numberBox,numberBox2);
        multiplication(numberBox,numberBox2);
    }

    public static void addition(Box<? extends Double, ? extends Integer> numberBox, Box<? extends Float, ? extends Float> numberBox2) {
        Number number = numberBox.getNumber1() + numberBox.getNumber2() + numberBox2.getNumber2() + numberBox2.getNumber1();
        System.out.println("Сумма:"+number);
    }

    public static void multiplication(Box<? extends Double, ? extends Integer> numberBox, Box<? extends Float, ? extends Float> numberBox2) {
        Number number2 = numberBox.getNumber1() * numberBox.getNumber2() * numberBox2.getNumber2() * numberBox2.getNumber1();
        System.out.println("Произведение"+number2);


    }
}

