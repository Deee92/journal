Hello,

I noticed with mutation testing that the behavior of `org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.isFill()` is not specified.\
If the body of `isFill()` is replaced with `return true;` or `return false;`, no test fails.

Here is a test case that specifies it with a new assertion.

```
@Test
public void testIsFill() {
   RenderingMode fillMode = RenderingMode.FILL;
   Assert.assertEquals(true, fillMode.isFill());
}

```

What do you think?

Thanks! 

