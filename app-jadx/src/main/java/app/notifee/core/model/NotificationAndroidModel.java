package app.notifee.core.model;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import app.notifee.core.Logger;
import cg.q;
import cg.s;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class NotificationAndroidModel {
    private static final String TAG = "NotificationAndroidModel";
    private Bundle mNotificationAndroidBundle;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f33011a;

        /* JADX INFO: renamed from: b */
        public int f33012b;

        /* JADX INFO: renamed from: c */
        public boolean f33013c;

        public a(int i10, int i11, boolean z10) {
            this.f33011a = i10;
            this.f33012b = i11;
            this.f33013c = z10;
        }
    }

    private NotificationAndroidModel(Bundle bundle) {
        this.mNotificationAndroidBundle = bundle;
    }

    public static NotificationAndroidModel fromBundle(Bundle bundle) {
        return new NotificationAndroidModel(bundle);
    }

    public ArrayList<NotificationAndroidActionModel> getActions() {
        if (!this.mNotificationAndroidBundle.containsKey("actions")) {
            return null;
        }
        ArrayList parcelableArrayList = this.mNotificationAndroidBundle.getParcelableArrayList("actions");
        Objects.requireNonNull(parcelableArrayList);
        ArrayList<NotificationAndroidActionModel> arrayList = new ArrayList<>(parcelableArrayList.size());
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(NotificationAndroidActionModel.fromBundle((Bundle) it.next()));
        }
        return arrayList;
    }

    public Boolean getAsForegroundService() {
        return Boolean.valueOf(this.mNotificationAndroidBundle.getBoolean("asForegroundService", false));
    }

    public Boolean getAutoCancel() {
        return Boolean.valueOf(this.mNotificationAndroidBundle.getBoolean("autoCancel", false));
    }

    public Integer getBadgeIconType() {
        if (this.mNotificationAndroidBundle.containsKey("badgeIconType")) {
            return Integer.valueOf(q.a(this.mNotificationAndroidBundle.get("badgeIconType")));
        }
        return 2;
    }

    public String getCategory() {
        return this.mNotificationAndroidBundle.getString("category");
    }

    public String getChannelId() {
        if (!this.mNotificationAndroidBundle.containsKey("channelId")) {
            return "";
        }
        String string = this.mNotificationAndroidBundle.getString("channelId");
        Objects.requireNonNull(string);
        return string;
    }

    public Boolean getChronometerCountDown() {
        if (!this.mNotificationAndroidBundle.containsKey("chronometerDirection")) {
            return Boolean.FALSE;
        }
        String string = this.mNotificationAndroidBundle.getString("chronometerDirection");
        return Boolean.valueOf(string != null && string.equals("down"));
    }

    public Boolean getCircularLargeIcon() {
        return Boolean.valueOf(this.mNotificationAndroidBundle.getBoolean("circularLargeIcon", false));
    }

    public Integer getColor() {
        if (this.mNotificationAndroidBundle.containsKey("color")) {
            return Integer.valueOf(Color.parseColor(this.mNotificationAndroidBundle.getString("color")));
        }
        return null;
    }

    public Boolean getColorized() {
        return Boolean.valueOf(this.mNotificationAndroidBundle.getBoolean("colorized", false));
    }

    public Integer getDefaults(Boolean bool) {
        Integer numValueOf;
        if (this.mNotificationAndroidBundle.containsKey("defaults")) {
            ArrayList<Integer> integerArrayList = this.mNotificationAndroidBundle.getIntegerArrayList("defaults");
            Objects.requireNonNull(integerArrayList);
            numValueOf = null;
            for (Integer num : integerArrayList) {
                numValueOf = numValueOf == null ? num : Integer.valueOf(numValueOf.intValue() | num.intValue());
            }
        } else {
            numValueOf = -1;
        }
        if (bool.booleanValue()) {
            numValueOf = Integer.valueOf(numValueOf.intValue() & (-2));
        }
        if (!this.mNotificationAndroidBundle.containsKey("vibrationPattern")) {
            numValueOf = Integer.valueOf(numValueOf.intValue() & (-3));
        }
        return this.mNotificationAndroidBundle.containsKey("lights") ? Integer.valueOf(numValueOf.intValue() & (-5)) : numValueOf;
    }

    public int[] getFlags() {
        if (!this.mNotificationAndroidBundle.containsKey("flags")) {
            return null;
        }
        ArrayList parcelableArrayList = this.mNotificationAndroidBundle.getParcelableArrayList("flags");
        Objects.requireNonNull(parcelableArrayList);
        int[] iArr = new int[parcelableArrayList.size()];
        for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
            iArr[i10] = q.a(parcelableArrayList.get(i10));
        }
        return iArr;
    }

    public int getForegroundServiceType() {
        if (!this.mNotificationAndroidBundle.containsKey("foregroundServiceTypes")) {
            return -1;
        }
        ArrayList parcelableArrayList = this.mNotificationAndroidBundle.getParcelableArrayList("foregroundServiceTypes");
        Objects.requireNonNull(parcelableArrayList);
        int iA = 0;
        for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
            iA |= q.a(parcelableArrayList.get(i10));
        }
        if (Build.VERSION.SDK_INT < 34 || iA != 0) {
            return iA;
        }
        return -1;
    }

    public NotificationAndroidPressActionModel getFullScreenAction() {
        if (hasFullScreenAction().booleanValue()) {
            return NotificationAndroidPressActionModel.fromBundle(this.mNotificationAndroidBundle.getBundle("fullScreenAction"));
        }
        return null;
    }

    public String getGroup() {
        return this.mNotificationAndroidBundle.getString("groupId");
    }

    public int getGroupAlertBehaviour() {
        if (this.mNotificationAndroidBundle.containsKey("groupAlertBehavior")) {
            return q.a(this.mNotificationAndroidBundle.get("groupAlertBehavior"));
        }
        return 0;
    }

    public Boolean getGroupSummary() {
        return Boolean.valueOf(this.mNotificationAndroidBundle.getBoolean("groupSummary", false));
    }

    public CharSequence[] getInputHistory() {
        if (!this.mNotificationAndroidBundle.containsKey("inputHistory")) {
            return null;
        }
        ArrayList<String> stringArrayList = this.mNotificationAndroidBundle.getStringArrayList("inputHistory");
        Objects.requireNonNull(stringArrayList);
        return (CharSequence[]) stringArrayList.toArray(new CharSequence[stringArrayList.size()]);
    }

    public String getLargeIcon() {
        if (!hasLargeIcon().booleanValue()) {
            return null;
        }
        String string = this.mNotificationAndroidBundle.getString("largeIcon");
        Objects.requireNonNull(string);
        return string;
    }

    public Boolean getLightUpScreen() {
        return Boolean.valueOf(this.mNotificationAndroidBundle.getBoolean("lightUpScreen", false));
    }

    public ArrayList<Integer> getLights() {
        if (this.mNotificationAndroidBundle.containsKey("lights")) {
            try {
                ArrayList parcelableArrayList = this.mNotificationAndroidBundle.getParcelableArrayList("lights");
                Objects.requireNonNull(parcelableArrayList);
                String str = (String) parcelableArrayList.get(0);
                ArrayList<Integer> arrayList = new ArrayList<>(3);
                arrayList.add(Integer.valueOf(Color.parseColor(str)));
                arrayList.add((Integer) parcelableArrayList.get(1));
                arrayList.add((Integer) parcelableArrayList.get(2));
                return arrayList;
            } catch (Exception unused) {
                Logger.e(TAG, "getLights -> Failed to parse lights");
            }
        }
        return null;
    }

    public Boolean getLocalOnly() {
        return Boolean.valueOf(this.mNotificationAndroidBundle.getBoolean("localOnly", false));
    }

    public Boolean getLoopSound() {
        return Boolean.valueOf(this.mNotificationAndroidBundle.getBoolean("loopSound", false));
    }

    public Integer getNumber() {
        if (this.mNotificationAndroidBundle.containsKey("badgeCount")) {
            return Integer.valueOf(q.a(this.mNotificationAndroidBundle.get("badgeCount")));
        }
        return null;
    }

    public Boolean getOngoing() {
        return Boolean.valueOf(this.mNotificationAndroidBundle.getBoolean("ongoing", false));
    }

    public Boolean getOnlyAlertOnce() {
        return Boolean.valueOf(this.mNotificationAndroidBundle.getBoolean("onlyAlertOnce", false));
    }

    public Bundle getPressAction() {
        return this.mNotificationAndroidBundle.getBundle("pressAction");
    }

    public int getPriority() {
        if (!this.mNotificationAndroidBundle.containsKey("importance")) {
            return 0;
        }
        int iA = q.a(this.mNotificationAndroidBundle.get("importance"));
        if (iA == 0) {
            return -2;
        }
        if (iA != 1) {
            return iA != 4 ? 0 : 1;
        }
        return -1;
    }

    public a getProgress() {
        if (!this.mNotificationAndroidBundle.containsKey(ReactProgressBarViewManager.PROP_PROGRESS)) {
            return null;
        }
        Bundle bundle = this.mNotificationAndroidBundle.getBundle(ReactProgressBarViewManager.PROP_PROGRESS);
        Objects.requireNonNull(bundle);
        return new a(q.a(bundle.get("max")), q.a(bundle.get("current")), bundle.getBoolean(ReactProgressBarViewManager.PROP_INDETERMINATE, false));
    }

    public String getShortcutId() {
        return this.mNotificationAndroidBundle.getString("shortcutId");
    }

    public Boolean getShowChronometer() {
        return Boolean.valueOf(this.mNotificationAndroidBundle.getBoolean("showChronometer", false));
    }

    public Boolean getShowTimestamp() {
        return Boolean.valueOf(this.mNotificationAndroidBundle.getBoolean("showTimestamp", false));
    }

    public Integer getSmallIcon() {
        if (!this.mNotificationAndroidBundle.containsKey("smallIcon")) {
            return null;
        }
        String string = this.mNotificationAndroidBundle.getString("smallIcon");
        int iA = s.a(string, "mipmap");
        if (iA == 0) {
            iA = s.a(string, "drawable");
        }
        if (iA != 0) {
            return Integer.valueOf(iA);
        }
        Logger.d(TAG, String.format("Notification small icon '%s' could not be found", string));
        return null;
    }

    public Integer getSmallIconLevel() {
        if (this.mNotificationAndroidBundle.containsKey("smallIconLevel")) {
            return Integer.valueOf(this.mNotificationAndroidBundle.getInt("smallIconLevel"));
        }
        return null;
    }

    public String getSortKey() {
        return this.mNotificationAndroidBundle.getString("sortKey");
    }

    public String getSound() {
        if (this.mNotificationAndroidBundle.containsKey("sound")) {
            return this.mNotificationAndroidBundle.getString("sound");
        }
        return null;
    }

    public NotificationAndroidStyleModel getStyle() {
        if (hasStyle().booleanValue()) {
            return NotificationAndroidStyleModel.fromBundle(this.mNotificationAndroidBundle.getBundle("style"));
        }
        return null;
    }

    public String getTag() {
        return this.mNotificationAndroidBundle.getString("tag");
    }

    public String getTicker() {
        return this.mNotificationAndroidBundle.getString("ticker");
    }

    public Long getTimeoutAfter() {
        if (this.mNotificationAndroidBundle.containsKey("timeoutAfter")) {
            return Long.valueOf(q.d(this.mNotificationAndroidBundle.get("timeoutAfter")));
        }
        return null;
    }

    public long getTimestamp() {
        if (this.mNotificationAndroidBundle.containsKey(DiagnosticsEntry.TIMESTAMP_KEY)) {
            return q.d(this.mNotificationAndroidBundle.get(DiagnosticsEntry.TIMESTAMP_KEY));
        }
        return -1L;
    }

    public long[] getVibrationPattern() {
        if (!this.mNotificationAndroidBundle.containsKey("vibrationPattern")) {
            return new long[0];
        }
        ArrayList parcelableArrayList = this.mNotificationAndroidBundle.getParcelableArrayList("vibrationPattern");
        Objects.requireNonNull(parcelableArrayList);
        long[] jArr = new long[parcelableArrayList.size()];
        for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
            jArr[i10] = ((Integer) parcelableArrayList.get(i10)).longValue();
        }
        return jArr;
    }

    public int getVisibility() {
        if (this.mNotificationAndroidBundle.containsKey("visibility")) {
            return q.a(this.mNotificationAndroidBundle.get("visibility"));
        }
        return 0;
    }

    public Boolean hasFullScreenAction() {
        return Boolean.valueOf(this.mNotificationAndroidBundle.containsKey("fullScreenAction"));
    }

    public Boolean hasLargeIcon() {
        return Boolean.valueOf(this.mNotificationAndroidBundle.containsKey("largeIcon"));
    }

    public Boolean hasStyle() {
        return Boolean.valueOf(this.mNotificationAndroidBundle.containsKey("style"));
    }
}
