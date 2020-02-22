CC = iccavr
LIB = ilibw
CFLAGS =  -e -D__ICC_VERSION=722 -D__BUILD=1 -DATMega16  -l -g -MLongJump -MHasMul -MEnhanced 
ASFLAGS = $(CFLAGS) 
LFLAGS =  -g -nb:1 -e:0x4000 -ucrtatmega.o -bfunc_lit:0x54.0x4000 -dram_end:0x45f -bdata:0x60.0x45f -dhwstk_size:30 -beeprom:0.512 -fihx_coff -S2
FILES = testcraft.o 

TESTCRAFT:	$(FILES)
	$(CC) -o TESTCRAFT $(LFLAGS) @TESTCRAFT.lk   -lcatmega
testcraft.o: .\..\..\Programs\ImageCraftAVR\include\iom16v.h .\..\..\Programs\ImageCraftAVR\include\macros.h E:\Programs\ImageCraftAVR\include\AVRdef.h
testcraft.o:	testcraft.c
	$(CC) -c $(CFLAGS) testcraft.c
