import React from 'react';
import Drawer from 'material-ui/Drawer';
import MenuItem from 'material-ui/MenuItem'
import PropTypes from 'prop-types';

export const DrawerUndocked = ({ onRequestChange, open }) => {

     return (
        <div>
            <Drawer
                docked={false} // shadowed other stuff
                width={200}
                open={open}
                onRequestChange={onRequestChange}>
                <MenuItem onClick={() => alert('Click1')}>Menu Item</MenuItem>
                <MenuItem onClick={() => alert('Click2')}>Menu Item 2</MenuItem>
            </Drawer>
        </div>
    );
};

DrawerUndocked.propTypes = {
    onRequestChange: PropTypes.func.isRequired,
    open: PropTypes.bool.isRequired
};