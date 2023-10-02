/*
 * Copyright (C) 2018-2021 Velocity Contributors
 *
 * The Velocity API is licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in the api top-level directory.
 */

package com.velocitypowered.api.event.connection;

import com.velocitypowered.api.proxy.InboundConnection;

/**
 * This event is fired when a player pings the server.
 */
public final class StatusPingEvent {

  private final InboundConnection connection;
  private final long randomId;

  public StatusPingEvent(InboundConnection connection, long randomId) {
    this.connection = connection;
    this.randomId = randomId;
  }

  public InboundConnection getConnection() {
    return connection;
  }

  public long getRandomId() {
    return randomId;
  }

  @Override
  public String toString() {
    return "StatusPingEvent{"
        + "connection=" + connection
        + '}';
  }

}
