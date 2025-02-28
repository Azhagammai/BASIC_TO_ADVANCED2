#include<stdio.h>
void draw(int n){
    if(n<=0){
        return;
    }
    draw(n-1);
    for(int i=0;i<n;i++){
        printf("# ");
    }
    printf("\n");
}
int main(void){
    int n=4;
    draw(n);
}