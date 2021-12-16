#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    int n,len,start,end;
    scanf("%d", &n);
    start=0;
    len=2*n-1;
    end=len-1;
    int arr[len][len];
    while(n!=0){
        for(int i=start;i<=end;i++){
            for(int j=start;j<=end;j++){
                if(i==start||i==end||j==start||j==end){
                    arr[i][j]=n;
                }
            }
        }
        ++start;
        --end;
        --n;
    }
    for(int i=0;i<len;i++){
        for(int j=0;j<len;j++){
            printf("%d ",arr[i][j]);
        }
    printf("\n");
    } 
     
    return 0;
}
