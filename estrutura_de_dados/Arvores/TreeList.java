package arvores;

public class TreeList {
  TreeNode root;

  public boolean isEmpty() {
    return root == null;
  }

  public String children(int... items) {
    int len = items.length;
    String str = "";
    for (int i = 0; i < len; i++) {
      str += children(items[i]) + "\n";
    }
    return str;
  }

  public String children(int item) {
    if (isEmpty()) {
      return null;
    }
    TreeNode aux = this.root;
    while (aux != null) {
      if (aux.value == item) {
        break;
      }
      if (aux.value > item) {
        aux = aux.left;
      } else {
        aux = aux.right;
      }
    }
    if (aux == null){
      return null;
    }
    return aux.children();
  }

  public TreeNode remove(int item) {
    if (isEmpty()) {
      return null;
    }
    TreeNode aux = this.root;
    TreeNode father = null;

    while (aux != null) {
      if (item > aux.value) {
        father = aux;
        aux = aux.right;
      } else if (item < aux.value) {
        father = aux;
        aux = aux.left;
      } else {
        break;
      }
    }
    if (aux.anOnlyChild()) {
      TreeNode son = (aux.left == null) ? aux.right : aux.left;
      if (son.value < father.value) {
        father.left = son;
      } else {
        father.right = son;
      }
    } else if (aux.childless()) {
      if (aux.equals(father.left)) {
        father.left = null;
      } else {
        father.right = null;
      }
    }else{
      System.out.println("#todo");
    }
    return aux;
  }

  public TreeNode insert(int... items) {
    TreeNode last = null;
    for (int item : items) {
      last = insert(this.root, item);
      if (last == null)
        return null;
    }
    return last;
  }

  public TreeNode insert(int item) {
    return insert(this.root, item);
  }

  private TreeNode insert(TreeNode ptr, int item) {
    if (ptr == null) {
      ptr = new TreeNode(item);
      ptr.left = null;
      ptr.right = null;
      if (root == null) {
        this.root = ptr;
      }
      return ptr;
    } else {
      TreeNode aux = null;
      if (item < ptr.value) {
        if (ptr.left == null) {
          ptr.left = insert(ptr.left, item);
        } else {
          aux = insert(ptr.left, item);
        }
        return (aux == null) ? ptr.left : aux;
      } else if (item > ptr.value) {
        if (ptr.right == null) {
          ptr.right = insert(ptr.right, item);
        } else {
          aux = insert(ptr.right, item);
        }
        return (aux == null) ? ptr.right : aux;
      } else {
        return null;
      }
    }
  }

  void inOrder() {
    inOrder(this.root);
    System.out.println();
  }

  void inOrder(TreeNode node) {
    if (node != null) {
      inOrder(node.left);
      System.out.printf("%3d ", node.value);
      inOrder(node.right);
    }
  }

  void preOrder() {
    preOrder(this.root);
    System.out.println();
  }

  void preOrder(TreeNode node) {
    if (node != null) {
      System.out.printf("%3d ", node.value);
      inOrder(node.left);
      inOrder(node.right);
    }
  }

  void posOrder() {
    posOrder(this.root);
    System.out.println();
  }

  void posOrder(TreeNode node) {
    if (node != null) {
      inOrder(node.left);
      inOrder(node.right);
      System.out.printf("%3d ", node.value);
    }
  }

}