/*
	Patrick Roberts
	Comp 256
	March 7,2012
	Source code repo: https://github.com/halfhalo/Comp-256-Projects
*/
	
public class LogicalExpressions
{

      public static void printTruthTable(LogicalFunction p)
      {
            //Complete this method as well as other methods needed for project
      			StringBuffer sb = new StringBuffer();
						String t="1";
						String f="0";
						String cp=p.toString();
						Boolean a=false;
						Boolean b=false;
						Boolean c=false;
						sb.append("--------");
						sb.append("--------");
						sb.append("-----");
						for(int z=0;z<cp.length();z++)
						{
							sb.append("-");
						}
						sb.append("\n|  p  ");
						sb.append("|  q  ");
						sb.append("|  r  |");
						sb.append("  "+p.toString());
						sb.append("\n");
						for(int i=1;i<9;i++)
						{
							sb.append("--------");
							sb.append("--------");
							sb.append("-----");
							for(int z=0;z<cp.length();z++)
							{
								sb.append("-");
							}
							sb.append("\n");
							sb.append("|  ");
							if(i>4)
							{
								a=true;
								sb.append(t);
							}
							else
							{
								a=false;
								sb.append(f);
							}
							sb.append("  |  ");
							if((((i+1)-((i+1)%2))/2)%2==0)
							{
								b=true;
								sb.append(t);
							}
							else
							{
								b=false;
								sb.append(f);
							}
							sb.append("  |  ");
							if((i+1)%2==0)
							{
								c=true;
								sb.append(t);
							}
							else
							{
								c=false;
								sb.append(f);
							}
							sb.append("  | ");
							for(int l=0;l<cp.length()/2;l++)
							{
								sb.append(" ");
							}
							if(p.evaluate(a,b,c))
							{
								sb.append(t);
							}
							else
							{
								sb.append(f);
							}
							sb.append("  ");
							sb.append("\n");
						
						}
						System.out.println(sb);
      }
			   public static void printTable(LogicalFunction p)
		      {
		            //Stringbuffer to store string and only spit it out once
		      			StringBuffer sb = new StringBuffer();
								StringBuffer line= new StringBuffer();
								//Used O for true and X for false since its was easier to distinguish on output than t/f/T/F/0/1
								String t="1";
								String f="0";
								String cp=p.toString();
								Boolean a=false;
								Boolean b=false;
								Boolean c=false;
								//Add - for box top
								sb.append("--------");
								sb.append("--------");
								sb.append("-----");
								//Add - equal to the length of p.toString() for pretty box
								for(int z=0;z<cp.length();z++)
								{
									sb.append("-");
								}
								//Title Row
								sb.append("\n|  p  ");
								sb.append("|  q  ");
								sb.append("|  r  |");
								sb.append("  "+p.toString());
								sb.append("\n");
								//Loop to get all 9 possible combinations.
								for(int i=1;i<9;i++)
								{
									line.delete(0,line.length());
									line.append("--------");
									line.append("--------");
									line.append("-----");
									
									for(int z=0;z<cp.length();z++)
									{
										line.append("-");
									}
									line.append("\n");
									line.append("|  ");
									//Last column (would be third bit in binary)
									if(i>4)
									{
										a=true;
										line.append(t);
									}
									else
									{
										a=false;
										line.append(f);
									}
									line.append("  |  ");
									//Middle column (Second bit in binary)
									if((((i+1)-((i+1)%2))/2)%2==0)
									{
										b=true;
										line.append(t);
									}
									else
									{
										b=false;
										line.append(f);
									}
									line.append("  |  ");
									//First column (first binary bit)
									if((i+1)%2==0)
									{
										c=true;
										line.append(t);
									}
									else
									{
										c=false;
										line.append(f);
									}
									line.append("  | ");
									//Add padding to p.toString()
									for(int l=0;l<cp.length()/2;l++)
									{
										line.append(" ");
									}
									if(p.evaluate(a,b,c))
									{
										line.append(t);
									}
									else
									{
										line.append(f);
									}
									line.append("  ");
									line.append("\n");
									if(p.evaluate(a,b,c))
									{
										sb.append(line);
									}
								}
								//Finally... Return!
								System.out.println(sb);
		      }
			public static boolean tautology(LogicalFunction p)
			{
				Boolean a=false;
				Boolean b=false;
				Boolean c=false;
				Boolean isTrue=true;
				for(int i=1;i<9;i++)
				{
					if(i>4)
					{a=true;}
					else
					{a=false;}
					if((((i+1)-((i+1)%2))/2)%2==0)
					{b=true;}
					else
					{b=false;}
					if((i+1)%2==0)
					{c=true;}
					else
					{c=false;}
					if(isTrue)
					{
						if(p.evaluate(a,b,c))
						{}
						else
						{
							isTrue=false;
						}
					}
				}
				return isTrue;
			}
			public static boolean contradiction(LogicalFunction p)
			{
				Boolean a=false;
				Boolean b=false;
				Boolean c=false;
				Boolean isTrue=false;
				for(int i=1;i<9;i++)
				{
					if(i>4)
					{a=true;}
					else
					{a=false;}
					if((((i+1)-((i+1)%2))/2)%2==0)
					{b=true;}
					else
					{b=false;}
					if((i+1)%2==0)
					{c=true;}
					else
					{c=false;}
					if(!isTrue)
					{
						if(p.evaluate(a,b,c))
						{
							isTrue=true;
						}
						else
						{
							//isTrue=false;
						}
					}
				}
				return isTrue;
			}
			public static boolean equivs(LogicalFunction p, LogicalFunction q)
			{
				Boolean a=false;
				Boolean b=false;
				Boolean c=false;
				Boolean isTrue=true;
				for(int i=1;i<9;i++)
				{
					if(i>4)
					{a=true;}
					else
					{a=false;}
					if((((i+1)-((i+1)%2))/2)%2==0)
					{b=true;}
					else
					{b=false;}
					if((i+1)%2==0)
					{c=true;}
					else
					{c=false;}
					if(isTrue)
					{
						if(p.evaluate(a,b,c)==q.evaluate(a,b,c))
						{}
						else
						{isTrue=false;}
					}
				}
				return isTrue;
			}
			public static boolean implies(LogicalFunction p, LogicalFunction q)
			{
				Boolean a=false;
				Boolean b=false;
				Boolean c=false;
				Boolean isTrue=true;
				for(int i=1;i<9;i++)
				{
					if(i>4)
					{a=true;}
					else
					{a=false;}
					if((((i+1)-((i+1)%2))/2)%2==0)
					{b=true;}
					else
					{b=false;}
					if((i+1)%2==0)
					{c=true;}
					else
					{c=false;}
					if(isTrue)
					{
						if(p.evaluate(a,b,c))
						{
							if(q.evaluate(a,b,c))
							{}
							else
							{
								isTrue=false;
							}
						}
						else
						{
							if(q.evaluate(a,b,c))
							{
								isTrue=false;
							}
						}
					}
				}
				return isTrue;
			}
      public static void main ( String[] args)
      {
      
        LogicalFunction p1 = new P1();
        LogicalFunction p2 = new P2();
				LogicalFunction p3 = new P3();
				LogicalFunction p4 = new P4();
				LogicalFunction p5 = new P5();
				LogicalFunction p6 = new P6();
				LogicalFunction p7 = new P7();

         
        System.out.println("Test A");
        System.out.println("P1  = " + p1 );
        System.out.println("P1 Truth Table: ");       
        printTruthTable(p1);
				System.out.println("");
				if(tautology(p1))
				{
					System.out.println("Tautology: True");
				}
				else
				{
					System.out.println("Tautology: False");
				}
				if(contradiction(p1))
				{
					System.out.println("Contradiction: False");
				}
				else
				{
					System.out.println("Contradiction: True");
				}
				System.out.println("");
				System.out.println("Test B");
        System.out.println("P2  = " + p2 );
        System.out.println("P2 Truth Table: ");       
        printTruthTable(p2);
				System.out.println("");
				if(tautology(p2))
				{
					System.out.println("Tautology: True");
				}
				else
				{
					System.out.println("Tautology: False");
				}
				if(contradiction(p2))
				{
					System.out.println("Contradiction: False");
				}
				else
				{
					System.out.println("Contradiction: True");
				}
				System.out.println("");
				System.out.println("Test C");
        System.out.println("P3  = " + p3 );
        System.out.println("P3 Truth Table: ");       
        printTruthTable(p3);
				System.out.println("");
				if(tautology(p3))
				{
					System.out.println("Tautology: True");
				}
				else
				{
					System.out.println("Tautology: False");
				}
				if(contradiction(p3))
				{
					System.out.println("Contradiction: False");
				}
				else
				{
					System.out.println("Contradiction: True");
				}
				System.out.println("");
				System.out.println("Test D");
				System.out.println("P4 => P5");
				if(implies(p1,p2))
				{
					System.out.println("True");
				}
				else
				{
					System.out.println("False");
				}
				System.out.println("");
				System.out.println("Test E");
				System.out.println("P5 <=> P6");
				if(equivs(p5,p6))
				{
					System.out.println("True");
				}
				else
				{
					System.out.println("False");
				}
				System.out.println("");
				System.out.println("Test F");
				System.out.println("P6 => P7");
				if(implies(p1,p2))
				{
					System.out.println("True");
				}
				else
				{
					System.out.println("False");
				}
				System.out.println("");
				System.out.println("Test G");
				System.out.println("P7 => P6");
				if(implies(p1,p2))
				{
					System.out.println("True");
				}
				else
				{
					System.out.println("False");
				}
				System.out.println("");
				System.out.println("Test H");
				System.out.println("Values that make P3 true:");
				printTable(p3);
      }
}