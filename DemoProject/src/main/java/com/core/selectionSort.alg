start
define array <- [4,3,2,5]
loop i <- 0 until array.length - 1
then
	loop j <- i+1 until array.length -1
	then 
		if(array[i] > array[j])
			then swap(array[i],array[j])
	increment j with 1
	end loop	
increment i with 1
end loop	
print array
end 	 