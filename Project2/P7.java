public class P7 implements LogicalFunction
{
      public boolean evaluate( boolean p, boolean q, boolean r)
      {
         return  ( p || !q ) && ( r || q );
      }
      
      public String toString()
      {
         return "( p || !q ) && ( r || q )";
      }
}