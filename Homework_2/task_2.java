package Homework_2;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class task_2 {

    static Scanner in = new Scanner(System.in);

    static int[] newArray() {
        System.out.print("Введите длину массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите число: ");
            array[i] = in.nextInt();
        }
        return array;
    }
    static int[] sortArray(int[] array) throws IOException{
        newWrite(array);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            write(array);
        }
        return array;
    }
    static void newWrite(int[] array) throws IOException{
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                                new FileOutputStream("//Users//bojeroff//Desktop//GB//GB Java//Homework//Homework_2//task_2.txt"), 
                                "UTF-8")); 
        writer.write(Arrays.toString(array));
        writer.newLine();
        writer.close();
    }

    static void write(int[] array) throws IOException{
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                                new FileOutputStream("//Users//bojeroff//Desktop//GB//GB Java//Homework//Homework_2//task_2.txt", 
                        true), "UTF-8")); 
        writer.write(Arrays.toString(array));
        writer.newLine();
        writer.close();
    }


    public static void main(String[] args) throws IOException {
       int[] array = newArray();
       System.out.println(Arrays.toString(array));
       int[] sortArray = sortArray(array);
       System.out.println(Arrays.toString(sortArray));
       in.close();

    }
}