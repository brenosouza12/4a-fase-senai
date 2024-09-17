import { useContext } from 'react'
import Navbar from '../components/Navbar'
import { GlobalContext } from '../contexts/GlobalContext'

function Home() {
    const { usuarioLogado, usuarios, setUsuarios } = useContext(GlobalContext)
    return (
        <div>
            <Navbar />
            <h1>Home</h1>
            Olá {usuarioLogado}
            <p>Hello World</p>
            <div>
                {
                    usuarios.map((usuario) => (
                        <div key={usuario.id}>
                            <p>Nome: {usuario.nome}</p>
                            <p>Email: {usuario.email}</p>
                            <p>{usuario.id}</p>
                        </div>
                    ))
                }
            </div>
        </div>

    )
}

export default Home