package com.codes.strings;

import java.util.ArrayList;
import java.util.List;

public class ServiceIdSequence {
    public static void main(String[] args) {
        String serviceId = "a00001";
        int count =12;
        List<String> newServiceIdList = createOtherServiceIds(serviceId, count);
        System.out.println(newServiceIdList);
    }

    private static List<String> createOtherServiceIds(String serviceId, int count) {
        List<String> newServiceIdList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String prefixLetter = serviceId.substring(0,1);
        int sequenceNum = Integer.parseInt(serviceId.substring(1));
        for (int i = 0; i < count; i++) {
            sequenceNum++;
            String newSequenceNum= String.format("%05d", sequenceNum);
            String resultingString = prefixLetter+newSequenceNum;
            newServiceIdList.add(resultingString);
        }

        return newServiceIdList;
    }

}
