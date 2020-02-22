#include "iom16v.h"
#include "macros.h"
void delay(int t)
{
	int c1,c2;
	for(c1=0;c1<t;c1++)
    {
    	for(c2=0;c2<100;c2++)
        {
        	NOP();
        }
    }
}
void main()
{
	DDRC=0b10000001;
    while(1)
    {
    	PORTC=0b00000001;
        delay(10);
    	PORTC=0b10000000;
        delay(10);

    }
    
    
}