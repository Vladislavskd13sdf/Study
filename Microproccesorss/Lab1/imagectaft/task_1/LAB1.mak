CC = iccavr
LIB = ilibw
CFLAGS =  -e -D__ICC_VERSION=722 -D__BUILD=2 -DATMega128  -l -g -MLongJump -MHasMul -MEnhanced -Wf-use_elpm 
ASFLAGS = $(CFLAGS) 
LFLAGS =  -g -nb:2 -e:0x20000 -ucrtatmega.o -bfunc_lit:0x8c.0x10000 -dram_end:0x10ff -bdata:0x100.0x10ff -dhwstk_size:30 -beeprom:0.4096 -fihx_coff -S2
FILES = task_1.o 

LAB1:	$(FILES)
	$(CC) -o LAB1 $(LFLAGS) @LAB1.lk   -lcatm128
task_1.o: .\..\..\..\..\..\Programs\ImageCraftAVR\include\iom128v.h
task_1.o:	task_1.c
	$(CC) -c $(CFLAGS) task_1.c
