
public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int regno=122;
		try {
			if(regno!=123)
				throw new StudentNotFoundException();
			System.out.println("Student details available ");
		}
		catch(StudentNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Successful ");
			System.out.println("Yes");
		}
	}

}
