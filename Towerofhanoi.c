#include <stdio.h>
#include<math.h>
int step=0; // To count the moves / steps of disc movement. Should be visible for both recursive calls. Hence global.
/*To give generic print statement for "Special Move", "num" is seperate from "n", the disk number passed in every recursive call */
int num;

void MoveTower(int n, char source,char dest,char temp)
{
   
    if(n==1) //Base Condition
    {   step++;
        printf("\n Step #%d disc %d from source: %c to destination: %c \n", step, n, source,dest);
        
        return;
    }
    
            MoveTower(n-1, source, temp, dest);//1st Recursion
    
            step++; // Return from 1st recursion
    
            if (step == (pow(2,num))/2)
            {
            printf("\n Step # %d is a SPECIAL MOVE",step);
            printf("\n Moves the last disc 'n'=%d from source %c to destination %c,where it stays!",n,source,dest);
            printf("\n It takes %d steps to move 'n-1',here %d discs from source %c to temp %c",step-1,n-1,source,temp);
            }
            else
            {
            
            printf("\nStep #%d disc %d from source:%c to destination:%c\n", step, n, source, dest);
            }
    
               MoveTower(n-1, temp, dest, source);//2nd Recursion
    /* NOTE: When control reaches here, it means "Base Condition" return from second recursion, right half of the recursion tree.
     The run-time environment looks at the call stack to see if all function calls are executed. If not, it executes the statements of that function call. That is how the "Special Move" print statement gets executed.
     E.g. Step # 4 in n = 3
     After this it calls the second recursion of "MoveTower" in a top dowm approach execution
     */
    
    
    
    }//end MoveTower
               
int main()
{
            int n = 0;
            printf("\n Enter the number of disks");
            scanf("%d", &num);
    
            n = num;
            MoveTower(n, 'A', 'B', 'C');
}//end main
