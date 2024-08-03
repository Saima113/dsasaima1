package Day12;

public class ilikefruits {
    public static void display(store s){
        System.out.println(s.id_no);
        System.out.println(s.customername);
        System.out.println(s.price);
       if(s.getFruitcode() == s.getFruitcolor()){
        System.out.println(s.f.fruit[s.getFruitcode()]);
        System.out.println(s.c.collection[s.getFruitcolor()]); //s.branch.branches array[s.getBranchCode()
       }
       else{
        System.out.println("fruit and it's color don't match");
       }
        
    }
     public static void main (String[] args){
        store s1= new store();
        store hi=new store(
            34,
            "saima",
            250,
            2,
            2
        );
        hi.setFruitcode(0);
        display(hi);

     }
}
