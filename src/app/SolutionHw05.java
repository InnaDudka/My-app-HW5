package app;

import java.util.Scanner;

public class SolutionHw05 {
    public static final double SMALL_TAX = 0.025;
    public static final double MEDIUM_TAX = 0.043;
    public static final double BIG_TAX = 0.067;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть свій дохід ");
        double salary = sc.nextDouble();

        if (salary < 0){
            System.out.println("Невірний дохід, будь ласка,зробіть його позитивним");
            return;
        }

        if (salary <= 10000){
            System.out.println("Податок з доходу = " + salary * SMALL_TAX);
        }else if (salary <= 25000) {
            System.out.println("Податок з доходу = " + salary * MEDIUM_TAX);
        }else {
            System.out.println("Податок з доходу = " + salary * BIG_TAX);
        }




        sc.close();




    }




















}
