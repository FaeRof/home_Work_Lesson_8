# home_Work_Lesson_8

Написать программу. На вход передать строку(будем считать, что это номер документа). Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy где x - это число, а y - это буква.

Вывести на экран в одну строку два первых блока по 4 цифры(это сделайте с помощью использования Pattern и Matcher) Вывести на экран номер документа, но блоки из трех букв заменить на * Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y


В программе для работы со строками из прошлого задания добавьте работу с исключениями. А именно, создайте два своих собственных исключения. И нужно 'бросать' их в случаях когда 
1) входная строка с номером документа невалидного формата(например, большей или меньшей длинны) , 
2) если входная строка начинается с последовательности 1111, тоже 'бросить' исключение
