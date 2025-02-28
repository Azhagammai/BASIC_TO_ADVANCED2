#include<stdio.h>
int main(void){
    // int n=10;
    // int *p=&n;
    // printf("The address of number: %p",p);
    // printf("\n The pointer value:%d ",p);
    // printf("\nThe number is : %d",*p);
    // printf("\nThe address of pointer is: %p",*p);
    // printf("\nThe address of number is: %p",&n);
    // printf("\n The address of number is : %p",p);
    char *s="Hello";
   
    printf("The address of the string: %p", s);  // Base address of array
    printf("\nThe address of first saracter: %p", &s[0]);  // Address of 'H'
    printf("\nThe address of second saracter: %p", &s[1]); // Address of 'e'
    printf("\nThe address of third saracter: %p", &s[2]);  // Address of 'l'
    printf("\nThe address of fourth saracter: %p", &s[3]); // Address of 'l'
    printf("\nThe address of fifth saracter: %p", &s[4]);  // Address of 'o'
    //pointer arithmetic
    printf("\n The first char: %c",*s);
    printf("\n The second char: %c",*(s+1));
    printf("\n The first string: %s",s);
    printf("\n The first string: %s",s+1);
    printf("\n The first string: %s",s+2);


    return 0;
}