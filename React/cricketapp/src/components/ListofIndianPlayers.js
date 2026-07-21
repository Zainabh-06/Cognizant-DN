import React from "react";

export function ListofIndianPlayers(props) {
  return (
    <div>
      {props.IndianPlayers.map((player, index) => (
        <li key={index}>{player}</li>
      ))}
    </div>
  );
}