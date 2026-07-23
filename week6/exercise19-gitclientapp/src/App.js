import "./App.css";
import { useEffect, useState } from "react";
import GitClient from "./GitClient";

function App() {
  const [repos, setRepos] = useState([]);

  useEffect(() => {
    GitClient.getRepositories("techiesyed")
      .then(res => setRepos(res.data));
  }, []);

  return (
    <div className="App">
      <h2>Git repositories of User - TechieSyed</h2>

      {repos.map(repo => (
        <p key={repo.id}>{repo.name}</p>
      ))}
    </div>
  );
}

export default App;