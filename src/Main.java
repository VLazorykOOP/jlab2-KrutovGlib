import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("""
                Menu
                First task --> 1
                Second task --> 2
                Third task --> 3""");
        Scanner scan = new Scanner(System.in);
        System.out.print("Your choose: ");
        int switcher = scan.nextInt();
        switch (switcher){
            case 1: Firstask();
            case 2:SecondTask();
            case 3: ThirdTask();
        }

    }

    public static void Firstask(){
        Scanner scan = new Scanner(System.in);
        boolean look = true;


        while (look) {
            System.out.print("Enter the expression: ");

            long num = scan.nextLong();
            int den = scan.nextInt();
            String symbol = scan.next();
            long nextnum = scan.nextLong();
            int nextden = scan.nextInt();

            Fraction first = new Fraction(num,den);
            Fraction second = new Fraction(nextnum,nextden);
            switch (symbol) {
                case "+": {
                    Fraction sum = first.add(second);
                    System.out.println("Sum of fractions: " + sum);
                    break;
                }
                case "-": {
                    Fraction substraction = first.subtract(second);
                    System.out.println("Substraction of fractions: " + substraction);
                    break;
                }
                case "*": {
                    Fraction myltiply = first.multiply(second);
                    System.out.println("Product of fractions: " + myltiply);
                    break;
                }
                case "?": {
                    int compareto = first.compareTo(second);
                    if (compareto < 0) {
                        System.out.println(first + " less than " + second);
                    } else if (compareto > 0) {
                        System.out.println(first + " more than " + second);
                    } else {
                        System.out.println(first + " equals " + second);
                    }
                }
                case "0":
                    look = false;
                    break;
                default:
                    System.out.println("Invalide operator");
            }
        }
    }

    public static void SecondTask(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть довжину ребра: ");
        double input = scan.nextDouble();
        Cube cub = new Cube(input);
        System.out.print("Сумарна площа граней: "+ cub.getTotalSurfaceArea()+"\n"+
                "Об'єм куба: "+cub.cubeVolume()+"\n"+"Довжина великої діагоналі: "+cub.largDiagonalLengh());
    }

    public static void ThirdTask(){
        Scanner scan = new Scanner(System.in);
        System.out.print("ВВедіть перше число: ");
        int first = scan.nextInt();
        System.out.printf("Введіть друге число: ");
        int second = scan.nextInt();
//        Mathh math = new Mathh(first,second);
        System.out.print("Найбільший спільний дільник: "+Mathh.GCD(first,second)+"\n"+
                "Найменше спільне кратне: "+Mathh.LCM(first,second));
    }
}
