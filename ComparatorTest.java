import java.util.*;

// Write your Checker class here

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		Player p1 = (Player)o1;
		Player p2 = (Player)o2;
		int p1Score = p1.score;
		int p2Score = p2.score;
		if(p1Score==p2Score) {
			//Validate against the name
			return p1.name.compareTo(p2.name);
		}else if(p2Score>p1Score) {
			return 1;
		}
		else {			
			return -1;
		}
	}	
}
public class ComparatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

/*
5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150
*/