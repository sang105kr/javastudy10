package sec01_inheritancepolymorphism.Ex01_Inheritance;

public class Student extends Human{
  int studentID;

  @Override
  void eat() {
    // 추가
//    super.eat();
//    System.out.println("설겆이하다");
    // 전체수정
//    System.out.println("설적이하다");
    // 일부수정
    System.out.println("맛잇게 먹다");
  }

  void goToSchool(){}
}
