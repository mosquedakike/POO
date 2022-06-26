class User extends Account{
    constructor(name, document, user, password) {
        super(name, document, password);
        this.user = user;
    }
}