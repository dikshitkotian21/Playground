#include<iostream>
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
    int max = 0;
    int result[m];
  i=0;
    while (i < m)
    {
        for ( j = 0; j < n; j++)
        {
            if (mat1[i][j] > max)
            {
                max = mat1[i][j];
            }
        }
        result[i] = max;
        max = 0;
        i++;

    }
     for(j = 0; j <i; j++)
    {
        cout << result[j] << "\n";
    }
    return 0;
}