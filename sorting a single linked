#include <stdio.h>  
struct node{  
    int data;  
    struct node *link;  
};      
 
struct node *head, *tail = NULL;  
void addNode(int data) {  
    struct node *newNode = (struct node*)malloc(sizeof(struct node));  
    newNode->data = data;  
    newNode->link = NULL;  
    if(head == NULL) {  
        head = newNode;  
        tail = newNode;  
    }  
    else {  
        tail->link = newNode;  
        tail = newNode;  
    }  
}  
    void sortList() {  
        struct node *ptr = head, *temp = NULL;  
        int t;  
          
        if(head == NULL) {  
            return;  
        }  
        else {  
            while(ptr != NULL) {  
                temp = ptr->link;  
                  
                while(temp != NULL) {  
                    if(ptr->data > temp->data) {  
                        t = ptr->data;  
                        ptr->data = temp->data;  
                        temp->data = t;  
                    }  
                    temp = temp->link;  
                }  
                ptr = ptr->link;  
            }      
        }  
    }  
void display() {  
    struct node *ptr = head;  
    if(head == NULL) {  
        printf("List is empty \n");  
        return;  
    }  
    while(ptr != NULL) {  
        printf("%d ", ptr->data);  
        ptr = ptr->link;  
    }  
    printf("\n");  
}  
      
int main()  
{  
    addNode(9);  
    addNode(7);  
    addNode(2);  
    addNode(5);  
    addNode(4);  
    printf("Original list: \n");  
    display();  
    sortList();  
    printf("Sorted list: \n");  
    display();  
          
    return 0;  
}  
