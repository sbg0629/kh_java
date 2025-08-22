package question08;

public class Person {
	public String lastName;
	public String firstname;
	
	public String getLastname() {
		return lastName;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	private int getLength() {
		return firstname.length()+lastName.length();
	}
public void show() {
	System.out.println("성: "+lastName+" 이름: "+firstname+" 성명의 길이는 : "+getLength());
}

}
