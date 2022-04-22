#include <stdio.h>
#include <stdlib.h>

typedef struct _NODE{
	int val;
	struct _NODE *next;
} NODE;

void printList(NODE *);
void freeList(NODE *);

int main(void){
	NODE *head = (NODE*) malloc( sizeof(NODE) );
	head->val = 1;

	NODE *a = (NODE*) malloc(sizeof(NODE));
	a->val = 2 ;
	a->next = NULL ;
	head->next = a ;

	NODE *b = (NODE*) malloc(sizeof(NODE));
	b->val = 2 ;
	b->next = NULL ;
	a->next = b ;

	NODE *c = (NODE*) malloc(sizeof(NODE));
	c->val = 2 ;
	c->next = NULL ;
	b->next = c ;

	NODE *d = (NODE*) malloc(sizeof(NODE));
	d->val = 2 ;
	d->next = NULL ;
	c->next = d ;
	

	printList(head);
	a = head;
	while(a != NULL){
		a = a->next;
		free(head);
		head = a; 
	}
	
	return 0;
}


void printList(NODE *p){	
	while(p!=NULL){
		printf("%d ", p->val);
		p = p->next;
	}
	printf("\n");
}

void freeList(NODE *p){
	NODE *a = p;
	while(a!=NULL){
		a = a->next;
		free(p);
		p = a;
	}
}



