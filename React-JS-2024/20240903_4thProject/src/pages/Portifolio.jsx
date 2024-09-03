import React from "react";
import Title from "../components/Title";
import Onibus from "../components/Onibus";

function Portifolio() {
  const buzoes = [
    {
      carroceria: "Marcopolo Torino S",
      chassi: "Mercedes-Benz OF-1721",
      ano: 2020,
      placa: "ABC1D23",
      id: Date.now(),
    },
    {
      carroceria: "Caio Apache VIP IV",
      chassi: "Volkswagen 17.230 OD",
      ano: 2018,
      placa: "DEF2G45",
      id: Date.now() + 1,
    },
    {
      carroceria: "Comil Svelto 2017",
      chassi: "MAN 17.230",
      ano: 2019,
      placa: "GHI3J67",
      id: Date.now() + 2,
    },
    {
      carroceria: "Neobus Mega Plus",
      chassi: "Mercedes-Benz OF-1519",
      ano: 2021,
      placa: "JKL4M89",
      id: Date.now() + 3,
    },
    {
      carroceria: "Mascarello GranVia 2014",
      chassi: "Volvo B270F",
      ano: 2017,
      placa: "MNO5P12",
      id: Date.now() + 4,
    },
    {
      carroceria: "Busscar Urbanuss Pluss",
      chassi: "Scania K250",
      ano: 2010,
      placa: "PQR6S34",
      id: Date.now() + 5,
    },
    {
      carroceria: "Marcopolo Viale BRT",
      chassi: "Mercedes-Benz O-500M",
      ano: 2019,
      placa: "STU7V56",
      id: Date.now() + 6,
    },
    {
      carroceria: "Caio Millennium BRT",
      chassi: "Volkswagen 18.280 OT",
      ano: 2015,
      placa: "VWX8Y78",
      id: Date.now() + 7,
    },
    {
      carroceria: "Comil Campione 3.45",
      chassi: "Mercedes-Benz O-400RSE",
      ano: 2018,
      placa: "YZA9B01",
      id: Date.now() + 8,
    },
    {
      carroceria: "Marcopolo Paradiso G8 1350",
      chassi: "Scania K360",
      ano: 2022,
      placa: "BCD0C23",
      id: Date.now() + 9,
    },
    {
      carroceria: "Mascarello Roma 370",
      chassi: "Volvo B380R",
      ano: 2014,
      placa: "EFG1D45",
      id: Date.now() + 10,
    },
    {
      carroceria: "Busscar Vissta Buss 360",
      chassi: "Mercedes-Benz O-500RS",
      ano: 2021,
      placa: "GHI2E67",
      id: Date.now() + 11,
    },
    {
      carroceria: "Neobus Thunder+",
      chassi: "Volkswagen 9.160",
      ano: 2019,
      placa: "JKL3F89",
      id: Date.now() + 12,
    },
    {
      carroceria: "Caio Foz Super",
      chassi: "Mercedes-Benz LO-916",
      ano: 2020,
      placa: "LMN4G12",
      id: Date.now() + 13,
    },
    {
      carroceria: "Marcopolo Senior 2016",
      chassi: "Volkswagen 15.190 OD",
      ano: 2018,
      placa: "OPQ5H34",
      id: Date.now() + 14,
    },
    {
      carroceria: "Mascarello GranVia 2014",
      chassi: "Mercedes-Benz OF-1724",
      ano: 2016,
      placa: "RST6I56",
      id: Date.now() + 15,
    },
    {
      carroceria: "Neobus Mega BRT",
      chassi: "Volvo B340M",
      ano: 2013,
      placa: "UVW7J78",
      id: Date.now() + 16,
    },
    {
      carroceria: "Caio Giro",
      chassi: "Scania K310",
      ano: 2021,
      placa: "XYZ8K01",
      id: Date.now() + 17,
    },
    {
      carroceria: "Marcopolo Ideale 800",
      chassi: "Mercedes-Benz OF-1721L",
      ano: 2017,
      placa: "ABC9L23",
      id: Date.now() + 18,
    },
    {
      carroceria: "Busscar El Buss 320",
      chassi: "MAN 17.230",
      ano: 2018,
      placa: "DEF0M45",
      id: Date.now() + 19,
    },
  ];

  return (
    <div>
      <Title text={"Portifolio"} />
      <p>Estamos na pagina de Portifólio</p>
      {buzoes.map((onibus) => (
        <Onibus onibus={onibus} key={onibus.id} />
      ))}
    </div>
  );
}

export default Portifolio;
