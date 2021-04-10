package project;

import java.util.*;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("jeong", "pro", "jkd", "java");
        long count = 0;
        for(String name : names) {
            if(name.contains("o"))
                count++;
        }
        System.out.println("Count : " + count);

        count = 0;
        count = names.stream().filter(x->x.contains("o")).count();
        System.out.println("Count : " + count);


        

    }

}
