import React from "react";

class CountPeople extends React.Component {
  constructor() {
    super();

    this.state = {
      entrycount: 0,
      exitcount: 0,
    };
  }

  UpdateEntry = () => {
    this.setState({
      entrycount: this.state.entrycount + 1,
    });
  };

  UpdateExit = () => {
    this.setState({
      exitcount: this.state.exitcount + 1,
    });
  };

  render() {
    return (
      <div style={{ margin: "20px" }}>
        <h1>Mall Entry Counter</h1>

        <h3>People Entered : {this.state.entrycount}</h3>

        <button onClick={this.UpdateEntry}>
          Login
        </button>

        <br /><br />

        <h3>People Exited : {this.state.exitcount}</h3>

        <button onClick={this.UpdateExit}>
          Exit
        </button>
      </div>
    );
  }
}

export default CountPeople;