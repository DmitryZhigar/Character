package com.zhigar.algoritm;

import java.util.ArrayList;
public class DetailSort {

    public static ArrayList<Detail> sortDetail(ArrayList<Detail> details) {

        ArrayList<Detail> first = new ArrayList<>();
        ArrayList<Detail> second = new ArrayList<>();

        for (Detail detail : details) {
            if (detail.getSt1() <= detail.getSt2()) {
                first.add(detail);
            } else {
                second.add(detail);
            }
        }

        first.sort((detail1, detail2) -> {
            if (detail1.getSt1() <= detail2.getSt1()) {
                return -1;
            } else return 1;

        });

        second.sort((detail1, detail2) -> {
            if (detail1.getSt2() <= detail2.getSt2()) {
                return 1;
            } else return -1;

        });
        first.addAll(second);
        return first;
    }

   /* static ArrayList<Detail> takeDetail(ArrayList<Detail> details) {
        ArrayList<Detail> detailLinkedList = new ArrayList<>();
        int i = 0;
        while (!details.isEmpty()) {
            Detail minDetail = details.get(0);
            if (minDetail.getSt1() <= minDetail.getSt2()) {
                for (Detail detail : details) {
                    if (detail.getSt1() <= detail.getSt2()) {
                        minDetail = detail;
                    }
                }
                detailLinkedList.add(detailLinkedList.size() - i, minDetail);
                i++;
                details.remove(minDetail);
            } else {
                for (Detail detail : details) {
                    if (detail.getSt2() < detail.getSt1()) {
                        minDetail = detail;
                    }
                }
                detailLinkedList.add(detailLinkedList.size(), minDetail);
                details.remove(minDetail);
            }
        }
        return detailLinkedList;
    }*/
}
