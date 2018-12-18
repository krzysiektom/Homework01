<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

### Zadania.

Stwórz projekt `Homework01`. Rozwiązania zadań powinny znajdować się w tym projekcie.


#### Zadanie 1
W projekcie utwórz pakiet `pl.coderslab.collection`, w pakiecie utwórz klasę `GenerateRandom` zawierającą metodę o sygnaturze:
`public static Map<Integer, Integer> checkRand(int amount, int interval)`, metoda ta ma zwracać mapę wystąpień wartości losowych generowanych za pomocą klasy `Random`.

Kluczem mapy ma być losowana liczba, wartością ilość jej wystąpień.

Parametry:
- `amount` - oznaczają ilość losowań jaka ma być wykonana.
- `interval` - zakres wartości dla metody klasy `nextInt` klasy `Random`.

Przykładowy wynik wyświetlenia elementów mapy dla wywołania metody z parametrami `amount` = 500000 oraz `interval` = 10:

````
0 : 50082
1 : 49956
2 : 49771
3 : 50001
4 : 50036
5 : 49699
6 : 50082
7 : 50272
8 : 50094
9 : 50007

````

#### Zadanie 2

Ze względu na oszczędności w pewnej firmie planowane są zwolnienia najlepiej opłacanych pracowników,
którzy nie są spokrewnieni z szefem o nazwisku **Kowalski**.

1. W pliku `Main1.java` napisz program, który wczyta dane z pliku `earnings.txt`.

2. Wyświetli listę 3 pracowników z największymi zarobkami, których nazwisko nie jest takie samo jak szefa (Kowalski).

    * Zwróć uwagę że nazwisko to może się odmieniać (Kowalski, Kowalska).
    * Zwróć uwagę na ułożenie danych w pliku, występują linie które nie zawierają płac.
    * Zwróć uwagę że ułożenie danych w pliku może się zmieniać.
    * Zwróć uwagę że kolejność danych w lini może być przestawiona.

Do pobrania ścieżki pliku możesz wykorzystać poniższy kod:
`` String path = getServletContext().getRealPath("/file.txt");
``

#### Zadanie 3

1. W pliku `Main2.java` do zmiennych **reg1**, **reg2**, **reg3**, **reg4** wpisz kolejno wyrażenia regularne, opisujące:

    * liczby zmiennoprzecinkowe (5.65 , 123.123)
    * liczby w notacji naukowej ( 5.4325e+04 ; 2.0000342E-06)
    * datę w formacie `dd/mm/yyyy`
    * datę w formacie `yyyy-mm-dd` - gdzie rok jest powyżej 2000


#### Zadanie 4

W pliku `Main3.java`

1. Napisz metodę `static boolean verifyLogin(String email)`,
która zwróci **true** jeżeli ciąg znaków:
    * Ma minimum 5 znaków.
    * Zawiera tylko litery, cyfry, znak podkreślenia, myślnik
    * Nie zaczyna się od cyfry

**false** w przeciwnym wypadku.


