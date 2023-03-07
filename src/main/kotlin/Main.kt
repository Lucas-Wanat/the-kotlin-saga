fun main(args: Array<String>) {

    println("Hello World!");
    println("Digite seu nome de usuário: ");
    val userName = readln();

    println("Digite sua senha: ");
    val password = readln();
    login(userName, password);
}
data class User(
    val name: String,
    val password: String
)

fun login(name: String, password: String) {

    println("nome de usuário: $name, senha de usuário: $password")

    val users = arrayOf(
        User("joao", "1234"),
        User("maria", "senha123"),
        User("pedro", "pedrinho2010")
    )

    val userAuthorized = users.find { it.name == name && it.password == password }
    if(userAuthorized != null) {
        println("Usuário autorizado com sucesso!");
        println("Seja bem vindo(a) ${userAuthorized.name}");
    } else {
        println("Algo deu errado, verifique seu login e tente novamente")
    }
}