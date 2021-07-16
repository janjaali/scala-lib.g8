# scala-lib.g8

[Giter8] skeleton for scala libraries with an opinionated structure.

## "Features"

* Predefined compiler-options based on [scala-compiler-options](https://github.com/janjaali/scala-compiler-options)

* [MUnit](https://github.com/scalameta/munit) used as test framework

* [Metals](https://github.com/scalameta/metals) support

* [liancheng/scalafix-organize-imports](https://github.com/liancheng/scalafix-organize-imports) support to organize imports

* [scalameta/scalafmt](https://github.com/scalameta/scalafmt) for formatting

## Usage

Giter the template

```shell
g8 janjaali/scala-lib.g8
```

## Test template locally

To test the template locally create a new directory and run:

```shell
mkdir testDir
cd testDir
g8 file://../scala-lib.g8/
```

## Release

1. Update [CHANGELOG](./CHANGELOG.md)

2. Merge changes back into main branch

3. Tag version `git tag -a v1.2.0 -m "Release version 1.2.0."`

[Giter8]: http://www.foundweekends.org/giter8/
