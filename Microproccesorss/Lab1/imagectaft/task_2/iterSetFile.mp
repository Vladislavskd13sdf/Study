Project:      iterSetFile
Build Number: 11
Date:         Thu Feb  6 09:30:50 2020
Compiler:     ICCAVR
Version:      7.22C

NOTE: AVR Code addresses are word addresses
All other addresses (including ones in FLASH) are byte addresses

Area                               Addr   Size   Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                            text   0022   0092 =    146. bytes (rel,con,rom)

       Addr  Global Symbol
      -----  --------------------------------
       0011  __text_start
       0011  __start
       0032  _exit
       0033  _delay
       0046  _main
       0050  push_xgsetF000
       0055  pop_xgsetF000
       005A  __text_end

Area                               Start  End    Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                          vector   0000   0002 =      2. bytes (abs,ovr,rom)

Files Linked      [ module(s) ]

E:\Programs\ImageCraftAVR\lib\crtAVR.o	[ crtavr.s ]
iterSetFile.o	[ iterSetFile.c ]
<library>	[ gpushy.s ]

User Global Definitions

ram_end = 0x25f
hwstk_size = 0x1e

Area Definitions

-bfunc_lit:0x22.0x2000
-bdata:0x60.0x25f

