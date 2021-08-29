# scala-lib.g8

[Giter8] skeleton for scala libraries with an opinionated structure.

## "Features"

* Predefined compiler-options based on [scala-compiler-options](https://github.com/janjaali/scala-compiler-options)

* [MUnit](https://github.com/scalameta/munit) used as test framework

* [Metals](https://github.com/scalameta/metals) support

* [liancheng/scalafix-organize-imports](https://github.com/liancheng/scalafix-organize-imports) support to organize imports

* [scalameta/scalafmt](https://github.com/scalameta/scalafmt) for formatting

## Usage

Apply the template with SBT:

```shell
sbt new janjaali/scala-lib.g8
```

## Test template locally

To test the template locally create a new directory and run:

```shell
mkdir testDir
cd testDir
sbt new file://../scala-lib.g8/
```

## Release

1. Update [CHANGELOG](./CHANGELOG.md) on your branch

2. Update this [README](./README.md) on your branch

3. Merge changes back into the main branch

4. Tag version `git tag -a v1.5.0 -m "Release version 1.5.0."`

5. Publish the new release `git push --tags`

6. Create a new release on GitHub

[Giter8]: http://www.foundweekends.org/giter8/
