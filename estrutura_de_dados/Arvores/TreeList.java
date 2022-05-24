package arvores;

public class TreeList {
  TreeNode root;
  
  boolean insert(TreeNode ptr, int item){
    return insert(ptr, new TreeNode(item));
  }

  boolean insert(TreeNode ptr, TreeNode item){
    if(item==null) return false;

    if(this.root==null){
      this.root = item;
      this.root.left = null;
      this.root.right = null;
      return true;
    }else{
      if(item.value < root.value ){
        
      }
    }
    return false;
  }



  String inOrder(){
    return "";
  }
  String preOrder(){
    return "";
  }
  String posOrder(){
    return "";
  }
}