package question08;

public class StudentDriver {
public static void main(String[] args) {
	Student student1,student2;
	
	student1 = new Student();
	student2 = new Student();
	
	student1.name = "갑돌";
	student1.number = 100;
	student1.Department ="컴퓨터공학과";
	System.out.println(student1);
	
	student2.name = "갑순";
	student2.number = 200;
	student2.Department ="건축공학과";
	System.out.println(student2);

	student2.setDepartment("수학과");
	System.out.println(student2);

	
	
	
}
}

