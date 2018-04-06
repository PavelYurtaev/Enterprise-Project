import initialState from '../store/initialState';
import { HIDE_DRAWER, OPEN_DRAWER } from "../actions/DrawerActions";

const DrawerReducer = (state=initialState, action) => {

    switch (action.type) {

        case OPEN_DRAWER:
            return Object.assign({}, state, { drawerShown: true });

        case HIDE_DRAWER:
            return Object.assign({}, state, { drawerShown: false });

        default:
            return state;
    }
};

export default DrawerReducer;