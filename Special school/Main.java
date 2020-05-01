#include<iostream>
using namespace std;
#include<string.h>
void strrrev(char * str) 
{
 int j = 0, i = 0;
 while(str[j+1]) j++;
 while(i < j) 
{
  char temp = str[i];
  str[i] = str[j];
  str[j] = temp;
  i++;
  j--;
}
}
int main()
{
    char str1[50],str2[50];
    gets(str1);
    gets(str2);
    strrrev(str1);
    if(strcmp(str2,str1)==0)
    std::cout<<"It is correct";
    else
    std::cout<<"It is wrong";
    return 0;
}