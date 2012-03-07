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