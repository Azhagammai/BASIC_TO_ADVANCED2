#include<stdio.h>
int main(){

    int arr[]={10,20,30,40,50};
    int n,flag=0;
    printf("Enter the Element to be found: ");
    scanf("%d",&n);
    int size=sizeof(arr)/sizeof(arr[0]);
    for(int i=size-1;i>=0;i--){
        if(arr[i]==n){
            printf("Found\n");
            flag=1;
            break;
        }
    }
    if(!flag)
        printf("Not found\n");
    return 0;
}