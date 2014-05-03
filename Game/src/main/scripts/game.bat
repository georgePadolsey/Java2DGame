@echo off
cd %~dp0
java -jar -Djava.library.path="lib/" "${project.build.finalName}.${project.packaging}"
