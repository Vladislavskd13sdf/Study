Project:      EFFECT_WAVE
Build Number: 30
Date:         Sun Feb  9 14:45:09 2020
Compiler:     ICCAVR
Version:      7.22C

NOTE: AVR Code addresses are word addresses
All other addresses (including ones in FLASH) are byte addresses

Area                               Addr   Size   Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                           idata   008C   000B =     11. bytes (rel,con,rom)

       Addr  Global Symbol
      -----  --------------------------------
       008C  __idata_start
       0097  __idata_end

Area                               Addr   Size   Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                            text   0098   01E4 =    484. bytes (rel,con,rom)

       Addr  Global Symbol
      -----  --------------------------------
       004C  __start
       004C  __text_start
       006E  _exit
       006F  _delay
       0084  _segments
       0092  _main
       010C  pop_xgset003C
       0111  push_xgsetF0FC
       0113  push_xgset30FC
       0115  push_xgset00FC
       0117  push_xgset003C
       011C  push_xgsetF000
       0121  pop_xgsetF000
       0126  asgnblk
       013E  __text_end

Area                               Addr   Size   Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                            data   0100   000B =     11. bytes (rel,con,ram)

       Addr  Global Symbol
      -----  --------------------------------
       0100  __data_start
       010B  __data_end

Area                               Start  End    Decimal Bytes (Attributes)
--------------------------------   ----   ----   ------- ----- ------------
                          vector   0000   0004 =      4. bytes (abs,ovr,rom)

Files Linked      [ module(s) ]

E:\Programs\ImageCraftAVR\lib\crtatmega.o	[ crtatmega.s ]
wave.o	[ wave.c ]
<library>	[ gpop2.s, gpush.s, gpushy.s, struct.s ]

User Global Definitions

ram_end = 0x10ff
hwstk_size = 0x1e

Area Definitions

-bfunc_lit:0x8c.0x10000
-bdata:0x100.0x10ff

