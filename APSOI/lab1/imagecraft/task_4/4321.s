	.module _4321.c
	.area text(rom, con, rel)
	.dbfile 4321.c
	.dbfile E:\Projects\APSOI\lab1\imagecraft\task_4\4321.c
	.dbfunc e delay _delay fV
;             c1 -> R20,R21
;             c2 -> R22,R23
;             ms -> R16,R17
	.even
_delay::
	xcall push_xgsetF000
	.dbline -1
	.dbline 5
; #include "iom128v.h"
; #include "macros.h"
; 
; void delay(int ms)
; {
	.dbline 7
;  int c1, c2;
;  for(c1=0;c1<ms;c1++)
	clr R20
	clr R21
	xjmp L5
L2:
	.dbline 8
;   for(c2=0;c2<970;c2++) NOP();
	clr R22
	clr R23
L6:
	.dbline 8
	nop
L7:
	.dbline 8
	subi R22,255  ; offset = 1
	sbci R23,255
	.dbline 8
	cpi R22,202
	ldi R30,3
	cpc R23,R30
	brlt L6
X0:
L3:
	.dbline 7
	subi R20,255  ; offset = 1
	sbci R21,255
L5:
	.dbline 7
	cp R20,R16
	cpc R21,R17
	brlt L2
X1:
	.dbline -2
L1:
	.dbline 0 ; func end
	xjmp pop_xgsetF000
	.dbsym r c1 20 I
	.dbsym r c2 22 I
	.dbsym r ms 16 I
	.dbend
	.area data(ram, con, rel)
	.dbfile E:\Projects\APSOI\lab1\imagecraft\task_4\4321.c
L11:
	.blkb 2
	.area idata
	.byte 6,7
	.area data(ram, con, rel)
	.dbfile E:\Projects\APSOI\lab1\imagecraft\task_4\4321.c
	.blkb 2
	.area idata
	.byte 1,2
	.area data(ram, con, rel)
	.dbfile E:\Projects\APSOI\lab1\imagecraft\task_4\4321.c
	.area text(rom, con, rel)
	.dbfile E:\Projects\APSOI\lab1\imagecraft\task_4\4321.c
	.dbfunc e main _main fV
	.even
_main::
	.dbline 0 ; func end
	ret
	.dbend
	.area data(ram, con, rel)
	.dbfile E:\Projects\APSOI\lab1\imagecraft\task_4\4321.c
_seg::
	.blkb 2
	.area idata
	.byte 96,62
	.area data(ram, con, rel)
	.dbfile E:\Projects\APSOI\lab1\imagecraft\task_4\4321.c
	.blkb 2
	.area idata
	.byte 'z,'i
	.area data(ram, con, rel)
	.dbfile E:\Projects\APSOI\lab1\imagecraft\task_4\4321.c
	.dbsym e seg _seg A[4:4]c
