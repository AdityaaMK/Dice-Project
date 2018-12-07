import java.util.ArrayList;

public class DiceRunner{
	public static void main(String[]args){

	Die die1 = new Die();
	Die die2 = new Die();

	int count = 0; //test1
	while((die1.getValue()!=1 || die2.getValue()!=1)){
		count++;
		die1.roll();
		die2.roll();
		System.out.println(die1);
		System.out.println(die2);
		System.out.println("Number of rolls: "+count+"\n");
	}

	//test2

	ArrayList<Die> list = new ArrayList<>();

	boolean b = true;
	Die die3 = new Die();
	DiceHolder diceHolder = new DiceHolder();
	int one = 0;

	while(b==true){
		int noSides = (int)(Math.random()*17)+4;
		die3 = new Die(noSides);
		list.add(die3);

		one = diceholder.addDie(die3);

		System.out.println(list);

		if(one == -1)
			b = false;

	}




	}
}