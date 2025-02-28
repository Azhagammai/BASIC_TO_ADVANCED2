#include<stdio.h>
// void meow(void);//function prototype because we run below int mmain without error
void meow(int n);
int main(){
    // for(int i=0;i<2;i++){
    //     meow();
    // }
    meow(10);
}
// void meow(void){
//     printf("Meow\n");
// }
void meow(int n){
     for(int i=0;i<n;i++)
         printf("Meow\n");
     }
