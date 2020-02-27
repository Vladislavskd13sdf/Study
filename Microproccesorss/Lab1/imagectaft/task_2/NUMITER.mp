Project:      NUMITER
Build Number: 33
Date:         Wed Feb 26 23:36:58 2020
Compiler:     ICCAVR
Version:      7.22C

NOTE: AVR Code addresses are word addresses
All other addresses (including ones in FLASH) are byte addresses

Area                               Addr   Size   Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                           idata   008C   000A =     10. bytes (rel,con,rom)

       Addr  Global Symbol
      -----  --------------------------------
       008C  __idata_start
       0096  __idata_end

Area                               Addr   Size   Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                            text   0096   0280 =    640. bytes (rel,con,rom)

       Addr  Global Symbol
      -----  --------------------------------
       004B  __text_start
       004B  __start
       006D  _exit
       006E  _delay
       0083  _scan_buttons
       00AA  _main
       012F  mod16s
       0133  div16s
       014D  mod16u
       014F  div16u
       0150  xdiv16u
       0169  push_xgsetF000
       016E  pop_xgsetF000
       0173  asgnblk
       018B  __text_end

Area                               Addr   Size   Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                            data   0100   000A =     10. bytes (rel,con,ram)

       Addr  Global Symbol
      -----  --------------------------------
       0100  __data_start
       010A  __data_end

Area                               Start  End    Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                          vector   0000   0004 =      4. bytes (abs,ovr,rom)

Files Linked      [ module(s) ]

E:\Programs\ImageCraftAVR\lib\crtatmega.o	[ crtatmega.s ]
iterSetFile.o	[ iterSetFile.c ]
<library>	[ div16s.s, div16u.s, gpushy.s, struct.s ]

User Global Definitions

ram_end = 0x10ff
hwstk_size = 0x1e

Area Definitions

-bfunc_lit:0x8c.0x10000
-bdata:0x100.0x10ff

