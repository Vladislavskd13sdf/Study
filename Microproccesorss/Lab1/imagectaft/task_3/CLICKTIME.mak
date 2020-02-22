CC = iccavr
LIB = ilibw
CFLAGS =  -e -D__ICC_VERSION=722 -D__BUILD=7 -DATMega128  -l -g -MLongJump -MHasMul -MEnhanced -Wf-use_elpm 
ASFLAGS = $(CFLAGS) 
LFLAGS =  -g -nb:7 -e:0x20000 -ucrtatmega.o -bfunc_lit:0x8c.0x10000 -dram_end:0x10ff -bdata:0x100.0x10ff -dhwstk_size:30 -beeprom:0.4096 -fihx_coff -S2
FILES = click_time.o 

CLICKTIME:	$(FILES)
	$(CC) -o CLICKTIME $(LFLAGS) @CLICKTIME.lk   -lcatm128
click_time.o: .\..\..\..\..\..\Programs\ImageCraftAVR\include\iom128v.h .\..\..\..\..\..\Programs\ImageCraftAVR\include\macros.h E:\Programs\ImageCraftAVR\include\AVRdef.h
click_time.o:	click_time.c
	$(CC) -c $(CFLAGS) click_time.c
