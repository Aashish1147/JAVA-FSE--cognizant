import React, { Component } from "react";

class Getuser extends Component {
  constructor() {
    super();

    this.state = {
      person: {},
      loading: true
    };
  }

  async componentDidMount() {
    const response = await fetch("https://api.randomuser.me/");
    const data = await response.json();

    this.setState({
      person: data.results[0],
      loading: false
    });
  }

  render() {
    if (this.state.loading) {
      return <h2>Loading...</h2>;
    }

    const { title, first } = this.state.person.name;
    const image = this.state.person.picture.large;

    return (
      <div className="container">
        <h1>
          {title} {first}
        </h1>

        <img src={image} alt="user" />
      </div>
    );
  }
}

export default Getuser;