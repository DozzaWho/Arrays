package org.dozza.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtil {
    /**
     * 1) Дан массив целых чисел. Заполнить данный массив с клавиатуры. Scanner подать как аргумент метода
     */
    public static void fill(int[] mass, Scanner scanner) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }
    }

    /**
     * 2) Дан массив целых чисел. Заполнить данный массив числами в диапазоне от a до b
     * Указание:
     * Для генерации случайного числа в диапазоне от a до b реализовать отдельный метод getRandomNumber
     */
    public static int getRandomNumber(int a, int b) {
        return a + (int) (Math.random() * (b - a + 1));
    }

    public static void fillRandom(int[] mass, int a, int b) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = getRandomNumber(a, b);
        }
    }

    /**
     * 3) Дан массив целых чисел. Преобразовать данный массив в строковое значение в формате JSON
     */
    public static String toString(int[] mass) {
        String res = "[";
        for (int val : mass) {
            if (res != "[") {
                res += ", ";
            }
            res += val;
        }
        return res + "]";
    }

    /**
     * 4) Дан массив целых чисел. Выведите все элементы
     * массива с четными индексами. В программе запрещено
     * использовать условную инструкцию для проверки четности индексов.
     */
    public static String evenIndexes(int[] mass) {
        String res = "[";
        for (int i = 0; i < mass.length; i += 2) {
            if (res != "[") {
                res += ", ";
            }
            res += mass[i];
        }
        return res + "]";
    }

    /**
     * 5) Дан массив целых чисел. Выведите все четные элементы массива.
     * Указание:
     * Для проверки четности элемента массива реализовать отдельный метод isEven,
     * который будет проверять, является ли переданный ей элемент четным.
     */
    public static boolean isEven(int i) {
        return i % 2 == 0;
    }

    public static String evenData(int[] mass) {
        String res = "[";
        for (int i = 0; i < mass.length; i++) {
            if (isEven(mass[i])) {
                if (res != "[") {
                    res += ", ";
                }
                res += mass[i];
            }
        }
        return res + "]";
    }

    /**
     * 6) Дан массив целых чисел. Определить количество положительных элементов в данном массиве.
     */
    public static int countPositive(int[] mass) {
        int res = 0;
        for (int var : mass) {
            if (var > 0) {
                res++;
            }
        }
        return res;
    }

    /**
     * 7) Дан массив целых чисел. Выведите все элементы массива, которые больше предыдущего элемента.
     */
    public static String greatPrev(int[] mass) {
        String res = "[";
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > mass[i - 1]) {
                if (res != "[") {
                    res += ", ";
                }
                res += mass[i];
            }
        }
        return res + "]";
    }

    /**
     * 8) Дан массив целых чисел. Если в нем есть два соседних элемента одного знака,
     * выведите эти числа. Если соседних элементов одного знака нет - не выводите ничего.
     * Если таких пар соседей несколько - выведите первую пару.
     * 1 2 3 4 5
     * ответ 1 2
     * -1 -2 1 2 3
     * ответ -1 -2
     */
    public static int[] sameNeighbours(int[] mass) {
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] < 0 && mass[i - 1] < 0 || mass[i] > 0 && mass[i - 1] > 0) {
                return new int[]{mass[i - 1], mass[i]};
            }
        }
        return new int[]{};
    }

    /**
     * 9) Дан массив целых чисел. Определите, сколько в этом массиве элементов,
     * которые больше двух своих соседей и выведите количество таких элементов.
     */
    public static int greaterNeighbours(int[] mass) {
        int count = 0;
        for (int i = 1; i < mass.length - 1; i++) {
            if (mass[i + 1] < mass[i] && mass[i - 1] < mass[i]) {
                count++;
            }
        }
        return count;
    }

    /**
     * 10) Дан массив целых чисел. Выведите значение наибольшего элемента в массиве
     */
    public static int max(int[] mass) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        return max;
    }


    /**
     * 12) Дан массив целых чисел. Выведите значение наименьшего из всех
     * положительных элементов в массиве. Известно, что в массиве есть хотя бы один положительный элемент.
     */
    public static int minPositive(int[] mass) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min && mass[i] > 0) {
                min = mass[i];
            }
        }
        return min;
    }

    /**
     * 13) Дан массив целых чисел. Выведите значение наименьшего нечетного
     * элемента массива, а если в массиве нет нечетных элементов см. способы реализации.
     * Вернуть значение 0 при отсутствии элементов, удовлетворяющих условию задачи
     */
    public static int minOdd(int[] mass) {
        int min = Integer.MAX_VALUE;
        boolean t = false;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] <= min && !isEven(mass[i])) {
                min = mass[i];
                t = true;
            }
        }
        return t ? min : 0;
    }

    public static Integer minOdd2(int[] mass) {
        int min = Integer.MAX_VALUE;
        boolean t = false;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] <= min && !isEven(mass[i])) {
                min = mass[i];
                t = true;
            }
        }
        return t ? min : null;
    }

    /**
     * 16) Дан массив целых чисел, упорядоченный по неубыванию элементов в нем.
     * Определите, сколько в нем различных элементов (количество неравных друг другу элементов).
     */
    public static int countDifferent(int[] mass) {
        int count = 1;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] != mass[i - 1]) {
                count++;
            }
        }
        return count;
    }

    /**
     * 17) Дан массив целых чисел. Переставьте элементы
     * данного массива в обратном порядке. Метод должен производить разворот
     * исходного массива, ничего не возвращая.
     */
    public static void reverse(int[] mass) {
        for (int i = 0; i < mass.length / 2; i++) {
            int temp = mass[i];
            mass[i] = mass[mass.length - i - 1];
            mass[mass.length - i - 1] = temp;
        }
    }

    /**
     * 18) Дан массив целых чисел. Переставьте соседние
     * элементы массива. Если элементов нечетное число, то последний
     * элемент остается на своем месте.
     */
    public static void reverseNeighbours(int[] mass) {
        for (int i = 0; i < mass.length / 2; i += 2) {
            int temp = mass[i];
            mass[i] = mass[i + 1];
            mass[i + 1] = temp;
        }
    }

    /**
     * 21) Дан массив целых чисел и параметр k. Если данный параметр истинный,
     * то выполнить циклический сдвиг массива на одну позицию вправо, если ложный,
     * то влево. Метод должен производить операции над массивом, ничего не возвращая.
     */
    public static void shift1(int[] mass, boolean n) {
        if (n) {
            int a = mass[mass.length - 1];
            for (int i = mass.length - 1; i > 0; i--) {
                mass[i] = mass[i - 1];
            }
            mass[0] = a;
        } else {
            int a = mass[0];
            for (int i = 0; i < mass.length - 1; i++) {
                mass[i] = mass[i + 1];
            }
            mass[mass.length - 1] = a;
        }
    }

    /**
     * 22) Дан массив целых чисел и число k. Выполнить циклический
     * сдвиг массива на |k| позиций вправо, если k>0 или влево, если k<0.
     * Метод должен производить операции над массивом, ничего не возвращая.
     */
    public static void shift2(int[] mass, int n) {
        int abs = Math.abs(n);
        for (int i = 0; i < abs; i++) {
            shift1(mass, n > 0);
        }
    }

    /**
     * 29) Дан массив целых чисел и число key.
     * Методом линейного поиска при помощи цикла for найти
     * индекс вхождения числа key в массиве
     */
    public static int search(int[] mass, int key) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 29.1) Модернизировать программу таким образом,
     * чтобы она вернула индексы всех вхождений числа key в массиве.
     */
    public static int[] search2(int[] mass, int key) {
        int count = 0;
        for (int val : mass) {
            if (val == key) {
                count++;
            }
        }
        int[] res = new int[count];
        for (int i = 0, j = 0; i < mass.length; i++) {
            if (mass[i] == key) {
                res[j++] = i;
            }
        }
        return res;
    }

    /**
     * 11) Дан массив целых чисел. Выведите все индексы наибольшего значения данного массива
     */
    public static int[] maxValues(int[] mass) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int val : mass) {
            max = Math.max(max, val);
            if (val == max) {
                count++;
            }

        }
        int[] res = new int[count];
        for (int i = 0, j = 0; i < mass.length; i++) {
            if (mass[i] == max) {
                res[j++] = i;
            }
        }
        return res;
    }

    /**
     * 30) Даны два массива целых чисел. Сравнить их на равенство.
     */
    public static boolean equals(int[] mass, int[] mass2) {
        if (mass.length != mass2.length) {
            return false;
        }

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != mass2[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 31) Даны два массива целых чисел. Сравнить их на равенство по
     * содержанию, то есть не учитывая порядок этих элементов.
     */
    public static boolean equalsIgnoreCase(int[] mass, int[] mass2) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass2.length; j++) {
                if (mass[i] == mass2[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 32.1) Дан массив целых чисел. Определить,
     * является ли он упорядоченным
     */
    private static boolean isOrderAsc(int[] mass) {
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] < mass[i + 1]) {
                return true;
            }
        }
        return false;
    }

    private static boolean isOrderDesc(int[] mass) {
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] > mass[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean isOrder(int[] mass) {
        return isOrderAsc(mass) || isOrderDesc(mass);
    }

    /**
     * 37) Дан массив вещественных чисел. Сформировать его строковое
     * представление в формате JSON следующем порядке: первое число,
     * последнее, второе, предпоследнее и так далее все числа
     */
    public static String towards(int[] mass) {
        String res = "[";
        for (int i = 0; i < mass.length / 2; i++) {
            if (res != "[") {
                res += ", ";
            }
            res += mass[i] + ", ";
            res += mass[mass.length - i - 1];
        }

        if (mass.length % 2 != 0) {
            res += ", " + mass[mass.length / 2];
        }

        return res + "]";
    }
}

