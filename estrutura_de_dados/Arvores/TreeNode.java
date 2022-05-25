package arvores;

public class TreeNode {
  TreeNode left;
  TreeNode right;
  TreeNode father;
  int value;
  
  TreeNode(int value) {
    this.value = value;
  }

  public String children() {
    String left = String.format("%4s", this.left);
    String right = String.format("%4s", this.right);
    String thisNode = String.format("%2s", this);
    return left + " <- " + thisNode + " -> " + right;
  }

  public boolean childless() {
    return (this.left == null && this.right == null);
  }

  public boolean twoChildren() {
    return (this.left != null && this.right != null);
  }
  public boolean anOnlyChild() {
    return !this.childless() && !this.twoChildren() ;
  }
  
  @Override
  public String toString() {
    return "" + this.value;
  }
}
