CC = iccavr
LIB = ilibw
CFLAGS =  -e -D__ICC_VERSION=722 -D__BUILD=1 -DAT90S8535  -l -g -Wa-W 
ASFLAGS = $(CFLAGS) 
LFLAGS =  -g -nb:1 -e:0x2000 -Wl-W -bfunc_lit:0x22.0x2000 -dram_end:0x25f -bdata:0x60.0x25f -dhwstk_size:30 -beeprom:1.512 -fihx_coff -S2
FILES = first.o 

FORST:	$(FILES)
	$(CC) -o FORST $(LFLAGS) @FORST.lk  
first.o: .\..\..\..\Programs\ImageCraftAVR\include\io8535v.h
first.o:	first.c
	$(CC) -c $(CFLAGS) first.c
