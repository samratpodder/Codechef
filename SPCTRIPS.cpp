#include<iostream>
using namespace std;
int main()
{
    int tc,n;
    cin>>tc;
    while(tc--)
    {
        int count=0;
        cin>>n;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = i; j <= n; j+=i) 
            {
                if (j%i==0) 
                {
                    for (int k = i; k <= n; k+=j) 
                    {
                        if (k%j==i) 
                        {
                            count++;
                        }
                    }
                }
            }
        }
        cout<<count<<endl;
    }
}