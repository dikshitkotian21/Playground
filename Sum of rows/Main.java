#include<iostream>
using namespace std;
int main() 
{ 
  
    int i,j,m,n; 
  std::cin>>m;
  std::cin>>n;
    int arr[m][n]; 
    for (i = 0; i < m; i++) 
    {
        for (j = 0; j < n; j++) 
        {
            std::cin>>arr[i][j]; 
        }
    }
    int sum = 0;
    for (i = 0; i < m; ++i) { 
        for (j = 0; j < n; ++j) { 
            sum = sum + arr[i][j]; 
        } 
        cout<<sum<<endl; 
        sum = 0; 
    } 
    return 0; 
} 