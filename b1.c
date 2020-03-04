#include <conio.h>
#include <stdio.h>
int tongchuso (int n);
void main()
{
 	FILE*f1,*f2;
int i,n,so;

 f1= fopen ("D:\\abcxyz\\aa..txt","r" );
 f2= fopen ("D:\\abcxyz\\aa..txt","w" );
 for(i=1;i<=n;i++)
 {
 	fscanf(f1,"%d",&so);
 	fprintf(f2,"%d\n",tongchuso(so));
 	fclose(f1);
 	fclose(f2);
getch();
 
}
int tongchuso(int n)
{
	int t=0;
	while(n!=0)
	{
		t=t+n%10;
		n=n/10;
	}
	return t;

}
}
