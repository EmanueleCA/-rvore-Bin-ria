public class BinaryTree {
    //guardar a raiz da árvore
   Node root;

   public Node getRoot(){
     return root;
   }

   public void setRoot(Node root) {
    this.root = root;
   }

   public BinaryTree(){
    root = new Node();
   }
   
   public BinaryTree(int info){
    root = new Node(info);
   }
   public void insert(int info){
    insert(root, info);
   }
   //método insert
   private void insert(Node root, int info){
    if(info <= root.info){
        //incluindo um novo nó à esquerda da raiz
        if(root.left == null){
            root.left = new Node(info);
        }
        //incluindo um novo nó abaixo da esquerda da raiz
        else{
            this.insert(root.left, info);
        }
    }else{
        if(root.right == null){
            root.right = new Node(info);
        }else{
            this.insert(root.right, info);
        }
    }
   }

   public void inOrder(Node root){
        if(root == null){
            return;
        }else{
            inOrder(root.left());
            System.out.println(root.info());
            inOrder(root.right());
        }
   }



    
}
