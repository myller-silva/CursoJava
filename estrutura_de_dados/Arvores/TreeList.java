package arvores;

public class TreeList {
  TreeNode root;
  TreeList(){
    root=null;
  }

  public TreeNode insert(int item){
    return insert(this.root, item);
  }

  TreeNode insert(TreeNode ptr, int item){
    if(ptr==null){
      ptr = new TreeNode(item);
      ptr.left = null;
      ptr.right = null;
      if(root == null) {
        this.root = ptr;
      }
      return ptr;
    }else{
      TreeNode aux = null;
      if(item < ptr.value ){
        if(ptr.left == null){
          ptr.left = insert(ptr.left, item);
        }else{
          aux = insert(ptr.left, item);
        }
        return (aux==null) ? ptr.left : aux;
      } else if(item > ptr.value ){
        if(ptr.right == null){
          ptr.right = insert(ptr.right, item);
        }else{
          aux = insert(ptr.right, item);
        }
        return (aux==null) ? ptr.right : aux;
      }else{
        return null;
      }
    }
  }
  
  // String inOrderStr(){
  //   String str="";
  //   return str;
  // }

  void inOrder(){
    inOrder(this.root);
    System.out.println();
  }
  void inOrder(TreeNode node){
    if (node!=null){
      inOrder(node.left);
      System.out.printf("%3d ", node.value);
      inOrder(node.right);
    } 
  }

  void preOrder(){
    preOrder(this.root);
    System.out.println();
  }
  void preOrder(TreeNode node){
    if (node!=null){
      System.out.printf("%3d ", node.value);
      inOrder(node.left);
      inOrder(node.right);
    } 
  }

  void posOrder(){
    posOrder(this.root);    
    System.out.println();
  }
  void posOrder(TreeNode node){
    if (node!=null){
      inOrder(node.left);
      inOrder(node.right);
      System.out.printf("%3d ", node.value);
    } 
  }


}