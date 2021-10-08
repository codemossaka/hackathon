import { Typography } from "@material-ui/core";
import logo from "../static/shield.png";
import VerifiedUserIcon from "@mui/icons-material/VerifiedUser";

import "./index.css";

function Header() {
  return (
    <header className="header">
      <img className="header-logo" src={logo} alt="Logo" />
      <Typography className="header-title" variant="h5">
        #dom_shield
      </Typography>
    </header>
  );
}

export default Header;
