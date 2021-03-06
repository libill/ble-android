/*******************************************************************************
 * Copyright (c) 2013 Nordic Semiconductor. All Rights Reserved.
 * 
 * The information contained herein is property of Nordic Semiconductor ASA.
 * Terms and conditions of usage are described in detail in NORDIC SEMICONDUCTOR STANDARD SOFTWARE LICENSE AGREEMENT.
 * Licensees are granted free, non-transferable use of the information. NO WARRANTY of ANY KIND is provided. 
 * This heading must NOT be removed from the file.
 ******************************************************************************/
package no.nordicsemi.android.nrftoolbox.csc;

import no.nordicsemi.android.nrftoolbox.profile.BleManagerCallbacks;

public interface CSCManagerCallbacks extends BleManagerCallbacks {
	public static final int NOT_AVAILABLE = -1;

	public void onWheelMeasurementReceived(final int wheelRevolutions, final int wheelCrankEventTime);

	public void onCrankMeasurementReceived(final int crankRevolutions, final int lastCrankEventTime);
}
