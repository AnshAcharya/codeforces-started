#include <stdio.h>
#include <string.h>

int main()
{
    int n;
    scanf("%d", &n);
    char oper[n][4];
    for (int i = 0; i < n; i++)
    {
        scanf("%s", oper[i]);
    }
    int x = 0;
    for (int i = 0; i < n; i++)
    {
        if(strcmp(oper[i], "++X") == 0 || strcmp(oper[i], "X++") == 0)
            x++;
        else
            x--;
    }
    printf("%d", x);
    return 0;
}