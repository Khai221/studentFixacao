package student;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public boolean pass() {
		if ((this.nota1 + this.nota2 + this.nota3) >= 90) {
			return true;
		} else {
			return false;
		}
	}
}
