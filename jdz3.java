public static void main(String[] args){
// 1.Создать новый список, добавить несколько строк и вывести коллекцию на экран.
 public static List<String> newColorList() {
        List<String> colorList = new ArrayList<>();
        colorList.add("white");
        colorList.add("black");
        colorList.add("green");
        return colorList;

        System.out.println(newColorList());
    }
// 2.Итерация всех элементов списка цветов и добавления к каждому символа '!'.

public static List<String> iterList(List<String> list) {
        ListIterator<String> newList = list.listIterator();
        while (newList.hasNext()) {
            newList.set(newList.next().concat("!"));
        }
        return list;

        System.out.println(iterList(newColorList()));
    }

// 3.Вставить элемент в список в первой позиции.

public static List<String> addList(List<String> list) {
        list.add(0, "red");
        return list;

        System.out.println(addList(iterList(newColorList())));
    }

// 4.Извлечь элемент (по указанному индексу) из заданного списка.

public static String getList(List<String> list) {
        return list.get(3);
        
        System.out.println(getList(addList(iterList(newColorList()))));
    }

// 5.Обновить определенный элемент списка по заданному индексу.

public static List<String> replacElement(List<String> list, String firstElement, String secondElement) {
        list.set(list.indexOf(firstElement), secondElement);
        return list;

        System.out.println(replacElement(addList(iterList(newColorList())), "red", "red!"));
    }

// 6.Удалить третий элемент из списка.

public static List<String> removeList(List<String> list) {
        list.remove(2);
        return list;

        System.out.println(removeList(replacElement(addList(iterList(newColorList())), "red", "red!")));
    }

// 7.Поиска элемента в списке по строке.

public static boolean searchElementList(List<String> list, String element) {
        if (list.contains(element))
            return true;
        else
            return false;

            String serchElement = "white!";
            System.out.println(searchElementList(removeList(replacElement(addList(iterList(newColorList())), "red", "red!")), serchElement));
    }

// // 8.Создать новый список и добавить в него несколько элементов первого списка.
public static List<String> copyList(List<String> list) {
            List<String> newCopyList = List.copyOf(list);
            return newCopyList;
            System.out.println(copyList(sortList(removeList(replacElement(addList(iterList(newColorList())), "red", "red!")))));
    
    }
// 9.Удалить из первого списка все элементы отсутствующие во втором списке.
// 10.*Сортировка списка.

public static List<String> sortList(List<String> list) {
        Collections.sort(list);
        return list;

        System.out.println(sortList(removeList(replacElement(addList(iterList(newColorList())), "red", "red!"))));

    }
}



