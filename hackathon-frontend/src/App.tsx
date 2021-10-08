import React, { useEffect, useState } from "react";
import logo from "./shield.png";
import VerifiedUserIcon from "@mui/icons-material/VerifiedUser";
import { Header, Scheme } from "./component";
import { useStompClien } from "./useStompClient";
import Alert from "@mui/material/Alert";
import Stack from "@mui/material/Stack";
import { AlertTitle, Collapse, IconButton } from "@mui/material";
import CloseIcon from "@mui/icons-material/Close";
import "./App.css";

function App() {
  const [message, disconnect] = useStompClien();
  const [open, setOpen] = useState(false);
  const [userWarning, setUserWarning] = useState(null);

  useEffect(() => {
    return () => disconnect();
  }, []);

  useEffect(() => {
    message &&
      message.forEach((element: any) => {
        element?.user?.arm?.router?.id !== element?.phoneRouter?.id &&
          setOpen(true);
        setUserWarning(element?.user?.fullname);
      });
  }, [message]);
  return (
    <div className="App">
      <Header />
      <section className="App-body">
        <Stack
          sx={{ width: "100%", position: "absolute", top: "5px", zIndex: 999 }}
          spacing={2}
        >
          <Collapse in={open}>
            <Alert
              severity="warning"
              action={
                <IconButton
                  aria-label="close"
                  color="inherit"
                  size="small"
                  onClick={() => {
                    setOpen(false);
                  }}
                >
                  <CloseIcon fontSize="inherit" />
                </IconButton>
              }
              sx={{ mb: 2 }}
            >
              {` Внимание! Нарушение должностной инструкции ${userWarning}!`}
            </Alert>
          </Collapse>
        </Stack>
        <Scheme message={message} />
      </section>
    </div>
  );
}

export default App;
