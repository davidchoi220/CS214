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

