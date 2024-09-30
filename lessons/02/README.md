## Topics

- Method categories:

  - **Creators** make a new value. (`List.of`)
  - **Transformers** make a new value of from an old value of the same type. (`List.clone`)
  - **Mutators** mutate a value. (`List.add`)
  - **Observers** calculate or retreives a property or metric of some value. (`List.size`)

- Aliasing and why it's an issue.

- `Array.clone(...)`, `new ArrayList<>(...)`.

- When to mutate and when to transform.

- Fluent interfaces:

```js
const numbers = [ 1, 6, 2, 4, 3 ];

numbers             // [ 1, 6, 2, 4, 3 ]
  .toSorted()       // [ 1, 2, 3, 4, 6 ]
  .toReversed()     // [ 6, 4, 3, 2, 1 ]
  .with(0, 5)       // [ 5, 4, 3, 2, 1 ]
  .map(x => x ** 2) // [ 25, 16, 9, 4, 1 ]
```

- Rust borrow checker.
