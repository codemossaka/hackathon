import { type } from "os";
import man from "../static/man.png";
import { Typography } from "@material-ui/core";

import "./index.css";

type UserR = { name: string };

function UserR({ name }: UserR) {
  return (
    <div
      style={{
        display: "flex",
        flexDirection: "column",
        alignItems: "center",
        margin: 3,
      }}
    >
      <Typography variant="caption">{name}</Typography>
      <img className="scheme-man scheme-man--position" src={man} alt="man" />
    </div>
  );
}

export default UserR;
