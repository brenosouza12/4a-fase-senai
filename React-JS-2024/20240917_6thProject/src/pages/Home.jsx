import { useContext } from 'react'
import Navbar from '../components/Navbar'
import { GlobalContext } from '../contexts/GlobalContext'

function Home() {
    const { usuarioLogado, usuarios, setUsuarios } = useContext(GlobalContext)

    function adicionarUsuario(){

        let usuario = {

            id: Date.now(),
            nome: "Alice Bell",
            email: "aliceB23@gmail.com"
        }
        setUsuarios({...usuarios,usuario})
    }
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

            <div>
                <button onClick={adicionarUsuario}>Adicionar Usuario</button>
            </div>
        </div>

    )
}

export default Home