package org.dozza.program;

import org.dozza.arrays.ArraysUtil;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aaaaa");

        System.out.println("bbbbb");
        /**
         * 1) Дан массив целых чисел. Заполнить данный массив с клавиатуры
         * Scanner подать как аргумент метода
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в массиве:");
        int k = scanner.nextInt();
        int[] mass = new int[k];
        System.out.println("Введите " + k + " чисел:");
        ArraysUtil.fill(mass, scanner);
        System.out.println(Arrays.toString(mass));

        /**
         * 2) Дан массив целых чисел. Заполнить данный массив числами в диапазоне от a до b
         * Указание:
         * Для генерации случайного числа в диапазоне от a до b реализовать отдельный метод getRandomNumber
         */
        /*System.out.println("Введите диапазон:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        ArraysUtil.fillRandom(mass, a, b);
        System.out.println(Arrays.toString(mass));*/

        /**
         * 3) Дан массив целых чисел. Преобразовать данный массив в строковое значение в формате JSON
         */
        /*System.out.println("Строковое значение в формате JSON");
        String toString = ArraysUtil.toString(mass);
        System.out.println(toString);*/

        /**
         * 4) Дан массив целых чисел. Выведите все элементы
         * массива с четными индексами. В программе запрещено
         * использовать условную инструкцию для проверки четности индексов.
         */
        /*System.out.println("Четные индексы");
        String evenIndexes = ArraysUtil.evenIndexes(mass);
        System.out.println(evenIndexes);*/

        /**
         * 5) Дан массив целых чисел. Выведите все четные элементы массива.
         * Указание:
         * Для проверки четности элемента массива реализовать отдельный метод isEven,
         * который будет проверять, является ли переданный ей элемент четным.
         */
        /*System.out.println("Четные элементы");
        String evenData = ArraysUtil.evenData(mass);
        System.out.println(evenData);*/

        /**
         * 6) Дан массив целых чисел. Определить количество положительных элементов в данном массиве.
         */
        /*System.out.println("Кол-во положительных элементов");
        int countPositive = ArraysUtil.countPositive(mass);
        System.out.println(countPositive);*/

        /**
         * 7) Дан массив целых чисел. Выведите все элементы массива, которые больше предыдущего элемента.
         */
        /*System.out.println("Элементы, которые больше предыдущего");
        String greatPrev = ArraysUtil.greatPrev(mass);
        System.out.println(greatPrev);*/

        /**
         * 8) Дан массив целых чисел. Если в нем есть два соседних элемента одного знака,
         * выведите эти числа. Если соседних элементов одного знака нет - не выводите ничего.
         * Если таких пар соседей несколько - выведите первую пару.
         */
        /*System.out.println("Два соседних эелемнта");
        int[] sameNeighbours = ArraysUtil.sameNeighbours(mass);
        System.out.println(Arrays.toString(sameNeighbours));*/

        /**
         * 9) Дан массив целых чисел. Определите, сколько в этом массиве элементов,
         * которые больше двух своих соседей и выведите количество таких элементов.
         */
        /*System.out.println("Кол-во элементов, которые больше 2 соседних");
        int greaterNeighbours = ArraysUtil.greaterNeighbours(mass);
        System.out.println(greaterNeighbours);*/

        /**
         * 10) Дан массив целых чисел. Выведите значение наибольшего элемента в массиве
         */
        /*System.out.println("Наибольший элемент");
        int max = ArraysUtil.max(mass);
        System.out.println(max);*/

        /**
         * 12) Дан массив целых чисел. Выведите значение наименьшего из всех
         * положительных элементов в массиве. Известно, что в массиве есть хотя бы один положительный элемент.
         */
        /*System.out.println("Наименьшее из положительных");
        int minPositive = ArraysUtil.minPositive(mass);
        System.out.println(minPositive);*/

        /**
         * 13) Дан массив целых чисел. Выведите значение наименьшего нечетного
         * элемента массива, а если в массиве нет нечетных элементов см. способы реализации.
         *
         */
        /*System.out.println("Наименьшее нечетное");
        int minOdd1 = ArraysUtil.minOdd(mass);
        Integer minOdd2 = ArraysUtil.minOdd2(mass);
        System.out.println(minOdd1);
        System.out.println(minOdd2);*/

        /**
         * 16) Дан массив целых чисел, упорядоченный по неубыванию элементов в нем.
         * Определите, сколько в нем различных элементов (количество неравных друг другу элементов).
         */
        /*System.out.println("Кол-во неравных друг другу элементов");
        int countDifferent = ArraysUtil.countDifferent(mass);
        System.out.println(countDifferent);*/

        /**
         * 17) Дан массив целых чисел. Переставьте элементы
         * данного массива в обратном порядке. Метод должен производить разворот
         * исходного массива, ничего не возвращая.
         */
        /*System.out.println("В обратном порядке");
        ArraysUtil.reverse(mass);
        System.out.println(Arrays.toString(mass));*/

        /**
         * 18) Дан массив целых чисел. Переставьте соседние
         * элементы массива. Если элементов нечетное число, то последний
         * элемент остается на своем месте.
         */
        /*System.out.println("Перестановка элементов");
        ArraysUtil.reverseNeighbours(mass);
        System.out.println(Arrays.toString(mass));*/

        /**
         * 21) Дан массив целых чисел и параметр k. Если данный параметр истинный,
         * то выполнить циклический сдвиг массива на одну позицию вправо, если ложный,
         * то влево. Метод должен производить операции над массивом, ничего не возвращая.
         */
        /*System.out.println("Циклический сдвиг массива");
        System.out.println("Введите true/false");
        boolean n = scanner.nextBoolean();
        ArraysUtil.shift1(mass, n);
        System.out.println(Arrays.toString(mass));*/

        /**
         * 22) Дан массив целых чисел и число k. Выполнить циклический
         * сдвиг массива на |k| позиций вправо, если k>0 или влево, если k<0.
         * Метод должен производить операции над массивом, ничего не возвращая.
         */
        /*System.out.println("Циклический сдвиг массива");
        System.out.println("Введите число");
        int n = scanner.nextInt();
        ArraysUtil.shift2(mass, n);
        System.out.println(Arrays.toString(mass));*/

        /**
         * 29) Дан массив целых чисел и число key.
         * Методом линейного поиска при помощи цикла for найти
         * индекс вхождения числа key в массиве
         */
        /*int key = scanner.nextInt();
        int search = ArraysUtil.search(mass, key);
        System.out.println(search);*/

        /** 29.1) Модернизировать программу таким образом,
         * чтобы она вернула индексы всех вхождений числа key в массиве.
         */
        /*int key = scanner.nextInt();
        int[] search2 = ArraysUtil.search2(mass, key);
        System.out.println(Arrays.toString(search2));*/

        /**
         * 11) Дан массив целых чисел. Выведите все индексы наибольшего значения данного массива
         */
        /*System.out.println("Индекс наибольшего значения");
        int[] maxValues = ArraysUtil.maxValues(mass);
        System.out.println(Arrays.toString(maxValues));*/

        /**
         * 30) Даны два массива целых чисел. Сравнить их на равенство.
         */
        System.out.println("Введите кол-во чисел в массиве:");
        int k2 = scanner.nextInt();
        int[] mass2 = new int[k2];
        System.out.println("Введите " + k2 + " чисел:");
        ArraysUtil.fill(mass2, scanner);
        System.out.println(Arrays.toString(mass2));

        System.out.println("Сравнение двух массивов");
        boolean equals = ArraysUtil.equals(mass, mass2);
        System.out.println(equals);

        /**
         * 31) Даны два массива целых чисел. Сравнить их на равенство по
         * содержанию, то есть не учитывая порядок этих элементов.
         */
        /*System.out.println("Введите кол-во чисел в массиве:");
        int k2 = scanner.nextInt();
        int[] mass2 = new int[k2];
        System.out.println("Введите " + k2 + " чисел:");
        ArraysUtil.fill(mass2, scanner);
        System.out.println(Arrays.toString(mass2));

        System.out.println("Сравнение двух массивов");
        boolean equalsIgnoreCase = ArraysUtil.equalsIgnoreCase(mass, mass2);
        System.out.println(equalsIgnoreCase);*/

        /**
         * 32.1) Дан массив целых чисел. Определить, является ли он упорядоченным
         */
        /*System.out.println("Является ли массив упорядоченным");
        boolean isOrder = ArraysUtil.isOrder(mass);
        System.out.println(isOrder);*/

        /**
         * 37) Дан массив вещественных чисел. Сформировать его строковое
         * представление в формате JSON следующем порядке: первое число,
         * последнее, второе, предпоследнее и так далее все числа
         */
        /*String towards = ArraysUtil.towards(mass);
        System.out.println(towards);*/
    }
}


