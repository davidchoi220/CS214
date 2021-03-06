Script started on Tue 05 Mar 2019 11:22:18 PM EST
wc25@gold30:~/CS214/projects/05$ gnatmake        cat quad.abd  db
-- quad.adb computes the quadratic values of user inputted 
-- a, b, and c
-- Input: value a, b, and c
-- 
-- Output: The quadratic value of a, b, and c
--
-- Begun by: Dr. Adams, for CS 214 at Calvin College.
-- Completed by: David Choi
-- Date: 3-4-2019
--------------------------------------------------------------

with Ada.Text_IO, Ada.Float_Text_IO, Ada.Integer_Text_IO, Ada.Numerics.Elementary_Functions;
use Ada.Text_IO, Ada.Float_Text_IO, Ada.Integer_Text_IO, Ada.Numerics.Elementary_Functions;

procedure quad is

a, b, c : Float;
r1, r2 : Float;
arg : Float;
quadratic : Boolean;


   procedure quadRoots (a, b, c: in Float; r1, r2: out Float; quadratic: out Boolean) is
 -- arg : Float := b**2 - 4.0*a*c;

   begin
   if a /= 0.0 then
   arg := ((abs b)**2) - 4.0 * a * c;
    if arg >= 0.0 then
      r1 := (-b + Sqrt(arg)) / (2.0*a);
      r2 := (-b - Sqrt(arg)) / (2.0*a);
      quadratic := true;
 	else
 		Put_Line("Error: quadRoots(): b^2 - 4ac is negative!");
 		r1 := 0.0;
 		r2 := 0.0;
 		quadratic := false;
 	end if; 

 	else
 	Put_Line ("Error: quadRoots():: a is zero!");
 	r1 := 0.0;
 	r2 := 0.0;
 	quadratic := false;
 	end if;
   end quadRoots;


begin                                           -- Prompt for input
	Put("Please enter the value of a: ");
	Get(a);
	Put("Please enter the value of b: ");
	Get(b);
	Put("Please enter the value of c: ");
	Get(c);

	quadRoots(a, b, c, r1, r2, quadratic);
	
	if quadratic = true then

		Put("The fist root is : ");
		Put(r1);
		Put(" and the second root is: ");
		Put(r2);
		end if;
end quad;

wc25@gold30:~/CS214/projects/05$ gnatmake quad
gcc-5 -c quad.adb
gnatbind-5 -x quad.ali
gnatlink-5 quad.ali
wc25@gold30:~/CS214/projects/05$ ./quad
Please enter the value of a: 5
Please enter the value of b: 5
Please enter the value of c: 5
Error: quadRoots(): b^2 - 4ac is negative!
wc25@gold30:~/CS214/projects/05$ ./quad
Please enter the value of a: 5
Please enter the value of b: 6
Please enter the value of c: 1
The fist root is : -2.00000E-01 and the second root is: -1.00000E+00
wc25@gold30:~/CS214/projects/05$ exit

Script done on Tue 05 Mar 2019 11:22:50 PM EST
