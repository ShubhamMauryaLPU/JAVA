#include <bits/stdc++.h>
using namespace std;
void bubbleSort(int arr[],int length){
    for(int i=0;i<length;i++){
        for(int j=0;j<length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    for(int i=0;i<length;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
void selectionSort(int arr[],int length){
    for(int i=0;i<length;i++){
        int minPos=i;
        for(int j=i+1;j<length;j++){
            if(arr[minPos]>arr[j]){
                minPos=j;
            }
        }
        int temp=arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=temp;
    }
}
void print(int arr[],int length){
    for(int i=0;i<length;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
int main(){
    int length;
    cin>>length;
    int arr[length];
    for(int i=0;i<length;i++){
        cin>>arr[i];
    }
    bubbleSort(arr,length);
    // int arr[]={1,4,2,3,5};
    // int length=sizeof(arr)/sizeof(int);
    // cout<<"using Selection Sort: "<<endl;
    // selectionSort(arr,length);
    // print(arr,length);
}