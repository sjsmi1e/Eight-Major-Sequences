package com.smile;

import java.util.ArrayList;
import java.util.List;

/**
 * @author smi1e
 * Date 2019/8/8 17:10
 * Description 基数排序
 */
public class RadixSort {

    static class Node {
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }

    /**
     * 基数排序
     *
     * @param list
     */
    public static void radixSort(List<Integer> list) {
        Node[] tong = new Node[10];
        int maxTimes = getMaxTimes(list);
        int time = 10;
        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 0; j < list.size(); j++) {
                int t = list.get(j);
                int i1 = (t % time) / (time / 10);
                Node n = tong[i1];
                while (true) {
                    if (tong[i1] == null) {
                        tong[i1] = new Node(t);
                        break;
                    }
                    if (n.next == null) {
                        n.next = new Node(t);
                        break;
                    } else {
                        n = n.next;
                    }
                }

            }
            time *= 10;
            list.clear();
            for (int k = 0; k < 10; k++) {
                for (Node node = tong[k]; node != null; node = node.next) {
                    list.add(node.val);
                }
                tong[k] = null;
            }
        }
    }

    /**
     * 获取最大位数
     *
     * @param list
     * @return
     */
    private static int getMaxTimes(List<Integer> list) {
        int max = -Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = max > list.get(i) ? max : list.get(i);
        }
        int res = 0;
        while (max != 0) {
            res++;
            max = max / 10;
        }
        return res;
    }
}
