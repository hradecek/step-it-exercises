# Reverse string

V souboru [ReverseString.java](src/main/ReverseString.java) vytvořte funkci `reverseString`.\
Funkce `reverseString` bude mít jeden argument typu `String`.\
Výsledkem funkce `reverseString` "obrácený" `String`, který bude funkci předán jako parametr.

Příklad:
```shell
reverseString("")                   -> ""
reverseString("hello")              -> "olleh"
reverseString("Kobyla ma maly bok") -> "kob ylam am alyboK"
```

## Pokročilejší varianta: Rekurzivní funkce
Udelejte funcki `reverseString` pomocí rekurze.

## Test
Pro otestovaní funkce spusti: [ReverseStringTest.java](src/test/ReverseString.java)

## Cheat sheet
Rekurzivní funkce je funkce, která volá sebe sama:

```java
public static void recursive(int n) {
    if (n == 0) {     // <-- Condition ending recursion
        return;
    }
    System.out.println(n);

    recursive(n - 1); // <-- Recursion
}

recursive(10) -> 10 9 8 7 6 5 4 3 2 1
```

