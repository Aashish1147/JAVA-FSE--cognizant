function ListofPlayers() {
  const players = [
    { name: "Virat", score: 95 },
    { name: "Rohit", score: 82 },
    { name: "Gill", score: 68 },
    { name: "KL Rahul", score: 72 },
    { name: "Pant", score: 65 },
    { name: "Hardik", score: 88 },
    { name: "Jadeja", score: 60 },
    { name: "Ashwin", score: 75 },
    { name: "Bumrah", score: 55 },
    { name: "Shami", score: 78 },
    { name: "Siraj", score: 50 }
  ];

  const below70 = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>List of Players</h2>

      <table border="1" cellPadding="8">
        <thead>
          <tr>
            <th>Name</th>
            <th>Score</th>
          </tr>
        </thead>

        <tbody>
          {players.map((player, index) => (
            <tr key={index}>
              <td>{player.name}</td>
              <td>{player.score}</td>
            </tr>
          ))}
        </tbody>
      </table>

      <h2>Players with Score Below 70</h2>

      <ul>
        {below70.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;