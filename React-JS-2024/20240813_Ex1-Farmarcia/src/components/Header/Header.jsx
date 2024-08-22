import React from 'react'
import './Header.css'
import Logo from '../Logo/Logo.jsx'


function Header() {
  return (

    <div className='header-container'>

      <Logo/>

      <h1 className='textHeader'>FarMárcia</h1>
    
      <p className='textHeaderProdutos'>Medicamentos</p>
      <p className='textHeaderProdutos'>Mamãe e seu bebê</p>
      <p className='textHeaderProdutos'>Produtos Intimos</p>
      <p className='textHeaderProdutos'>Sobre nós</p>

    </div>
    

  )

}

export default Header
