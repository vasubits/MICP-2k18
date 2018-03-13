#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node* left;
    struct node* right;
};

 
/* This function returns 1 if S is a subtree of T, otherwise -1 */
int isSubtree(struct node *T, struct node *S)
{
    /* base cases */
    if (S == NULL ^ T == NULL)
        return -1;
 
    /* check given node is same in both trees S & T */
    if (dicto(T, S)==1)
        return 1;
 
    /* If the tree with tree as current node doesn't match then
       try left and right subtrees one by one */
    return isSubtree(T->left, S) || isSubtree(T->right, S);
}
 

int dicto(struct node * tree1, struct node *tree2)
{
   
    
    /* eiher of them is NULL,but not both*/
    if (tree1 == NULL ^ tree2 == NULL)
        return -1;

    /* both NULL and thus same */
    if (tree1 == NULL && tree2 == NULL)
        return 1;
   
	
    /* Check if the data of both trees is same and data of left and right
       subtrees are also same */
    return (tree1->data == tree2->data   &&  dicto(tree1->left, tree2->left) && dicto(tree1->right, tree2->right) );
}
 
 
/* Assigner fucntion datavalues &
   and NULL left and right pointers. */
struct node* NNode(int data)
{
    struct node* node =
        (struct node*)malloc(sizeof(struct node));
    node->data  = data;
    node->left  = NULL;
    node->right = NULL;
    return(node);
}
 
/* Main Function*/
int main()
{
    
    /*// TREE 1
              13
            /   \
          15     23
        /         \
      40            3
       \
        11
    */
    struct node *T        = NNode(13);
    T->right              = NNode(23);
    T->right->right       = NNode(3);
    T->left               = NNode(15);
    T->left->left         = NNode(40);
    T->left->right        = NNode(11);
    
    /* // TREE 2
          15
        /    
      40      
       \
        11
    */
    struct node *S    = NNode(15);
    S->left	      = NNode(40);
    S->left->right    = NNode(11);
 
 
    if (isSubtree(T, S)==1)
        printf("S is subtree of T");
    else
        printf("S is not a subtree of T");
 
    return 0;
}
