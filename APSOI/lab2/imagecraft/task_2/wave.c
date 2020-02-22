#include "iom128v.h"
#include "macros.h"

void delay(int ms)
{
 int c1, c2;
 for(c1=0;c1<ms;c1++)
  for(c2=0;c2<970;c2++) NOP();
}

void segments(int i, int j)
{
 PORTC=i;
 PORTA=~j;
 delay(100);
}

void main()
{
 char seg[3]={0b00000101, 0b00011010, 0b01100000};
 int item[4]={6,7,1,2};
 int i,j;
 DDRC=0b10000111;
 DDRA=0xFF;
 DDRG=0x01;
 PORTG=0;
 PORTA=0;
 PORTC=0;
 PORTC=5;
 PORTC=1;
 PORTA=0xFF; 
 PORTC=1;
 PORTC=2;
 PORTC=7;
 PORTC=6;
 while(1)
 {
  for(i=0;i<4;i++)
  {
   for(j=0;j<3;j++)
   {
   	segments(item[i],seg[j]);
   }
   PORTA=0xFF;
  }
  for(i=3;i>=0;i--)
  {
   for(j=2;j>=0;j--)
   {
   	segments(item[i],seg[j]);
   }
   PORTA=0xFF;
  }
 }
}
