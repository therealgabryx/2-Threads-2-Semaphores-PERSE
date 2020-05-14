class Main {
  public static void main(String[] args) {
    Semaforo sem1 = new Semaforo(0);
    Semaforo sem2 = new Semaforo(0);

    Thread th1 = new Thread1(sem1, sem2);
    Thread th2 = new Thread2(sem1, sem2);

    th1.start();
    th2.start();
  }
}
