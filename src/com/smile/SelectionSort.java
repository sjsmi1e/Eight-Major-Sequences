package com.smile;

import java.util.List;

/**
 * @author smi1e
 * Date 2019/8/8 15:17
 * Description 选择排序
 */
public class SelectionSort {

    public static void selectionSort(List<Integer> list) {
        int len = list.size();
        for (int i = 0; i < len; i++) {
            int index = i;
            for (int j = i; j < len; j++) {
                if (list.get(index) > list.get(j)) {
                    index = j;
                }
            }
            //交换
            int temp = list.get(i);
            list.set(i, list.get(index));
            list.set(index, temp);
        }
    }
}
