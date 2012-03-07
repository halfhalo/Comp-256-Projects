/*
	Patrick Roberts
	Comp 256
	March 7,2012
	Source code repo: https://github.com/halfhalo/Comp-256-Projects
*/
public class P4 implements LogicalFunction
{
      public boolean evaluate( boolean p, boolean q, boolean r)
      {
         return  ( !q ) || ( ( r || p) || !q );
      }
      
      public String toString()
      {
         return "( !q ) || ( ( r || p) || !q )";
      }
}