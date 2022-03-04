public class PilhaArray implements Pilha {
  private Object array[];
  private int count;

  public PilhaArray(int tam) {
    count = 0;
    array = new Object[tam];
  }

  public void fazVazia() {
    while (count > 0)
      array[--count] = null;
  }

  public boolean estaVazia() {
    return count == 0;
  }

  public void push(Object objeto) throws ContainerCheioException {
    if (count == array.length)
      throw new ContainerCheioException();
    array[count++] = objeto;
  }

  public Object pop() throws ContainerVazioException {
    if (count == 0)
      throw new ContainerVazioException();
    count--;
    Object result = array[count];
    array[count] = null;
    return result;
  }

  public Object getTop() throws ContainerVazioException {
    if (count == 0)
      throw new ContainerVazioException();
    return array[count - 1];
  }

}
