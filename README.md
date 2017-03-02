# Stopwatch tasks by Wuttipat Nilsiri (5910545850) task 2&3

I ran the tasks on a Microsoft Surface Pro (of course), and got
these results:
Task
---------------------------------------------------------------------
Append 50,000 chars to String 							0.779048 sec
Append 100,000 chars to String							2.071060 sec
Append 100,000 chars to StringBuilder					0.002052 sec
Sum array of double primitives with count=1,000,000,000 1.379849 sec
Sum array of Double objects with count=1,000,000,000	4.636418 sec
Sum array of BigDecimal with count=1,000,000,000		8.605341 sec

## Explanation
why is there such a big difference in the time used to append chars to a String and to a StringBuilder?
Even though we eventually "copy" the StringBuilder into a String so the final result is the same.

ans :  Operation + in String it have Re-Allocate Memory everytime so it will take times more than StringBuilder

why is there a significant difference in times to sum double, Double, and BigDecimal values?

ans : 1. sum double it is sum of normal values 1 + 2 + 3 ... so it will be the fastest  
	  2. Double (Object)  it have to create new Object everytime so it take more few times
	  3. BigDecimal it have to invoke a method everytime to sum so it will br the slowest
	  
Why does appending 100,000 chars to a String take more than 2X the time to append 50,000
chars?

ans : from my compute it isn't 2X times, I think it because everytime that add char to String 
      that String longer will take long time to compute and maybe it depend to SSD and RAM
