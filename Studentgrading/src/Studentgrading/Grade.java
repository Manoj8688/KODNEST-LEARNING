package Studentgrading;

public class Grade {
	public void grading(int score)
	{
	if(score>=90)
	{
		System.out.println("Grade is A+");
	}else if(score>=80 && score<90)
	{
		System.out.println("Grade is A");
	}else if(score>=70 && score<80)
	{
		System.out.println("Grade is B");
	}else if(score>=60 && score<70)
	{
		System.out.println("Grade is C");
	}else if(score>=50 && score<60)
	{
		System.out.println("Grade is D");
	}else
	{
		System.out.println("FAIL....Get Lost");
		
	}

}
}
