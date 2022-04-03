import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
class Main
{
	public static void main(String[]args)
	{
		int p1 = 0;
		int p2 = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Welcome to SlapJack!  The rules to this game are simple. If the console prints out Jack \nplayer 1 has to type \" a \" and player 2 has to type \" k \" and then press enter and the first one to do it get the point. If you type the letter when it is not a Jack you  will lose 1 point.\nThe first player to 3, wins the game. Just press enter when it is not a Jack. But if it is a \nJack and you press enter you both lose 1 point.");
    System.out.println("          _____");
    System.out.println("         |A .  | _____");
    System.out.println("         | /.\\ ||A ^  | _____");
    System.out.println("         |(_._)|| / \\ ||A _  | _____");
    System.out.println("         |  |  || \\ / || ( ) ||A_ _ |");
    System.out.println("         |____V||  .  ||(_\'_)||( v )|");
    System.out.println("                |____V||  |  || \\ / |");
    System.out.println("                       |____V||  .  |");
    System.out.println("                              |____V|");
		System.out.println();
    Jack a = new Jack(p1,p2);
    ArrayList<String> cards = new ArrayList<String>();
    cards.add("Ace");
    cards.add("Two");
    cards.add("Three");
    cards.add("Four");
    cards.add("Five");
    cards.add("Six");
    cards.add("Seven");
    cards.add("Eight");
    cards.add("Nine");
    cards.add("Ten");
    cards.add("Jack");
    cards.add("Queen");
    cards.add("King");
		while(p1 < 3 && p2 < 3)
		{
			int i = (int)(Math.random()*13);
			System.out.println(cards.get(i));
			String b = reader.nextLine();
			if(cards.get(i).equals("Jack"))
			{
        a.win(b);
			}
			else
			{
				a.lose(b);
			}
      p1 = a.getP1();
      p2 = a.getP2();
		}
    System.out.println(a.determine(p1, p2)+" won the game!");
	}
}