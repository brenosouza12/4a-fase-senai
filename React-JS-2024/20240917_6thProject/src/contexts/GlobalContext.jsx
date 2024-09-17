import { createContext, useState } from "react";

export const GlobalContext = createContext()

export const GlobalContextProvider = ({ children }) => {

    let usuarioLogado = 'Clara Wayland'
    const [usuarios, setUsuarios] = useState([

        {
            id: Date.now(),
            nome: 'Elizabeth Lindemann'
            , email: 'lizzielind@gmail.com.br'

        },

        {
            id: Date.now()+ 1,
            nome: 'Elizabeth Spectrum'
            , email: 'lizziespk12@gmail.com.br'

        }
    ])

    return (
        <GlobalContext.Provider value={{ usuarioLogado, usuarios, setUsuarios }}>
            {children}
        </GlobalContext.Provider>
    )
}