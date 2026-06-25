package Jc;

import android.app.NotificationChannel;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class c implements e {
    private Bundle d(AudioAttributes audioAttributes) {
        if (audioAttributes == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("usage", Mc.b.c(audioAttributes.getUsage()).h());
        bundle.putInt("contentType", Mc.a.c(audioAttributes.getContentType()).h());
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("requestHardwareAudioVideoSynchronization", (audioAttributes.getFlags() & 16) > 0);
        bundle2.putBoolean("enforceAudibility", (audioAttributes.getFlags() & 1) > 0);
        bundle.putBundle("flags", bundle2);
        return bundle;
    }

    private String e(Uri uri) {
        if (uri == null) {
            return null;
        }
        return Settings.System.DEFAULT_NOTIFICATION_URI.equals(uri) ? "default" : "custom";
    }

    @Override // Jc.e
    public Bundle a(NotificationChannel notificationChannel) {
        Bundle bundle = new Bundle();
        bundle.putString(DiagnosticsEntry.ID_KEY, b(notificationChannel));
        bundle.putString("name", notificationChannel.getName().toString());
        bundle.putInt("importance", Mc.c.c(notificationChannel.getImportance()).h());
        bundle.putBoolean("bypassDnd", notificationChannel.canBypassDnd());
        bundle.putString(com.amazon.a.a.o.b.f34645c, notificationChannel.getDescription());
        bundle.putString("groupId", c(notificationChannel));
        bundle.putString("lightColor", String.format("#%08x", Integer.valueOf(Color.valueOf(notificationChannel.getLightColor()).toArgb())).toUpperCase());
        bundle.putInt("lockscreenVisibility", Mc.e.c(notificationChannel.getLockscreenVisibility()).h());
        bundle.putBoolean("showBadge", notificationChannel.canShowBadge());
        bundle.putString("sound", e(notificationChannel.getSound()));
        bundle.putBundle("audioAttributes", d(notificationChannel.getAudioAttributes()));
        bundle.putLongArray("vibrationPattern", notificationChannel.getVibrationPattern());
        bundle.putBoolean("enableLights", notificationChannel.shouldShowLights());
        bundle.putBoolean("enableVibrate", notificationChannel.shouldVibrate());
        return bundle;
    }

    protected String b(NotificationChannel notificationChannel) {
        return notificationChannel.getId();
    }

    protected String c(NotificationChannel notificationChannel) {
        return notificationChannel.getGroup();
    }
}
