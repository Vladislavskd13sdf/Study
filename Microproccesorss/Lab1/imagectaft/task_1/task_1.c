#include "iom128v.h"
#include "macros.h"

void delay(int ms)
{
	int c1,c2;
    for(c1=0;c1<ms;c1++)
    	for(c2=0;c2<970;c2++)
        	NOP();
}
void cout_open()
{
    char seg[4]={0b01110111,0b00111101,0b00011111,0b01101101};
    char pc[4]={6,7,1,2};
    char i;
    DDRA=255;
    for(i=0;i<4;i++)
    {
        PORTC=pc[i];
        PORTA=~seg[i];
    }
}
void cout_close()
{
    char seg[4]={0b00010111,0b00000111,0b01110111,0b01011011};
    char pc[4]={6,7,1,2};
    char i;
    DDRA=255;
    for(i=0;i<4;i++)
    {
        PORTC=pc[i];
        PORTA=~seg[i];
    }
}
char get_key()
{
    char k;
    char button=0;
    PORTC=0;
    DDRA=0;
    PORTD=128;
    k=PINA;
    PORTD=0;
    if(k==~0b00010000) button=1;
    else if(k==~0b00100000) button=2;
    else if(k==~0b01000000) button=3;
    else if(k==~0b10000000) button=4;
    else if(k==~0b00001000) button=5;
    else if(k==~0b00000100) button=6;
    else if(k==~0b00000010) button=7;
    else if(k==~0b00000001) button=8;
    return button;
}
void main()
{
    char state=0;
    char key=0;
    DDRC=0b10000111;
    DDRG=1;
    DDRD=0x80; // 128 or 0b10000000
    cout_close();
    while(1)
    {
    	while(key==0)
	    {
    	    key=get_key();
	    }
        
        
        if((state==0)&&(key==3))
        {
            state=1;
            cout_close();
        }
        
        else if((state==1)&&(key==3))
        {
            state=2;
            cout_close();     
        }
        else if((state==2)&&(key==2))
        {
            state=3;
            cout_close();
        }
        else if((state==3)&&(key==1))
        {
            cout_open();
            state=0;
            delay(4000);
            cout_close();
        }
        
        while(key!=0)
        {
         key=get_key();
        }
    }
}