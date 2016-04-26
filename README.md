# Karaf Gradle Bnd Integration Example

This repository shows how to create osgi bundles, karaf features and karaf assembly using [Bndtools](https://github.com/bndtools/bnd/blob/master/biz.aQute.bnd.gradle/README.md#gradle-plugin-for-workspace-builds) and [Gradle](http://gradle.org/).

## Project Layout

<code><pre>
└── gradle-bnd-project
    ├── greeting-api <== Bundle API example
    ├── greeting-impl <== Bundle Implementation example
    ├── greeting-features <== Karaf feature for greeting-api and greeting-impl
    ├── greeting-distro <== Karaf assembly used to deploy greeting-features
    ├── greeting-kar <== Karaf KAR for greeting-features
    └── greeting-offline-repo <== Karaf offline repository
</pre></code>

## Demo

    ~/git/gradle-bnd-project$ gradle build install

After that check a karaf distribution with logback ready to run greeting-api and greeting-impl bundles.

    ~/git/gradle-bnd-project/greeting-distro/build/assembly

 Type to start karaf
    
     ~/git/gradle-bnd-project/greeting-distro/build/assembly/bin/karaf
 