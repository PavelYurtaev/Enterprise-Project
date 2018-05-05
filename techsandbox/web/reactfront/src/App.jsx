import React, { Component } from 'react';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider'
import MuiThemeColor from './components/MuiThemeColor'
import MainLayout from "./components/MainLayout"

class App extends Component {

    render() {
        return (
            <MuiThemeProvider muiTheme={MuiThemeColor}>
                <MainLayout />
            </MuiThemeProvider>
        );
    }
}

export default App;
