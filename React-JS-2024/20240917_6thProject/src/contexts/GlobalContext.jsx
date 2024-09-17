import { createContext } from "react";

export const GlobalContext = createContext()

export const GlobalContextProvider = ({ children }) => {

    let usuarioLogado = 'Clara Wayland'

    return (
        <GlobalContext.Provider value={{usuarioLogado}}>
            {children}
        </GlobalContext.Provider>
    )
}