char firstNotRepeatingChar(char *rawstr) {
    if (rawstr == NULL) return '\0';
    const int size = 256;
    unsigned int hashTable[size];
    for (int i = 0; i < size; ++i) {
        hashTable[i] = 0;
    }
    char *str = rawstr;
    while (*str != '\0') {
        hashTable[*str]++;
        str++;
    }
    str = rawstr;
    while (*str != '\0') {
        if (hashTable[*str] == 1) return *str;
        str++;
    }
    return '\0';
}