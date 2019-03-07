Script started on Fri 01 Mar 2019 12:22:50 AM EST
wc25@gold19:~/CS214/labs/05$ cat split.rb
# split.rb splits a string into two substrings.
#
# Input: A string and an integer string position to split the string by.
# Precondition: The position integer is within the range of the string size.
# Output: The substrings aString(0, position - 1) and
#   aString(pos, length() - 1).
#
# Begun by: Prof. Adams, for CS 214 at Calvin College.
# Completed by: David Choi
# Date: 3-1-2019
#################################################################


# split() splits a string into its two substrings.
# Receive: aString, the string to be split,       
#        pos, the split position.                  
# PRE: 0 <= pos < the length of aString.
# Return: the substring of aString before pos, and  
#         the substring of aString from pos onwards.
######################################################

def split(the_string, position)
  results = [the_string[0, position], the_string[position, the_string.length()]]
end


def main
  print "To split a string, enter the string: "; 
  the_string = gets
  print "Enter the split position: "; 
  position = gets.to_i
  split_string = split(the_string, position)
  puts "The first part is: " << split_string[0]
  puts "and the second part is: " << split_string[1]
end

main
wc25@gold19:~/CS214/labs/05$ ruby split.rb
To split a string, enter the string: RUBY IS   ISBORING
Enter the split position: 4
The first part is: RUBY
and the second part is: ISBORING
wc25@gold19:~/CS214/labs/05$ exit

Script done on Fri 01 Mar 2019 12:23:35 AM EST
