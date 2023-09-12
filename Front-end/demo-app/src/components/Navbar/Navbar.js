import React from "react";
import { Link } from "react-router-dom";
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import IconButton from '@mui/material/IconButton';
import MenuIcon from '@mui/icons-material/Menu';
import "./Navbar.scss";

function Navbar()
{
   // sx={{ flexGrow: 1}}
    let userId=5;
    return(


        <div>

<Box sx={{ flexGrow: 1}} >
      <AppBar  position="static" style={{ background: '#2E3B55' }}>
        <Toolbar>
          <IconButton
            size="large"
            edge="start"
            color="inherit"
            aria-label="menu"
            sx={{ mr: 2 }}
          >
            <MenuIcon />
          </IconButton>
          <Typography variant="h6" component="div"  sx={{ flexGrow: 1}} className="navbarContainer">
            
            <Link className="navbarContainer" to="/"> Home</Link>
          </Typography>
          <Typography variant="h6" component="div"  className="navbarUserContainer">
          <Link className="navbarUserContainer"  to={{pathname : '/users/'+userId}}> User</Link>
          </Typography>
        </Toolbar>
      </AppBar>
    </Box>

            <ul>

                
               

            </ul>


        </div>

    )



}


export default Navbar;