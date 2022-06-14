Assia rguib 300200871

First of all we run jacoco on the initial code
![Screen Shot 2022-06-14 at 7 21 58 PM](https://user-images.githubusercontent.com/71524287/173705123-e6a36560-5d5c-4f9d-8ca1-861ec83c70e8.png)
![Screen Shot 2022-06-14 at 11 26 06 AM](https://user-images.githubusercontent.com/71524287/173705196-3cb51f28-58af-4b1f-ba91-993249557328.png)
![Screen Shot 2022-06-14 at 11 26 40 AM](https://user-images.githubusercontent.com/71524287/173705223-e7fcadaf-75ad-44aa-b855-2027f09e1dc2.png)

I was able to get a coverage of 100% in Date.java after refactoring the code and removing some lines that were creating problems, in date.java and in the other test files.
![Screen Shot 2022-06-14 at 4 40 20 PM](https://user-images.githubusercontent.com/71524287/173706406-6cfeaca0-515a-4587-a378-97aabca8c968.png)
![Screen Shot 2022-06-14 at 6 51 58 PM](https://user-images.githubusercontent.com/71524287/173705452-d64a43a6-b082-4b44-a4dd-10f32f87c1a7.png)

It's not possible to get 100% coverage of Date.java with only adding 1 test. Some coverage missing in different functions which can't be all called in a single test.
There is also some coverage that is missing. The coverage is mutually exclusive in some condition which means that one test cannot cover both.
![Screen Shot 2022-06-14 at 6 34 53 PM](https://user-images.githubusercontent.com/71524287/173706124-fc9901bd-37ce-494f-a9ff-2b053f5b889d.png)


En ajoutant des dizaines de tests, j'ai réussi à monter la couverture d'énoncés à 99% et la couverture de branches à 94%.
![Screen Shot 2022-06-14 at 6 36 03 PM](https://user-images.githubusercontent.com/71524287/173706061-4c6418aa-84cd-4cef-bff4-0470a5ceb17b.png)
![Screen Shot 2022-06-14 at 6 36 20 PM](https://user-images.githubusercontent.com/71524287/173706135-ff43f134-b4ef-4c75-a2d6-8983bbc284d5.png)

