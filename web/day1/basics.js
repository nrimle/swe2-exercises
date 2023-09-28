// Deklariere 2 Variablen vom Typ Number
// Addiere die zwei Zahlen und gib sie auf der Konsole aus

let a = 5;
let b = 8;

console.log(a+b)


// Deklariere ein Objekt und gib alle Properties auf der Konsole aus

let c = {
    this: "is",
    a: "test"
}

console.log(JSON.stringify(c))

// Deklariere ein Array und gib die Anzahl Elemente auf der Konsole aus

let d = ["another", "test"]

d.forEach((v) => {
    console.log(v);
})

// Schreibe eine Funktion mit einem String Parameter. In der Funktion soll der übergebene Text auf der Konsole ausgegeben werden.
// Rufe die Funktion auf

function print(string) {
    console.log(string)
}

print("this is a string")

// Schreibe eine Funktion mit einem Boolean Parameter.
// Wenn true übergeben wird, soll "Hello World" auf der Konsole ausgegeben werden.
// Wenn false übergeben wird, soll "Bye" auf der Konsole ausgegeben werden.

function bool(value) {
    if (value) {
        console.log("Hello world")
    } else {
        console.log("Bye")
    }
}

// Schreibe eine Funktion, die eine Nummer entgegen nimmt.
// Wenn die nummer unter 10 ist, soll "small" auf der Konsole ausgegeben werden.
// Wenn die nummer zwischen 10 und 50 ist, soll "medium" auf der Konsole ausgegeben werden.
// Wenn die nummer grösser als 50 ist, soll "large" auf der Konsole ausgegeben werden.

function num(value) {
    if (value < 10) {
        console.log("small")
    } else if (value >= 10 && value <= 50) {
        console.log("medium")
    } else if (value > 50) {
        console.log("large")
    } else {
        console.log("input is not a number")
    }
}

// Schreibe eine Funktion, die ein Array entgegen nimmt. Verwende die Filter Funktion
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/filter

function arr(value) {
    value.filter(v => v >= 10);
}

// Schreibe eine Funktion, die ein Array entgegen nimmt. Verwende die forEach Funktion um alle Elemente auf der Konsole auszugeben
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach

function printArr(value) {
    value.forEach((v) => {
        console.log(`Hello: ${v}`);
    })

}

printArr(["Max", "Tom", "Peter"])

// Schreibe eine Funktion, die ein Array entgegen nimmt. Verwende die Map Funktion
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/map

function mapArr(value) {
    console.log(d.map((j) => j));
}
