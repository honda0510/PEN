/* Generated By:JJTree: Do not edit this line. ASTgDrawText.java */

public class ASTgDrawText extends SimpleNode {
  public ASTgDrawText(int id) {
    super(id);
  }

  public ASTgDrawText(IntVParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(IntVParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
