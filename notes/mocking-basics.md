## Source classes: A, B, C, D

```
public class A {
    private B b; // can't be final or static
    private C c; // can't be final or static

    A() {
        b = new B(9);
        c = new C("January");
    }

    public int methodOne(int numOne) {
        System.out.println(methodTwo("once"));
        System.out.println(methodTwo("twice"));
        System.out.println(methodTwo("thrice"));
        return numOne + 33;
    }

    public String methodTwo(String stringOne) {
        return "Going " + stringOne;
    }

    public int usingB() {
        return b.getDoubleOfNumberInB();
    }

    public String usingBAndC() {
        int numFromB = usingB();
        return "B says: " + numFromB + " and C says: " + c.giveString();
    }

    public boolean getABoolean(D d) {
        return d.complementOfD();
    }
}


// can't be final
public class B {
    int numberInB;

    B(int num) {
        numberInB = num;
    }

    int getDoubleOfNumberInB() {
        return numberInB * 2;
    }
}

// can't be final
public class C {
    String stringInC;

    C(String aString) {
        stringInC = aString;
    }

    String giveString() {
        return "The string is " + stringInC;
    }
}

// can't be final
public class D {
    boolean booleanInD;

    boolean complementOfD() {
        return !booleanInD;
    }
}
```

## Tests

```
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith( MockitoJUnitRunner.class )
public class TestA {
    @Test
    public void testMock() {
        A mockA = mock(A.class); // all methods in A are now bare-bones
        mockA.methodOne(anyInt());
        verify(mockA).methodOne(anyInt());
        // These fail because the method body is gone
        // verify(mockA, times(3)).methodTwo(anyString());
        // assertEquals(39, mockA.methodOne(6));
    }

    @Test
    public void testSpy() {
        A spyA = spy(A.class);
        spyA.methodOne(anyInt());
        verify(spyA).methodOne(anyInt());
        verify(spyA, times(3)).methodTwo(anyString());
        assertEquals(39, spyA.methodOne(6));
    }

    @Test
    public void testStub() {
        A mockA = mock(A.class);
        when(mockA.methodOne(6)).thenReturn(8);
        mockA.methodOne(6);
        verify(mockA).methodOne(anyInt());
        // This fails because the method is now stubbed
        // verify(mockA, times(3)).methodTwo(anyString());
        assertEquals(8, mockA.methodOne(6));
    }

    @Mock
    B mockB;

    @Mock
    C mockC;

    @InjectMocks
    A a;

    @Test
    public void testB() {
        a.usingB();
        verify(mockB).getDoubleOfNumberInB();
    }

    @Test
    public void testBAndC() {
        a.usingBAndC();
        verify(mockB).getDoubleOfNumberInB();
        verify(mockC).giveString();
        // The methods in B and C are bare-bones
        // Output: B says: 0 and C says: null
        System.out.println(a.usingBAndC());
    }
    
    @Test
    public void testD() {
        A a = new A();
        // D is an external parameter object
        D mockD = mock(D.class);
        a.getABoolean(mockD);
        verify(mockD).complementOfD();
        // Method in D is bare-bones
        // Output: Boolean value: false
        System.out.println("Boolean value: " + a.getABoolean(mockD));
    }
}
```

