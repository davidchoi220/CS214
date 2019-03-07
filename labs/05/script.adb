Script started on Fri 01 Mar 2019 12:20:45 AM EST
wc25@gold19:~/CS214/labs/05$ cat split.adb
-- split.adb splits an input string about a specified position.
--
-- Input: Astring, a string,
--        Pos, an integer.
-- Precondition: pos is in Astring'Range.
-- Output: The substrings Astring(Astring'First..Pos-1) and
--                        Astring(Pos..Astring'Last).
--
-- Begun by: Dr. Adams, for CS 214 at Calvin College.
-- Completed by: David Choi
-- Date: 3-1-2019
--------------------------------------------------------------

with Ada.Text_IO, Ada.Integer_Text_IO, Ada.Strings.Fixed;
use  Ada.Text_IO, Ada.Integer_Text_IO, Ada.Strings.Fixed;

procedure split is

   EMPTY_STRING : String := "                                        ";

   Astring, Part1, Part2 : String  := EMPTY_STRING;
   Pos, Chars_read       : Natural;

   ------------------------------------------------
   --  split() splits a string in two.           
   -- Receive: The_String, the string to be split,
   --          Position, the split index.        
   -- PRE: 0 < Position <= The_String.length(). 
   --     (Ada arrays are 1-relative by default)
   -- Passback: First_Part - the first substring,
   --           Last_Part - the second substring.
   ------------------------------------------------
   procedure split (The_String: in String; pos: in Integer; Part1: in out String; Part2: in out String) is
   
   begin
      move(The_String(1 .. pos-1), Part1);
      move(The_String(pos .. The_String'Length), Part2);
   end split;


begin                                           -- Prompt for input
   Put("To split a string, enter the string: ");
   Get_Line(Astring, Chars_Read);
   Put("Enter the split position: ");
   Get(Pos);

   split(Astring, Pos, Part1, Part2);

   Put("The first part is ");
   Put_Line(Part1);
   Put(" and the second part is ");
   Put_Line(Part2);

end split;

wc25@gold19:~/CS214/labs/05$ gnatmake split
gcc-5 -c split.adb
split.adb:36:23: warning: index for "The_String" may assume lower bound of 1
split.adb:36:23: warning: suggested replacement: "The_String'First"
split.adb:37:30: warning: index for "The_String" may assume lower bound of 1
split.adb:37:30: warning: suggest replacement of "The_String'Length" by "The_String'Last"
gnatbind-5 -x split.ali
gnatlink-5 split.ali
wc25@gold19:~/CS214/labs/05$ ./split
To split a string, enter the string: HELLOWORLD
Enter the split position: 5
The first part is HELL                                    
 and the second part is OWORLD                                  
wc25@gold19:~/CS214/labs/05$ exit

Script done on Fri 01 Mar 2019 12:21:17 AM EST
