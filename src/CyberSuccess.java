
public class CyberSuccess {
private String companyName;
private String directorName;
private String[] courses;
private Trainer[] trainer;
public CyberSuccess(String companyName, 
		String directorName, String[] courses,
		Trainer[] trainer) {
	super();
	this.companyName = companyName;
	this.directorName = directorName;
	this.courses = courses;
	this.trainer = trainer;
}
public String getCompanyName() {
	return companyName;
}
public String getDirectorName() {
	return directorName;
}
public String[] getCourses() {
	return courses;
}
public Trainer[] getTrainer() {
	return trainer;
}




}
