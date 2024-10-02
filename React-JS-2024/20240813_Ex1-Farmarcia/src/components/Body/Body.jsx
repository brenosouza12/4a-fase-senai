import React from 'react';
import './Body.css';
import GerenciadorSenhas from '../GerenciadorSenhas/GerenciadorSenhas.jsx'; // Importe o novo componente

function Body() {

  return (
    <div className='body-container'>
      <div className='left-body'>
        <p className='textBody'>Venha conhecer a farmácia da Márcia, sob nova direção dela mesma.</p><br />
        <img className="taylor-image" src="./images/tay swift.jpg" alt="" />
        <p className='textBodyTaylorS'>Taylor Swift, a patrocinadora da FarMárcia</p>
        <img className="tshirt-image" src="./images/farmarcia-camisetas.PNG.png" alt="" />
        <p className='textBodyTaylorS'>A nossa camiseta!!!</p>
      </div>

      <div className='right-body'>
        <p className='textHistory'>Nossa história: Márcia, depois de comprar a farmácia de seu tio Mario, fez um rebranding na farmácia e mudou o nome para FarMárcia. Agora, ela lhe convida para sua inauguração no dia 23 de agosto, às 1h30.<br /> E vai ter show da Taylor Swift cantando músicas que você, cliente, pedir.</p><br />
        <button className='button-taylor'>Taylor Swift - The Eras Tour in FarMárcia</button>

        {/* Aqui está o sistema de senhas */}
        <GerenciadorSenhas />
      </div>
    </div>
  );
}

export default Body;
