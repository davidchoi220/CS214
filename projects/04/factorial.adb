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

end factorial;