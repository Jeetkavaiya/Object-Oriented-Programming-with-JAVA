package OOPs.Abstract;

public class Son extends Parent{
    public Son(int age) {
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am going to be an Entrepreneur");
    }

    @Override
    void partner() {
        System.out.println("I love Hailee Steinfeld");
    }
}
