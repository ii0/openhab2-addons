/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.somfytahoma.internal.model;

import java.util.ArrayList;

/**
 * The {@link SomfyTahomaAction} holds information about a list of
 * commands for one concrete device.
 *
 * @author Ondrej Pecta - Initial contribution
 */
public class SomfyTahomaAction {

    private String deviceURL;
    private ArrayList<SomfyTahomaCommand> commands = new ArrayList<SomfyTahomaCommand>();

    public String getDeviceURL() {
        return deviceURL;
    }

    public void setDeviceURL(String deviceURL) {
        this.deviceURL = deviceURL;
    }

    public ArrayList<SomfyTahomaCommand> getCommands() {
        return commands;
    }

    public void addCommand(SomfyTahomaCommand command) {
        this.commands.add(command);
    }
}
