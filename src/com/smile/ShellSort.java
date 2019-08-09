package com.smile;


import java.util.List;

/**
 * @author smi1e
 * Date 2019/8/8 15:13
 * Description 希尔排序
 */
public class ShellSort {
    /**
     * 希尔排序(从小到大)
     *
     * @param list
     */
    public static void shellSort(List<Integer> list) {
        int len = list.size();
        //初始化gap的值,这里为len/2
        for (int gap = len >> 1; gap >= 1; gap = gap >> 1) {
            //分组
            for (int s = 0; s < len - gap; s++) {
                //插入排序
                for (int j = s; j < len; j = j + gap) {
                    int t = list.get(j);
                    int k = j - gap;
                    for (; k >= s; k = k - gap) {
                        if (list.get(k) > t) {
                            list.set(k + gap, list.get(k));
                        } else {
                            break;
                        }
                    }
                    list.set(k + gap, t);
                }
            }
        }
    }
}
