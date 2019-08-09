package com.smile;

import java.util.List;

/**
 * @author smi1e
 * Date 2019/8/8 20:53
 * Description 快速排序
 */
public class QuickSort {
    public static void quickSort(List<Integer> list) {
        sort(list, 0, list.size() - 1);
    }


    private static void sort(List<Integer> list, int s, int e) {
        if (s >= e) {
            return;
        }
        int t = list.get(s);
        int start = s, end = e;
        while (start < end) {
            while (start < end && list.get(end) >= t) {
                end--;
            }
            if (start < end) {
                list.set(start, list.get(end));
                start++;
            }
            while (start < end && list.get(start) <= t) {
                start++;
            }
            if (start < end) {
                list.set(end, list.get(start));
                end--;
            }
        }
        list.set(start, t);
        sort(list, s, start);
        sort(list, end + 1, e);
    }

}
