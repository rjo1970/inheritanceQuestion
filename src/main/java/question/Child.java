package question;

public class Child extends Parent {
    protected String foo = "Child-foo";

    public String print() {
        return "foo = " + foo;
    }
}
