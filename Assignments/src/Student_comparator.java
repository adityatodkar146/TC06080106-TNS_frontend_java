import java.util.Comparator;
public class Student_comparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getScore() > o2.getScore())
			return 1;
		else if (o1.getScore() < o2.getScore())
			return -1;
		else if (o1.getRoll_no() >o2.getRoll_no())
			return -1;
		else
			return 1;
			
	}
	

}
