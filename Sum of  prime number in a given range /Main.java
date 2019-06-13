#include<stdio.h>

int main(){

    int numbr,k,remark,first=2,last,sum=0;

    
    scanf("%d",&last);

    for(numbr= first; numbr<= last; ++numbr)

   {

    remark=0;

    for(k=2; k<=numbr/2; k++)

   {

        if((numbr % k) == 0){

        remark++;

        break;

        }

    }

   if(remark==0)

   sum += numbr;

   }

   printf("%d ",sum);

   return 0;

}