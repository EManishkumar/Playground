#include<stdio.h>
int main()
{
  int n,p,b;
  scanf("%d",&n);
  p=(n/100);
  b=(n%100)%10;
  printf("%d",p+b);
  
  
  return 0;
}