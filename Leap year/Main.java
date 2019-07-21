#include<stdio.h>
int main()
{
  int lp;
  scanf("%d",&lp);
  if (lp>0 && lp%4==0)
  {
    printf("Leap year");
  }
  else
    printf("Not Leap year");
  return 0;
}