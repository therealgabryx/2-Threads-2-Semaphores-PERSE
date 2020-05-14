public class Thread1 extends Thread {
  Semaforo sem1;
  Semaforo sem2;

  public Thread1(Semaforo s1, Semaforo s2) {
    sem1 = s1;
    sem2 = s2;
  }

  @Override
  public void run() {
    System.out.println("P");
    System.out.println("E");
    sem1.V();
    sem2.P();
    System.out.println("E");
  }
}