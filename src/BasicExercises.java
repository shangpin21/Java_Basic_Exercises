import java.util.Scanner;

public class BasicExercises {
    public static void main(String[] args) throws Exception {
        System.out.println(decimalToOct());
    }

    // Print the sum of two numbers
    private static int exercise2(int x, int y){
        int sum = x + y;
        return sum;
    }

    // Q3 divide two numbers 
    private static double exercise3(int x, int y){
        double divide = (double) x / y;
        return divide;
    }

    /* Q4 Write a Java program to print the results of the following operations.
    Test Data:
    a. -5 + 8 * 6
    b. (55+9) % 9
    c. 20 + -3*5 / 8
    d. 5 + 15 / 3 * 2 - 8 % 3
    */

    private static void exercise4(){
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    // Q5 return product of two numbers
    private static double exercise5(int x, int y){
        return x * y;
    }

    // Q6 return the sum, multiply, subtract, divide and remainder of two numbers
    private static void exercise6(){
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = in.nextInt();

        System.out.println("Input second number: ");
        int num2 = in.nextInt();
        
        // Calculate and print the sum of the two numbers
        System.out.println(num1 + " + " + num2 +  " = " + (num1 + num2));

        // Calculate and print the difference of the two numbers
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        // Calculate and print the multiplication of the two numbers
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));

        // Calculate and print the division of the two numbers
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));

        // Calculate and print the remainder of the two numbers
        System.out.println(num1 + " % " + num2 + " = " + (num1%num2));

    }

    // Q7 return multiplication table of input
    private static void exercise7(){
        Scanner in = new Scanner(System.in);

        System.out.println("Input number for multiplication table: ");
        int num = in.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    /* Q8
     Sample Pattern :

   J    a   v     v  a                                                  
   J   a a   v   v  a a                                                 
J  J  aaaaa   V V  aaaaa                                                
 JJ  a     a   V  a     a
     */

     private static void exercise8(){
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
     }

     // Q9 compute ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))

     private static double exercise9(){
        return ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
     }

     // Q10 compute 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))

     private static double exercise10(){
        return 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
     }

     // Q11 print the area of perimeter of a circle
     private static void exercise11(double r){
        double area = Math.PI * Math.pow(2, r);
        double perimeter = Math.PI  * (2 * r);

        System.out.println("Area " + area);
        System.out.println("Perimeter " + perimeter);
     }

     // Q12 take 3 numbers as input and calculate the average of the numbers
     private static double exercise12(int x, int y, int z){
        double sum = x + y + z;
        double avg = sum / 3;
        return avg;
     }

     // Q13 Calculate and print the area and perimeter of a rectangle
     private static void exercise13(int x, int y){
        double area = x * y;
        double perimeter = 2 * (x + y);
        System.out.println("Area: " + area + "\nPerimeter: " + perimeter);
     }

     // Q14 
     /*
        * * * * * * ==================================                          
        * * * * *  ==================================                          
        * * * * * * ==================================                          
        * * * * *  ==================================                          
        * * * * * * ==================================                          
        * * * * *  ==================================                          
        * * * * * * ==================================                          
        * * * * *  ==================================                          
        * * * * * * ==================================                          
        ==============================================                          
        ==============================================                          
        ==============================================                          
        ==============================================                          
        ==============================================                          
        ==============================================
      */
      private static void exercise14(){
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        
        // Print a row of equal signs to complete the design
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");

    }

    // Q15 swap two variables
    private static void exercise15(){
        String x = "Hello";
        String y = "World";
        String temp  = x;
        x = y;
        y = temp;

        System.out.println(x);
        System.out.println(y);

    }

    // Q17 add two binary numbers
    private static String exercise17(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st binary no: ");
        String b1 = in.next();
        System.out.println("Enter 2nd binary no. : ");
        String b2 = in.next();

        StringBuilder sb = new StringBuilder();
        int i = b1.length()-1;
        int j = b2.length()-1;
        int carry = 0;

        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += b1.charAt(i) - '0';
            if(j >= 0) sum += b2.charAt(j) - '0';
            sb.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
        
    }

    // Q18 product of two binary numbers
    private static void exercise18(){
        String b1,b2;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st binary no. : ") ;
        b1=sc.next();
        System.out.println("Enter 2nd binary no. : ") ;
        b2=sc.next();
        int num1=Integer.parseInt(b1,2);
        int num2=Integer.parseInt(b2,2);
        int mul=num1*num2;
        System.out.println("M359ultiplication is : "+Integer.toBinaryString(mul));
    }

    // Q19 Convert an integer number to a binary number5
    private static String exercise19(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        String num1 = in.next();
        int result = Integer.parseInt(num1,10);
        return "Result = " + Integer.toBinaryString(result);
    }

    // Q20 Convert a decimal number to hexadecimal number
    private static String decimalToHex(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Decimal value: ");
        int decimal = in.nextInt();

        if(decimal == 0){
            return "Enter a valid decimal";
        }

        StringBuilder hex = new StringBuilder();
        while(decimal != 0){
            int remainder = decimal % 16;
            char hexChar = (char)((remainder < 10) ? remainder + '0' : remainder - 10 + 'A');
            hex.insert(0, hexChar);
            decimal /= 16;
        }
        return "result = " + hex.toString();
    }

    // Q21 convert decimal number to an octal number
    private static String decimalToOct(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a decimal value: ");
        int decimal = in.nextInt();

        if(decimal == 0){
            return "Enter a valid decimal";
        }

        StringBuilder oct = new StringBuilder();
        while(decimal != 0){
            int remainder = decimal % 8;
            oct.insert(0, remainder);
            decimal /= 8;
        }

        return "result = " + oct;
    }

}