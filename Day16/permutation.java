package Day16;
import java.util.*;

public class permutation {
    List<List<Integer>> ll; //global variable

     public List<List<Integer>> permute(int[] nums){
        ll=new ArrayList<>();
        permutations(nums,new ArrayList<Integer>());
        return ll;
     }

     public void permutations(int [] nums, ArrayList<Integer> arr){
        if(arr.size()==nums.length){
            ll.add(new ArrayList<Integer>(arr));
            return;
        }
        for(int i:nums){ // this loops works on elements instead of indices
            if(!arr.contains(i)){
                arr.add(i);
                permutations(nums,arr);
                arr.remove(arr.size()-1);//removing last element added
            }
        }
     }
    
}
