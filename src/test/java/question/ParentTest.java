package question;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParentTest {

    Parent subject;

    @Before
    public void setup() {
        subject = new Parent();
    }

    @Test
    public void parentReportsParentFooFromPrint() {
        assertEquals("foo = Parent-foo", subject.print());
    }
}
