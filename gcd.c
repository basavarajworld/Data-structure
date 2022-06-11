#include<stdio.h>

int gcd (int n1,int n2)
{
	if (n2 !=0)
	{
		return gcd(n2, n1%n2);
	}
	else
	{
		return n1;
	}
}

void main ()
{
	int n1, n2;
	printf("\nEnter two positive numbers : \n");
	scanf("%d%d", &n1, &n2);
	
	printf("\nGCD of %d and %d is %d\n", n1, n2, gcd(n1,n2));
	
}
