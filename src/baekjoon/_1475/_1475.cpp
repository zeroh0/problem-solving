#include <bits/stdc++.h>

using namespace std;

int num[10];

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int number;
    cin >> number;

    while (number) {
        num[number % 10]++;
        number /= 10;
    }

    int max = 1;
    for (int n = 0; n < 10; n++) {
        if (n == 6 || n == 9) continue;
        if (max < num[n]) max = num[n];
    }

    int six_nine = ((num[6] + num[9]) / 2) + ((num[6] + num[9]) % 2);

    if (max < six_nine) max = six_nine;

    cout << max;
}