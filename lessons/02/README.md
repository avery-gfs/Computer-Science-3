## Arrays

### Creation

```java
String[] dirs = { "north", "south", "east", "west" };
```

### Printing

```java
System.out.println(dirs); // Prints nonsense
System.out.println(Arrays.toString(dirs)); // Prints { "north", "south", "east", "west" }
```

### API

```java
dirs.length                       // 4
dirs[0]                           // "north"
dirs[dirs.length - 1]             // "west"
dirs[random.nextInt(dirs.length)] // Random direction
dirs[0] = "up";                   // dirs = { "up", "south", "east", "west" }
```

### Fixed size

Arrays have a fixed length.

No equivalent of Python's `append`.

## Lists

### Creation

```java
List<String> dirs = List.of("north", "south", "east", "west");
```

### Printing

```java
List<String> dirs = List.of("north", "south", "east", "west");

System.out.println(dirs); // Prints [north, south, east, west]
```

### API

```java
List<String> dirs = List.of("north", "south", "east", "west");

dirs.size()                           // 4
dirs.get(0)                           // "north" (can't use [0])
dirs.get(dirs.size() - 1)             // "west"
dirs.get(random.nextInt(dirs.size())) // Random direction
```

### Immutability

`List.of` makes an immutable list that we can't update or add to.

```java
List<String> dirs = List.of("north", "south", "east");

dirs.set(0, "up"); // `UnsupportedOperationException`
```

To make a mutable List:

```java
List<String> dirs = List.of("north", "south", "east");

// Make a mutable list from an existing list
List<String> mutableDirs = new ArrayList<>(dirs);

// Make a mutable list from scratch
List<String> mutableDirs = new ArrayList<>(List.of("north", "south", "east"));
```

### Mutable API

```java
List<String> mutableDirs = new ArrayList<>(List.of("north", "south", "east"));

dirs.set(0, "up"); // dirs = [up, south, east, west]
dirs.add("down");  // dirs = [up, south, east, west, down]
```

See also:

- `addAll`
- `contains`
- `equals`
- `getLast`
- `indexOf`
- `isEmpty`
- `lastIndexOf`
- `removeLast`
- `reversed`
- `sort`
- `subList`

### Primitives

```java
List<char> letters = List.of('a', 'b', 'c'); // Doesn't work
```

We can't declare a list of primitives, we have to use wrapper
classes:

- `int` -> `Integer`
- `double` -> `Double`
- `boolean` -> `Boolean`
- `char` -> `Character`

```java
List<Character> letters = List.of('a', 'b', 'c');
```

## Comparison

| Arrays                    | Immutable Lists           | Mutable Lists             |
| ------------------------- | ------------------------- | ------------------------- |
| ❤️ Nice syntax            | ❤️ Ok syntax              | 💩 Annoying syntax        |
| 💩 Fixed length           | 💩 Fixed length           | ❤️ Flexible length        |
| 💩 Can update elements    | 💩 Can't update elements  | ❤️ Can update elements    |
| ❤️ `[]` syntax            | 💩 No `[]` syntax         | 💩 No `[]` syntax         |
| 💩 Printing is annoying   | ❤️ Printing is reasonable | ❤️ Printing is reasonable |
| 💩 No nice helper methods | ❤️ Nice helper methods    | ❤️ Nice helper methods    |
| ❤️ Can store primitives   | 💩 No primitives          | 💩 No primitives          |

## Links

- https://runestone.academy/ns/books/published/csawesome/Unit6-Arrays/topic-6-1-array-basics.html
- https://runestone.academy/ns/books/published/csawesome/Unit6-Arrays/topic-6-2-traversing-arrays.html
- https://runestone.academy/ns/books/published/csawesome/Unit6-Arrays/topic-6-3-arrays-with-foreach.html
- https://runestone.academy/ns/books/published/csawesome/Unit7-ArrayList/topic-7-1-arraylist-basics.html
- https://runestone.academy/ns/books/published/csawesome/Unit7-ArrayList/topic-7-2-arraylist-methods.html
