Conversor Kelvin <-> Celcius
==

Este projeto tem como foco a aplicar o conteúdo aprendido em aula sobre **node.js** e **api rest**.

Para converte K (Kelvin) para C (celcius) basta enviar sua requisição **POST** em json como demonstrado abaixo:

```json
{
    "kelvin": 302,
}
```

    http://localhost:3000/kelvin-to-celcius

Para converte C (celcius) para K (Kelvin) basta enviar sua requisição **POST** em json como demonstrado abaixo:

```json
{
    "Celcius": 29,
}
```

    http://localhost:3000/celcius-to-kelvin