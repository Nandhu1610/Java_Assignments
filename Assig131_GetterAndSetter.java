package java1_assignments;

//WAP to ensure the use of getter and setter
public class Assig131_GetterAndSetter 
{
	private int age=10;
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public static void main(String[] args) 
	{
		Assig131_GetterAndSetter a1=new Assig131_GetterAndSetter();
		a1.setAge(20);
		System.out.println(a1.getAge());
	}
}
