const express = require('express')
const app = express()
const conversor = 273

app.use(express.json())

app.post('/kelvin-to-celcius', (request, response) => {
    const kelvin = request.body.kelvin;
    
    response.json({
        Celcius: kelvin - conversor + '°C',
    })
})

app.post('/celcius-to-kelvin', (request, response) => {
    const celcius = request.body.celcius;

    response.json({
        kelvin: celcius + conversor + '°K',
    })
})

app.listen(3000, () => {
    console.log('Server ok')
})