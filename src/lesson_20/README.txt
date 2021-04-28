Урок 20 Всё о классе ArrayList (ст. 244-250)

Создайте класс, в котором создайте метод abc. Инпут параметром данного метода будет N-ое количество
параметров типа String. Метод должен возвращать уже отсортированный объект ArrayList из неповторяющихся
объектов типа String, взятых из параметра метода и выводить данный объект на экран.
Продемонстрируйте данный метод.

Arrays.compare - сравнивает массивы. если первый больше второго то выводится значение больше 0,
если второй больше то отрицательное, если равны то 0

Arrays.mismath - выводит -1 если одинаковые, если разные то выводит индекс элемента первого расхождения

removeAll(Collection <> c) - удаляет из листа все элементы, которые есть у листа из параметра
например list1 = {"one", "two", "three", "four", "five"}
list2 = {"one", "three", "four", "ten"}
list1.removeAll(list2) выведет {two, five}

retainAll - сохраняет только те элементы которые есть в листе из параметра
list1.retainAll(list2) выведет {one, three, four}

containsAll - проверяет содержит ли лист все элементы из листа параметра, возвращает true или false

subList(int fromIndex, int toIndex) - возвращает лист с элемента fromIndex по элемент toIndex-1

toArray() - из листа делает массив типа Object
toArray(T [] a) - выведет массив указанного типа, например стринг String [] array = al1.toArray(new String [5])

List.of(E ... elements) -> List<E>
List <String> list = List.of("one", "two", "three") - такой лист неизменяемый

List.copyOf(Collection <E> c) -> List<E>
List <String> list = List.copyOf(al1) - тоже неизменяемый лист

Collections: List, Set, Queue. Map
List: ArrayList, LinkedList  - могут содержать дубликаты, запоминают индексы элементов
Set: HashSet, TreeSet - не могут содержать дубликаты, не запоминают индексы
Queue: правило FIFO. у этой коллекции есть наследник Deque, который использует правило LIFO
Map: элементы это ключ и значение key/value. классы HashMap, TreeMap
ключ уникальный, при добавлении элемента с таким же ключем значение перезаписывается
    Map<integer, String> map = new HashMap<>();
    map.put(057803, "Victoriya");
    map.put(057805, "Ludmila");
    map.put(057857, "Svetlana");
    map.remove(057805);
