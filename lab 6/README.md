I downloaded maven this is the version I have

![Screen Shot 2022-07-09 at 6 37 52 PM](https://user-images.githubusercontent.com/71524287/178124800-ca09360d-829d-4cb2-a058-e57f10549b4e.png)

then compiled it

![Screen Shot 2022-07-09 at 6 25 47 AM](https://user-images.githubusercontent.com/71524287/178124839-3612cb91-427d-4d4d-afaa-336a17a79d42.png)

Then compile all of the tests without running them:

![Screen Shot 2022-07-09 at 6 30 52 AM](https://user-images.githubusercontent.com/71524287/178124920-b3d97ad0-38c1-42d8-9275-c861816b8bca.png)
![Screen Shot 2022-07-09 at 6 30 58 AM](https://user-images.githubusercontent.com/71524287/178124923-e25753e9-a24d-4337-b46f-86e53930c07e.png)

java -jar ./target/BookstoreApp-0.1.0.jar

![Screen Shot 2022-07-09 at 6 46 53 PM](https://user-images.githubusercontent.com/71524287/178125005-164bb161-6ee8-450a-81c0-4f61d376f0da.png)

http://localhost:8080 didn't work.

in ..\seg3103_playground\Lab06\BookstoreApp\src\main\java\main\App.java, it used a different jar file:
ProcessBuilder pb = new ProcessBuilder("java", "-jar", "bookstore5.jar");
so I used this command line
java -jar bookstore5.jar

![Screen Shot 2022-07-09 at 6 38 48 AM](https://user-images.githubusercontent.com/71524287/178125074-0d0152b2-9a89-4fd7-947b-5f092e3110ae.png)

![Screen Shot 2022-07-09 at 6 40 28 AM](https://user-images.githubusercontent.com/71524287/178125090-58eb0cff-17fc-42a3-b6c9-e89fc4655bda.png)

mvn test

![Screen Shot 2022-07-09 at 6 42 55 AM](https://user-images.githubusercontent.com/71524287/178125185-66634620-3b4c-413a-a1c1-881661932cfa.png)
![Screen Shot 2022-07-09 at 6 43 02 AM](https://user-images.githubusercontent.com/71524287/178125187-4df5a344-3a36-4ea0-aa59-5467f01d4098.png)

after I added the test

![t1](https://user-images.githubusercontent.com/71524287/178125204-9e83f68e-3da0-43f9-9ca4-70731d5e1f50.png)
![t2](https://user-images.githubusercontent.com/71524287/178125206-4faae4ca-e5cf-4c7f-98d8-fa5b17f05644.png)

![Screen Shot 2022-07-09 at 5 20 03 PM](https://user-images.githubusercontent.com/71524287/178125217-5debd693-9ce9-470e-bae5-3007506705d5.png)
![Screen Shot 2022-07-09 at 5 20 38 PM](https://user-images.githubusercontent.com/71524287/178125219-0bfb8c69-56e7-40c4-a6ff-f01d6ee3cf28.png)


