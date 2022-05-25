package arvores;

public class TreeNode {
  TreeNode left;
  TreeNode right;
  int value;
  TreeNode(){}
  TreeNode(int value){
    this.value = value;
  }

  public String children() {
    String format = "%4s";
    String left = String.format(format, this.left);
    String right = String.format(format, this.right);
    
    String thisNode = String.format("%2d",this.value);
    
    return left+" <- "+thisNode+" -> "+right;
  }

  @Override
  public String toString() {
    return ""+this.value;
  }
}
