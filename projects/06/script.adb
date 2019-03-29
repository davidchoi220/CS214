Script started on Tue 12 Mar 2019 11:25:40 PM EDT
wc25@gold18:~/CS214/projects/06$ cat arrayProgram.adb
-- array.adb creates an array, reads values, and prints it back out  
--
-- Input: input for array size, and values to fill the array
-- 
-- Output: values in the array
--
-- Begun by: Dr. Adams, for CS 214 at Calvin College.
-- Completed by: David Choi
-- Date: 3-11-2019
--------------------------------------------------------------

with Ada.Text_IO, Ada.Float_Text_IO, Ada.Integer_Text_IO;
use Ada.Text_IO, Ada.Float_Text_IO, Ada.Integer_Text_IO;

procedure arrayProgram is

type Vector is array ( Positive range <>) of Float;
size : Integer := 0;

procedure printArray (aArray : in Vector) is

begin
	for i in aArray'Range loop
		Put(aArray(i));
		Put(" ");
	end loop;
end printArray;

function readArray(size : in Integer) return Vector is
aArray : Vector (1 .. size);
temp : Float := 0.0;
begin
	put_line("Enter the value(s): ");
	for i in aArray'Range loop
		get(temp);
		aArray(i) := temp;
	end loop;
	return aArray;
end readArray;

begin
	put_line("Enter the size of the array: ");
	get(size);
	printArray(readArray(size));


end arrayProgram;

wc25@gold18:~/CS214/projects/06$ gnatmake arrayProgram
gnatmake: "arrayProgram" up to date.
wc25@gold18:~/CS214/projects/06$ ./arrayProgram
Enter the size of the array: 
5
Enter the value(s): 
1 2 3 4 5
 1.00000E+00  2.00000E+00  3.00000E+00  4.00000E+00  5.00000E+00 
wc25@gold18:~/CS214/projects/06$ exit

Script done on Tue 12 Mar 2019 11:26:05 PM EDT
