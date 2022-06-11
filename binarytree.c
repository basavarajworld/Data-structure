#include<stdio.h>
#include<stdlib.h>
    int number;
typedef struct btree{
    int num;
    struct btree *left;
    struct btree *right;
    
}BT;
int main(){
    BT*root;
   root=createbtree();
}

int createbtree(){
    BT*ptr;
    printf("enter the number:");
    scanf("%d",&number);
    if(number==-1){
        return NULL;
    }
    ptr=(BT*)malloc(sizeof(BT));
    ptr->num=number;
    ptr->left=createbtree();
    ptr->right=createbtree();
    return ptr;
    
}
