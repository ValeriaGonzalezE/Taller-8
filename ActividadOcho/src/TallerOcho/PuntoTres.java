package TallerOcho;

public class PuntoTres {
	
	static Animal a1 = new Animal();
	static Animal a2 = new Animal(50,21,4);
	public static void main(String[] args) {
		System.out.println("Animal 1 tiene una velocidad de "+ a1.getSpeed() + "\nAnimal 2 tiene una velocidad de " + a2.getSpeed());
	}
	
	
}
