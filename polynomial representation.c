#include<stdio.h>
#include<stdlib.h>

struct node
{
  struct node *link;
  float coef;
  int expo;

};

int main ()
{
  struct node *head = NULL;
  printf ("enter the polynomial:");
  head = create (head);
  display(head);
  return 0;
}

struct node * create (struct node *head)
{
  int n;
  int expo;
  float coef;
  printf ("enter the no of terms:");
  scanf ("%d", &n);
  for (int i = 0; i < n; i++)
    {
      printf ("enter the coefficient:", i + 1);
      scanf ("%f", &coef);
      printf ("enter the exponential:", i + 1);
      scanf ("%d", &expo);
      head = insert (head, coef, expo);
    }
    return head;
}

void insert (struct node *head, float co, int ex)
{
  struct node *temp;
  struct node *newp = malloc (sizeof (struct node));
  newp->link = NULL;
  newp->coef=co;
  newp->expo=ex;
  
  if (head == NULL && ex> head->expo)
    {
      newp->link = head->link;
      newp = head;
    }
  else {
      temp=head;
      while(temp->link != NULL&&temp->link->expo>=ex)
     temp=temp->link;
      temp->link = newp->link;
      temp->link=newp;


    }
    return head;
}

void display (struct node *head)
{
  if (head == NULL)
    printf ("no polynomial:");
  else {
      struct node *temp=head;
      while(temp!=NULL){
    printf ("%.1fx^%d", temp->coef,temp->expo);
    temp=temp->link;
 if (temp!=NULL)
  printf("+");
  else
    printf ("\n");

}}}

