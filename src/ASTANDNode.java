/* Generated By:JJTree: Do not edit this line. ASTANDNode.java */

public class ASTANDNode extends SimpleNode {
	public ASTANDNode(int id) {
		super(id);
	}

	public ASTANDNode(IntVParser p, int id) {
		super(p, id);
	}


	/** Accept the visitor. **/
	public Object jjtAccept(IntVParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}
}