#include<iostream>
using namespace std;
class Bird{
    public:
    virtual void wings()=0;
};
class parrot :public Bird{
    public:
    void wings(){
        cout<<"Parrot has its wings"<<endl;
    }
    void legs(){
        cout<<"Parrot has two legs"<<endl;
    }
};
int main(){
    int a=10;
    bool y=(a>5) && true;
    cout<<y<<endl;
    return 0;
}