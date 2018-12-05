import java.util.ArrayList;
public class DiceHolder{

	private ArrayList<Die> dieCup;

	public DiceHolder(){
		dieCup= new ArrayList<>();
	}

	public int addDie(Die die){
		if(dieCup.size()<6){
			dieCup.add(die);
			return 1;
		}

		else
			return -1;
	}

	public void shake(){
			for(int i=0; i<dieCup.size(); i++){
					dieCup.get(i).roll();
			}

	}

	public String toString(){
		for(int i=0; i<dieCup.size(); i++){
			return dieCup.get(i).toString()+"\n";
	}


	}



