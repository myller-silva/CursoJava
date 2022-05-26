package arvores;

public class TreeList {
  TreeNode root;

  public boolean isEmpty() {
    return root == null;
  }

  public TreeNode getNode(int value) {
    return getNode(this.root, value);
  }

  public TreeNode getNode(TreeNode node, int value) {
    if (node == null) {
      return null;
    }
    if (value < node.value) {
      return getNode(node.left, value);
    } else if (node.value < value) {
      return getNode(node.right, value);
    } else {
      return node;
    }
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

  public void inOrder() {
    System.out.print("inOrder:");
    inOrder(this.root);
    System.out.println();
  }

  public void inOrder(TreeNode node) {
    if (node != null) {
      inOrder(node.left);
      System.out.printf("%3d ", node.value);
      inOrder(node.right);
    }
  }

  public void preOrder() {
    preOrder(this.root);
    System.out.println();
  }

  public void preOrder(TreeNode node) {
    if (node != null) {
      System.out.printf("%3d ", node.value);
      inOrder(node.left);
      inOrder(node.right);
    }
  }

  public void posOrder() {
    posOrder(this.root);
    System.out.println();
  }

  public void posOrder(TreeNode node) {
    if (node != null) {
      inOrder(node.left);
      inOrder(node.right);
      System.out.printf("%3d ", node.value);
    }
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
    switch (aux.numberOfChildren()) {
      case 0: // ok
        if (aux.equals(father.left)) {
          father.left = null;
        } else {
          father.right = null;
        }
        break;
      case 1: // ok
        TreeNode son = (aux.left == null) ? aux.right : aux.left;
        if (son.value < father.value) {
          father.left = son;
        } else {
          father.right = son;
        }
        break;
      case 2: // todo

        break;
      default:
        break;
    }
    return aux;
  }

}