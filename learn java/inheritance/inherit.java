class employee{
    int salary = 40000;
    String dept = "cs";
}

class programmer extends employee{
    int bonus = 10000;
}

public class inherit {
    public static void main(String[] args) {
        
        programmer p = new programmer();
        
        System.out.println(p.salary + " " + p.dept +" "+ p.bonus);

        employee e = new employee();
        System.out.println(e.salary);

    }
}
