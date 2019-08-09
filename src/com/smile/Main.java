package com.smile;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author smi1e
 * Date 2019/8/8 15:14
 * Description
 */
public class Main {
    private static int SORTSIZE = 100000;

    private static List<Integer> initList(List<Integer> list) {
        List<Integer> res = new ArrayList<>(SORTSIZE);
        for (int i = 0; i < SORTSIZE; i++) {
            res.add(list.get(i));
        }
        return res;
    }

    public static void main(String[] args) {
        Random ra = new Random();
        List<Integer> list = new ArrayList<>(SORTSIZE);
        for (int i = 0; i < SORTSIZE; i++) {
            list.add(ra.nextInt(100) + 1);
        }
//        //时间测试
        long s = System.currentTimeMillis();

        s = System.currentTimeMillis();
        InsertionSort.insertionSort(initList(list));
        System.out.println("插入排序用时：" + (System.currentTimeMillis() - s));

        s = System.currentTimeMillis();
        ShellSort.shellSort(initList(list));
        System.out.println("希尔排序用时：" + (System.currentTimeMillis() - s));

        s = System.currentTimeMillis();
        BubbleSort.bubbleSort(initList(list));
        System.out.println("冒泡排序用时：" + (System.currentTimeMillis() - s));

        s = System.currentTimeMillis();
        SelectionSort.selectionSort(initList(list));
        System.out.println("选择排序用时：" + (System.currentTimeMillis() - s));

        s = System.currentTimeMillis();
        RadixSort.radixSort(initList(list));
        System.out.println("基数排序用时：" + (System.currentTimeMillis() - s));

        s = System.currentTimeMillis();
        MergeSort.mergeSort(initList(list));
        System.out.println("归并排序用时：" + (System.currentTimeMillis() - s));

        s = System.currentTimeMillis();
        QuickSort.quickSort(initList(list));
        System.out.println("快速排序用时：" + (System.currentTimeMillis() - s));

        s = System.currentTimeMillis();
        HeapSort.heapSort(initList(list));
        System.out.println("堆排序用时：" + (System.currentTimeMillis() - s));
    }
}
