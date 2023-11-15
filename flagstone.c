#include <stdio.h>
#include <math.h>

int main()
{
    int n, m, a;
    scanf("%d %d %d", &n, &m ,&a);
    printf("%.0f", (int)(ceil((double)n / (double)a))*ceil((double)m / (double)a));
    return 0;
}