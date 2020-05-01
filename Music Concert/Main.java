#include<iostream>
#include<cstdlib>
int main(){
  // Type your code here
  int *a;
  int n,male=0,female=0;
  std::cin>>n;
  a=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    std::cin>>*(a+i);
    if((*(a+i))%2==0)
      female=female+1;
    else
      male=male+1;
  }
  std::cout<<male;
  std::cout<<"\n"<<female;
  free(a);
  a=NULL;
  return 0;
}