package question;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChildTest {
    Child subject;

    @Before
    public void setup() {
        subject = new Child();
    }

    @Test
    public void childReportsChildFooFromPrintFromChildClass() {
        assertEquals("foo = Child-foo", subject.print());
    }

    @Test
    public void childReportsChildFooFromPrintFromParentTypeOfChildClass() {
        Parent parentRef = new Child();
        assertEquals("foo = Child-foo", parentRef.print());
    }
}
