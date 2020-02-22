
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








/*#include <io8535v.h>

//header file
#include <header_file.hS>

//global variable in declarate as SRAM
#pragma abs_address:0x1000
unsigned LCD_control_register
#pragma end_abs_address

//#pragme interrupt_handler vector_:_ to create interrupt functions 
#pragma interrupt_handler int0_isr:2

//assembler code
#asm("asm_code");




int strlen(const char[]);


const double e=2.718281828;
const char msg[]="Error number: ";
void main()
{
 	 int i;//correct declaration
 	 DDRD=0xff;//setting up all pins of port D to the output
	 PORTD=0b10101010;//output of the combination 10101010 to the port
	 int j,k;//uncorrect declaration
	 
}

void int0_isr(void)
{
 	 //external interrupt on INT0
}

*/