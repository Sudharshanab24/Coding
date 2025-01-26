int isPalindrome(char *s,int i,int j)
{
    while(i<j)
    {
        if(s[i]!=s[j])
        return 0;
        i++;
        j--;
    }
    return 1;
}


char* longestPalindrome(char* s)
{
    int n=strlen(s);

    if (n==0)
    return "";

    int start=0,maxlen=1;

    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
            if(j+1-i>maxlen && isPalindrome(s,i,j))
            {
                start=i;
                maxlen=j+1-i;
            }
        }
    }

    char *temp=(char *)malloc(maxlen+1);
    strncpy(temp,s+start,maxlen);
    temp[maxlen]='\0';

    return temp;
}