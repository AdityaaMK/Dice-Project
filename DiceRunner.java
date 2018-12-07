import java.util.ArrayList;

public class DiceRunner{
	public static void main(String[]args){

	Die die1 = new Die();
	Die die2 = new Die();

	//test1

	int count = 0;
	while((die1.getValue()!=1 || die2.getValue()!=1)){
		count++;
		die1.roll();
		die2.roll();
		System.out.println(die1);
		System.out.println(die2);
		System.out.println("Number of rolls: "+count+"\n");
	}


	//test2

	boolean b = true;
	DiceHolder diceHolder = new DiceHolder();
	int one = 0;

	while(b==true){

		one = diceHolder.addDie(new Die((int)(Math.random()*17)+4));

		if(one == -1){
			b = false;
			break;
		}
		System.out.println(diceHolder);
	}
		System.out.println();

		diceHolder.shake();
		System.out.println(diceHolder);

	}
}