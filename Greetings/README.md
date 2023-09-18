# Greetings

V souboru [Greetings.java](src/main/Greetings.java) vytvořte funkci `greet`.

Funkce `greet` vytiskne na obrazovku řetězec `"Hello <NAME>!"` kde `<NAME> `bude nahrazeno hodnotou, kterou funkce
dostane jako argument a odřádkuje.

> Řetezec musí být identický!

## Test
Pro otestovaní funkce spusti: [GreetingsTest.java](src/test/GreetingsTest.java)

## Náročnejší varianta
Vytvořte spustitelný program (funkce `main`), který vyzve uživatele k zadaním užívatelského jména.\
Zavolejte funcki `greet` se zadaným užívatelským jménem.

Příklad běhu programu:
```bash
Username: johnny
Hello johnny!
```

## Cheat sheet
Definovaní funkce v Javě bez návratové hodnoty s argumenty:
```java

private static void functionName(int intArg, String stringArg, int anotherIntArg) {
    ... HERE IS THE FUCNTION BODY ...
}
```

Deklarace funkce main:
```java
public static void main(String[]args) {
    ... HERE IS THE FUCNTION BODY ...
}
```

Získaní řetězce (přečtení celého řádku) ze standardního vstupu:
```java
try(final var input = new Scanner(System.in)) {
    final var string = input.nextLine();
    ...
}
```

Ukončení programu:
```java
System.exit(1);
```
