#include<stdio.h>
#include<string.h>
int main(void){
    char *s="HI!";
    char *t="Hi!";
    if(strcmp(s,t)==0){
        printf("Same");
    }
    else{
        printf("DIFFERENCE");
    }

    printf("\n The address of first *s or s[]: %p",s);
    printf("\n The address of second *t or t[]: %p",t);

}