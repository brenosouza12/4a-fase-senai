import React from 'react'
import './Header.css'
import Logo from '../Logo/Logo'

function Header() {
  return (

    <div className='header-container'>

      <Logo/>

      <div>

      <h1 className='textHeader'>Farmárcia</h1>

      </div>

      <p className='textHeader'>A nossa farmácia, mas conhecida em homenagem a sua nova dona, se chama Farmárcia.</p>

    </div>
    

  )

}

export default Header
