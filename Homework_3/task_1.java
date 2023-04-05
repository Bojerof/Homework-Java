package Homework_3;

import java.util.Random;
import java.util.Scanner;

//Реализовать алгоритм сортировки слиянием
public class task_1 {
    static Scanner in = new Scanner(System.in);

    static int[] createArray() {
        Random random = new Random();
        System.out.print("Введите длину: ");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(14);
        }
        return array;
    }

    static void sortArray(int[] array) {
        int size = array.length;
        if (size == 1)
            return;
        int mid = size / 2;
        int[] l = new int[mid];
        int[] r = new int[size - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < size; i++) {
            r[i - mid] = array[i];
        }
        sortArray(l);
        sortArray(r);
        merge(l, r, array);

    }

    static void merge(int[] l, int[] r, int[] array) {
        int left = l.length;
        int right = r.length;
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                array[index] = l[i];
                i++;
                index++;
            } else {
                array[index] = r[j];
                j++;
                index++;
            }
        }
        for (int ll = i; ll < left; ll++) {
            array[index] = l[ll];
            index++;
        }
        for (int rr = j; rr < right; rr++) {
            array[index] = r[rr];
            index++;
        }
    }

    public static void main(String[] args) {
        int[] array = createArray();
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        sortArray(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        in.close();
    }
}
