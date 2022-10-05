

const PRIMERA_CONSULTA = "http://localhost:8080/api/home/all"


const apenasCargaUno = async () => {

    var ctx = document.getElementById('myChart')
    var myChart = new Chart(ctx, {
        type: 'bar',
        data: {
            datasets: [{
                label: 'Producto / Cantidad',
                backgroundColor: ['#1983B0', '#1719B7', '#531899', '#A42FD0', '#C70855', '#F51417', '#90CAF9', '#21A80C'],
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

    fetch(PRIMERA_CONSULTA)
        .then(response => response.json())
        .then(datos => mostrar(datos))
        .catch(error => console.log(error))


    const mostrar = (articulos) => {
        articulos.forEach(element => {
            myChart.data['labels'].push(element.categoria)
            myChart.data['datasets'][0].data.push(element.cantidad)
            myChart.update()
        });

    }


}


fetch(PRIMERA_CONSULTA)
    .then(response => response.json())
    .then(data => mostrarData(data))
    .catch(error => console.log(error))

const mostrarData = (data) => {
    console.log(data)
    let body = ""
    for (var i = 0; i < data.length; i++) {
        body += `<tr><td>${data[i].categoria}</td><td>${data[i].cantidad}</td></tr>`
    }
    document.getElementById('data').innerHTML = body
    //console.log(body)
}













