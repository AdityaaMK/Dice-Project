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



	}
}