package com.smile;

import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author smi1e
 * Date 2019/8/7 11:40
 * Description 插入排序
 */
public class InsertionSort {


    /**
     * 从已经排序好的元素中插入
     *
     * @param list
     */
    public static void insertionSort(List<Integer> list) {
        int len = list.size();
        for (int i = 0; i < len; i++) {
            int t = list.get(i);
            int j = i - 1;
            for (; j >= 0; j--) {
                if (t < list.get(j)) {
                    list.set(j + 1, list.get(j));
                } else {
                    break;
                }
            }
            list.set(j + 1, t);
        }
    }


    public static void selectionSort(List<Integer> list) {
        int len = list.size();
        for (int i = 0; i < len; i++) {

        }

    }


}
