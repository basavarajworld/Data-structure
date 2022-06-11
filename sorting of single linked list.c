#include<stdio.h>
struct node{
int AGE;
struct node *link;
};
struct node *head=NULL;
struct node *tail=NULL;

void add(int AGE){
struct node *newnode=(struct node*)malloc(sizeof(struct node));
newnode->AGE=AGE;
newnode->link=NULL;
if(head==NULL){
head=newnode;
tail=newnode;
}
else{
tail->link=newnode;
tail=newnode;
}}
void sort(){
struct node *ptr=head;
struct node *temp=NULL;
int t;
if(head==NULL){
return;
}
else{
while(ptr!=NULL){
temp=ptr->link;
while(temp!=NULL){
if(ptr->AGE>temp->AGE){
t=ptr->AGE;
ptr->AGE=temp->AGE;
temp->AGE=t;
}
temp=temp->link;
}
ptr=ptr->link;
}}}
void display(){
struct node *ptr=head;
if(head==NULL){
printf("list is empty:");
return;
}
while(ptr!=NULL){
printf("%d\n",ptr->AGE);
ptr=ptr->link;
}
printf("\n");
}

int main(){
add(16);
add(15);
add(20);
add(19);
printf("list before sort:\n");
display();
sort();
printf("list after sort:\n");
display();
return 0;}
