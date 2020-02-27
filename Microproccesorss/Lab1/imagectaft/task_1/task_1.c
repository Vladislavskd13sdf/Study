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

char scan_buttons() // функция считывания состояния с кнопок
{
  char t, d=0;
  DDRA=0;		   // порт А настроен на вход для считывания данных с кнопок
  PORTD=0x80;	   // уст. лог. 1 на выводе PD7 для управления регистром клавиатуры
  t=PINA;		   // считывание значения с шины данных
  PORTD=0;		   // перевод регистра клавиатуры в высокоимпедансное состояние
  DDRA=0xFF;	   // настройка порта А на выход
  DDRG=0x01;	   // разрешение работы дешифратора
  PORTG=0;	 	   // установка на выходе PG0 лог. 0
  // преобразование данных, полученных с кнопок для удобства использования
  if((t&0x10)==0) d=1;	
  if((t&0x20)==0) d=2;
  if((t&0x40)==0) d=3;
  if((t&0x80)==0) d=4;
  if((t&0x01)==0) d=5;
  if((t&0x02)==0) d=6;
  if((t&0x04)==0) d=7;
  if((t&0x08)==0) d=8;
  return d;	  // значение возвращается из функции с инверсией
}

void main()
{
	char d=0;
	char i,j,k;
    char state=0;
	char clos[4]={0b00010111,0b00000111,0b01110111,0b01011011};
    char open[4]={0b01110111,0b00111101,0b00011111,0b01001100};
    char buss[4]={6,7,1,2};
	DDRA=0xFF;
    DDRC=0b10000111;
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
		 	PORTC=4;
			PORTA=0b00000001;
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
         	PORTC=4;
			PORTA=0b00000001<1;
        	showData_sevenIndc(open,buss,4);
        }
        delay(5000);

    }
}