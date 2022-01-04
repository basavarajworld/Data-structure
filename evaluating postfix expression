#include<stdio.h>
#include<conio.h>
#include<ctype.h>
#include<stdlib.h>
#define MAX 50
struct tree{
    struct tree *left;
    char data;
    struct tree *right;
};
struct tree *node = NULL;
struct tree *stack[MAX];
int top = -1;
void push(struct tree* node){
    if(top == MAX-1){
        printf("\nStack overflow");
    }
    else{
        stack[++top] = node;
    }
}

struct tree* pop(){
    if(top == -1){
        printf("Stack Overflow");
    }
    else{
        return stack[top--];
    }
}

int check(char s){
    if(s == '+' || s == '-' || s == '*' || s == '/'){
        return 2;
    }
    else{
        return 1;
    }
}

int isValidPostfix(char postfix[]){
    int isValidPostfix = 1;
    int noOfOperators = 0;
    int noOfDigits = 0;
    if(isdigit(postfix[0]) && postfix[1] == '\0'){
        return (--isValidPostfix);
    }
    if((!isdigit(postfix[0])) && isdigit(postfix[1])){
        return (--isValidPostfix);
    }
    for(int i=0;postfix[i] != '\0'; i++){
        if(isalnum(postfix[i])){
            noOfDigits++;
        }
        else if(postfix[i] == '+' || postfix[i] == '-' || postfix[i] == '*' || postfix[i] == '/'){
            noOfOperators++;
        }
        else{
            return (--isValidPostfix);
        }
    }
    if(noOfDigits-noOfOperators != 1){
        return (--isValidPostfix);
    }
    else{
        return (isValidPostfix);
    }
}
void operand(char op){
    struct tree *newNode;
    newNode = (struct tree *)malloc(sizeof(struct tree));
    newNode->data = op;
    newNode->left = NULL;
    newNode->right  = NULL;
    push(newNode);
}
void operator(char opr){
    struct tree *newNode;
    newNode = (struct tree*)malloc(sizeof(struct tree));
    newNode->data = opr;
    newNode->right = pop();
    newNode->left = pop();
    push(newNode);
}
int calculateResult(struct tree *node){
    char s = node->data;
    int ch = check(s);
    if(ch == 1){
        return(node->data-48);
    }
    else if(ch == 2){
        if(s == '+'){
            return (calculateResult(node->left) + calculateResult(node->right));
        }
        
        else if(s == '-'){
            return (calculateResult(node->left) - calculateResult(node->right));
        }
        
        else if(s == '*'){
            return (calculateResult(node->left) * calculateResult(node->right));
        }
        
        else if(s == '/'){
            return (calculateResult(node->left) / calculateResult(node->right));
        }
    }
    else{
        printf("Some invalid Operator");
        return 0;
    }
}
void inOrderTraversal(struct tree *node){
    if(node != NULL){
        inOrderTraversal(node->left);
        printf("%c ",node->data);
        inOrderTraversal(node->right);
    }
}
void main(){
    char postfix[MAX];
    while(1){
        printf("\nEnter the postfix expression:\t");
        scanf("%s",postfix);
        if(isValidPostfix(postfix)){
            break;
        }
        else{
            printf("\nInvalid expression");
        }
    }
    for(int i=0;postfix[i] != '\0';i++){
        char s = postfix[i];
        int ch = check(s);
        if(ch == 1){
            operand(s);
        }
        else{
            operator(s);
        }
    }
    int result = calculateResult(stack[top]);
    printf("\nThe corresponding infix expression is:\t");
    inOrderTraversal(stack[top]);
    printf("\nThe value of the postfix expression is %d",calculateResult(stack[top]));
}
