# Caesar_Cipher


We will process the cipher message which is encrypted by Caesar cipher to break it down to its original message form. There will be a shiftKey given, using which we can shift each character back to get the original message.

Suppose the encrypted text is CDEF and two is the shiftKey, then:
C -> A
D -> B
E -> C
F -> D
That means our original message is “ABCD”.

The Formula for Decryption With Shift n:
                    Dn(x)=(x-n)mod26
                    
where, n stands for Shift key.
       x stands for Alphabet number(which means in the numeric form).
