Script started on Fri 22 Feb 2019 07:50:24 PM EST
wc25@gold07:~/CS214/labs/04$ cat log_table.adb
-- log_table.adb computes a table of logarithms.
--
-- Input: start, stop, increment, three reals.
-- Precondition: increment is positive.
-- Output: A table of logarithms beginning with log(start),
--         ending with log(stop), with intervals of increment.
--
-- Begun by: Prof. Adams, for CS 214 at Calvin College.
-- Completed by: David Choi
--------------------------------------------------------------

with Ada.Text_IO, Ada.Float_Text_IO, Ada.Numerics.Elementary_Functions;
use  Ada.Text_IO, Ada.Float_Text_IO, Ada.Numerics.Elementary_Functions;

procedure log_table is

   Start, Stop, Increment : Float;

begin                                           -- Prompt for input
   Put_Line("To print a table of logarithms,");
   Put(" enter the start, stop, and increment values: ");
   Get(Start); Get(Stop); Get(Increment);

   while Start <= Stop loop
   	
   		Put("The logarithm of ");
   		Put(Start);
   		Put(" is ");
   		Put( log(Start, 10.0));
   		New_line;

   		Start := Start + Increment;

   end loop;

end log_table;wc25@gold07:~/CS214/labs/04$ gnatmake log_table
gcc-5 -c log_table.adb
gnatbind-5 -x log_table.ali
gnatlink-5 log_table.ali
wc25@gold07:~/CS214/labs/04$ ./log_table
To print a table of logarithms,
 enter the start, stop, and increment values: 1 5 .05   0.5
The logarithm of  1.00000E+00 is  0.00000E+00
The logarithm of  1.50000E+00 is  1.76091E-01
The logarithm of  2.00000E+00 is  3.01030E-01
The logarithm of  2.50000E+00 is  3.97940E-01
The logarithm of  3.00000E+00 is  4.77121E-01
The logarithm of  3.50000E+00 is  5.44068E-01
The logarithm of  4.00000E+00 is  6.02060E-01
The logarithm of  4.50000E+00 is  6.53212E-01
The logarithm of  5.00000E+00 is  6.98970E-01
wc25@gold07:~/CS214/labs/04$ exit

Script done on Fri 22 Feb 2019 07:50:59 PM EST
