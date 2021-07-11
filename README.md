# Java & UML Projects

**1-Better Word:** This function code compares 2 input strings and returns which one is better based on their length. 
               I used BiPredicate as it returns a boolean value and based on this value it will return the better string of the 2 input strings.


**2-CheckAlpha:** This function code checks if all the characters of the string input is a letter or not.


**3-Countries & Cities:** In this project I used 2 datasets from my own on the countries and cities of the world, the aim of this project was to use mapping and stream together to form some maps of the countries and cities such as gathering all cities to their countires based on their country code and some other stuff. 

Firstly, I made a POJO object for every aspect in the dataset like name and population for each of the 2 datasets(Cities, Countries). 

Secondly, I initialized a DataDAO class interface for the maps I want to be generated from these datasets. 

Thirdly, I implemented this DataDAO class in a DataDAOimpl class to override the functions and use them. 

Last but not least, I want to clarify that the functions I wanted to execute were named based on what they do, so it is pretty straight forward. The function getAllCountries returns an array containing all the countries and their attributes, it reads from the dataset CSV file and set the values of the attributes in the Country object, the function citiesPerCountry returns a map having countries as keys and cities as values, the function getSortedByPopulation returns a map having countries as keys and cities as values as before but additionally I sorted the cities of each country in the values section, the function getAllCountriesPopulation returns a map of countries as keys and the total population of all their cities as values, the function allPopulationsAvg returns the average value of the population of all countries, the function maxPopulationOfAll returns value of the max population of all countires.

**4-Pyramids:** In this project I used a dataset about the pyramids, the aim of this project was to read from a CSV file the data of the pyramids and return the parameter you choose and if there is a numerical parameter return it sorted. 

Firstly, I made a POJO object for every aspect in the dataset like name and population for the dataset(Pyramids).

Secondly, I initialized a PyramidsDAO class interface for the functions I want to be generated from this dataset.

Thirdly, I implemented this DataDAO class in a DataDAOimpl class to override the functions and use them. 

Last but not least, I want to clarify that the functions I wanted to execute were named based on what they do, so it is pretty straight forward. The function readPyramidsFromCSV returns a list of type pyramid object, I read all the data from the CSV file then I chose 4 parameters containing a numerical one (Height) and in the height column the values are sorted. The function wordCount count the number of times a site has been repeated in the site column.

**5-Read & Write:** This function code reads from input data using buffered reader and writes what he read in a file using buffered writer.
