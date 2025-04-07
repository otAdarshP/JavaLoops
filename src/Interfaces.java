public class Interfaces {
    public static void main(String[] args) {
        FinalDetails obj = new FinalDetails();
        obj.gf_name();
        obj.gf_city();
        obj.f_name();
        obj.f_city();
    }
}


interface GrandFather {
    void gf_name();
    void gf_city();
}

interface Father extends GrandFather {
    void f_name();
    void f_city();
}

abstract class Details implements Father {
    public void gf_name() {
        System.out.println("MANOJ");
    }

    public void gf_city() {
        System.out.println("CHANDIGARH");
    }

    public void f_name() {
        System.out.println("KUMAR");
    }

    public void f_city() {
        System.out.println("DELHI");
    }
}
class FinalDetails extends Details{
    void display() {
        System.out.print("FINAL DEF");
    }
};

