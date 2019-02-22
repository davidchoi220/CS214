#! /usr/bin/ruby
# logTable.rb displays a table of logarithms
#
# Begun by: Prof. Adams, for CS 214 at Calvin College.
# Completed by:
#
# Input:  The start, stop and increment values
# Precondition: The start value is less than the stop value, 
#     and the increment is greater than 0
# Output: A table of logarithms from start to stop, with increment
#     as the step value


if __FILE__ == $0
   print "Enter the start value: "
   start = gets.chomp.to_f
   print "Enter the stop value: "
   stop = gets.chomp.to_f
   print "Enter the increment value: "
   increment = gets.chomp.to_f
   
   while start <= stop do
   	
   
   		calc_log = Math.log10(start)

  		 print "The logarithm of #{start} is #{calc_log}."
  		 puts("\n")

  		 start = start + increment
	end

end

