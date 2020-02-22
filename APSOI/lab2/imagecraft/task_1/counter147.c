#include "iom128v.h"
#include "macros.h"

void delay(int ms)
{
 int c1, c2;
 for(c1=0;c1<ms;c1++)
 {
  for(c2=0;c2<970;c2++)
  {
   NOP();
  }
 }
}

void main()
{
 char seg[10]={0b01110111,0b01100000,0b00111110,0b01111010,0b01101001,0b01011011,0b01011111,0b01110000,0b01111111,0b01111011};
 int i;
 DDRC=0b10000111;
 DDRA=0xFF;
 DDRG=0x01;
 PORTG=0;
 PORTA=0;
 PORTC=0;
 PORTC=5;
 while(1)
 {
  for(i=0;i<1470;i++)
  {
   PORTC=6;
   PORTA=~seg[i/147];
   PORTC=7;
   PORTA=~seg[(i%147)/100];
   PORTC=1;
   PORTA=~seg[((i%147)%100)/10];
   PORTC=2;
   PORTA=~seg[((i%147)%100)%10];
   delay(50);
  }
 }
}