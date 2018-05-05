import React, { Component } from 'react';
import AppBar from 'material-ui/AppBar'
import FlatButton from 'material-ui/FlatButton'
import { DrawerUndocked } from './DrawerUndocked'
import { openDrawerAction, hideDrawerAction } from "../actions/DrawerActions";
import { connect } from 'react-redux';

class MainLayout extends Component {

    flatButton = () => {
        return (
            <FlatButton label="Sign up" onClick={this.handleToggle}/>
        );

    };

    render() {
        return (
            <div>
                <AppBar
                    title="Tasker"
                    iconElementRight={this.flatButton()}
                    onLeftIconButtonClick={() => this.props.openDrawer()}/>
                <DrawerUndocked open={this.props.drawerShown} onRequestChange={() => this.props.hideDrawer()}/>
            </div>
        )
    };
}

const mapDispatchToProps = (dispatch) => {
    return {
        openDrawer: () => {
            dispatch(openDrawerAction());
        },

        hideDrawer: () => {
            dispatch(hideDrawerAction());
        },
    }
};

const mapStateToProps = (state) => {
    console.log(state);
    return {
        drawerShown: state.someReducer.drawerShown
    };
};

export default connect(mapStateToProps, mapDispatchToProps)(MainLayout);