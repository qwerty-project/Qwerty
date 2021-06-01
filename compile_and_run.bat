@echo off
setlocal

if "%~1"=="" (
    set "input=input.txt"
) else set "input=%*"

antlr4 Qwerty.g4 && javac **.java && java Qwerty %input% && pause