const SEGUNDA_CONSULTA = "http://localhost:8080/api/home/readOrdeCountries"


const apenasCarga = async () => {
    var ctx = document.getElementById('myChart')
    var myChart = new Chart(ctx, {
        type: 'bar',
        data: {
            datasets: [{
                label: 'OrderID and ShipCountry',
                backgroundColor: ['#7A4768', '#190714', '#65D62C', '#65AED0', '#65D0BE', '#43E3C8', '#1F7EA7', '#4FE343', '#ED0D36', '#E3AB43'],
                borderColor: ['White'],
                borderWidth: 1
            }]
        },
        options: {
            scales: {
                y: {
                    beginAtZero: true
                }
            }
        }
    })

    fetch(SEGUNDA_CONSULTA)
        .then(response => response.json())
        .then(datos => mostrar(datos))
        .catch(error => console.log(error))


    const mostrar = (articulos) => {
        articulos.forEach(element => {
            myChart.data['labels'].push(element.ShipCountry)
            myChart.data['datasets'][0].data.push(element.OrderID)
            myChart.update()
        });

    }

}


        fetch(SEGUNDA_CONSULTA)
            .then( response => response.json() )
            .then( data => mostrarData(data) )
            .catch( error => console.log(error) )

        const mostrarData = (data) => {
            console.log(data)
            let body = ""
            for (var i = 0; i < data.length; i++) {      
               body+=`<tr><td>${data[i].OrderID}</td><td>${data[i].ShipCountry}</td></tr>`
            }
            document.getElementById('data').innerHTML = body
        }