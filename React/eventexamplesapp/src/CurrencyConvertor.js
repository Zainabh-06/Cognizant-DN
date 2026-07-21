import React, { useState } from "react";

function CurrencyConvertor() {
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("Euro");

  const handleSubmit = (e) => {
    e.preventDefault();

    // 1 Euro = 80 INR
    const euroAmount = amount * 80;

    alert(`Converting to ${currency} Amount is ${euroAmount}`);
  };

  return (
    <div>
      <h1 style={{ color: "green" }}>
        Currency Convertor!!!
      </h1>

      <form onSubmit={handleSubmit}>
        <table>
          <tbody>
            <tr>
              <td>Amount:</td>
              <td>
                <input
                  type="number"
                  value={amount}
                  onChange={(e) => setAmount(e.target.value)}
                />
              </td>
            </tr>

            <tr>
              <td>Currency:</td>
              <td>
                <select
                  value={currency}
                  onChange={(e) => setCurrency(e.target.value)}
                >
                  <option>Euro</option>
                </select>
              </td>
            </tr>

            <tr>
              <td></td>
              <td>
                <button type="submit">
                  Submit
                </button>
              </td>
            </tr>
          </tbody>
        </table>
      </form>
    </div>
  );
}

export default CurrencyConvertor;