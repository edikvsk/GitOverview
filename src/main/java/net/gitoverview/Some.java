package net.gitoverview;

public class Some extends Base {

    private String someString1;

    private String someString2;

    public String getSomeString1() {
        return someString1;
    }

    public void setSomeString1(String someString1) {
        this.someString1 = someString1;
    }

    public String getSomeString2() {
        return someString2;
    }

    public void setSomeString2(String someString2) {
        this.someString2 = someString2;
    }

    @Override
    public String toString() {
        return "Some{" +
                "someString1='" + someString1 + '\'' +
                ", someString2='" + someString2 + '\'' +
                '}';
    }
}
