#include "iostream"
// #include  <string>
using namespace std;
std::string convert24(string time)
{
    char part = time[6];
    // cout<<part<<endl;
    if (part=='P')
    {
        string hour = time.substr(0,2);
        // cout<<hour<<endl;
        int hr = stoi(hour);
        // cout<<hr<<endl;
        if (hr==12)
        {
            hr=0;
        }
        
        hr+=12;
        string minutes = time.substr(3,2);
        string result = to_string(hr).append(minutes);
        return result;
    }
    else if (part=='A')
    {
        string hour = time.substr(0,2);
        // cout<<hour<<endl;
        int hr = stoi(hour);
        if (hr==12)
        {
            return "0000";
        }
        
        // cout<<hr<<endl;
        string minutes = time.substr(3,2);
        string result = to_string(hr).append(minutes);
        if (hr<10)
        {
            result.insert(0,"0");
        }
        return result;
    }
    
    
    return 0;
}
int main()
{
    string t;
    getline(cin,t);//test case input
    int tests = stoi(t);
    for(int i=0;i<tests;i++)
    {
        string time = "02:00 PM";
        getline(cin,time);// my time input
        // cout<<time<<endl;
        // cout<<convert24(time)<<endl;
        std::string time24 = convert24(time);
        int arr[4];
        string n;
        cin >> n;// n input
        unsigned int N = stoi(n);
        for (int j = 0; j < N+1; j++)
        {
            
            string LRTIME;
            getline(cin,LRTIME);// lr time input
            string delim = "M";
            // cout<<LRTIME.find(delim)<<endl;

            string ltime = LRTIME.substr(0,LRTIME.find(delim)+1);
            string rtime = LRTIME.substr(LRTIME.find(delim)+1);
            // cout<<ltime<<"\t\t"<<rtime<<endl;
            string ltime24 = convert24(ltime);
            string rtime24 = convert24(rtime);
            cout<<ltime24<<"\t\t"<<rtime24<<endl;
        }
        
    }
    
    
    
    
    return 1;
}