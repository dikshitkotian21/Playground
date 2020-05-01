#include<iostream>
using namespace std;
int main()
{
  int m, n, c, d, matrix[100][100], maximum;
	std::cin>>m;
  std::cin>>n;
 for (c = 0; c < m; c++)
    for(d = 0; d < n; d++)
      scanf("%d", &matrix[c][d]);

  maximum = matrix[0][0];

  for (c = 0; c < m; c++)
    for (d = 0; d < n; d++)
      if (matrix[c][d] > maximum)
        maximum = matrix[c][d];

  std::cout<<"The maximum element is "<<maximum;

  return 0;
}