import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    Node root;
    BinaryTree(){
        root=null;
    }

void InorderTreversal(Node root){
    if(root==null){
        return ;
    }
    InorderTreversal(root.left);
    System.out.println(root.data);
    InorderTreversal(root.right);
}
void inorder(){
    InorderTreversal(root);
}
static Node insertlevel(int arr[],int i,Node root){
    if(i<arr.length){
       Node temp=new Node(arr[i]);
        root=temp;
        root.left=insertlevel(arr,2*i+1,root.left);
        root.right=insertlevel(arr, 2*i+2, root.right);
    }
    return root;
}

    public static void main(String args[]){
        BinaryTree bt=new BinaryTree();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        int n=sc.nextInt();        
        int []arr=new int[n];
        System.out.println("Enter the element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bt.root=insertlevel(arr,0,bt.root);
        System.out.println("the Given Tree is:");
        bt.inorder();
        sc.close();
    }
}