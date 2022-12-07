package sec01_inheritancepolymorphism.Ex01_Inheritance;

public class Inheritance {
  public static void main(String[] args) {
    Human h = new Human();
    h.name = "김현지";
    h.age = 11;
    h.eat();
    h.sleep();

    Student s = new Student();
    s.name = "김민생";
    s.age = 16;
    s.studentID = 128;
    s.eat();
    System.out.println("-----");
    Human h2 = (Human)s;

    System.out.println("-----");
    s.sleep();
    s.goToSchool();

    Worker w = new Worker();
    w.name = "봉윤정";
    w.age = 45;
    w.workerID = 128;
    w.eat();
    w.sleep();
    w.goToWork();
  }
}
