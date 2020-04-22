package com.appnetics;

public class Main {

    public static void main(String[] args) {
	    char switchValue = 'B';

	    switch (switchValue){
            case 'A':
                System.out.println( switchValue + " For Apple");
                break;

            case  'B':
                System.out.println(switchValue + " for Boy");
                break;

            case  'C':
                System.out.println(switchValue + " for Cat");
                break;

            case  'D':
                System.out.println(switchValue + " for Dog");
                break;

            case  'E':
                System.out.println(switchValue + " for Elephant");
                break;

            case 'F': case 'G': case 'H':
                System.out.println(  switchValue +" is a Letter of the Alphabet");
                break;


            default:
                System.out.println("We are adding more soon");
                break;
        }
    }
}
