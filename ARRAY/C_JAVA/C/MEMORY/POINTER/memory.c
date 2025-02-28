#include<stdio.h>
#include<string.h>
#include<ctype.h>

int main(void){
    char s[]="hi";
    char *t=s;
    t[0]=toupper(t[0]);
    printf("The string s:%s",s);
    printf("\nThe string t:%s",t);// we gona use malloc
    
}