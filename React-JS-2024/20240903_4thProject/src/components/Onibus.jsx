import React from "react";

function Onibus(props) {

    let onibus =  props.onibus

  return (
    <div>
      <h2>{onibus.carroceria}</h2>
      <p>{onibus.chassi}</p>
      <p>{onibus.ano}</p>
      <p>{onibus.placa}</p>
      <p>{onibus.id}</p>
    </div>
  );
}

export default Onibus;
