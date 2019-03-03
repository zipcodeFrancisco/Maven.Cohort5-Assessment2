# Assessment 2

## Frequently Asked Questions

| Yes                                | No                               |
| ---------------------------------- | -------------------------------- |
| Can I add additional methods?      | Can I **contact** someone other than an instructor for help?
| Can I add additional classes?      | Can I modify the tests? |
| Can I use content from my labs?    | Can I add comments to the tests?   |
| Can I use content from the internet?    |
| Can I use content from my notebook? |
| Can I view the test cases? |
| Does the project become progressively difficult? |


## Getting Started

### Setting up the project
* Ensure that the tests run upon opening the project.
	* You should see, `Tests Failed: 159 of 159 tests`
* Read each of the `README.md`s by clicking the links below
    * [Part 1 - Fundamentals](./README-Part1.md)
    * [Part 2 - Arrays](./README-Part2.md)
    * [Part 3 - Object Orientation](./README-Part3.md)
    * [Part 4 - Collections](./README-Part4.md)
    * [Part 5 - Generics](./README-Part5.md)


### Part 3 - Object Orientation
* Complete this section in the following order:
  1. `Address`
  2. `Person`
  3. `Animal`
  4. `Dog`

#### Address
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

#### Person
* `Person()`
* `Person(Long, String, Address)`
* `getId(): Long`
* `setId(Long): void`
* `getName(): String`
* `setName(String): void`
* `getAddress(): String`
* `setAddress(String): void`

#### Animal
* `Animal()`
* `Animal(Long, Person)`
* `getId(): Long`
* `setId(Long): void`
* `getOwner(): Person`
* `setOwner(Person): void`
* `getAddress(): Address`
* `setAddress(Address): void`

#### Dog
* `speak(): String`


### Part 4 - Collections
#### Family
* `add(Person): void`
* `contains(Person): Boolean`
* `remove(Person): void`
* `get(int): Person`
* `where(Predicate<Person>): List<Person>`
* `whereNameStartsWith(String): List<Person>`







### Part 5 - Generics
#### Shelter
* `Integer size()`
* `void add(Ageable)`
* `removeLast()`
* `getYoungest()`