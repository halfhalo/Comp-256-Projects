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