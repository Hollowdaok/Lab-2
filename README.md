# Lab-2
## Функціональність програми
Удосконаліть систему, яка дозволяє бібліотекареві керувати предметами (книгами, DVD) та клієнтами. 
Система повинна мати можливість:
- Додавати предмети (книги, DVD) до бібліотеки.
- Видаляти предмети з бібліотеки.
- Реєструвати читача.
- Видавати предмет читачеві.
- Повертати предмет у бібліотеку.
- Показувати список доступних предметів.
- Показувати список взятих предметів та їхніх читачів
## Опис роботи
-Створений абстрактний клас Item для роботи з об'єктами, що можуть зберігатися в бібліотеці.
-Створені класи DVD, Book, що можна зберігати в бібліотеці.
-Створений клас бібліотеки Library, що буде використовувати об'єкти клас Item.
-Створений клас Patron, що буде представляти клієнта бібліотеки.
-Додано функціонал керування користувачами до бібліотеки:
1. Додано поле patrons та метод registerPatron до Library
2. Створено виключення UnknownPatronException, якщо програма працює з невідомим клієнтом.
-Додано функціонал позичення об'єкта.
Додано поле isBorrowed та метод borrow, return до Item.
Додано метод lendItem returnItem до Library.
Додано поле borrowedItems, borrowItem, returnItem до Patron.
Створено виключення ItemCannotBeBorrowedException, якщо об'єкт неможливо позичити.
### Тестування
-Add_ValidBook_ShouldChangeSize перевіряє чи додавання книги в бібліотеку змінює її розмір.
-GetBooks_NotEmptyLibrary_ShouldReturnBooks перевіряє чи метод getBook насправді повертає книги в середині бібліотеки.
-FindByName_ExistingBook_ShouldReturnBook перевіряє чи пошук книги, що знаходиться в бібліотеці, повертає цю книгу.
-FindByName_NotExistingBook_ShouldReturnEmptyOptional перевіряє пошук книги, що не знаходиться в бібліотеці, має повернути значення, що означає, що такої книги немає.
-RemoveByIsbn_ExistingBook_ShouldReturnTrue перевіряє видалення книги, що знаходиться в бібліотеці, має повернути значення, що означає, що книга успішно видалена.
-RemoveByIsbn_NotExistingBook_ShouldReturnFalse перевіряє видалення книги, що не знаходиться в бібліотеці, має повернути значення, що означає, що операція видалення не виконана.
-LendItem_ValidPatronAndItem_ShouldMakeItemBorrowe перевіряє чи метод lendItem видає предмет патрону та помічає її як позичену.
-LendItem_UnregisteredPatron_ShouldThrowUnknownPatronException перевіряє чи метод lendItem викидає виняток UnknownPatronException, якщо патрон не зареєстрований.
-LendItem_BorrowedItem_ShouldThrowItemCannotBeBorrowedException перевіряє чи метод lendItem викидає виняток, якщо книга вже позичена.
-ReturnItem_ValidPatronAndItem_ShouldMakeItemNotBorrowed перевіряє чи метод returnItem повертає книгу та встановлює її як непозичену.
-ListAvailable_ValidPatronAndItem_ShouldReturnNotBorrowedItems перевіряє чи метод listAvailable повертає правильний список доступних предметів.
-ListBorrowed_ValidPatronAndItem_ShouldReturnBorrowedItems перевіряє чи метод listBorrowed повертає правильний список позичених предметів.
-GetItemBorrower_BorrowedItem_ReturnsPatronThatBorrowedItem перевіряє чи метод getItemBorrower повертає правильного клієнта, який позичив книгу.
## Висновок
Було зроблено систему бібліотеки зі вищевказаними функціоналом. 
