package guide.springboot.maven.model;

public class Benz {

	private String nameOfCar;
	private Integer yearOfMfg;

	public Benz(String nameOfCar, Integer yearOfMfg) {
		super();
		this.nameOfCar = nameOfCar;
		this.yearOfMfg = yearOfMfg;
	}

	public String getNameOfCar() {
		return nameOfCar;
	}

	public void setNameOfCar(String nameOfCar) {
		this.nameOfCar = nameOfCar;
	}

	public Integer getYearOfMfg() {
		return yearOfMfg;
	}

	public void setYearOfMfg(Integer yearOfMfg) {
		this.yearOfMfg = yearOfMfg;
	}

}
