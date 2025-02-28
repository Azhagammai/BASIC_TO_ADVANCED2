#include<stdio.h>
//constant
const int N=3;
//protype
void average(int N,int arr[]);
int main(void){
    int arr[N];
    for(int i;i<N;i++){
        scanf("%d\n",&arr[i]);
    }
    average(N,arr);


}
void average(int N,int arr[]){
    int sum=0;
    for(int i=0;i<N;i++){
        sum+=arr[i];
    }
    printf("Average: %f\n",(sum/(float)N));
}