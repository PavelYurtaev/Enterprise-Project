import React, { Component } from 'react';
import logo from './logo.svg';
import 'whatwg-fetch';
import './App.css';

class App extends Component {
    handleSubmit = (event) => {
        event.preventDefault();
        let request = this.state.request.trim();
        if (!request) {
            return;
        }
        fetch(`/echo?request=${request}`)
            .then(response => {
                return response.text();
            })
            .then(body => {
                alert(body);
            });
    }
    

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to React</h1>
        </header>
          <div>
              <input type="submit" value="Echo" onClick={this.handleSubmit}/>
          </div>
      </div>
    );
  }
}


export default App;
