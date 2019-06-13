#include<stdio.h>
int main()
{
  int a,b,c;
  
  scanf("%d%d%d",&a,&b,&c);
  if(b>a && b<c)
  {
     printf("second greatest = %d",b);
  }
  else if(c<b && c>a)
  {
     printf("second greatest = %d",c);
  }
  else
    printf("second greatest = %d",a);
    
}