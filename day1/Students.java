package week3.day1;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println(id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println(id);
		System.out.println(name);
	}
	public void getStudentInfo(String email,long phone)
	{
		System.out.println(email);
		System.out.println(phone);
	}
	public static void main(String[] args) {
    Students obj = new 	 Students ();
    obj.getStudentInfo(101);
    obj.getStudentInfo(102, "Hope");
    obj.getStudentInfo("hope@gmail.com",36243762);

	}

}
