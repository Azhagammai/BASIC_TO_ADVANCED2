#include<stdio.h>
#include<string.h>
int main(void){
    FILE *file=fopen("Phonebook.csv","w");
    // FILE *file=fopen("Phonebook.csv","a");

    char name[10];
    char number[10];
    printf("Enter the name: ");
    fgets(name,sizeof(name),stdin);
    printf("\nEnter the number: ");
    fgets(number,sizeof(number),stdin);
    fprintf(file,"%s%s",name,number);
    fclose(file);



}