#include<stdio.h>
#include<stdlib.h>

struct node
{
    char data[2];
    struct node*next;
};

struct node*head1 = NULL;
struct node*head2 = NULL;

void traverse(struct node*head)
{
    struct node*temp = head;
    while(temp != NULL)
    {
        printf("%c",temp->data[0]);
        printf("%c->",temp->data[1]);
        temp = temp->next;
    } printf("NULL");
}

int main()
{
    head1 = malloc(sizeof(struct node));
    head1 -> data[0]= 'E';
    head1 -> data[1]= '1';
    
    head1->next = malloc(sizeof(struct node));
    head1->next -> data[0]= 'S';
    head1 ->next-> data[1]= '1';

    head1->next->next = malloc(sizeof(struct node));
    head1->next->next -> data[0]= 'S';
    head1->next->next-> data[1]= '2';

    head1->next->next->next = malloc(sizeof(struct node));
    head1->next->next->next -> data[0]= 'S';
    head1->next->next ->next-> data[1]= '3';

    head1->next->next->next->next = malloc(sizeof(struct node));
    head1->next->next->next->next -> data[0]= 'B';
    head1 ->next->next->next->next-> data[1]= '1';

    head1->next->next->next->next->next = malloc(sizeof(struct node));
    head1->next->next->next->next->next -> data[0]= 'B';
    head1->next->next->next->next->next-> data[1]= '2';

    head1->next->next->next->next->next->next = malloc(sizeof(struct node));
    head1->next->next->next->next->next->next -> data[0]= 'B';
    head1 ->next->next->next->next->next->next-> data[1]= '3';
    printf("\n");
    printf("SATABDI EXPRESS IS\n");
    traverse(head1);

    head2 = malloc(sizeof(struct node));
    head2 -> data[0]= 'E';
    head2 -> data[1]= '2';
    
    head2->next = malloc(sizeof(struct node));
    head2->next -> data[0]= 'S';
    head2 ->next-> data[1]= '1';

    head2->next->next = malloc(sizeof(struct node));
    head2->next->next -> data[0]= 'S';
    head2->next->next-> data[1]= '2';

    head2->next->next->next = malloc(sizeof(struct node));
    head2->next->next->next -> data[0]= 'S';
    head2->next->next ->next-> data[1]= '3';

    head2->next->next->next->next = malloc(sizeof(struct node));
    head2->next->next->next->next -> data[0]= 'S';
    head2 ->next->next->next->next-> data[1]= '4';

    head2->next->next->next->next->next = malloc(sizeof(struct node));
    head2->next->next->next->next->next -> data[0]= 'A';
    head2->next->next->next->next->next-> data[1]= '1';
    
    printf("\n");
    printf("GATIMAN EXPRESS IS\n");
    traverse(head2);
    printf("\n");
    
    //disconnect e1 from satabdi
    struct node*temp1 = head1;
    head1 = head1 -> next;
    free(temp1);
    printf("AFTER DISCONNECTING E1 FROM SATABDI EXPRESS\n");
    traverse(head1);
    printf("\n");

    //connect e2 to satabdi express
    struct node*temp2 = head2;
    head2 = head2->next;
    //add e2 to satabdi express
    temp2->next = head1;
    head1 = temp2;
    printf("AFTER CONNECTING E2 TO SATABDI EXPRESS\n");
    traverse(head1);
    printf("\n");

    //remove s4 from gatiman express
    struct node*temp4 = head2;
    while (temp4->next-> data[0] != 'S' || temp4->next->data[1] != '4')
    {
        temp4 = temp4->next;
    }
    struct node * s4 = temp4->next;
    temp4->next = s4 -> next;
    //traverse(head2);
    struct node * prashu = head1;
    while (prashu-> data[0] != 'S' || prashu->data[1] != '3')
    {
        prashu = prashu->next;
    }
    s4->next = prashu->next;
    prashu -> next = s4;
    printf("AFTER CONNECTING S4 OF GATIMAN AFTER S3 AND B1 OF SATABDI IS\n ");
    traverse(head1);
    printf("\n");
    //detach the last coach of satabdi
    struct node*bhanu = head1;
    while(bhanu->next->next!=NULL)
    {
        bhanu = bhanu -> next;
    }
    struct node*m = bhanu->next;
    bhanu->next = NULL;
    free(m);
    printf("AFTER DETACHING LAST COACH FROM SATABDI\n");
    traverse(head1);
    printf("\n");

    //add new coach Be to satabdi
    struct node* tarun = (struct node*)malloc(sizeof(struct node));
    char p[2];
    p[0]='B';
    p[1]='e';
    tarun->data[0] = p[0];
    tarun->data[1] = p[1];
    tarun->next = NULL;
    struct node*yash = head1;
    while(yash->next != NULL)
    {
        yash = yash->next;
    }
    yash->next = tarun;
    printf("AFTER ADDING NEW COACH Be AS LAST COACH OF SATABDI EXPRESS\n");
    traverse(head1);
    printf("\n");
    return 0;
}




/*
A.
#The suitable data structure to implement above scenario is LINKED LIST
#as the given question contains trains which has coaches connected to each other
through links is similar to nodes linked with links in linked list 
#here engine of trains refer to the head node of the linked list
#as engine is main coach, by getting engine we can find all the coaches as they are linked
#similarly by getting head we can find all the nodes
#so this is why I selected LINKED LISTS to solve the above problem  

B.
    i. It is remove begining operation in LinkedList
    ii. It is insert begining operation in LinkedList
    iii. It is remove in the middle and add in the middle operation
    iv.remove end operation in LinkedList
    v.insertend operation in Linked List 
*/