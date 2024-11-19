import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



       /* int a = 1;
        while (a<=5){
            System.out.println("Hello World!");
            a++;
        }*/

        /*int a = 1;
        while (a<=5){
            System.out.println(a);
            a++;
        }*/

        //Консолдон бир бүтүн сан берилгенде, натыйжада бир гана цифра болмоюнча анын бардык сандарын кайра-кайра кошуп,
        //акырында  бир орундуу санды консолго чыгар.
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Input num: ");
        int number = scanner.nextInt();
        while (true){
            int a = (number/100);
            int b = (number/10)%10;
            int c = (number % 10);
            int sum = (a+b+c);
            System.out.println(a + " + " + b + " + " + c +" = " + sum + " ");
            int num1 =(sum/10)%10;
            int num2 =(sum%10);
            int num3 = num1 + num2;
            System.out.println("Output: " + num1 + "+" + num2 + " = " + num3);
             break;

        }*/




        /*//Консолдон бир бүтүн сан берилгенде, натыйжада бир гана цифра болмоюнча анын бардык сандарын кайра-кайра кошуп,
        //акырында  бир орундуу санды консолго чыгар.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input num: ");
        int number = scanner.nextInt();
         while (true) {
            int u = (number / 10000);
            int a = (number / 1000) % 10;
            int b = (number / 100) % 10;
            int c = (number / 10) % 10;
            int d = (number % 10);
            int sum1 = (u + a + b + c + d);
            System.out.println(u + " + " + a + " + " + b + " + " + c + " + " + d + " = " + sum1 + " ");
            int e = (sum1 / 1000) % 10;
            int f = (sum1 / 100) % 10;
            int g = (sum1 / 10) % 10;
            int h = (sum1 % 10);
            int sum2 = (e + f + g + h);
            System.out.println("Output: " + e + " + " + f + " + " + g + " + " + h + " = " + sum2);
             int i = (sum1 / 100) % 10;
             int j = (sum1 / 10) % 10;
             int k = (sum1 % 10);
             int sum3 =(i + j + k);
             System.out.println("Output: " + i + " + " + j + " + " + k +  " = " + sum3);
            break;
        }*/




        /*Консолдон бир сан бериңиз, берилген сандан 1 ге чейин кемуу тартибинде катары менен консольго
        чыгарыныз. Мисалы :
        Input: 4
        Output: 4,3,2,1*/
         /*Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (0 < num) {
            System.out.println(num);
            num--;
        }*/


        //• Консолдон бир сан бериңиз жана ал санга чейинки жуп сандарды консолго чыгарыңыз.Input: 10 ; Output: 2,4,6,8

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int a = scanner.nextInt();
        int b = 0;
        while (a > b) {
            if (b % 2 == 0) {
                System.out.println("Output: " + b);
            }
            b++;
        }*/


        // LMS task 1. Консолдон бир сан бериңиз, анын канча орундуу сан экенин консолго чыгарыңыз. 1 variant
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int a = scanner.nextInt();
        while (true) {
            if (a >= 0 && a <= 9) {
                System.out.println("Output: 1 orunduu san: " + a);
                break;
            } else if (a >= 10 && a < 99) {
                System.out.println("Output: 2 orunduu san: " + a);
                break;
            } else if (a >= 100 && a < 999) {
                System.out.println("Output: 3 orunduu san: " + a);
                break;
            } else if (a >= 1000 && a < 9999) {
                System.out.println("Output: 4 orunduu san: " + a);
               break;
            }
        }
