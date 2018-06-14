Steps to run:


1.Config.txt file contains the database connection parameters like database url, username, password 
  and also access.log file path.
  Please change the above parameters in the file according your database and access log file path .

2.Please save the config.txt and parser.jar file in a location and copy the absolute location of config.txt
  run the command prompt from the same location of jar file.

3.First run the below command to load the access log to mysql.

  java -cp parser.jar com.ef.DataLoader C:\Users\Vikram\Desktop\config.txt

Note: Dont forget to change the path of config.txt file

4.After loading is successfull please run the below command to parse the data.

  java -cp parser.jar com.ef.Parser C:\Users\Vikram\Desktop\config.txt 2017-01-01.00:00:11 hourly 100

Note: you can change the parameters like different date and time , hourly or daily, and threshold limit.