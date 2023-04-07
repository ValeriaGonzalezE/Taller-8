package TallerOcho;

import java.util.Scanner;

public class Card{
String suit,name;
int points;

Card(int n1, int n2){

suit = getSuit(n1);
name = getName(n2);
points = getPoints(name);
}
public String toString(){

return "El " + name + " de " + suit;
}
public String getName(int i){

if(i == 1) return "As";
if(i == 2) return "Dos";
if(i == 3) return "Tres";
if(i == 4) return "Cuatro";
if(i == 5) return "Cinco";
if(i == 6) return "Seis";
if(i == 7) return "Siete";
if(i == 8) return "Ocho";
if(i == 9) return "Nueve";
if(i == 10) return "Diez";
if(i == 11) return "Jota";
if(i == 12) return "Reina";
if(i == 13) return "Rey";
return "error";
}
public int getPoints(String n){

if(n == "Jota" ||n == "Reina" ||n == "Rey"||n == "Diez")
return 10;
if(n == "Dos")
return 2;
if(n == "Tres")
return 3;
if(n == "Cuatro")
return 4;
if(n == "Cinco")
return 5;
if(n == "Seis")
return 6;
if(n == "Siete")
return 7;
if(n == "Ocho")
return 8;
if(n == "Nueve")
return 9;
if(n == "As")
return 1;

return -1;
}

public String getSuit(int i){

if(i == 1) return "Diamante";
if(i == 2) return "Treboles";
if(i == 3) return "Picas";
if(i == 4) return "Corazones";
return "error";
}



public static void main(String args[]){

int suitNumber = (int)(Math.random()*4.0+1);
int faceNumber = (int)(Math.random()*13.0+1);
Card newCard = new Card(suitNumber,faceNumber);
System.out.println(newCard);

suitNumber = (int)(Math.random()*4.0+1);
faceNumber = (int)(Math.random()*13.0+1);
suitNumber = (int)(Math.random()*4.0+1);
faceNumber = (int)(Math.random()*13.0+1);
Card newCard2 = new Card(suitNumber,faceNumber);
System.out.println(newCard2);

 suitNumber = (int)(Math.random()*4.0+1);

 faceNumber = (int)(Math.random()*13.0+1);


suitNumber = (int)(Math.random()*4.0+1);
faceNumber = (int)(Math.random()*13.0+1);



int points = (newCard.points)+(newCard2.points);

System.out.println("El total de puntos es= " + points);
int numCards = 2;
Scanner sc = new Scanner(System.in);
int choice = 1;

while(choice == 1 && points < 21 && numCards < 5){
System.out.println("Tu deseas otra carta?");

System.out.println("1. si");
System.out.println("2. No");
choice=sc.nextInt();

if(choice == 1){
numCards++;

suitNumber = (int)(Math.random()*4.0+1);
faceNumber = (int)(Math.random()*13.0+1);
newCard2 = new Card(suitNumber,faceNumber);
System.out.println(newCard2);

points+= newCard2.points;
System.out.println("El total de puntos= " +
points);

}
}
if(points>21) {
	System.out.println("usted perdio, se paso de 21");
}
}
}