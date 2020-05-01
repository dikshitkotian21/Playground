#include <iostream>
int main()
{
char str[100], rev[100];     
int count = 0, end, i;    
//Your code goes here     
  std::cin.getline(str,100);
  for(i=0;str[i]!='\0';i++)
  {
    count=count+1;
  }
  int j=0;
  for(i=count-1;i>=0;i--)
  {
    rev[j]=str[i];
    j++;
  }
std::cout<<rev;
}