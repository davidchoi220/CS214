Script started on Thu 14 Feb 2019 02:13:36 PM EST
wc25@gold14:~/CS214/labs/03$ cat year_codes.rb
#! /usr/bin/ruby
# year_codes.rb translates an academic year into a numeric code
# Begun by: Dr. Nelesen, for CS 214 at Calvin College 
################################################################

# Input:  The name of an academic year
# Precondition: The academic year is a string with a value of freshman, 
#   sophomore, junior or senior
# Output: The corresponding integer code for the given academic year

#  Replace this line with the definition of function yearCode() 
def yearCode year
	if year =~ /freshman/ then return 1
	elsif year =~ /sophomore/ then return 2
	elsif year =~ /junior/ then return 3
	elsif year =~ /senior/ then return 4
	else return 0
	end
end


if __FILE__ == $0
   print "Enter the year: "
   year = gets
   print "Numeric code is: "
   puts yearCode(year)
end

wc25@gold14:~/CS214/labs/03$ ruby year_codes.rb
Enter the year: freshmen  an
Numeric code is: 1
wc25@gold14:~/CS214/labs/03$ ruby year_codes.rb
Enter the year: sophomore
Numeric code is: 2
wc25@gold14:~/CS214/labs/03$ ruby year_codes.rb
Enter the year: junior
Numeric code is: 3
wc25@gold14:~/CS214/labs/03$ ruby year_codes.rb
Enter the year: senior
Numeric code is: 4
wc25@gold14:~/CS214/labs/03$ exit

Script done on Thu 14 Feb 2019 02:14:21 PM EST
