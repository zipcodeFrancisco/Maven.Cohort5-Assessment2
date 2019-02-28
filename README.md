# Assessment 2

## Part 1 - Fundamentals

### StringUtils
* `padLeft(String, int): String`
* `padRight(String, int): String`
* `repeatString(String, int): String`
* `replaceLastSubString(String, String): String`
* `replaceNthSubstring(String, String, int): String`
* `getIndexOfNthSubstring(String, String, Integer): Integer`
* `getNumberOfOccurrences(String, String): Integer`
* `isAlphaString(String): Boolean`
* `isNumericString(String): Boolean`
* `isSpecialCharacterString(String): Boolean`

### PredicateUtilities
* isEven(Integer): Boolean
* isOdd(Integer): Boolean
* isMultipleOf3(Integer): Boolean
* isMultipleOfN(Integer,Integer): Boolean
* startsWithCapitalLetter(String): Boolean

### BasicStringUtils
* concatentate(String,String): String
* reverse(String): String
* reverseThenConcatenate(String,String): String
* removeCharacters(String,String): String
* removeCharactersThenReverse(String,String): String

## Part 2 - Arrays
### IntegerArrayUtils
* `add(Integer[], Integer): Integer[]`
* `swap(Integer[], int, Integer): Integer[]`
* `get(Integer[], Integer[]): Integer`
* `incrementEvenDecrementOdd(Integer[]): Integer[]`
* `incrementEven(Integer[]): Integer[]`

### StringArrayUtils
* `getSubArray(String[], int, int): String[]`
* `getEndingArray(String[], int): String[]`

## Part 3 - Object Orientation
* Complete this section in the following order:
  1. `Address`
  2. `Person`
  3. `Animal`
  4. `Dog`

### Address
* `Address()`
* `Address(String, String, String, String, String)`
* `getAddressLine1(): String`
* `setAddressLine1(String): void`
* `getAddressLine2(): String`
* `setAddressLine2(String): void`
* `getCity(): String`
* `setCity(String): void`
* `getState(): String`
* `setState(String): void`
* `getZipcode(): String`
* `setZipcode(String): void`

### Person
* `Person()`
* `Person(Long, String, Address)`
* `getId(): Long`
* `setId(Long): void`
* `getName(): String`
* `setName(String): void`
* `getAddress(): String`
* `setAddress(String): void`

### Animal
* `Animal()`
* `Animal(Long, Person)`
* `getId(): Long`
* `setId(Long): void`
* `getOwner(): Person`
* `setOwner(Person): void`
* `getAddress(): Address`
* `setAddress(Address): void`

### Dog
* `speak(): String`


## Part 4 - Collections
### Family
* `add(Person): void`
* `contains(Person): Boolean`
* `remove(Person): void`
* `get(int): Person`
* `where(Predicate<Person>): List<Person>`
* `whereNameStartsWith(String): List<Person>`







## Part 5 - Generics
### Shelter
* `Integer size()`
* `void add(Ageable)`
* `removeLast()`
* `getYoungest()`
