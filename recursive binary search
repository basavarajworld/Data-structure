#include<stdio.h>

int binarysearch(int A[], int low, int high, int key)
{
    int mid;
    mid =(low+high)/2;

    if(low>high)
        return -1;
    else
    {
        if(A[mid]==key)
            return (mid+1);
        else if(A[mid]>key)
            return binarysearch(A,low, mid-1, key);
        else if(A[mid]<key)
            return binarysearch(A, mid+1, high, key);
    }
}
void main()
{
    int A[40], low, high, result, key, n;
    printf("enter the size of the array\n");
    scanf("%d", &n);
    printf("enter the sorted elements in array\n");
    for(int i = 0 ; i < n ; i++)
    {
        scanf("%d", &A[i]);
    }
    printf("enter the element to be searched\n");
    scanf("%d", &key);
    low = 0 ;
    high = n-1;
    result = binarysearch(A, low, high, key);
    if(result == -1)
        printf("element not found\n");
    else
        printf("element %d is found at %d", key, result);
}
