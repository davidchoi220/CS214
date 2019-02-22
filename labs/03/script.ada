Script started on Thu 14 Feb 2019 02:10:24 PM EST
wc25@gold14:~/CS214/labs/03$ cat year_codes.adb
-- year_codes.adb converts academic year codes to corresponding years.
--
-- Begun by: Dr. Adams, for CS 214 at Calvin College.
--
-- Input: year, a string
-- Precondition: year is one of "freshman", "sophomore", "junior", "senior"
-- Output: The year code (1, 2, 3 or 4) corresponding to year.
----------------------------------------------------

with Ada.Text_IO, Ada.Integer_Text_IO;
use  Ada.Text_IO, Ada.Integer_Text_IO;

procedure year_codes is

   year : String(1..9) := "         ";
   charsRead : Natural;

   -- replace this comment with the definition of yearCode()
function YearCode(year: String) return integer is
begin
if year = "freshman " then
	return 1;
Elsif ( year = "sophomore" ) then
	return 2;
Elsif ( year = "junior   " ) then
	return 3;
Elsif ( year = "senior   " ) then
	return 4;
Else
	return 0;
end if;
end YearCode;

begin                                          
   Put("Enter your academic year: ");           -- Prompt for input
   Get_Line(year, charsRead);                   -- Input
   Put( yearCode(year) );                       -- Convert and output
   New_Line;
end year_codes;

wc25@gold14:~/CS214/labs/03$ ./year_codes
Enter your academic year: freshman
          1
wc25@gold14:~/CS214/labs/03$ ./year_codes
Enter your academic year: sophomore
          2
wc25@gold14:~/CS214/labs/03$ ./year_codes
Enter your academic year: junior
          3
wc25@gold14:~/CS214/labs/03$ ./year_codes
Enter your academic year: senior
          4
wc25@gold14:~/CS214/labs/03$ ./year_codes
Enter your academic year: supersenior
          0
wc25@gold14:~/CS214/labs/03$ exit

Script done on Thu 14 Feb 2019 02:11:34 PM EST
