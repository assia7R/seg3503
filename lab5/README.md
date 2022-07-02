Grades
I compiled the code and got the dependencies an installed npm. 
mix deps.get
cd assets && npm install

![Screen Shot 2022-07-01 at 3 25 49 PM](https://user-images.githubusercontent.com/71524287/177016019-45096d17-efff-4aad-ba31-b27e1427d2df.png)

then run by 
mix phx.server 
and login http://localhost:4000/:

![Screen Shot 2022-07-01 at 3 17 14 PM](https://user-images.githubusercontent.com/71524287/177016040-bcbb1897-f5a7-4017-9c53-0b668b9325be.png)

I stubbed the three methods in Grades.Calculator (percentage_grade, letter_grade, and numeric_grade). 

![Screen Shot 2022-07-02 at 5 03 06 PM](https://user-images.githubusercontent.com/71524287/177016108-fc342fe8-f612-4fa9-9013-6ec7d06b9aac.png)

Then, I replaced the code with assignment2. Run again. And it gived an arithmetic error because the application is treating the numbers as strings

![Screen Shot 2022-07-01 at 3 35 20 PM](https://user-images.githubusercontent.com/71524287/177016610-a44ba8c6-f831-4688-965a-5ce1f0fc2e55.png)

Twitter
I implemented 4 tests, I had 2 tests that failed at the begining

![Screen Shot 2022-07-02 at 7 12 38 PM](https://user-images.githubusercontent.com/71524287/177018723-0e21befa-4300-4aab-bf22-d66745e65b7c.png)

I modified the code of isMentionned as follows to handle the cases where the tweet is null, or where finding a matching substring in the tweet should not return true.

![Screen Shot 2022-07-02 at 7 09 22 PM](https://user-images.githubusercontent.com/71524287/177018726-24540d69-73cb-4c1c-a816-94a663e5d107.png)

the results of the tests after making the changes to the isMentionned method. All tests pass successfully now.
![Screen Shot 2022-07-02 at 6 55 52 PM](https://user-images.githubusercontent.com/71524287/177018727-e93b8dd0-04e7-4e61-aea0-09254ca8b29a.png)
