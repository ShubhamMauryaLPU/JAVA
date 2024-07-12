#include<iostream>
using namespace std;
int main()
{
    
    int a[5]={1,2,3,4,5};
    a[7]=a[6];
    a[6]=a[5];
    a[5]=a[4];
    int n;
    cout<<"Enter value";
    cin>>n;
    a[4]=n;
    for(int i=1; i<=5; i++){
        cout<<a[i]<<endl;;
    }

    }