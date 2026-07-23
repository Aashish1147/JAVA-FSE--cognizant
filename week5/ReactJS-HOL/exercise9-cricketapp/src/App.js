import ListofPlayers from "./ListofPlayers";
import IndianPlayers from "./IndianPlayers";

function App() {
  const flag = true;

  return (
    <div style={{ margin: "20px" }}>
      <h1>Cricket App</h1>

      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;