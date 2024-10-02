import React, { useState } from 'react';
import './GerenciadorSenhas.css';

const GerenciadorSenhas = () => {
    const [filaNormal, setFilaNormal] = useState([]);
    const [filaPreferencial, setFilaPreferencial] = useState([]);
    const [senhaChamada, setSenhaChamada] = useState(null);

    let contadorNormal = 1;
    let contadorPreferencial = 1;

    // Função para gerar senha Normal
    const gerarSenhaNormal = () => {
        setFilaNormal([...filaNormal, `N${contadorNormal}`]);
        contadorNormal++;
    };

    // Função para gerar senha Preferencial
    const gerarSenhaPreferencial = () => {
        setFilaPreferencial([...filaPreferencial, `P${contadorPreferencial}`]);
        contadorPreferencial++;
    };

    // Função para chamar a próxima senha
    const chamarProximaSenha = () => {
        if (filaPreferencial.length > 0) {
            const proximaSenha = filaPreferencial.shift();
            setSenhaChamada(proximaSenha);
            setFilaPreferencial([...filaPreferencial]);
        } else if (filaNormal.length > 0) {
            const proximaSenha = filaNormal.shift();
            setSenhaChamada(proximaSenha);
            setFilaNormal([...filaNormal]);
        } else {
            setSenhaChamada('Fila Vazia');
        }
    };

    return (
        <div className='gerenciador-senhas-container'>
            <h1>Sistema de Gestão de Senhas</h1>
            <button onClick={gerarSenhaNormal}>Gerar Senha Normal</button>
            <button onClick={gerarSenhaPreferencial}>Gerar Senha Preferencial</button>
            <button onClick={chamarProximaSenha}>Chamar Próxima Senha</button>
            <h2>Senha Chamada: {senhaChamada}</h2>
            <h3>{filaNormal.length || filaPreferencial.length ? 'Fila Não Vazia' : 'Fila Vazia'}</h3>
        </div>
    );
};

export default GerenciadorSenhas;
