#include<stdio.h>
#include <string.h>
int main(void){
    char *ch1[]={"Pragadeesh","Azhagammai","Pramizh"};
    char *ch2[]={"+91-7000101000","+91-9800020051","+91-7000098000"};
    char ch3[100];
    int found=-1;
    printf("Enter the name: ");
    scanf("%s",ch3);
    for(int i=0;i<3;i++){
        if (strcmp(ch1[i], ch3) == 0){
            printf("Found: %s",ch2[i]);
            return 0;
            // found=i;
            // break;
        }

    }
    // if(found!=-1){
    //     printf("Found! Phone Number: %s\n", ch2[found]); 
    // }
    // else{
    //     printf("Not Found");
    // }
    printf("Not Found");
    return 1; //signifient error
}

