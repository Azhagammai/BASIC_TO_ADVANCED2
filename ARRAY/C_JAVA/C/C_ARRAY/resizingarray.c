#include<stdio.h>
#include<stdlib.h>
int main(void){
    int *list=malloc(3*sizeof(int));
    if(list==NULL){
        return 1;
        
    }
    list[0]=1;
    list[1]=2;
    list[2]=3;
 
    //Time passes
    int *temp=malloc(5*sizeof(int));
    // int *temp=reallo(list,5*sizeof(int)); we don't copy the previous instead of we use realloc

    if(temp==NULL){
        // free(list);
        return 1;
    }
    for(int i=0;i<3;i++){
        temp[i]=list[i];//copy the value in  temp;
    }
    temp[3]=4;
    // free(list);
    // list=temp;
    for(int i=0;i<5;i++){
        printf("%d\n",temp[i]);
    }
    free(list);
    return 0;



    
}