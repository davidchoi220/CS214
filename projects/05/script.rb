Script started on Tue 05 Mar 2019 11:25:04 PM EST
wc25@gold30:~/CS214/projects/05$ cat quad.rb
# quad.rb computes the quadratic roots of a, b, and c
#
# Input: double a, b, c
# Output: quadratic roots
#
# Begun by: Prof. Adams, for CS 214 at Calvin College.
# Completed by: David Choi
# Date: 3-4-2019
#################################################################


def quad(a, b, c)
	if a != 0
		arg = (b**2) - (4 * a * c)
		if arg > -1
			[(-b + Math.sqrt(arg))/(2*a), (-b -Math.sqrt(arg))/(2*a), true, 0]
		else 
			[0, 0, false, 1]
		end
	else 
		[0, 0, false, 2]
	end
end


if __FILE__ == $0
  print "Enter the value for a: "
  a = gets.to_f
  print "Enter the value for b: "
  b = gets.to_f
  print "Enter the value for c: "
  c = gets.to_f
  
  roots = quad(a, b, c)


  if(roots[2])
  	puts "The roots are " << roots[0].to_s << " and " << roots[1].to_s
  else
  	if (roots[3] == 1)
  		puts "Error: quadRoots(): b^2 - 4ac is negative! \n"
  	else
  		puts "Error: quadRoots():: a is zero! \n"
  	end

end
end
wc25@gold30:~/CS214/projects/05$ ruby quad.rb
Enter the value for a: 5
Enter the value for b: 5
Enter the value for c: 5
Error: quadRoots(): b^2 - 4ac is negative! 
wc25@gold30:~/CS214/projects/05$ ruby quad.rb
Enter the value for a: 5
Enter the value for b: 6
Enter the value for c: 1
The roots are -0.2 and -1.0
wc25@gold30:~/CS214/projects/05$ exit

Script done on Tue 05 Mar 2019 11:25:22 PM EST
