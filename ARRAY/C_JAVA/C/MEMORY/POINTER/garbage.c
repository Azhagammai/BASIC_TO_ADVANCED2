#include<stdio.h>
#include<stdlib.h>
int main(void){
    int *x;
    int *y;
    x=malloc(sizeof(int));
    *x=42;
    //  *y=8; // segment fault;
    y=x;
    *y=90;
    printf("%d",*y);
}