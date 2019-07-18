package other;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5};
        int n = 2;
        ArrayList list = new ArrayList();

        int count = a.length / n;
        int rest = a.length % n;
        System.out.println(count);
        for(int i = 0 ;i < count; i++){
            for(int j = (i+1)*n-1;j>=i*n;j--){
                System.out.print(a[j]+"  ");
                list.add(a[j]);

            }
            System.out.println();
        }
        System.out.println(list.size());
        for(int i = a.length-rest;i<a.length;i++){
            list.add(a[i]);
        }

        for(int i = 0;i < list.size();i++ ){
            System.out.print(list.get(i)+" ");
        }

    }
}
