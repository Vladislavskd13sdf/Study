#include "iom128v.h"
void main()
{
 	 char data;
	 DDRC=0b11111111;
	 DDRB=0b11111111;
	 while(1)
	 {
			 PORTC=PINB+PIND; 
	 }
}
