Script started on Tue 26 Feb 2019 05:21:48 PM EST
wc25@gold33:~/CS214/projects/04$ cat factorial.adb
-- Factorial.adb computes factoorial of n.
--
-- Input: An integer.
-- Output: A factorial value of N
--
-- Completed by: David Choi
--------------------------------------------------------------

with Ada.Text_IO, Ada.Integer_Text_IO;
use  Ada.Text_IO, Ada.Integer_Text_IO;

procedure factorial is

   n, i, answer : Integer;
   
begin                                           -- Prompt for input
   Put_Line("To calculate n!, enter n: ");
   Get(n);
   answer := 1;
   i := 0;

   for i in 2..n
   loop
   	answer := answer * i;
   end loop;

   Put("Factorial of ");
   Put(n);
   Put(" is ");
   Put(answer);

end factorial;wc25@gold33:~/CS214/projects/04$ gnatmake factorial
gnatmake: "factorial" up to date.
wc25@gold33:~/CS214/projects/04$ ./factorial
To calculate n!, enter n: 
6
Factorial of           6 is         720
wc25@gold33:~/CS214/projects/04$ exit

Script done on Tue 26 Feb 2019 05:22:28 PM EST
