/* Generated By:JJTree: Do not edit this line. ASTSwitch.java */

public class ASTSwitch extends SimpleNode {
	public ASTSwitch(int id) {
		super(id);
	}

	public ASTSwitch(IntVParser p, int id) {
		super(p, id);
	}


	/** Accept the visitor. **/
	public Object jjtAccept(IntVParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}
}