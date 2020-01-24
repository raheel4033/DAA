#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a;
	int b;
	printf("Enter value of a:");
	scanf("%d",&a);
	printf("\n");
	printf("Enter value of b:");
	scanf("%d",&b);
	printf("\n");
	printf("Entered value is a=%d and b =%d ",a,b);
	printf("\n");
	a=a+b;
	b=a-b;
	a=a-b;
	printf("after swaping a=%d and b=%d",a,b);
	return 0;
}


