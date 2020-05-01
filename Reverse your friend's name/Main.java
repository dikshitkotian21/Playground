#include<iostream>
#include<string>
#include<bits/stdc++.h> 
int main() 
{ 
//Type your code here
  std::string s;
  std::getline(std::cin,s);
  std::reverse(std::begin(s),std::end(s));
  std::cout<<s;
}