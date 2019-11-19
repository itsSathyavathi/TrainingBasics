package labassignments;

public class StudentDataBase {

	public static void main(String[] args) {
		Student student1= new Student("9845679008", "Soni");
		student1.enroll("History");
		student1.enroll("Math");
		student1.checkBalance();
		student1.pay(800);
		student1.showCourses();
		System.out.println(student1.toString());
		Student student2= new Student("1989770090", "Sheldon");
		Student student3= new Student("8656999754", "Mike");
		Student student4= new Student("3680086446", "Abby");

	}

}


class Student{

	private String name;
	private String SSN;
	private int phoneNumber;
	private String city;
	private String state;
	private double balance=0;
	private String emailID;
	private String studentId;
	private static final int schoolFee= 10000;
	private static int ID= 100;
	private static final String schoolName= "@harvvard.com";
	private String courses="";

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setEmailID(String emailID){	
		this.emailID= emailID;

	}

	private void generateEmailID(String SSN) {
		emailID= name+SSN.substring(8, 10)+schoolName;
		//System.out.println(emailID);

	}

	public String getEmailID() {
		return emailID;
	}

	public Student(String SSN, String name){
		this.name= name;
		ID++;
		generateID(SSN);
		generateEmailID(SSN);

	}

	private void generateID(String SSN) {
		int max=90;
		int min=10;
		int randomNumber=(int) (Math.random()*(max-min));
		randomNumber= randomNumber+min;
		String rNumber= String.valueOf(randomNumber);
		studentId= ID+ rNumber + SSN.substring(6, 10);
		//System.out.println("Student Id :" + studentId);
	}

	public void enroll(String course){
		this.courses=course+ " " +courses;
		balance= balance+schoolFee;
		System.out.println("Payment for the course : " + balance);
	}

	public void pay(int payment){	
		int studentPay= (int) (balance-payment);	
		System.out.println("Remaining Payment: " + studentPay);

	}

	public void checkBalance(){
		System.out.println("Balance: " + balance);

	}

	public void showCourses(){
		System.out.println(courses);

	}

	@Override
	public String toString(){
		return "[Student name: " + name +"]\n[Courses: " + courses +"]\n[Email Id : " + emailID +"]\n[Balance : " + balance +"]";
	}
}
