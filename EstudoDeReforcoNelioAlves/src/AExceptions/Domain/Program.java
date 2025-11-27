package AExceptions.Domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        method1();
        System.out.println("End of Program");
    }

    public static void method1(){
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");
    }
       public static void method2(){
           System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);
            try {
                // bloco que sera executado
                String[] vect = sc.nextLine().split(" ");// separar por " "
                int positiom = sc.nextInt();
                System.out.println(vect[positiom]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid position");
                e.printStackTrace();
            }catch (InputMismatchException e){
                System.out.println("Input Invalid");
            }


            sc.close();
           System.out.println("***METHOD2 END***");
        }

    }


