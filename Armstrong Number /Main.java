#include <stdio.h>
int main()
{
    int number;
    int sum=0;
    int r,temp;
   
    scanf("%d",&number);
    temp=number;
   while(number>0)
    {
       r=number%10;
     sum=sum+(r*r*r);
     number=number/10;
     
    }
  if(temp==sum)
  {
    printf("Armstrong Number");
  }
  else
  {
     printf("Not an Armstrong Number");
  }

    return 0;
}