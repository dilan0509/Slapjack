public class Jack
{
  private static int p1;
  private static int p2;
  public Jack(int p1, int p2)
  {
    this.p1 = p1;
    this.p2 = p2;
  }
  public int getP1()
  {
    return p1;
  }
  public int getP2()
  {
    return p2;
  }
  public void win(String b)
  {
    if(b.equals("a")||b.equals("A")||b.equals("ak")||b.equals("Ak")||b.equals("AK")||b.equals("aK"))
    {
      p1++;
      System.out.println("Player 1 score: "+p1+"\nPlayer 2 score: "+p2);
      System.out.println();
    }
    else if(b.equals("k")||b.equals("K")||b.equals("ka")||b.equals("Ka")||b.equals("KA")||b.equals("kA"))
    {
      p2++;
      System.out.println("Player 1 score: "+ p1 +"\nPlayer 2 score: "+p2);
      System.out.println();
    }
    else if(b.equals(""))
    {
      p1--;
      p2--;
      System.out.println("Player 1 score: "+ p1 +"\nPlayer 2 score: "+p2);
      System.out.println();
    }
  }
  public void lose(String b)
  {
    if(b.equals("a")||b.equals("A")||b.equals("ak")||b.equals("Ak")||b.equals("AK")||b.equals("aK"))
    {
      p1--;
      System.out.println("Player 1 score: "+p1+"\nPlayer 2 score: "+p2);
      System.out.println();
    }
    else if(b.equals("k")||b.equals("K")||b.equals("ka")||b.equals("Ka")||b.equals("KA")||b.equals("kA"))
    {
      p2--;
      System.out.println("Player 1 score: "+ p1 +"\nPlayer 2 score: "+p2);
      System.out.println();
    }
  }
  public String determine(int a, int b)
  {
    if(a == 3)
		{
			return "p1";
		}
		else
		{
			return "p2";
		}
  }
} 