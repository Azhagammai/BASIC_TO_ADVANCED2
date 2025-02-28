#include<stdio.h>
void swap(int *a,int *b);
int main(void){
  int a=9;
  int b=7;
  printf("\nThe a value of A is:%d",a);
  printf("\nThe a value of B is: %d",b);
  swap(&a,&b);
  printf("\nThe a value of a is:%d",a);
  printf("\nThe a value of b is: %d",b);
}
void swap(int *a,int *b){
    int  temp=*a;
    *a=*b;
    *b=temp;
    
}