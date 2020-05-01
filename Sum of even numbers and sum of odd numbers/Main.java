#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int a[n],even=0,odd=0;
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
    if(a[i]%2==0)
      even=even+a[i];
    else
      odd=odd+a[i];
  }
  std::cout<<"The sum of the even numbers in the array is "<<even<<"\n";
  std::cout<<"The sum of the odd numbers in the array is "<<odd;
}