*/

       // LMS task 1. Консолдон бир сан бериңиз, анын канча орундуу сан экенин консолго чыгарыңыз. Rah
        /*Scanner scanner = new Scanner(System.in);
        System.out.print(“Consolgo san beriniz: “);
        int san = scanner.nextInt();  //Консолдон берчу сан.
        int sikl = 0;         //Канча орундуу экенин табат.
        while (san > 0) {//Бул жерде sikl деп жазсам ката чыкты,анан 0 дедим.
            san /= 10; //san = san /10
            sikl++;
        }
        System.out.println(“Siz bergen san ” + sikl + ” orunduu!“); */






        // LMS task 1. Консолдон бир сан бериңиз, анын канча орундуу сан экенин консолго чыгарыңыз. 2 variant
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int a = scanner.nextInt();
        if (a >= 0 && a <= 9) {
            System.out.println("1 orunduu san: " + a);
        } else if (a >= 10 && a < 99) {
            System.out.println("2 orunduu san: " + a);
        } else if (a >= 100 && a < 999) {
            System.out.println("3 orunduu san: " + a);
        } else if (a >= 1000 && a < 9999) {
            System.out.println("4 orunduu san: " + a);
        } else {
            System.out.println("error");
        }*/




        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int a = scanner.nextInt();
        if (a >= 0 && a <= 9) {
            System.out.println("1 orunduu san: " + a);
        } else if (a >= 10 && a < 99) {
            System.out.println("2 orunduu san: " + a);
        } else if (a >= 100 && a < 999) {
            System.out.println("3 orunduu san: " + a);
        } else if (a >= 1000 && a < 9999) {
            System.out.println("4 orunduu san: " + a);
        } else {
            System.out.println("error");
        }*/
        /*while (a > b) {
            if (b % 2 == 0) {
                System.out.println("Output: " + b);
            }
            b++;
        }*/




       /* Scanner scanner = new Scanner(System.in);
        System.out.print("San beriniz: ");
        int a = scanner.nextInt();
        if (a>=1000 && a<=9999){
            System.out.println(4);
        } else if (a>=100 && a<999 ) {
            System.out.println(3);
        } else if (a>=10 && a<99) {
            System.out.println(2);
        } else if (a>=0 && a<9 ) {
            System.out.println(1);
        }else{
            System.out.println("error");
        }*/


        //Сканнер аркылуу эки сан бериңиз, консолго берилген эки сандын арасындагы
        //сандарды чыгарыныз. Биринчи сан экинчи сандан кичине болуусу керек.
        //Мисалы:
        //Input:
        //2
        //5
        //Output:
        //2
        //3
        //4
        //5
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        do{
            System.out.println(num1);
            num1++;
        }while (num1<=num2);*/


       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        while (num1<=num2){
            System.out.println(num1);
            num1++;
        }*/


        //murdaky
        /*Scanner scanner = new Scanner(System.in);
          System.out.println("Сан бериниз: ");
            int num = scanner.nextInt();
           System.out.println( num%2!=0 ? "Так сан" : "Жуп сан");*/

          /*Scanner scanner = new Scanner(System.in);
         System.out.println("Сан бериниз: ");
            int num = scanner.nextInt();
       if (num % 2 != 0) {
    System.out.println("Так сан");
         } else {
    System.out.println("Жуп сан");

        }*/



        //Консолдон бир бүтүн сан берилгенде, натыйжада бир гана цифра болмоюнча анын бардык сандарын кайра-кайра кошуп,
        //акырында  бир орундуу санды консолго чыгар.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Бир бүтүн санды киргизиңиз: ");
        int number = scanner.nextInt();

        while (number >= 10 || number <= -10) {
            int sum = 0; // Сандардын суммасын нөлдөн баштайбыз

            // Санды кошуу
            while (number != 0) {
                sum += Math.abs(number % 10); // Соңку санды алып, суммалап жатабыз
                number /= 10; // Санды бөлүп, кийинки цифраны алабыз
            }

            number = sum; // Жаңы сумма менен продолжать
        }

        System.out.println("Акыркы бир орундуу сан: " + number);
        scanner.close(); // Scanner объектин жабуу


        //Консолдон бир сан бериңиз, анын канча орундуу сан экенин консолго чыгарыңыз.
        /*
         Scanner scanner = new Scanner(System.in); // Консольдон кирүү үчүн Scanner

        System.out.print("Бир санды киргизиңиз: ");
        int number = scanner.nextInt(); // Колдонуучудан бүтүн санды алуу
        int count = 0; // Сандардын санын эсептөө үчүн счетчик

        // Санды оңдоо, анткени биз 0 менен текшеребиз
        number = Math.abs(number);

        // Цикл, сандагы орундардын санын эсептөө
        while (number > 0) {
            number /= 10; // Санды 10 га бөлүп, акыркы орунду алып таштайбыз
            count++; // Орунду көбөйтүү
        }

        // Эгер колдонуучу 0 киргизсе, аны 1 орундуу сан деп эсептейбиз
        if (count == 0) {
            count = 1;
        }

        System.out.println("Сан " + count + " орундуу.");
        scanner.close(); // Scanner объектин жабуу
         */



    }
}