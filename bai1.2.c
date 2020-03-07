#include <stdio.h>
#include <conio.h>
#include <string.h>
int kiemtra (long n);
main() 
{
	FILE *f1, *f2;
	int n,i;
	long so;
 f1= fopen ("D:\\NGUYEN THI CHAU KHAU\\test2.txt","r" );
 f2= fopen ("D:\\NGUYEN THI CHAU KHAU\\ketqua2.txt","w" );
	fscanf (f1,"%d", &n); //Doc so bo test trong file
	for (i=0; i<n; i++) 
	{
		fscanf (f1,"%ld",&so);//Doc du lieu tu tep theo khuon dang
		
		if (kiemtra(so))
			fprintf (f2, "%s\n", "YES");//Ghi du lieu len tep theo khuon dang
		else
			fprintf (f2, "%s\n", "NO");
	}
	fclose(f1);
	fclose (f2);
}
int kiemtra(long n) {
	int sd, sc;
	sc = n%10;
	while (n!=0) {
		sd = n%10;
		n = n/10;
	}
	if (sd == sc) {
		return 1;
	}
	return 0;
}
