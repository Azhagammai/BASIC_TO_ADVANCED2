#include<stdio.h>
#include<string.h>
int main(void){
    char ch[50]={"Hello"};
    int n=0;
    while(ch[n]!='\0'){
        n++;
    }
    printf("%i\n",n);
    int m=strlen(ch);
    printf("%i\n",m);
}