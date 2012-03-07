public class P5 implements LogicalFunction
{
      public boolean evaluate( boolean p, boolean q, boolean r)
      {
         return  !p && !q && !r;
      }
      
      public String toString()
      {
         return "!p && !q && !r";
      }
}