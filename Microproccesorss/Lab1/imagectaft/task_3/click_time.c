#include "iom128v.h"
#include "macros.h"

void delay(int ms)
{
	int c1,c2;
    for(c1=0;c1<ms;c1++)
    	for(c2=0;c2<970;c2++)
        	NOP();
}

void showData_sevenIndc(char seven_indc[],char ports[],char iter)
{
	char i;
	for(i=0;i<iter;i++)
    {
    	PORTC=ports[i];
        PORTA=~seven_indc[i];
    }
}

char scan_buttons() // ������� ���������� ��������� � ������
{
  char t, d=0;
  DDRA=0;		   // ���� � �������� �� ���� ��� ���������� ������ � ������
  PORTD=0x80;	   // ���. ���. 1 �� ������ PD7 ��� ���������� ��������� ����������
  t=PINA;		   // ���������� �������� � ���� ������
  PORTD=0;		   // ������� �������� ���������� � ����������������� ���������
  DDRA=0xFF;	   // ��������� ����� � �� �����
  DDRG=0x01;	   // ���������� ������ �����������
  PORTG=0;	 	   // ��������� �� ������ PG0 ���. 0
  // �������������� ������, ���������� � ������ ��� �������� �������������
  if((t&0x10)==0) d=0b00000001;	
  if((t&0x20)==0) d=0b00000010;
  if((t&0x40)==0) d=0b00000100;
  if((t&0x80)==0) d=0b00001000;
  if((t&0x01)==0) d=0b00000001;
  if((t&0x02)==0) d=0b00000010;
  if((t&0x04)==0) d=0b00000100;
  if((t&0x08)==0) d=0b00001000;
  return d;	  // �������� ������������ �� ������� � ���������
}

void main()
{
 	char seg[10]={0b01110111, 0b01100000, 0b00111110, 0b01111010, 0b01101001,
		 		  0b01011011, 0b01011111, 0b01110000,0b01111111, 0b01111011};
	char d=0;
	char i,j,k;
    char state=0;
	char buss[4]={6,7,1,2};
	DDRA=0xFF;
    DDRC=0b00000111;
    PORTA=0;
    PORTC=0;
    PORTC=5;
    DDRG=0b00000001;
    DDRD=0x80;
    while(1)
    {
    	d=scan_buttons();
        
        if(state==0)
        {
        	showData_sevenIndc(clos,buss,4);
			if(d==1)
            {
            	state=1;
                showData_sevenIndc(clos,buss,4);
            }
            else 
            {
            	state=0;
                showData_sevenIndc(clos,buss,4);
            }
        }
        else if(state==1)
        {
			if(d==2)
            {
            	state=2;
                showData_sevenIndc(clos,buss,4);
            }
            else 
            {
            	state=0;
                showData_sevenIndc(clos,buss,4);
            }
        }
        else if(state==2)
        {
			if(d==3)
            {
            	state=3;
                showData_sevenIndc(clos,buss,4);
            }
            else 
            {
            	state=0;
                showData_sevenIndc(clos,buss,4);
            }
        }
        else if(state==3)
        {
			if(d==4)
            {
            	state=4;
                showData_sevenIndc(clos,buss,4);
            }
            else 
            {
            	state=0;
                showData_sevenIndc(clos,buss,4);
            }
        }
        else if(state==4)
        {
        
        	showData_sevenIndc(open,buss,4);
        }
        delay(5000);

    }
}