#include<iostream>
using namespace std;
#include<string.h>
int main()
{
    char str1[100];char str2[100];
    int i=0; 
    std::cin>>str1;
  std::cin>>str2;
    i=strcmp(str1,str2);    
    if(i==0)
    std::cout<<"It is correct";
    else
    std::cout<<"It is wrong";
    return 0;
}