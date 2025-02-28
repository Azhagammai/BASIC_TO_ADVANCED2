#include<stdio.h>
#include<string.h>
#include<stdbool.h>
#include<ctype.h>  //==> islower, isupper
int main(void){
    char str[70]={"HeLLO"};
    printf("before : %s\n",str);
    int length=strlen(str);
    bool lower=false;
    for(int i=0;i<length;i++){
        if(str[i]>='a'&&str[i]<='z'){
            lower=true;
            //convert upper
            printf("%c",str[i]-('a'-'A'));//()
            
        }
        else{
            printf("%c",str[i]);
        }
    }
    if(lower){
        printf("It is lower");
    }
    else{
        printf("it is not");
    }

}