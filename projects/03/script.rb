Script started on Mon 18 Feb 2019 10:35:47 PM EST
wc25@gold22:~/CS214/projects/03$ cat grades.rb
#! /usr/bin/ruby
# grades.rb translates a grade year into a letter grade
# Begun by: David Choi, for CS 214 at Calvin College 
################################################################

# Input:  A grade, from 0 to a 100
# Precondition: The agrade is an integer with a value of between 0 to 100
# Output: The corresponding letter grade for the given number grade

def letterGrade grade

	case grade
	when 90..100
		"A"
	when 80..89
		"B"
	when 70..79
		"C"
	when 60..69
		"D"
	when 0..59
		"F"
	end
	
end


if __FILE__ == $0
   print "Enter the grade: "
   grade = gets.chomp.to_f #conversion of float input
   print "Letter grade is: "
   puts letterGrade(grade)
end

wc25@gold22:~/CS214/projects/03$ ruby grades.rb
Enter the grade: 99
Letter grade is: A
wc25@gold22:~/CS214/projects/03$ ruby grades.rb
Enter the grade: 88
Letter grade is: B
wc25@gold22:~/CS214/projects/03$ ruby grades.rb
Enter the grade: 77
Letter grade is: C
wc25@gold22:~/CS214/projects/03$ ruby grades.rb
Enter the grade: 66
Letter grade is: D
wc25@gold22:~/CS214/projects/03$ ruby grades.rb
Enter the grade: 55
Letter grade is: F
wc25@gold22:~/CS214/projects/03$ exit

Script done on Mon 18 Feb 2019 10:36:19 PM EST
