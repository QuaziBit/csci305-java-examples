package csci305.examples.java3;

/**
 * A stack machine for simple integer arithmetic
 */
public class StackMachineExcept extends IntStackExcept {

  /**
   * Pop the two top integers from the stack, add
   * them, and push their integer sum. There
   * should be at least two integers on the stack
   * when we are called. If not, we leave the stack
   * empty and set the error flag.
   * @throws EmptyStack if stack runs out
   */
  public void add() throws EmptyStack {
    int i = pop();
    int j = pop();
    push(i + j);
  }

  /**
   * Pop the two top integers from the stack, divide
   * them, and push their integer quotient. There
   * should be at least two integers on the stack
   * when we are called. If not, we leave the stack
   * empty and set the error flag.
   * @throws EmptyStack if stack runs out
   */
  public void divide() throws EmptyStack {
    int i = pop();
    int j = pop();
    push(i / j);
  }

  /**
   * Pop the two top integers from the stack, multiply
   * them, and push their integer product. There
   * should be at least two integers on the stack
   * when we are called. If not, we leave the stack
   * empty and set the error flag.
   * @throws EmptyStack if stack runs out
   */
  public void multiply() throws EmptyStack {
    int i = pop();
    int j = pop();
    if (getError()) return;
    push(i * j);
  }

  /**
   * Pop the two top integers from the stack, subtract
   * the second from the first, and push their integer
   * difference. There should be at least two
   * integers on the stack when we are called. If not,
   * we leave the stack empty and set the error flag.
   * @throws EmptyStack if stack runs out
   */
  public void subtract() throws EmptyStack {
    int i = pop();
    int j = pop();
    push(i - j);
  }
}
