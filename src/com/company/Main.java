package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Person maks = new Person(180,74.4f);
        final float pi = 3.14f;
        maks.say("hi, i m");
        System.out.println(maks.weight);

        Person oleg = new Person();
        oleg.height = 195;
        oleg.weight = 96.7f;
        System.out.println(oleg.weight);

        Student vova = new Student(178,98f,3);
        System.out.println(vova.course);

        System.out.println(Person.summ);
        Person.summ=34;
        Person.write("You summ is: ");
        System.out.println(Person.summ);


        /*
        byte num=2;
        int i=342523523;
        long l = 85468546;
        float num_2 = 4353.34543f;
        double num_3;
        num_3=567.5675f;
        boolean is_happy = false;
        String str  = "HW";
        System.out.print("Var = "+ str );
*/

/*
        Scanner num = new Scanner (System.in);
//        int i = num.nextInt();
//        System.out.println("Var = "+ i );
        String symbols  = num.nextLine();
        System.out.println("Var = "+ symbols );
*/

/*
    float num_1 =  50f, num_2 =90f, res;
    res =num_1 + num_2;
    res--;
    System.out.println(res);
*/


/*
    int i = 234;
    if (i ==234) {

        System.out.println(i);

    }
    else System.out.println("qqq");
*/


/*
    int [][] arr = new int [][] {
            {00,01,02,03,04},
            {10,11,12,13,14},
            {20,21,22,23,24},
            {30,31,32,33,34}
    };
        System.out.println(arr[1][3]);
*/

    }


}

