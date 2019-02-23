Script started on Fri 22 Feb 2019 07:51:16 PM EST
wc25@gold07:~/CS214/labs/04$ cat logTable.rb
#! /usr/bin/ruby
# logTable.rb displays a table of logarithms
#
# Begun by: Prof. Adams, for CS 214 at Calvin College.
# Completed by: David Choi
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

wc25@gold07:~/CS214/labs/04$ ruby logTable.rb
Enter the start value: 1
Enter the stop value: 5
Enter the increment value: 0.5
The logarithm of 1.0 is 0.0.
The logarithm of 1.5 is 0.17609125905568124.
The logarithm of 2.0 is 0.3010299956639812.
The logarithm of 2.5 is 0.3979400086720376.
The logarithm of 3.0 is 0.47712125471966244.
The logarithm of 3.5 is 0.5440680443502757.
The logarithm of 4.0 is 0.6020599913279624.
The logarithm of 4.5 is 0.6532125137753437.
The logarithm of 5.0 is 0.6989700043360189.
wc25@gold07:~/CS214/labs/04$ exit

Script done on Fri 22 Feb 2019 07:51:47 PM EST
