import React from "react";
import "./App.css";

function App() {

  const element = "Office Space";

  const sr = "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=600";

  const jsxatt = (
    <img
      src={sr}
      width="25%"
      height="25%"
      alt="Office Space"
    />
  );

 const ItemName = {
  Name: "DBS",
  Rent: 50000,
  Address: "Chennai"
};

const officeList = [
  {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  },
  {
    Name: "Regus",
    Rent: 70000,
    Address: "Bangalore"
  },
  {
    Name: "WeWork",
    Rent: 85000,
    Address: "Hyderabad"
  }
];

let colors = [];

  if (ItemName.Rent <= 60000) {
    colors.push("textRed");
  } else {
    colors.push("textGreen");
  }

  return (
    <div className="App">
      <h1>{element}, at Affordable Range</h1>

      {jsxatt}

      <h1>Name: {ItemName.Name}</h1>

      <h3 className={colors[0]}>
        Rent Rs. {ItemName.Rent}
      </h3>

      <h3>Address: {ItemName.Address}</h3>
      <hr />

{officeList.map((office, index) => (
  <div key={index}>
    <h2>Name: {office.Name}</h2>

    <h3 className={office.Rent <= 60000 ? "textRed" : "textGreen"}>
      Rent Rs. {office.Rent}
    </h3>

    <h3>Address: {office.Address}</h3>

    <hr />
  </div>
))}
    </div>
  );
}

export default App;