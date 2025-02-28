#include<stdio.h>
int main(void){
    char ch1[]="Hello";
    char ch2[100];
    int flag=1;
    for(int i=0;i<5;i++){
        scanf("%c",&ch2[i]);
        
    }
    for(int i=0;i<5;i++){
        if(ch1[i]!=ch2[i]){
            flag=0;
            break;
        }
        
        }
    
    if(flag){
        printf("Found");
    }
    else{
        printf("Not Found");
    }

}