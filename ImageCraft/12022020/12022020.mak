CC = iccavr
LIB = ilibw
CFLAGS =  -e -D__ICC_VERSION=722 -D__BUILD=12 -DATMega16  -l -g -MLongJump -MHasMul -MEnhanced 
ASFLAGS = $(CFLAGS) 
LFLAGS =  -g -nb:12 -e:0x4000 -ucrtatmega.o -bfunc_lit:0x54.0x4000 -dram_end:0x45f -bdata:0x60.0x45f -dhwstk_size:30 -beeprom:0.512 -fihx_coff -S2
FILES = 2bit_to_10.o 

12022020:	$(FILES)
	$(CC) -o 12022020 $(LFLAGS) @12022020.lk   -lcatmega
2bit_to_10.o: .\..\..\..\Programs\ImageCraftAVR\include\iom128v.h .\..\..\..\Programs\ImageCraftAVR\include\macros.h E:\Programs\ImageCraftAVR\include\AVRdef.h
2bit_to_10.o:	2bit_to_10.c
	$(CC) -c $(CFLAGS) 2bit_to_10.c
