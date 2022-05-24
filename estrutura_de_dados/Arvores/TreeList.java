package arvores;

public class TreeList {
  TreeNode root;
  
  boolean insert(TreeNode ptr, int item){
    if(ptr==null){
      ptr = new TreeNode(item);
      ptr.left = ptr.right = null;
      this.root = ptr;
      return true;
    }else{
      if(item < ptr.value ){
        insert(ptr.left, item);
        return true;
      } else if(item > root.value ){
        insert(ptr.right, item);
        return true;
      }else{
        return false;
      }
    }
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