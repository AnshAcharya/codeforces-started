#include <stdio.h>
#include <string.h>

int cnt_1(int *arr)
{
    int cnt = 0;
    for(int i = 0; i < 3; i++)
    {
        if(arr[i] == 1)
        {
            cnt++;
        }
    }
    return cnt;
}

int main()
{
    int n;
    scanf("%d", &n);
    int arr[n][3];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            scanf("%d", &arr[i][j]);
        }
    }
    int final_cnt = 0;
    for (int i = 0; i < n; i++)
    {
        if(cnt_1(arr[i]) > 1)
        {
            final_cnt++;
        }
    }
    printf("%d\n", final_cnt);
    return 0;
}