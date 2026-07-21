import React, { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {
  const [count, setCount] = useState(0);

  // Increment counter
  const increment = () => {
    setCount(count + 1);
  };

  // Decrement counter
  const decrement = () => {
    setCount(count - 1);
  };

  // Say Hello
  const sayHello = () => {
    alert("Hello! Member 1.");
  };

  // Multiple methods
  const handleIncrement = () => {
    increment();
    sayHello();
  };

  // Welcome function
  const welcome = (msg) => {
    alert(msg);
  };

  // Synthetic Event
  const onPress = () => {
    alert("I was clicked");
  };

  return (
    <div style={{ padding: "20px" }}>
      <h3>{count}</h3>

      <button onClick={handleIncrement}>Increment</button>
      <br /><br />

      <button onClick={decrement}>Decrement</button>
      <br /><br />

      <button onClick={() => welcome("Welcome")}>
        Say Welcome
      </button>
      <br /><br />

      <button onClick={onPress}>
        Click on me
      </button>

      <br /><br />

      <CurrencyConvertor />
    </div>
  );
}

export default App;