package Day12;

public class store {
    int id_no=0;
    String customername="";
    int price=0;
    private int fruit_code=-1;
    private int fruit_color=-1;
    //Branch class branch obj= new Branch();
    fruits f= new fruits();
    color c=new color();

    public store(){}

    public store(
        int id,
        String name,
        int cost,
        int code,
        int color

    )
    {
        this.id_no=id;
        this.customername=name;
        this.price=cost;
        this.fruit_code=code;
        this.fruit_color=color;


    }

    public int getFruitcolor(){
        return this.fruit_color;
    }

    public int getFruitcode(){
        return this.fruit_code;
    }

    public void setFruitcode(int change){
        this.fruit_code=change;
    }
    

}
