import { useState } from 'react';
import './App.css'

function App() {

  const [counter, setCounter] = useState(0);

  let count = 0;

  function treatClick(){

    count++;

    alert("Count: " + count)

  }

  function incrementState(){

    setCounter(counter + 1)
    
  }

  return (

    <>

      <h1>The New Button by Breno Souza</h1>
      <p>This is a new button</p>
      <button onClick = {treatClick}>Click</button>
      
      <div>

      {count}

      </div>

      <button onClick = {incrementState}>Increment State</button>

      <div>

        {counter}

      </div>
  
    </>

  )

}

export default App
