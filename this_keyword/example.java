package this_keyword;

public class example {

    int id;
    String name;

    example(int id,String name){
        this.id = id;
        this.name = name;
    }

    void dispaly(){
        System.out.println(id + name);
    }
    public static void main(String[] args) {
        example e = new example(10, "mashood");
        e.dispaly();
    }
}
