import React from 'react'
import './Body.css'
function Body() {

  return (

    <div className='body-container'>

      <div className='left-body'>

      <p className='textBody'>Venha conhecer a farmacia da Márcia, sob nova direção dela mesmo.</p><br/>
      
      <img className="taylor-image"src="./images/tay swift.jpg" alt="" />

      <p className='textBodyTaylorS'>Taylor Swift, a patrocinadora da FarMárcia</p>

      <img className = "tshirt-image"src="./images/farmarcia-camisetas.PNG.png" alt="" />

      <p className='textBodyTaylorS'> A nossa camiseta!!!</p>

      </div>

      <div className='right-body'>

      <p className='textHistory'>Nossa historia: Márcia depois de comprar a farmácia de seu tio Mario, fez um rebranding na farmácia e mudou o seu nome para FarMárcia. Agora ela lhe convida para sua inauguração no dia 23 de agosto as 1h30.<br></br> E vai ter show da Taylor Swift cantando músicas que você cliente pedir.</p><br/>
       
       <button className='button-taylor'>Taylor Swift - The Eras Tour in FarMárcia</button>

      </div>

    </div>
    

    


  )

}

export default Body
