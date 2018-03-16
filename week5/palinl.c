/*C Program to Check whether a Singly Linked List is a Palindrome */
#include <stdio.h>
#include <stdlib.h>
 
struct node
{
    int num;
    struct node *next;
};

 
int main()
{
    struct node *p = NULL;
    int c, ch, count = 0,n,pc=0;
    printf("Enter data into the list\n");
    struct node *temp,**link=NULL;
    n=create(&p);
    pc = CheckPalin(p, n);
    if (pc == 1)
    {
        printf("palindrome linked list\n");
    }
    else
    {
        printf("non-palindrome linked list\n");
    }

 
    return 0;
}

int create (struct node **link)
{
    int c, ch, count = 0,n;
    struct node *temp;
    printf("How many element would you like to enter?\n");
    scanf("%d",&n);
    while(count<n)
    {
        printf("Enter element: ");
        scanf("%d", &c);
        count++;
        temp = (struct node *)malloc(sizeof(struct node));
        temp->num = c;
        temp->next = *link;
        *link = temp;
    }
    printf("\n");
 
    return n;
}
 
 
int CheckPalin (struct node *p, int count)
{
    int i = 0, j;
    struct node *front, *rear; //using Queue as DS
 
    while (i != count / 2)
    {
        front = rear = p;
        for (j = 0; j < i; j++)
        {
            front = front->next; 
        }
        for (j = 0; j < count - (i + 1); j++)
        {
            rear = rear->next;
        }
        if (front->num == rear->num) //when found non equal element
        {
           i++;
        }
        else
        {
            return 0;
        }
    }
 
    return 1;
}
 


