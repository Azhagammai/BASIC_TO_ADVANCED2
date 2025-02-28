//all are lowercase without spece in my file name
#include<stdio.h>

int main(){
    int arr[]={1,200,30,8};
   
    int n;
    int size =sizeof(arr)/sizeof(arr[0]);
    
    printf("Enter the number: ");
    scanf("%d", &n); 
    for(int i=0;i<size;i++){
        if(arr[i]==n){
            printf("Found\n");
            return 0;
        }
    }
    printf("Not Found\n");
    return 1;
    

}