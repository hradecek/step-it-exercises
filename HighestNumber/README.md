# The highest number

Vytvořte program, který najde nejvyšší číslo v seznamu čísel.

Seznam čísel bude získán ze standardního vstupu (klávesnice) nebo ze souboru [resources/numbers.txt](resources/numbers.txt).

## Implementace třídy `StdInputNumbersReader`
Vytvořte třídu `StdInputNumbersReader`, která implementuje interface [NumbersReader.java](src/main/NumbersReader.java).\
Třída `StdInputNumbersReader` načte seznam čísel ze standardního vstupu od uživatele a vráti jej jako `List`.

V případe, kdy užívatel zadá něco co číslo není, vypíše se chybová hláška a bude se pokračovat v načítavaní dalších čísel.

Zadávaní, bude ukončeno prázdnym řádkem (ENTER).

## Implementace třídy `FileNumbersReader`
Vytvořte třídu `FileNumbersReader`, která implementuje interface [NumbersReader.java](src/main/NumbersReader.java).\
Třída `FileNumbersReader` načte seznam čísel ze souboru, který jej bude předán jako argument konstruktoru a vráti seznam
čísel jako `List`.

Soubor obsahuje na každém řádku vždy jen jedno číslo.

V případe chyby, řádek obsahuje něco co číslo není, se daný řádek přeskočí.

## Hlavní program
[Main.java](src/main/Main.java) obsahuje spustitelný program.\
Zkuste to spustit s oběma implementacemi `NumbersReader`.
