class dept { //parent class
    String branch = "cse";
}

class student extends dept { //child class
    void printBranch() {
        System.out.println(super.branch);
    }
}

public class supr {

    public static void main(String[] args) {
        student s1 = new student();
        s1.printBranch();
    }
}
