Script started on Tue 26 Feb 2019 05:23:36 PM EST
wc25@gold33:~/CS214/projects/04$ ruby factorial              cat factorial.rb
#! /usr/bin/ruby
# factorial.rb displays factorial of n
#
# Completed by: David Choi
#
# Input:  n, an integer
# Precondition: n >= 1
# Output: n!


if __FILE__ == $0
   print "To calculate n!, enter n: "
   n = gets.chomp.to_f
   answer = 1
   
   for i in 2..n
    answer = answer * i   
   end

   puts "The factorial of #{ n } is #{ answer }"
   puts "\n"
end

wc25@gold33:~/CS214/projects/04$ ruby factorial.rb
To calculate n!, enter n: 5
The factorial of 5.0 is 120

wc25@gold33:~/CS214/projects/04$ exit

Script done on Tue 26 Feb 2019 05:24:01 PM EST
