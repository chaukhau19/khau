#include <string.h>
#include <conio.h>
#include <stdio.h>
int tongchuso (long n);
void main()
{
 	FILE*f1,*f2;
int i,n,so;

 f1= fopen ("D:\\abcxyz\\khaau.txt","r" );
 f2= fopen ("D:\\abcxyz\\khaau.txt","w" );
 fscanf (f1,"%d", &n);
 for(i=1;i<=n;i++)
 {
 	fscanf(f1,"%d",&so);
 	fprintf(f2,"%d\n",tongchuso(so));
 }
 	fclose(f1);
 	fclose(f2);

 
}
int tongchuso(long n)
{
    int t;
	long S=0;
	while(n!=0)
	{
		t=n%10;
		n=n/10;
		S=S +t;
	}
	return S;

}


