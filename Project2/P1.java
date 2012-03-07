/*
	Patrick Roberts
	Comp 256
	March 7,2012
	Source code repo: https://github.com/halfhalo/Comp-256-Projects
*/
public class P1 implements LogicalFunction
{
      public boolean evaluate( boolean p, boolean q, boolean r)
      {
         return  !q && ((p) || !(q)) && p;
      }
      
      public String toString()
      {
         return "!q && ((p) || !(q)) && p";
      }
}