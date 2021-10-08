import React, { useEffect, useCallback, useState } from "react";
import SockJS from "sockjs-client";
import * as StompJs from "@stomp/stompjs";

interface StompClien {
  message: any;
  connect: () => void;
  disconnect: () => void;
}

export const useStompClien = (): any => {
  const baseUrl = "http://godsonpeya.ru:8080/ws";
  let stompClient: any = null;
  const [message, setMessage] = useState(null);
  // connect
  useEffect(() => {
    connect();
  }, []);
  const connect = () => {
    const socket = new SockJS(baseUrl);
    stompClient = StompJs.Stomp.over(socket);
    stompClient.connect({}, function (frame: any) {
      console.log("Connected: " + frame);
      stompClient.subscribe("/topic/userEvent", function (message: any) {
        const data = JSON.parse(message.body);
        console.log("messages", data);
        setMessage(data);
      });
    });
  };

  function sendName(name: any) {
    stompClient.send("/app/door", {}, JSON.stringify(name));
  }

  const disconnect = () => {
    if (stompClient !== null) {
      stompClient.disconnect();
    }
    console.log("Disconnected");
  };
  return [message, disconnect, sendName];
};
