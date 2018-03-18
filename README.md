# Alibaba-Test

This is a little script to make two array mix themselves.

Such as {a1,a2...ai,ai+1}, and {b1,b2...bi,bi+1} turns to {a1,a2,b1,a3,b2...ai+1,bi+1}

The only principle is that for each array, a or b, their index behind should be larger than the front one in the final result array.
And the output is the c1c2+c3c4+c5c6....

Here is an example output

Please input the length for the two arrary: 5

The array A is: [40, 20, 25, 27, 31]

The array B is: [36, 64, 84, 17, 62]

The final array is: [36, 40, 64, 84, 17, 20, 25, 62, 27, 31]

The final result is: 9543

 