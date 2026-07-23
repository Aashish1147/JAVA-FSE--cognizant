import { useState } from "react";

import Greeting from "./Greeting";
import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";

function App() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <div style={{ margin: "30px" }}>

      <Greeting isLoggedIn={isLoggedIn} />

      <br />

      {isLoggedIn ? (

        <LogoutButton
          onClick={() => setIsLoggedIn(false)}
        />

      ) : (

        <LoginButton
          onClick={() => setIsLoggedIn(true)}
        />

      )}

    </div>
  );
}

export default App;