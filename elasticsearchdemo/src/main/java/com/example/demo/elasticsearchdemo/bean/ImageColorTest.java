package com.example.demo.elasticsearchdemo.bean;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ImageColorTest {

    public static void main(String[] args) {
        ImageColor imageColor1 = new ImageColor(1, "5f287d40b79d4fa1bb0ded66c78aaa0b");
        //System.out.println(imageColor1.getCuid().length());
        ImageColor imageColor2 = new ImageColor(1, "5f287d40b79d4fa1bb0ded66c78aaa0b");
        ImageColor imageColor3 = new ImageColor(1, "5f287d40b79d4fa1bb0ded66c78aaa0b");
        ImageColor imageColor4 = new ImageColor(2, "92e5e63e2a6a47c890dd66894546ee8a");
        ImageColor imageColor5 = new ImageColor(3, "6cdfd3b2f84149bc87b577c9e0f5de20");
        ImageColor imageColor6 = new ImageColor(4, "277f34b26fd14fda9c16d4c8b0302323");
        List<ImageColor> list = new ArrayList<>();
        list.add(imageColor1);
        list.add(imageColor2);
        list.add(imageColor3);
        list.add(imageColor4);
        list.add(imageColor5);
        list.add(imageColor6);

        List<ImageColor> newList = list.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(ImageColor::getCuid))), ArrayList::new));

        for (int i=0; i < newList.size(); i++) {
            List<String> cuids = new ArrayList<>();
            for (int j=0 ; j < list.size(); j++) {
                if (newList.get(i).getId() == (list.get(j).getId())) {
                    cuids.add(list.get(j).getCuid());
                }
            }
            newList.get(i).setCuids(cuids);
        }

      for (ImageColor imageColor : newList) {
          System.out.println(imageColor);
      }
    }
}
