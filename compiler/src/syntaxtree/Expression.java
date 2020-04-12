//
// Generated by JTB 1.3.2 DIT@UoA patched
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> AndExpression()
 *       | OrExpression()
 *       | EqualExpression()
 *       | NotEqualExpression()
 *       | LessThanExpression()
 *       | LessThanOrEqualExpression()
 *       | GreaterThanExpression()
 *       | GreaterThanOrEqualExpression()
 *       | PlusExpression()
 *       | MinusExpression()
 *       | TimesExpression()
 *       | ArrayLookup()
 *       | ArrayLength()
 *       | MessageSend()
 *       | Clause()
 */
public class Expression implements Node {
   public NodeChoice f0;

   public Expression(NodeChoice n0) {
      f0 = n0;
   }

   public void accept(visitor.Visitor v) throws Exception {
      v.visit(this);
   }
   public <R,A> R accept(visitor.GJVisitor<R,A> v, A argu) throws Exception {
      return v.visit(this,argu);
   }
   public <R> R accept(visitor.GJNoArguVisitor<R> v) throws Exception {
      return v.visit(this);
   }
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu) throws Exception {
      v.visit(this,argu);
   }
}

