# Fibonacci sequence

Fibonacciho posloupnost je posloupnost čísel:
> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

každé číslo v posloupnosti je součtem dvou předchozích.

V souboru [FibonacciSequence.java](src/main/FibonacciSequence.java) je implementována funkce `generateFibonacciSequence` pomocí cyklu `for`.

Funkce `generateFibonacciSequence` vrací `List` prvních `n` (parametr funkce) čísel z Fibonacciho posloupnosti.

Příklad volání:
```shell
generateFibonacciSequence(-10) -> []
generateFibonacciSequence(0)   -> []
generateFibonacciSequence(1)   -> [0]
generateFibonacciSequence(2)   -> [0, 1]
generateFibonacciSequence(10)  -> [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
```

Přepište funkci `generateFibonacciSequence` na cyklus `while`.

## Test
Pro otestovaní funkce spusti: [FibonacciSequenceTest.java](src/test/FibonacciSequenceTest.java)

> Testy musí procházet před i po změne na `while` cyklus.

