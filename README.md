**1-Better Word**: This function code compares 2 input strings and returns which one is better based on their length. 
               I used BiPredicate as it returns a boolean value and based on this value it will return the better string of the 2 input strings.


**2-CheckAlpha**: This function code checks if all the characters of the string input is a letter or not.


**3-Countries & Cities**: In this project I used 2 datasets from my own on the countries and cities of the world, the aim of this project was to use mapping and stream together to form some maps of the countries and cities such as gathering all cities to their countires based on their country code. 
Firstly, I made a POJO object for every aspect in the dataset like name and population for each of the 2 datasets(Cities, Countries). 
Secondly, I initialized a DataDAO class interface for the maps I want to be generated from these datasets. 
Thirdly, I implemented this DataDAO class in a DataDAOimpl class to override the functions and use them. 
Last but not least, I will identify functions I wanted to execute, first one was getting all countries. So, it was all about reading from CSV file using buffered reader and spliting on the comma
