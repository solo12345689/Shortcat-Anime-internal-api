package app.notifee.core.model;

import android.os.Build;
import android.os.Bundle;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class NotificationAndroidPressActionModel {
    private Bundle mNotificationAndroidPressActionBundle;

    private NotificationAndroidPressActionModel(Bundle bundle) {
        this.mNotificationAndroidPressActionBundle = bundle;
    }

    public static NotificationAndroidPressActionModel fromBundle(Bundle bundle) {
        return new NotificationAndroidPressActionModel(bundle);
    }

    public String getId() {
        String string = this.mNotificationAndroidPressActionBundle.getString(DiagnosticsEntry.ID_KEY);
        Objects.requireNonNull(string);
        return string;
    }

    public String getLaunchActivity() {
        return this.mNotificationAndroidPressActionBundle.getString("launchActivity");
    }

    public int getLaunchActivityFlags() {
        int i10;
        if (!this.mNotificationAndroidPressActionBundle.containsKey("launchActivityFlags")) {
            return -1;
        }
        ArrayList<Integer> integerArrayList = this.mNotificationAndroidPressActionBundle.getIntegerArrayList("launchActivityFlags");
        Objects.requireNonNull(integerArrayList);
        int i11 = 0;
        for (int i12 = 0; i12 < integerArrayList.size(); i12++) {
            switch (integerArrayList.get(i12).intValue()) {
                case 0:
                    i10 = 1073741824;
                    i11 |= i10;
                    break;
                case 1:
                    i10 = 536870912;
                    i11 |= i10;
                    break;
                case 2:
                    i10 = 268435456;
                    i11 |= i10;
                    break;
                case 3:
                    i10 = 134217728;
                    i11 |= i10;
                    break;
                case 4:
                    i10 = 67108864;
                    i11 |= i10;
                    break;
                case 5:
                    i10 = 33554432;
                    i11 |= i10;
                    break;
                case 6:
                    i10 = 16777216;
                    i11 |= i10;
                    break;
                case 7:
                    i10 = 8388608;
                    i11 |= i10;
                    break;
                case 8:
                    i10 = 4194304;
                    i11 |= i10;
                    break;
                case 9:
                    i10 = 2097152;
                    i11 |= i10;
                    break;
                case 10:
                    i10 = 1048576;
                    i11 |= i10;
                    break;
                case 11:
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    i10 = 524288;
                    i11 |= i10;
                    break;
                case 13:
                    i10 = 262144;
                    i11 |= i10;
                    break;
                case 14:
                    i10 = 131072;
                    i11 |= i10;
                    break;
                case 15:
                    i10 = 65536;
                    i11 |= i10;
                    break;
                case 16:
                    i10 = 32768;
                    i11 |= i10;
                    break;
                case 17:
                    i10 = 16384;
                    i11 |= i10;
                    break;
                case 18:
                    i10 = 8192;
                    i11 |= i10;
                    break;
                case 19:
                    i10 = 4096;
                    i11 |= i10;
                    break;
                case 20:
                    if (Build.VERSION.SDK_INT >= 28) {
                        i10 = 2048;
                        i11 |= i10;
                    }
                    break;
            }
        }
        return i11;
    }

    public String getMainComponent() {
        return this.mNotificationAndroidPressActionBundle.getString("mainComponent");
    }

    public Bundle toBundle() {
        return (Bundle) this.mNotificationAndroidPressActionBundle.clone();
    }
}
