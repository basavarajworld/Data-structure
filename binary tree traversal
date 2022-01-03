#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<ctype.h>
struct node{
    struct node *left;
    int data;
    struct node *right;
};
struct node *root = NULL;
struct node *tree = NULL;

struct node *createNode(int data){
    if(data == -1){
        return NULL;
    }
    struct node *newNode;
    newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

void createTree(struct node *root){
    int data;
    if(root == NULL){
        printf("\nEnter the value of the root element:\t");
        scanf("%d",&data);
        root = createNode(data);
        tree = root;
    }
    printf("\nThe value of the root element is %d",root->data);

    printf("\nEnter the value of the left child. Enter -1 to put NULL:\t");
    scanf("%d",&data);
    root->left = createNode(data);

    printf("\nEnter the value of the right child. Enter -1 to put NULL:\t");
    scanf("%d",&data);
    root->right = createNode(data);

    if(root->left != NULL){
        createTree(root->left);
    }
    if(root->right != NULL){
        createTree(root->right);
    }
    
}
void inOrderTraversal(struct node *root){
    if(root != NULL){
        inOrderTraversal(root->left);
        printf("%d ",root->data);
        inOrderTraversal(root->right);
    }
}


void preOrderTraversal(struct node *root){
    if(root != NULL){
        preOrderTraversal(root->left);
        preOrderTraversal(root->right);
        printf("%d ",root->data);
    }
}


void postOrderTraversal(struct node *root){
    if(root != NULL){
        postOrderTraversal(root->left);
        postOrderTraversal(root->right);
        printf("%d ",root->data);
    }
}

void main(){
    printf("\nCreating the tree");
    createTree(tree);
    printf("\n Inorder Traversal");
    inOrderTraversal(tree);
    
    printf("\n Preorder Traversal");
    preOrderTraversal(tree);
    
    printf("\n Postorder Traversal");
    postOrderTraversal(tree);
}
