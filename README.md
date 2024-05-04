# Ćwiczenia 

## Zadanie 1 ( branch - zad1)
W ramach zadania 1, wykonaj następujące kroki:
- utwórz plik Person.javaw pakiecie company.beans
- zdefiniuj w nim prywatnepola name (String) oraz age (int)
- dodaj konstruktor przyjmujący name i age, który rzuca wyjątek InvalidAgeException, jeśli agenie mieści się w zakresie od 0 do 125
- zaimplementuj getteryoraz settery dla obu pól (getName, setName, getAge, setAge)
- utwórz plik InvalidAgeException.java w pakiecie company.exceptions
- klasa ta, dziedziczy po Exception (klasa wbudowana w Java) i posiada konstruktor przyjmujący poprzez dziedziczenie (super), wiadomość jako argument
- utwórz poza pakietem company (na najwyższym poziomie w strukturze aplikacji) plik Main.java, implementujący metodę maini utwórz w niej instancję Personi wypisz jej dane (pamiętaj o użyciu np. bloku try-catch)

**UWAGA**: Pamiętaj, że w celu zadeklarowania użycia wyjątku w klasie należy użyć odpowiedniej frazy throws SomeExceptionw jej deklaracji. Zapis ten, zmusza instancje (obiekty) tej klasy, do obsługi tego konkretnego wyjątku na przykład poprzez blok try-catch.

## Zadanie 2 ( branch – zad2)
W ramach zadania 2, kontynuuj na osobnym branchu, rozwijanie kodu napisanego w poprzednim zadaniu i wykonaj następujące kroki:
- utwórz plik Messenger.java w pakiecie company.interfaces
- zdefiniuj w nim jedynie jedną metodę sendMessage(String message)
- utwórz plik EmailMessenger.java w pakiecie company.implementations
- klasa ta, implementuje interfejs Messenger i wypisuje wiadomość w konsoli przy pomocy System.out.println poprzez przeciążanie metody sendMessage,
- w metodzie mainutwórz instancję EmailMessenger i użyj metody sendMessage.

**UWAGA**: Pamiętaj, że w celu zaimplementowanie interfejsuw klasie, należy użyć odpowiedniej frazy implements SomeInterfacew jej deklaracji oraz, w celu przeciążenia metodynależy użyć odpowiedniej adnotacji @Override.

## Zadanie 3 ( branch – zad3)
W ramach zadania 3, kontynuuj na osobnym branchu, rozwijanie kodu napisanego w poprzednim zadaniu i wykonaj następujące kroki:
- utwórz plik MathUtils.java w pakiecie company.utils
- dodaj statyczną metodęadd(int a, int b), która zwraca sumę dwóch liczb
- w metodzie main użyj metody add z klasy MathUtils do dodania dwóch liczb a następnie przed fragmentem kodu odpowiedzialnym za użycie metody sendMessage, wypisz w konsoli wynik a następnie przekaż w treści wiadomości metody sendMessage.

## Zadanie 4 ( branch – zad4)
W ramach zadania 4, kontynuuj na osobnym branchu, rozwijanie kodu napisanego w poprzednim zadaniu, zmodyfikuj kod w metodzie main i wykonaj następujące kroki:
- utwórz tablicę peoplez pięcioma obiektami instancji Person (people = new Person[5])
- utwórz stałą b (int) o wartości 10,w bloku try-catch (lub innym, jeżeli nie wykorzystałeś tego), przypisz dla każdej instancji nową instancję Person(people[0] = new Person(„John Doe”, 30))
- wylicz dla każdej osoby z osobna wartość za pomocą metody add z MathUtilswykorzystując jako argument awiek danej osoby a argument b, utworzoną wcześniej stałą
- wykorzystaj jak wcześniej wyliczoną wartość w treści wiadomości metody sendMessage.
