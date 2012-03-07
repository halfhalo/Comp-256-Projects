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