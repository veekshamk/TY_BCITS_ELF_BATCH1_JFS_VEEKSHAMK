package bcits.java.secondpart;

public class Gun {
	int bullets;

	public Gun(int bullets) {
		super();
		this.bullets = bullets;
	}

	@Override
	public String toString() {
		return "Gun is loaded with "  + bullets + " Bullets ";
	}
	

}
