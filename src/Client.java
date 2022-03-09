
public class Client {

	public static void main(String[] args) {
		Sertar s1 = new Sertar(30, 70, 9);
		Sertar s2 = new Sertar(55, 80, 14);
		
//		s1.AfiseazaSertar();
//		s2.AfiseazaSertar();
		
		Birou b = new Birou (120, 65, 30, s1, s2);
		b.AfiseazaBirou();
	}

}
