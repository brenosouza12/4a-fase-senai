import { useContext } from 'react'
import Navbar from '../components/Navbar'
import { GlobalContext } from '../contexts/GlobalContext'

function Home() {
    const { usuarioLogado } = useContext(GlobalContext)
    return (
        <div>
            <Navbar />
            <h1>Home</h1>
            {usuarioLogado}
            <p>Hello World</p>
        </div>
    )
}

export default Home