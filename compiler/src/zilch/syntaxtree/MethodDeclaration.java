//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> Type()
 * f1 -> Identifier()
 * f2 -> "("
 * f3 -> ( FormalParameterList() )?
 * f4 -> ")"
 * f5 -> "{"
 * f6 -> ( VarDeclaration() )*
 * f7 -> ( Statement() )*
 * f8 -> "return"
 * f9 -> Expression()
 * f10 -> ";"
 * f11 -> "}"
 */
public class MethodDeclaration implements Node {
   public Type f0;
   public Identifier f1;
   public NodeToken f2;
   public NodeOptional f3;
   public NodeToken f4;
   public NodeToken f5;
   public NodeListOptional f6;
   public NodeListOptional f7;
   public NodeToken f8;
   public Expression f9;
   public NodeToken f10;
   public NodeToken f11;

   public MethodDeclaration(Type n0, Identifier n1, NodeToken n2, NodeOptional n3, NodeToken n4, NodeToken n5, NodeListOptional n6, NodeListOptional n7, NodeToken n8, Expression n9, NodeToken n10, NodeToken n11) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
      f6 = n6;
      f7 = n7;
      f8 = n8;
      f9 = n9;
      f10 = n10;
      f11 = n11;
   }

   public MethodDeclaration(Type n0, Identifier n1, NodeOptional n2, NodeListOptional n3, NodeListOptional n4, Expression n5) {
      f0 = n0;
      f1 = n1;
      f2 = new NodeToken("(");
      f3 = n2;
      f4 = new NodeToken(")");
      f5 = new NodeToken("{");
      f6 = n3;
      f7 = n4;
      f8 = new NodeToken("return");
      f9 = n5;
      f10 = new NodeToken(";");
      f11 = new NodeToken("}");
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

