/*
	Patrick Roberts
	Comp 256
	March 7,2012
	Source code repo: https://github.com/halfhalo/Comp-256-Projects
*/
public class P3 implements LogicalFunction
{
      public boolean evaluate( boolean p, boolean q, boolean r)
      {
         return (p || !r) && (r || q || !p) && (!r || p);
      }
      
      public String toString()
      {
         return "(p || !r) && (r || q || !p) && (!r || p)";
      }
}