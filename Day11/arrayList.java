import java.util.ArrayList;
import java.util.Collections;
public class arrayList {
    public static void main(String[] args){
        //syntax
        ArrayList<Integer> arr= new ArrayList<>(2);
        System.out.println(arr.size());

        //adding element
        arr.add(1);
        arr.add(2);
        arr.add(6);
        arr.add(4);
        arr.add(3);
        // accessing an element
        /*System.out.println(arr.get(2)); //3

        //removing an element
        System.out.println(arr.remove(3)); // returns the element that was removed // 4

        System.out.println(arr.get(3)); // 5 is op

        //update
        arr.set(0,10);
        System.out.println(arr.get(0));

        System.out.println(arr.set(0,10));
        System.out.println(arr.size());
        System.out.println(arr);
        //sorting*/
        Collections.sort(arr);
        System.out.println(arr);
        

    }
    
}
