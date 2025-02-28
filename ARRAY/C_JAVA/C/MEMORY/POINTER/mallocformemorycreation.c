#include<stdio.h>
#include<ctype.h>
#include<stdlib.h>//malloc
#include<string.h>

int main(void){
    char s[]="hi!";
    char *t=malloc(strlen(s)+1);//allocate memory based on s
    int n=strlen(s);
    if(t==NULL){
        return 1;//error when malloc is not worlk
    }
    // for(int i=0;i<=n;i++){
    //     t[i]=s[i];//copy each character to t
    // }
    strcpy(t,s); 
    if(n>0){
        t[0]=toupper(t[0]);
    }
    printf("The each char in s: %s", s);
    printf("\nThe each char in t: %s", t);
    free(t);
    printf("\nThe each char in t: %s", t);

    
}