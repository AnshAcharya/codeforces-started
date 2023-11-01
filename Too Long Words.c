#include <stdio.h>
#include <String.h>

int main()
{
    int n;
    scanf("%d", &n);
    char str[1000];
    int size[n];
    scanf("%s",str);

    for(int i = 0; i < n; i++)
    {
        if(size[i] <= 10)
        {
            printf("%s\n",str[i]);
        }
        else
        {
            printf("%c%d%c", str[i][0], size[i] - 2, str[i][n - 1]);
        }
    }
    return 0;
}