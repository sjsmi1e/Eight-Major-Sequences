package com.smile;

import java.util.*;

/**
 * @author smi1e
 * Date 2019/8/8 15:42
 * Description 堆排序（大顶堆）
 */
public class HeapSort {


    public static void heapSort(List<Integer> list) {
        for (int i = (list.size() - 2) >>> 1; i >= 0; i--) {
            adjust(list, i, list.size() - 1);
        }
        for (int i = list.size() - 1; i > 0; i--) {
            swap(list, i, 0);
            adjust(list, 0, i - 1);
        }

    }

    /**
     * buildMaxHeap方法（pushdown），时间复杂度o（n），静态
     * @param list
     * @param i
     * @param len
     */
    private static void adjust(List<Integer> list, int i, int len) {
        int parent = i;
        int temp = list.get(parent);
        int p = (parent << 1) + 1;
        while (p <= len) {
            int r = (parent << 1) + 2;
            if (r <= len && list.get(p) < list.get(r)) {
                p = r;
            }
            if (list.get(p) > temp) {
                list.set(parent, list.get(p));
                parent = p;
                p = (parent << 1) + 1;
            } else {
                break;
            }
        }
        list.set(parent, temp);
    }

    /**
     * maxHeapInsert（pushup方法），时间复杂度o（nlogn），动态
     * @param list
     * @param i
     */
    private static void adjust2(List<Integer> list, int i) {
        int len = i;
        int parent = (len - 1) >> 1;
        int t = list.get(len);
        while (parent >= 0) {
            if (t > list.get(parent)) {
                list.set(len, list.get(parent));
                len = parent;
                parent = (parent - 1) >> 1;
            } else {
                break;
            }
        }
        list.set(len, t);
    }

    private static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
