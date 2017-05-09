package Tutorials30DayOfCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by sattallah on 8/21/2016.
 */
public class Day8DictionariesAndMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> myMap = new HashMap<>();
        ArrayList<String> names = new ArrayList<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            myMap.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            names.add(s);
        }
        in.close();
        for (int i = 0; i<names.size(); i++) {
            if (myMap.containsKey(names.get(i))){
                System.out.println(names.get(i) + "=" + myMap.get(names.get(i)));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
