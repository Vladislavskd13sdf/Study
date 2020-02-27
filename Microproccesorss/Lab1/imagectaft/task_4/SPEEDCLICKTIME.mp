Project:      SPEEDCLICKTIME
Build Number: 8
Date:         Thu Feb 27 00:11:31 2020
Compiler:     ICCAVR
Version:      7.22C

NOTE: AVR Code addresses are word addresses
All other addresses (including ones in FLASH) are byte addresses

Area                               Addr   Size   Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                           idata   008C   0033 =     51. bytes (rel,con,rom)

       Addr  Global Symbol
      -----  --------------------------------
       008C  __idata_start
       00BF  __idata_end

Area                               Addr   Size   Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                            text   00C0   03E8 =   1000. bytes (rel,con,rom)

       Addr  Global Symbol
      -----  --------------------------------
       0060  __start
       0060  __text_start
       0082  _exit
       0083  _delay
       0098  _scan_buttons
       00BF  _segments
       00CD  _main
       0215  asr16
       021C  pop_xgset003C
       0221  push_xgsetF0FC
       0223  push_xgset30FC
       0225  push_xgset00FC
       0227  push_xgset003C
       022C  push_xgsetF000
       0231  pop_xgsetF000
       0236  lsl8
       023C  asgnblk
       0254  __text_end

Area                               Addr   Size   Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                            data   0100   0033 =     51. bytes (rel,con,ram)

       Addr  Global Symbol
      -----  --------------------------------
       0100  __data_start
       0133  __data_end

Area                               Start  End    Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                          vector   0000   0004 =      4. bytes (abs,ovr,rom)

Files Linked      [ module(s) ]

E:\Programs\ImageCraftAVR\lib\crtatmega.o	[ crtatmega.s ]
SpeedClick.o	[ SpeedClick.c ]
<library>	[ asr16.s, gpop2.s, gpush.s, gpushy.s, lsl8.s, struct.s ]

User Global Definitions

ram_end = 0x10ff
hwstk_size = 0x1e

Area Definitions

-bfunc_lit:0x8c.0x10000
-bdata:0x100.0x10ff

