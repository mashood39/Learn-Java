public class para {

    int id;
    String name;

    para(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void dispaly() {
        System.out.println(id + name);
    }

    public static void main(String[] args) {
        para p = new para(10, "mashood");
        p.dispaly();
    }
}
