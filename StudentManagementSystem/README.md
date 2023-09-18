# Student Management System
Vytvořte program pro správu studentů.

 - Každý student má jméno a příjmení a študijní průměr
 - Student musí mít zvolen nějaký jednoznačný identifikátor pro případ, že dva studenti budou mít stejné jméno a příjmení
 - Seznam studentů se bude ukládat na disk do vámi zvoleného souboru

Program bude podporovat následujíci operace:

 - Registrace nového studenta
 - Výpis všech studentů
 - Nalezení studenta (nebo studentů) podle jména nebo příjmení a jeho/jejich výpis
   - Se stejným jménem nebo příjmení může existovat více studentů

## Přiklad souboru se studenty
Formát v jakém se informace o studentech ukládají je na vás.\
Jednou z možností je CSV (https://cs.wikipedia.org/wiki/CSV0).

Přiklad souboru:
```text
Pospíšilová,Petra,2.1
Novák,Jan,
Marešová,Eva,1.2
Svobodová,Alena,3.0
```
Jan Novák nemá zatím žádny průměr.

## Ukázkový příklad běhu programu
Tohle je ukázkový program - přizpůsobte si dle libosti.

Příklad registrace:
```shell
1. Registrace nového studenta
2. Výpis všech studentů
3. Hledani studenta

Zadej volbu (1-2): 1

Jmeno: Jan
Příjmení: Novák
```

Příklad výpisu:
```shell
1. Registrace nového studenta
2. Výpis všech studentů
3. Hledani studenta

Zadej volbu (1-2): 2

NOVÁK, Jan (--)
POSPÍŠILOVÁ, Petra (2.1)
MAREŠOVÁ, EVA (1.2)
SVOBODOVÁ, Alena - (3.0)
DVOŘÁK, Karel (4.2)
NOVÁK, Petr (2.5)
KOUHOUT, Pavel - (1.1)
...
```

Příklad hledání:
```shell
1. Registrace nového studenta
2. Výpis všech studentů
3. Hledani studenta

Zadej volbu (1-2): 3

Jmémno nebo příjmení: Novák

Výsledek (počet 2):
NOVÁK, Jan (--)
NOVÁK, Petr (2.5)
```

Příklad hledání:
```shell
1. Registrace nového studenta
2. Výpis všech studentů
3. Hledani studenta

Zadej volbu (1-2): 3

Jmémno nebo příjmení: Nevim

Nenalezen žádny student.
```
