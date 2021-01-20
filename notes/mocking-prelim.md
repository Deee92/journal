## What should we mock?

- We can only mock non-static, non-final, non-private classes and verify/stub their behaviour directly 
- We can mock a complex object passed as parameter, and verify that a method is invoked on the object inside the method;
  - Example from `org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject`:
```
public void setMatrix(AffineTransform transform) {  // complex parameter object
  COSArray matrix = new COSArray();
  double[] values = new double[6];
  transform.getMatrix(values); // method called on parameter
  for (double v : values) {
    matrix.add(new COSFloat((float) v));
  }
  getCOSObject().setItem(COSName.MATRIX, matrix);
}
```
  - Mocking:
```
@Test
public void testSetMatrix() {
  ...
  AffineTransform mockAffine = Mockito.mock(AffineTransform.class);
  receivingObject.setMatrix(mockAffine);
  verify(mockAffine, times(1)).getMatrix((double[]) any());
}
```
- We can verify invocations within the method body of methods from the same class (through spies); see answer [here](https://stackoverflow.com/questions/7829659/count-indirect-method-calls-mockito)
  - Example from `org.apache.fontbox.ttf.TrueTypeFont`
```
public int getAdvanceWidth(int gid) throws IOException {
  HorizontalMetricsTable hmtx = getHorizontalMetrics(); // method from the same class
  if (hmtx != null)
    return hmtx.getAdvanceWidth(gid);
  else return 250;
}
```
  - Mocking:
```
@Test
public void testGetAdvanceWidth() {
  ...
  TrueTypeFont spyTrueTypeFont = spy(receivingObject);
  spyTrueTypeFont.getAdvanceWidth(anyInt());
  verify(spyTrueTypeFont).getHorizontalMetrics();
  verify(spyTrueTypeFont, atMostOnce()).getAdvanceHeight(anyInt());
}
```  

What we can't do (most likely):
- We cannot mock an object that is created within the method body and methods are invoked on it (such as `matrix` in first example)
- We cannot mock a complex parameter passed to a method to verify that it is also passed as a parameter to another method inside the method body
- Complex field within the receiving object on which a method is being invoked inside the method -- can we do it with mock dependency injection?

