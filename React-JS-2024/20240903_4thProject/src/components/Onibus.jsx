import React from "react";
import './Onibus.css'
function Onibus(props) {

    let onibus = props.onibus

  return (
    <div className="onibus-container">
      <h2>{onibus.carroceria}</h2>
      <p>{onibus.chassi}</p>
      <p>{onibus.ano}</p>
      <p>{onibus.placa}</p>
      <p>{onibus.id}</p>
    </div>
  );
}

export default Onibus;
