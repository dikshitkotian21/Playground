#include<iostream>
using namespace std;
int printresult(int *a,int sum,int s)
{
  if(sum>s)
    return 0;
  else
    return 1;
}
int main()
{
  //Type your code here.
  int n,s;
  std::cin>>n;
  std::cin>>s;
  int a[n],sum=0,res;
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
    sum=sum+a[i];
  }
  res=printresult(a,sum,s);
    if(res==0)
      std::cout<<"NO";
    else
      std::cout<<"YES";
}