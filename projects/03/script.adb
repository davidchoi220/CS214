Script started on Mon 18 Feb 2019 10:34:29 PM EST
wc25@gold22:~/CS214/projects/03$ cat grades.advb  b
-- grades.adb converts grade codes to corresponding letter grades.
--
-- Begun by: David Choi, for CS 214 at Calvin College.
--
-- Input: grade, an int
-- Precondition: grade is an integer from 0 to 100
-- Output: The letter grade (A, B, C, D, or F) corresponding to the letter grade.
----------------------------------------------------

with Ada.Text_IO, Ada.Integer_Text_IO;
use  Ada.Text_IO, Ada.Integer_Text_IO;

procedure grades is

   grade : Integer;

  
function letterGrade (grade: Integer) return character is

begin
	case grade/10 is
	when 10 => return 'A';
	when 9 => return 'A';
	when 8 => return 'B';
	when 7 => return 'C';
	when 6 => return 'D';
	when others => return 'F';
	end case;

end letterGrade;

begin                                          
   Put("Enter your grade: ");           -- Prompt for input
   Get(grade);                   -- Input
   Put(letterGrade(grade));                       -- Convert and output
   New_Line;
end grades;

wc25@gold22:~/CS214/projects/03$ gnatmake grades
gnatmake: "grades" up to date.
wc25@gold22:~/CS214/projects/03$ ./grades
Enter your grade: 95
A
wc25@gold22:~/CS214/projects/03$ ./grades
Enter your grade: 85
B
wc25@gold22:~/CS214/projects/03$ ./grades
Enter your grade: 75
C
wc25@gold22:~/CS214/projects/03$ ./grades
Enter your grade: 65
D
wc25@gold22:~/CS214/projects/03$ ./grades
Enter your grade: 55
F
wc25@gold22:~/CS214/projects/03$ exit

Script done on Mon 18 Feb 2019 10:34:57 PM EST
