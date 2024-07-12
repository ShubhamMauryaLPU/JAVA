#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    float a=1;
    float z=0;
    for(int i=0;i<n;i++){
        a+=z/(z+1);
        z++;
        
    }
    printf("%.2f",a);
    return 0;
}