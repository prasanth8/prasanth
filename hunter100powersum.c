#include<stdio.h>
#include<conio.h>
int main(){
int n,i,a,b,sum=0,s=1;
scanf("%d",&n);
while(n>0){
a=n%10;
if(sum==0)
sum+=1;
else
{for(i=0;i<b;i++)
   s=s*a;
sum+=s;}
b=a;
s=1;
n=n/10;

}printf("%d",sum);
getch();
}