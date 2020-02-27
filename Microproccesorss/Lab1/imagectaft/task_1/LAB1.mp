Project:      LAB1
Build Number: 4
Date:         Wed Feb 26 16:32:16 2020
Compiler:     ICCAVR
Version:      7.22C

NOTE: AVR Code addresses are word addresses
All other addresses (including ones in FLASH) are byte addresses

Area                               Addr   Size   Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                           idata   008C   000C =     12. bytes (rel,con,rom)

       Addr  Global Symbol
      -----  --------------------------------
       008C  __idata_start
       0098  __idata_end

Area                               Addr   Size   Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                            text   0098   02B4 =    692. bytes (rel,con,rom)

       Addr  Global Symbol
      -----  --------------------------------
       004C  __start
       004C  __text_start
       006E  _exit
       006F  _delay
       0084  _showData_sevenIndc
       009C  _scan_buttons
       00C3  _main
       0184  push_xgsetF000
       0189  pop_xgsetF000
       018E  asgnblk
       01A6  __text_end

Area                               Addr   Size   Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                            data   0100   000C =     12. bytes (rel,con,ram)

       Addr  Global Symbol
      -----  --------------------------------
       0100  __data_start
       010C  __data_end

Area                               Start  End    Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                          vector   0000   0004 =      4. bytes (abs,ovr,rom)

Files Linked      [ module(s) ]

E:\Programs\ImageCraftAVR\lib\crtatmega.o	[ crtatmega.s ]
task_1.o	[ task_1.c ]
<library>	[ gpushy.s, struct.s ]

User Global Definitions

ram_end = 0x10ff
hwstk_size = 0x1e

Area Definitions

-bfunc_lit:0x8c.0x10000
-bdata:0x100.0x10ff

