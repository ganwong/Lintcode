#include <iostream>

void replace(char a[], int length);
void print(char a[]);

int main() {
    const int length = 50;
    char a[length] = "We are happy.";
    print(a);
    replace(a, length);
    print(a);
}

void print(char a[]) {
    for (int i = 0; a[i] != '\0'; ++i) {
        std::cout << a[i];
    }
}

void replace(char a[], int length) {
    if (a == NULL || length <= 0) return;

    int originalLength = 0;
    int numBlank = 0;
    for (int i = 0; a[i] != '\0'; ++i) {
        if (a[i] == ' ') {
            numBlank++;
        }
        originalLength++;
    }
    int newLength = originalLength + 2 * numBlank;
    if (newLength > length) return;

    int indexOriginal = originalLength;
    int indexNew = newLength;
    while (indexOriginal >= 0 && indexOriginal < indexNew) {
        if (a[indexOriginal] == ' ') {
            a[indexNew--] = '0';
            a[indexNew--] = '2';
            a[indexNew--] = '%';
        } else {
            a[indexNew--] = a[indexOriginal];
        }
        indexOriginal--;
    }
}