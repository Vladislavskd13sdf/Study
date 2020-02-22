#line 35 "E:\Programs\ImageCraftAVR\include\AVRdef.h"
unsigned char FlashReadByte(unsigned char ramp, unsigned addr);
unsigned FlashReadWord(unsigned char ramp, unsigned addr);
unsigned long FlashReadLWord(unsigned char ramp, unsigned addr);
void FlashReadBytes(unsigned char ramp, unsigned addr, unsigned char *buf, int n);



unsigned char EDataReadByte(unsigned char ramp, unsigned addr);
unsigned EDataReadWord(unsigned char ramp, unsigned addr);
unsigned long EDataReadLWord(unsigned char ramp, unsigned addr);
void EDataReadBytes(unsigned char ramp, unsigned addr, unsigned char *buf, int n);

void EDataWriteByte(unsigned char ramp, unsigned addr);
void EDataWriteWord(unsigned char ramp, unsigned addr);
void EDataWriteLWord(unsigned char ramp, unsigned addr);
void EDataWriteBytes(unsigned char ramp, unsigned addr, unsigned char *buf, int n);






















void _StackCheck(void);
void _StackOverflowed(char);

#line 4 "E:\Projects\APSOI\lab1\imagecraft\task_4\4321.c"
void delay(int ms)
{
 int c1, c2;
 for(c1=0;c1<ms;c1++)
 for(c2=0;c2<970;c2++) asm("nop");
}

void main()
{
 char cnt_a, cnt_b;
 char PC[4]={6,7,1,2};
 char 2[4]={1,2,7,6};

 char seg[4]={0b01100000,0b00111110,0b01111010,0b01101001};

 (*(volatile unsigned char *)0x34)=0b10001111;
 (*(volatile unsigned char *)0x64)=0b00000001;
 (*(volatile unsigned char *)0x3A)=0b11111111;
 while(1)
 {
 (*(volatile unsigned char *)0x3B)=0xff;
 (*(volatile unsigned char *)0x35)=2;
 (*(volatile unsigned char *)0x35)=1;
 (*(volatile unsigned char *)0x35)=7;
 (*(volatile unsigned char *)0x35)=6;
 for(cnt_a=0;cnt_a<4;cnt_a++)
 {

















 for(cnt_b=3;cnt_b>=(0+cnt_a);cnt_b--)
 {
 if(cnt_b==3)
 {
 (*(volatile unsigned char *)0x35)=2[3]; 
 (*(volatile unsigned char *)0x3B)=~seg[0+cnt_a];
 delay(500);
 }
 else
 { 
 (*(volatile unsigned char *)0x35)=2[0+cnt_b];
 (*(volatile unsigned char *)0x3B)=~seg[0+cnt_a];
 (*(volatile unsigned char *)0x35)=2[0+cnt_b-1];
 (*(volatile unsigned char *)0x3B)=0xff;
 delay(500);
 }
 }
 }
 }
}

