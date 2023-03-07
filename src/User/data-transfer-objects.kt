data class User(
    val name: String,
    val address: Address,
    val document: Document
){
    data class Address(
        val country: String,
        val state: String,
        val cityCode: String,
        val street: String?
    )

    data class Document(
        val type: DocumentType,
        val number: String
    ){
        enum class DocumentType{
            CPF,
            CNPJ
        }
    }
}