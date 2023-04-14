import java.time.chrono.MinguoChronology;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {   task1();
        task2();
        task3();
        task4();


    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        {System.out.println("задача 1");}
        int[] arr = generateRandomArray();
        int sum =0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];}
            System.out.println("Сумма трат за месяц составила "+sum+" рублей");
      }

    public static void task2() {
        {System.out.println("задача 2");}
        int[] arr = generateRandomArray();
        int sumMin = arr[0];
        int sumMax = arr[0];
        for (int i = 0; i < arr.length; i++){
        if (sumMax < arr[i])
            sumMax = arr[i];
        if (sumMin > arr[i])
            sumMin = arr[i];
        }
        System.out.println("Минимальная сумма трат за день составила "+sumMin+" рублей. Максимальная сумма трат за день составила "+sumMax+" рублей");
    }


    public static void task3() {
        {System.out.println("задача 3");}
        int[] arr = generateRandomArray();
        float sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];{
            float averageSum = sum / arr.length;
            System.out.println(averageSum);}
    }


    public static void task4() {
        {System.out.println("задача 4");}
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--){

                System.out.print(reverseFullName [i] +"" );
            }

    }


}








