package jav.Task_8;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
    private long max;
    List<Integer> list = new ArrayList<>();
    List<Integer> listMinus = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    public FibonacciSequence(long max) {
        this.max = max;
        createSequence();
        getByRange(-30000,20);
    }

    public void createSequence() {
        list.add(0);
        list.add(1);
        int next;
        int i;
        for (i=1; (next = list.get(i)+list.get(i-1)) < max;i++) {
            list.add(next);
        }
        if(i%2==1){
            i--;
        }
        for(;i>1;i-=2){
            listMinus.add(-list.get(i));
        }

//        for(int k:listMinus){
//            System.out.println(k);
//        }
//        System.out.println("_______________");
//        for(int s:list){
//            System.out.println(s);
//        }
    }

    void getByRange(int first, int last){
        if(first<0) {
            for(int i=0;i<listMinus.size();i++){
                if(listMinus.get(i)<first) continue;
                sb.append(listMinus.get(i)).append(", ");
            }
            if(last<0){
                sb.delete(sb.length()-2, sb.length());
            }
        }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)<first) continue;
                sb.append(list.get(i)).append(", ");
            }
            sb.delete(sb.length()-2, sb.length());

        System.out.println(sb.toString());

    }





    void getByLength(int len){

    }
}
