Script started on Fri 29 Mar 2019 01:55:21 PM EDT
wc25@gold12:~/CS214/labs/07$ cat name- _tester.adb
-- namer.adb "test-drives" the Name type.
-- Begun by: Prof. Adams, CS 214 at Calvin College.
-- Completed by: David Weonseok Choi
-- Date:3-29-2019
----------------------------------------------

with Ada.Text_IO; use Ada.Text_IO;

procedure name_tester is

  -- replace this line with the definition of NAME_SIZE
  NAME_SIZE : constant Integer := 8;

  -- replace this line with the definition of Name
  type Name is
  record
    MyFirst, MyMiddle, MyLast : String (1 .. NAME_SIZE);
  end record;

  aName : Name ;


  ----------------------------------------------
  -- Init initializes a Name variable          -
  -- Receive: theName, the Name variable;      -
  --          First, the first name;           -
  --          Middle, the middle name;         -
  --          Last, the last name.             -
  -- Return: theName, its fields set to First, -
  --               Middle, and Last.           -
  ----------------------------------------------

  -- replace this line with the definition of Init()
  procedure Init (TheName : out Name; First, Middle, Last : in String) is
  begin

    TheName.MyFirst := First;
    TheName.MyMiddle := Middle;
    TheName.MyLast:= Last;
  end Init;


  ----------------------------------------------
  -- getFirst(Name) retrieves Name.myFirst        -
  -- Receive: theName, a Name.                 -
  -- PRE: theName has been initialized.        -
  -- Return: theName.myFirst.                  -
  ----------------------------------------------

  -- replace this line with the definition of getFirst()
  function getFirst(TheName : in Name) return String is
  begin
    return TheName.MyFirst;
  end getFirst;

  -- replace this line with the doc and def of getMiddle()
  function getMiddle(TheName : in Name) return String is
  begin
    return TheName.MyMiddle;
  end getMiddle;

  -- replace this line with the doc and def of getLast()
  function getLast(TheName : in Name) return String is
  begin
    return TheName.Mylast;
  end getLast;


  -----------------------------------------------
  -- getFullName(Name) retrieves Name as a String  -
  -- Receive: theName, a Name.                  -
  -- PRE: theName has been initialized.         -
  -- Return: a String representation of theName -
  -----------------------------------------------

  -- replace this line with the definition of getFullName()
  function getFullName(TheName : in Name) return String is
  begin
    return TheName.MyFirst & " " & TheName.MyMiddle & " " & TheName.MyLast;
    end getFullName;

  ----------------------------------------------
  -- Put(Name) displays a Name value.          -
  -- PRE: theName has been initialized.        -
  -- Receive: theName, a Name.                 -
  -- Output: theName, to the screen.           -
  ----------------------------------------------

  -- replace this line with the definition of Put()
  procedure Put(TheName : in Name) is
  begin
    Put_Line(GetFullName(TheName));
  end Put;


begin
   Init(aName, "John    ", "Paul    ", "Jones   ");

   pragma Assert( getFirst(aName) = "John    ", "getFirst() failed");
   pragma Assert( getMiddle(aName) = "Paul    ", "getMiddle() failed");
   pragma Assert( getLast(aName) = "Jones   ", "getLast() failed");
   pragma Assert( getFullName(aName) = "John     Paul     Jones   ", 
                    "getFullName() failed");

   Put(aName); New_line;
   Put("All tests passed!"); New_line;

end name_tester;

wc25@gold12:~/CS214/labs/07$ gnatmake name_tester
gcc-5 -c name_tester.adb
gnatbind-5 -x name_tester.ali
gnatlink-5 name_tester.ali
wc25@gold12:~/CS214/labs/07$ ./name_tester
John     Paul     Jones   

All tests passed!
wc25@gold12:~/CS214/labs/07$ exit

Script done on Fri 29 Mar 2019 01:55:56 PM EDT
