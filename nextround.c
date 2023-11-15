#include <stdio.h>
int numOfCot(int *arr, int n, int k)
{
    for (int i = 0; i < n; i++)
    {
        if (arr[i] < arr[k] && arr[i] > 0)
        {
            return i;
        }
    }
    return 0;
}
int main()
{
    int n, k;
    scanf("%d %d", &n, &k);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d ", &arr[i]);
    }
    printf("%d", numOfCot(arr, n, k));
    return 0;
}