import java.util.Random;
import java.util.Scanner;

/**
 * Created by cobik99 on 15.06.17.
 */
public class Main {
   Random r = new Random();


    public static void main(String[] args) {
            

        Scanner scn = new Scanner(System.in);


        //obyavlayem matricu i obrabativayem eqo

        System.out.println(" Razmer matrici : 5 ");
        int SIZE = 5;

        // Создаем двумерный массив
        int[][] matrica = new int[SIZE][SIZE];


        //zapolneniye dvumernoqo massiva
        zapolMatric(matrica);

        //vivod matrici
        vivodMatric(matrica);

        //coolviewMatrici
        coolviewMatric(matrica);


    }

   private  static void zapolMatric(int matric[][]) {
        Random r = new Random();

        // Цикл по первой размерности (первые квадратные скобки)
        for (int i = 0; i < matric.length; i++) {
            // Цикл по второй размерности (вторые квадратные скобки)
            for (int j = 0; j < matric.length; j++) {
                matric[i][j] = r.nextInt(5);
            }
        }
    }

    private static void vivodMatric(int matric[] []){

        // Теперь выводим массив на экран
        // Цикл по первой размерности выводит строки
        for (int i = 0; i < matric.length; i++) {
            // Цикл по второй размерности выводит колонки - вывод одной строки
            for (int j = 0; j < matric.length; j++) {
                // Используем оператор print - без перехода на следующую строку
                System.out.print(matric[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }
    }

    private static void coolviewMatric(int matric [] []){
        int sredelement  =  ((int)(matric.length/2)) ;

        System.out.println("sredniy element matrici  = " + matric[sredelement] [sredelement]);

        System.out.println("============Elementi matrici po casovoy strelke=============");

        System.out.println(matric [sredelement - 1] [sredelement]);
        System.out.println(matric [sredelement - 1] [sredelement + 1]);


        for(int i = sredelement  - 1; i<=sredelement + 1; i++){

            System.out.println(matric[i][sredelement + 1]);


        }

    }


}
