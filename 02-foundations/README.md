## Preview

- Wordle

## Object-Oriented Programming (in Java)

- `Playlist`
  - Data: `title`, `songs`, `length`, `creator`, `duration`
  - Functionality: `addSong`, `removeSong`, `play`, `delete`

- `Song`
  - Data: `title`, `artist`, `album`, `duration`
  - Functionality: `play`, `delete`, `addToPlaylist`

- Objects: data + functionality + identity
- Why is this good? Why is this bad?
- Java is OOP to the max

- Interfaces
  - `Playable`
  - `LibraryItem`

- Polymorphism `SearchResults`

- Inheritance
  - `Playable`

- Composition
- Encapsulation and data-hiding: `songs.add` vs `addSong`
- Java access control makes questionable design choices (see: subsequent languages)

## Java Topics

- `Template.java`
- Running vs compiling
- Static typing
- Declaration vs initialization (why declare and not initialize)
- `var` vs explicit types
- Variable scope
- `import java.util.*`
- Printing, `Scanner`
- Primitives: `boolean`s, `int`s, `double`s
- Other questionably useful number types https://docs.oracle.com/javase%2Ftutorial%2F/java/nutsandbolts/datatypes.html
- Number weirdness: int overflow, double infinity
- Type conversions
- `null`, and the billion dollar mistake
- Operators: numerical, compound, boolean, comparison, increment / decrement
- Strings, `+`, `.equals`, chars
- Conditionals, ternary operator
- Loops
- Reading files
- Checked exceptions
- Methods
- Method overloading
- Sequence types, initialization (used to be terrible, not it's just bad)
- Boxed types
- Enums
- Switch
- Records

## To Do

- Play Wordle https://wordly.org/
- Understand the scoring mechanism https://en.wikipedia.org/wiki/Wordle#Gameplay

## Problems

**Change Calculator**: Get a number `n` as input. Calculate the "change" for `n`; that is, the smallest set of quarters, dimes, nickles, and pennies to make `n` cents.

**Anagram Finder**: Download the file `unixdict.txt` (a list of words). Write a program that takes a word as input and finds all of its anagrams (from `unixdict.txt`). Words are anagrams of each other if they contains the same letters in a different order. For example, the anagrams of `time` are `mite`, `emit`, and `item`. Find the largest set of anagrams in the file.

**Bar Chart**: Make a bar chart for a list of integers. For example, for the numbers (1 4 2 5 3) generate:

```
   X
 X X
 X XX
 XXXX
XXXXX
```
