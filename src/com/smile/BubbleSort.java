package com.smile;

import java.util.List;

/**
 * @author smi1e
 * Date 2019/8/8 16:50
 * Description 冒泡排序
 */
public class BubbleSort {

    public static void bubbleSort(List<Integer> list) {
        int len = list.size();
        for (int i = 0; i < len; i++) {
            boolean flag = false;
            for (int j = 1; j < len - i; j++) {
                if (list.get(j - 1) > list.get(j)) {
                    int t = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, t);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
