// Problem Statement

// An Instagram influencer wishes to create a report for assessing their engagement with their followers.

// To categorize the influencer's following, we will classify them as having a "Large Following"
//  if they possess more than 1000 followers, or as having a "Moderate Following" if they have 1000 or fewer followers.

// Note: To implement this, we will define a class called "Profile" that includes an attribute for the number of followers.
// Input Format
// The input consists of an integer representing the number of followers the influencer has.
// Output Format
// If the follower count is greater than 1000, the output prints "Influencer has large followers"
// If the follower count is 1000 or fewer, the output prints "Influencer has moderate followers"
// Constraints
// 0 <= Number of followers <= 106
#include<iostream>
using namespace std;
class profile{
    public:
    int noOfFollowers;
    profile(int noOfFollowers){
        this->noOfFollowers=noOfFollowers;
    }
    void check(){
        if(noOfFollowers>=1000){
        cout<<"Influencer has large followers"<<endl;
    }
    else{
        cout<<"Influencer has moderate followers"<<endl;
    }
    }
};
int main(){
    int n;
    cin>>n;
    profile p(n);
    p.check();
    
}