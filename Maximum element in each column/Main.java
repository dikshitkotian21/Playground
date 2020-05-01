#include<iostream>
#include<limits.h>
using namespace std;

int main()
{
    int i, j,m,n;
  std::cin>>m;
  std::cin>>n;
    int mat1[m][n];
    for(i = 0; i < m; i++)
    {
        for(j = 0; j < n; j++)
            cin >> mat1[i][j];
    }
  for(i = 0; i < n; i++)
    {
        int max = mat1[0][i];
        for(j = 1; j < m; j++)
        {
            if(mat1[j][i] > max)
            {
                max = mat1[j][i];
            }
        }
        cout << max << endl;
    }
    return 0;
}