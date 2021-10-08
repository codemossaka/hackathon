import { Typography } from "@material-ui/core";
import wifi from "../static/wifi-router.png";
import arm from "../static/computer.png";
import lock from "../static/padlock.png";
import UserR from "./UserR";
import "./index.css";

type Scheme = { message: any };

function Scheme({ message }: Scheme) {
  const getUsers = (numberRoom: number) => {
    return (
      message &&
      message.map((item: any) => {
        if (item?.entry?.id === numberRoom) {
          return <UserR key={item.id} name={`${item?.user?.fullname}`} />;
        }
      })
    );
  };

  const armLocked = (idArm: number) => {
    let result = true;
    message &&
      message.forEach((element: any) => {
        if (element?.user?.arm?.id === idArm) {
          element?.user?.arm?.status === "logout"
            ? (result = true)
            : (result = false);
        }
      });
    return result;
  };

  return (
    <div className="scheme">
      <div className="scheme-root">
        <div className="scheme-room">
          <span className="scheme-arm">
            <img className="scheme-pc" src={arm} alt="arm" />
            {armLocked(1) && (
              <img className="scheme-lock" src={lock} alt="lock" />
            )}
          </span>
          <span className="scheme-arm">
            <img className="scheme-pc" src={arm} alt="arm" />
            {armLocked(2) && (
              <img className="scheme-lock" src={lock} alt="lock" />
            )}
          </span>
          <span className="scheme-man-container">{getUsers(4)}</span>
          <div className="scheme-door"></div>
          <span className="pulse">
            <img className="pulse-wifi" src={wifi} alt="wifi" />
          </span>
          <Typography className="scheme-txt" variant="h5">
            100B
          </Typography>
        </div>
        <div className="scheme-room">
          <div className="scheme-door"></div>
          <span className="scheme-man-container">{getUsers(3)}</span>
          <span className="scheme-arm">
            <img className="scheme-pc" src={arm} alt="arm" />
            {armLocked(3) && (
              <img className="scheme-lock" src={lock} alt="lock" />
            )}
          </span>
          <Typography className="scheme-txt" variant="h5">
            100A
          </Typography>
        </div>
        <div className="scheme-guest">
          <div className="scheme-door--guest"></div>
          <span className="scheme-man-container">{getUsers(1)}</span>
          <span className="pulse">
            <img className="pulse-wifi" src={wifi} alt="wifi" />
          </span>
          <Typography className="scheme-txt" variant="h5">
            guest area
          </Typography>
        </div>
      </div>
      <span className="scheme-man-container--lobby">{getUsers(2)}</span>
      <div className="scheme-auxiliary">
        <div className="scheme-room scheme-room--down">
          <div className="scheme-door--down"></div>
          <span className="scheme-man-container">{getUsers(6)}</span>
          <span className="pulse">
            <img className="pulse-wifi" src={wifi} alt="wifi" />
          </span>
          <span className="scheme-arm">
            <img className="scheme-pc" src={arm} alt="arm" />
            {armLocked(4) && (
              <img className="scheme-lock" src={lock} alt="lock" />
            )}
          </span>
          <Typography className="scheme-txt" variant="h5">
            100D
          </Typography>
        </div>
        <div className="scheme-room--shift">
          <div className="scheme-door--shift"></div>
          <span className="scheme-man-container">{getUsers(5)}</span>
          <span className="pulse">
            <img className="pulse-wifi" src={wifi} alt="wifi" />
          </span>
          <span className="scheme-arm">
            <img className="scheme-pc" src={arm} alt="arm" />
            {armLocked(5) && (
              <img className="scheme-lock" src={lock} alt="lock" />
            )}
          </span>
          <Typography className="scheme-txt" variant="h5">
            100C
          </Typography>
        </div>
      </div>
    </div>
  );
}

export default Scheme;
