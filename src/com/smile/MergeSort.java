package com.smile;

import java.util.ArrayList;
import java.util.List;

/**
 * @author smi1e
 * Date 2019/8/9 10:38
 * Description 归并排序
 */
public class MergeSort {


    public static void mergeSort(List<Integer> list) {
        sort(list, 0, list.size() - 1);
    }

    private static void sort(List<Integer> list, int s, int e) {
        int mid = (e + s) >>> 1;
        if (s < e) {
            sort(list, s, mid);
            sort(list, mid + 1, e);
            merge(list, s, e, mid);
        }
    }

    private static void merge(List<Integer> list, int s, int e, int mid) {
        List<Integer> temp = new ArrayList<>(e - s + 1);
        int start = s, start2 = mid + 1;
        while (start <= mid && start2 <= e) {
            if (list.get(start) > list.get(start2)) {
                temp.add(list.get(start2++));
            } else {
                temp.add(list.get(start++));
            }
        }
        while (start <= mid) {
            temp.add(list.get(start++));
        }
        while (start2 <= e) {
            temp.add(list.get(start2++));
        }
        for (int index = 0, i = s; index < temp.size(); i++, index++) {
            list.set(i, temp.get(index));
        }
    }
}
