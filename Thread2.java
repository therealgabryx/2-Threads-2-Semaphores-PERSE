public class Thread2 extends Thread {
  Semaforo sem1;
  Semaforo sem2;

  public Thread2(Semaforo s1, Semaforo s2) {
    sem1 = s1;
    sem2 = s2;
  }

  @Override
  public void run() {
    sem1.P();
    System.out.println("R");
    System.out.println("S");
    sem2.V();
  }
}
