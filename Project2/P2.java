/*
	Patrick Roberts
	Comp 256
	March 7,2012
	Source code repo: https://github.com/halfhalo/Comp-256-Projects
*/
public class P2 implements LogicalFunction
{
      public boolean evaluate( boolean p, boolean q, boolean r)
      {
         return  (((p)||!(q) || (p)||!(r)) && p) || !(q || r);
      }
      
      public String toString()
      {
				//(p)||!(q)
         return "( ( (p) || !(q) || (p) || !(r) ) && p ) || !(q || r)";
      }
}