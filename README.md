This is a giter8 template for sbt 1.x projects in the style that
I (inkytonik) commonly use.

See [`inkytonik/kiama.g8`](https://github.com/inkytonik/kiama.g8) and
[`inkytonik/kiama-rats.g8`](https://github.com/inkytonik/kiama-rats.g8) for
variants that use the [Kiama language processing library](http://kiama.googlecode.com).

### Properties

* scalac options `-deprecation` and `-unchecked` turned on

* sbt log level is warning

* sbt shell prompt contains project name and version

* no project sub-directory

* stub `Main` object with a dummy `main` method

* Mercurial `.hgignore` file

* simple example of ScalaTest test

### Usage

Install [sbt 1.x](http://www.scala-sbt.org).

If using sbt 0.13.13 or above:

    sbt new inkytonik/plain.g8

Run the generated project as follows:

    cd $name$
    sbt
    > run
    Hello from $organization$.$name$ Main!
    Factorial 4 = 24

where `$organization$` and `$name$` are the values you entered when
running the `g8` command.

You can also use the `test` command to run some simple tests of the
Factorial implementation using ScalaTest.
