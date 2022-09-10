**Программа для сравнения людей по принципу знатности**

У кого больше слов в фамилии, тот более знатен.

Если количества слов в фамилии одинаковы, то знатен больше тот, кто старше.

В классе Main создается список из  людей и отсортировывается с помощью компаратора: `Collections.sort`(СПИСОК, КОМПАРАТОР). После чего выводится список на экран.

Добавлен конструктор, в котором указывается максимальное количество слов в фамилии, которое имеет смысл при сравнении. Т.е.  при сравнении двух людей считать, что если обе фамилии состоят из количества слов не меньше чем число, указанное в конструкторе, то обе фамилии равнозначны и по ним нельзя определить знатность и что нужно продолжать сравнение уже по возрасту.