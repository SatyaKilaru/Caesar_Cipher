# Caesar_Cipher

In encryption a given message will be transformed into another formatted message. To use the Caesar cipher technique, a shift will be given to us, which will be applied to encrypt our message.Suppose we are given a shift of three, then each character of a message will be shifted to the next third character. The last characters like Y or Z will follow the loop and be shifted to A , B or C. With a shift of three, A is shifted to D and B is shifted to E.
Formula for Encryption With Shift n:
            En(x) = (x+n)mod26
where, n stands for shift number which we give.
       x stands for Alphabet number.
