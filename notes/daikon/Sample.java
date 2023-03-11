class Sample {
  String dogName;
  
  Sample(String name) {
    this.dogName = name;
  }
  
  int sum(int numOne, int numTwo) {
    return numOne + numTwo;
  }
  
  public static void main(String[] args) {
    System.out.println("Hello there");
    Sample s = new Sample("Kaaju");
    int sum = s.sum(21, 21);
    System.out.println("Sum: " + sum);
    sum = s.sum(22, 20);
    System.out.println("Sum: " + sum);
    sum = s.sum(3, 3);
    System.out.println("Sum: " + sum);
  } 
}
