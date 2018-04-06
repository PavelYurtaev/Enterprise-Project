import React from 'react';
import ReactDOM from 'react-dom';
import './styles/index.css';
import App from './App';
import injectTapEventPlugin from 'react-tap-event-plugin';
import { BrowserRouter, Route } from 'react-router-dom';
import { Provider } from 'react-redux';
import { createStore } from 'redux';
import { mainReducer } from "./reducers/MainReducer";

injectTapEventPlugin();

const store = createStore(mainReducer);

ReactDOM.render(
    <Provider store={store}>
        <BrowserRouter>
            <Route path="/" component={App}/>
        </BrowserRouter>
    </Provider>,
    document.getElementById('root'));





