// function Account(name, document) {
//     this.id;
//     this.name = name;
//     this.document = document;
//     this.email;
//     this.password;
// }

//EcmaScript6
//Declaramos el metodo Account
class Account{
    constructor(name, document) {
        this.id;
        this.name = name;
        this.document = document;
        this.email;
        this.password;
    }

    printDataAccount(){
        console.log(this.name)
        console.log(this.document)
        console.log(this.email);
    }
}