
package ParametrsOfMethods;

import java.util.Scanner;

class Calc {
    public static void main(String[] args) {
        Schety Calc = new Schety();
        Calc.Schitat(10,25, "+" );
        Calc.Schitat(10,25, "-" );
        Calc.Schitat(10,25, "*" );
        Calc.Schitat(10,25, "/" );
        Calc.Schitat(10,25, ")" );

    }
}

           class Schety {
               void Schitat(int a, int b, String c) {
                if(c == "+") {
                    System.out.println(a + b);
                } else if(c == "*") {
                    System.out.println(a * b);

                } else if(c == "-") {
                    System.out.println(a - b);

                } else if(c == "/") {
                    System.out.println((float) a / (float)b);

                } else {
                    System.out.println("Неизвестный символ");
                }

               }
           }