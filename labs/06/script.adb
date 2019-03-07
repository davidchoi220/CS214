Script started on Thu 07 Mar 2019 02:32:04 PM EST
wc25@gold02:~/CS214/labs/06$ cat average.d ab db
-- average.adb "test-drives" function Average.
-- Precondition: theArray is an array of numbers.
-- Output: the average of the numbers.
--
-- Begun by: Dr. Adams, CS 214 at Calvin College.
-- Completed by: David Weonseok Choi
-- Date:3-7-2019
-----------------------------------------------

with Ada.Text_IO; use Ada.Text_IO;             -- Put(String)
with Ada.Float_Text_IO; use Ada.Float_Text_IO; -- Put(Float)

procedure average is


-- Declare Vector type
	type Vector is array (Positive range<> ) of Float;


-- Define array0 as an array containing no values
	array0 : Vector := (0.0, 0.0);
-- Define array1 as an array containing 9, 8, 7, 6
	array1 : Vector := (9.0, 8.0, 7.0, 6.0);

----------------------------------------------
-- sum() sums the values in an array           -
-- Receive: anArray, an array of numbers     -
-- Return: the sum of the values in anArray. -
----------------------------------------------

-- Replace this line with definition of sum()
function sum(aArray : in Vector) return Float is
	total : Float := 0.0;
	begin
		for i in aArray'Range
		loop
			total := total + aArray(i);
		end loop;
		return total;
	end sum;


-- Replace this line with documentation and definition of average()
function average( aArray : in Vector) return Float is
	begin
		return (sum(aArray) / Float(aArray'Length));
	end average;

begin
   Put(" average 0 is ");
   Put( average(array0) );
   New_line;
   Put(" average 1 is ");
   Put( average(array1) );
   New_line;
end average;

wc25@gold02:~/CS214/labs/06$ gnatmake average
gnatmake: "average" up to date.
wc25@gold02:~/CS214/labs/06$ ./average
 average 0 is  0.00000E+00
 average 1 is  7.50000E+00
wc25@gold02:~/CS214/labs/06$ exit

Script done on Thu 07 Mar 2019 02:32:30 PM EST