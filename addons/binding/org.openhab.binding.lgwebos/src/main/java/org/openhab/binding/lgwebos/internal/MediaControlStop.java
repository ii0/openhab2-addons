/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.lgwebos.internal;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.smarthome.core.types.Command;
import org.openhab.binding.lgwebos.handler.LGWebOSHandler;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.capability.MediaControl;

/**
 * Handles Media Control Command Stop.
 *
 * @author Sebastian Prehn - initial contribution
 */
@NonNullByDefault
public class MediaControlStop extends BaseChannelHandler<Void, Object> {

    private MediaControl getControl(ConnectableDevice device) {
        return device.getCapability(MediaControl.class);
    }

    @Override
    public void onReceiveCommand(@Nullable ConnectableDevice device, String channelId, LGWebOSHandler handler,
            Command command) {
        if (device == null) {
            return;
        }
        if (device.hasCapabilities(MediaControl.Stop)) {
            getControl(device).stop(getDefaultResponseListener());
        }
    }
}
