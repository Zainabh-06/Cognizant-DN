import React from "react";

import { ListofPlayers } from "./components/ListofPlayers";
import { Scorebelow70 } from "./components/Scorebelow70";

import {
  OddPlayers,
  EvenPlayers,
  IndianPlayers,
} from "./components/IndianPlayers";

import { ListofIndianPlayers } from "./components/ListofIndianPlayers";

function App() {

  const players = [
    { name: "Virat Kohli", score: 95 },
    { name: "Rohit Sharma", score: 82 },
    { name: "Shubman Gill", score: 45 },
    { name: "KL Rahul", score: 67 },
    { name: "Hardik Pandya", score: 72 },
    { name: "Ravindra Jadeja", score: 58 },
    { name: "R Ashwin", score: 76 },
    { name: "Jasprit Bumrah", score: 65 },
    { name: "Mohammed Shami", score: 69 },
    { name: "Mohammed Siraj", score: 55 },
    { name: "Kuldeep Yadav", score: 80 },
  ];

  const IndianTeam = [
    "Virat",
    "Rohit",
    "Gill",
    "Rahul",
    "Hardik",
    "Jadeja",
  ];

  var flag = true;      // Change to false for second output

  if (flag === true) {
    return (
      <div style={{ marginLeft: "20px" }}>
        <h1>List of Players</h1>

        <ListofPlayers players={players} />

        <hr />

        <h1>List of Players having Scores Less than 70</h1>

        <Scorebelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div style={{ marginLeft: "20px" }}>
        <h1>Indian Team</h1>

        <h2>Odd Players</h2>
        {OddPlayers(IndianTeam)}

        <hr />

        <h2>Even Players</h2>
        {EvenPlayers(IndianTeam)}

        <hr />

        <h2>List of Indian Players Merged</h2>

        <ListofIndianPlayers IndianPlayers={IndianPlayers} />
      </div>
    );
  }
}

export default App;