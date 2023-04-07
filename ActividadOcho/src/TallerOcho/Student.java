package TallerOcho;

public class Student {

	    Student mary = new Student("Mary Jones",14,46);
		Student john = new Student("John Stiner",60,173);
		Student ari = new Student("Ari Samala",31,69);

		String name;
		int credits,qualityPoints;
		double gpa;
		Student(String name,int credits, int qualityPoints) {
		this.name = name;
		this.credits = credits;
		this.qualityPoints = qualityPoints;
		gpa = (double)qualityPoints/(double)credits;
		}
		public double getGPA(){
		return gpa;
		}
		public void addCredits(int credits, int qualityPoints){
		this.credits += credits;
		this.qualityPoints += qualityPoints;
		gpa = (double)qualityPoints/(double)credits;
		
		ari.addCredits(13,52);
		
		}
		}
	