package TallerOcho;

public class PuntoUno {

	int numSides;
	boolean regular;
	PuntoUno(){
	numSides = 3;
	regular=true;
	}
	PuntoUno(int n, boolean regular){
	numSides = n;
	
	this.regular = regular;
	}
	public boolean isRegular(){
	return regular;
	}
	public int getSides(){
	return numSides;
	}
	public void setSides(int s){
	numSides = s;
	}
	public void setRegular(boolean regular){
	this.regular = regular;
	}
	}
	

