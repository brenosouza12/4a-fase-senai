import React from 'react'
import './Contents.css'
import { Cat } from './Navbar/Cat'

function Contents() {
    
  return (

    <div className='contents-container'>

      <Cat/>
      
      <img className= 'imagem-conteudo'src="./images/tay swift.jpg" alt="Taylor Swift, a industria" />

      <p>

      Taylor Alison Swift é uma cantora, compositora, diretora e roteirista americana. <br />
      Suas composições narrativas, muitas vezes inspiradas pelas suas experiências pessoais, têm recebido ampla cobertura mediática e elogios de críticos.
        
      </p>

    </div>

  )

}

export default Contents
