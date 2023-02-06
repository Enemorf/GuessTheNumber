import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
        int min = 1;
        int max = 100;

        Random rand = new Random();
        int randNum = rand.nextInt(max - min + 1) + min;

        System.out.printf("Привет! Я загадал число =)\n" +
                "Напиши число от %d до %d, а я скажу, оно больше, меньше или ты угадал!\n", min, max);

        guessNum(randNum);
    }

    private static void guessNum(int randNum)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Напиши число: ");

        int userPutNum = in.nextInt();

        if(randNum == userPutNum)
        {
            System.out.printf("Да, ты угадал! Это число %d! Игра окончена.",userPutNum);
        }
        else if(randNum > userPutNum)
        {
            System.out.printf("Нет, твое число %d меньше, чем задуманное число. \n", userPutNum);
            guessNum(randNum);
        }
        else
        {
            System.out.printf("Нет, твое число %d больше, чем задуманное число. \n", userPutNum);
            guessNum(randNum);
        }
    }
}