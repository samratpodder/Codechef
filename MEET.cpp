#include "iostream"
#include  <string>
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
    string time = "02:00 PM";
    getline(cin,time);
    // cout<<time<<endl;
    // cout<<convert24(time)<<endl;
    std::string time24 = convert24(time);
    int arr[4];
    
    return 1;
}