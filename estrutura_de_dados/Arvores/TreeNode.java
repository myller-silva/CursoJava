package arvores;

public class TreeNode {
  TreeNode left;
  TreeNode right;
  int value;
  TreeNode(){}
  TreeNode(int value){
    this.value = value;
  }
  @Override
  public String toString() {
    return ""+this.value;
  }
}
