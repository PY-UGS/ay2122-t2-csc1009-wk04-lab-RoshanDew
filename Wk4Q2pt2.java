public class Wk4Q2pt2 {
    public static void main(String[] args) {
    StacksOfIntegers stack = new StacksOfIntegers();

    for (int i = 0; i < 10; i++) {
        stack.push(i);
    }

    while (!stack.empty()) {
        System.out.print(stack.pop() + " ");
    }
  }
}