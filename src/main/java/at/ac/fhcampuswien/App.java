package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char a = 'Z';
        int b = 0xface;
        int c = 012;
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;
        int sum;

        int aa = (int) a;
        int dd = (int) d;
        int ee = (int) e;
        int ff = (int) f;
        int gg = (int) g;
        int hh = (int) h;

        sum=aa+b+c+dd+ee+ff+gg+hh;

        System.out.println(sum);



    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int sum;
        sum = x+y;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();
        System.out.println("After Swap:");
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1: ");
        x = scanner.nextInt();
        System.out.print("n2: ");
        y = scanner.nextInt();
               if(x>y) {
               System.out.println("n1 > n2");
               } else if (x<y){
               System.out.println("n2 > n1");
               } else {
               System.out.println("n1 == n2");
               }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int x = scanner.nextInt();
        if(x<0||x>=100000){
            System.out.println("Invalid Revenue");
        } else if(0<=x && x<20000){
            System.out.println("Poor Sales Revenue");
        }
        else if(20000<=x && x<50000){
            System.out.println("Average Sales Revenue");
        } else if(50000<=x && x<80000){
            System.out.println("Good Sales Revenue");
        } else if(80000<=x && x<10000){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int x = scanner.nextInt();
        switch(x){
            case 1: System.out.println("Your Commission Rate was set to 0.01");break;
            case 2: System.out.println("Your Commission Rate was set to 0.02");break;
            case 3: System.out.println("Your Commission Rate was set to 0.03");break;
            case 4: System.out.println("Your Commission Rate was set to 0.04");break;
            default: System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int x = scanner.nextInt();
            if (x%4==0 && x%400==0){
                System.out.println("Leapyear");
            } else if (x%100==0 && x%400!=0){
                System.out.println("Not a Leapyear");
            } else {
                System.out.println("Not a Leapyear");
            }
    }

    //todo Task 10
    public void transposedNumbers() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int num = scanner.nextInt();
        int count = 0;
        int interim = 0;
        interim = num;
        int factor = 1;
        int swapped = 0;

          while(interim!=0){
              interim=interim/10;
              count++;
          }
          for(int i=1; i<count; i++){
              factor = factor*10;
          }
          interim=num;
          while(interim!=0){
              swapped=(interim%10)*factor+swapped;
              interim=interim/10;
              factor=factor/10;
          }
        System.out.println(swapped);
    }


    public static void main(String[] args) {
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}