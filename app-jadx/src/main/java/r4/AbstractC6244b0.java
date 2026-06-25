package r4;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import app.notifee.core.Logger;
import app.notifee.core.Notifee;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: r4.b0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6244b0 {
    public static Bundle a(NotificationChannel notificationChannel) {
        String strReplace = null;
        if (notificationChannel == null || Build.VERSION.SDK_INT < 26) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(DiagnosticsEntry.ID_KEY, notificationChannel.getId());
        bundle.putString("name", notificationChannel.getName().toString());
        bundle.putBoolean("badge", notificationChannel.canShowBadge());
        bundle.putBoolean("bypassDnd", notificationChannel.canBypassDnd());
        if (notificationChannel.getDescription() != null) {
            bundle.putString(com.amazon.a.a.o.b.f34645c, notificationChannel.getDescription());
        }
        if (notificationChannel.getGroup() != null) {
            bundle.putString("groupId", notificationChannel.getGroup());
        }
        bundle.putInt("importance", notificationChannel.getImportance());
        bundle.putBoolean("lights", notificationChannel.shouldShowLights());
        bundle.putBoolean("vibration", notificationChannel.shouldVibrate());
        bundle.putBoolean("blocked", notificationChannel.getImportance() == 0);
        if (notificationChannel.getSound() != null) {
            bundle.putString("soundURI", notificationChannel.getSound().toString());
            Uri sound = notificationChannel.getSound();
            if (sound != null && sound.toString().contains("android.resource")) {
                String lastPathSegment = sound.getLastPathSegment();
                try {
                    int iIntValue = Integer.valueOf(lastPathSegment).intValue();
                    Logger.e("ResourceUtils", "Loaded sound by resource id. New app builds will fail to play sound. Create a new channel to resolve. Issue #341");
                    if (iIntValue != 0) {
                        TypedValue typedValue = new TypedValue();
                        cg.f.f33622a.getResources().getValue(iIntValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        if (charSequence != null || charSequence.length() > 0) {
                            strReplace = charSequence.toString().replace("res/raw/", "");
                        }
                    }
                } catch (NumberFormatException unused) {
                    strReplace = lastPathSegment;
                }
            }
            if (strReplace != null) {
                bundle.putString("sound", strReplace);
            }
        }
        if (notificationChannel.getLightColor() != 0) {
            int lightColor = notificationChannel.getLightColor();
            String str = (String) cg.e.f33621a.get(Integer.valueOf(lightColor));
            if (str == null) {
                str = "#" + Integer.toHexString(lightColor).substring(2);
            }
            bundle.putString("lightColor", str);
        }
        long[] vibrationPattern = notificationChannel.getVibrationPattern();
        if (vibrationPattern != null && vibrationPattern.length > 0) {
            try {
                int[] iArr = new int[vibrationPattern.length];
                for (int i10 = 0; i10 < vibrationPattern.length; i10++) {
                    iArr[i10] = (int) vibrationPattern[i10];
                }
                bundle.putIntArray("vibrationPattern", iArr);
            } catch (Exception e10) {
                Logger.e("ChannelManager", "Unable to convert Vibration Pattern to Channel Bundle", e10);
            }
        }
        int lockscreenVisibility = notificationChannel.getLockscreenVisibility();
        if (lockscreenVisibility != -1000) {
            bundle.putInt("visibility", lockscreenVisibility);
        }
        return bundle;
    }

    public static Bundle b(NotificationChannelGroup notificationChannelGroup) {
        if (notificationChannelGroup == null || Build.VERSION.SDK_INT < 26) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(DiagnosticsEntry.ID_KEY, notificationChannelGroup.getId());
        bundle.putString("name", notificationChannelGroup.getName().toString());
        List channels = notificationChannelGroup.getChannels();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(channels.size());
        Iterator it = channels.iterator();
        while (it.hasNext()) {
            arrayList.add(a(N.a(it.next())));
        }
        bundle.putParcelableArrayList("channels", arrayList);
        if (Build.VERSION.SDK_INT < 28) {
            bundle.putBoolean("blocked", false);
            return bundle;
        }
        bundle.putBoolean("blocked", notificationChannelGroup.isBlocked());
        bundle.putString(com.amazon.a.a.o.b.f34645c, notificationChannelGroup.getDescription());
        return bundle;
    }

    public static com.google.common.util.concurrent.p c() {
        return Notifee.getListeningExecutorService().submit(new Callable() { // from class: r4.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC6244b0.o();
            }
        });
    }

    public static com.google.common.util.concurrent.p d(final cg.c cVar) {
        return Notifee.getListeningExecutorService().submit(new Callable() { // from class: r4.X
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC6244b0.k(cVar);
            }
        });
    }

    public static com.google.common.util.concurrent.p e(final cg.d dVar) {
        return Notifee.getListeningExecutorService().submit(new Callable() { // from class: r4.W
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC6244b0.l(dVar);
            }
        });
    }

    public static com.google.common.util.concurrent.p f(final String str) {
        return Notifee.getListeningExecutorService().submit(new Callable() { // from class: r4.U
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC6244b0.s(str);
            }
        });
    }

    public static com.google.common.util.concurrent.p g(final List list) {
        return Notifee.getListeningExecutorService().submit(new Callable() { // from class: r4.T
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC6244b0.n(list);
            }
        });
    }

    public static com.google.common.util.concurrent.p h() {
        return Notifee.getListeningExecutorService().submit(new Callable() { // from class: r4.V
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC6244b0.r();
            }
        });
    }

    public static com.google.common.util.concurrent.p i(final String str) {
        return Notifee.getListeningExecutorService().submit(new Callable() { // from class: r4.Z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC6244b0.t(str);
            }
        });
    }

    public static com.google.common.util.concurrent.p j(final List list) {
        return Notifee.getListeningExecutorService().submit(new Callable() { // from class: r4.Q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC6244b0.q(list);
            }
        });
    }

    public static Void k(cg.c cVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return null;
        }
        J.a();
        String string = cVar.f33619a.getString(DiagnosticsEntry.ID_KEY);
        Objects.requireNonNull(string);
        String string2 = cVar.f33619a.getString("name");
        Objects.requireNonNull(string2);
        NotificationChannelGroup notificationChannelGroupA = E.a(string, string2);
        if (i10 >= 28 && cVar.f33619a.getString(com.amazon.a.a.o.b.f34645c) != null) {
            notificationChannelGroupA.setDescription(cVar.f33619a.getString(com.amazon.a.a.o.b.f34645c));
        }
        androidx.core.app.q.i(cg.f.f33622a).f(notificationChannelGroupA);
        return null;
    }

    public static Void l(cg.d dVar) {
        long[] jArr;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        AbstractC6264t.a();
        String string = dVar.f33620a.getString(DiagnosticsEntry.ID_KEY);
        Objects.requireNonNull(string);
        String string2 = dVar.f33620a.getString("name");
        Objects.requireNonNull(string2);
        NotificationChannel notificationChannelA = AbstractC6254i.a(string, string2, (dVar.f33620a.containsKey("importance") ? Integer.valueOf(cg.q.a(dVar.f33620a.get("importance"))) : 3).intValue());
        notificationChannelA.setShowBadge(dVar.f33620a.getBoolean("badge", true));
        notificationChannelA.setBypassDnd(dVar.f33620a.getBoolean("bypassDnd", false));
        notificationChannelA.setDescription(dVar.f33620a.getString(com.amazon.a.a.o.b.f34645c));
        notificationChannelA.setGroup(dVar.f33620a.getString("groupId"));
        notificationChannelA.enableLights(dVar.f33620a.getBoolean("lights", true));
        if (dVar.a() != null) {
            notificationChannelA.setLightColor(dVar.a().intValue());
        }
        notificationChannelA.setLockscreenVisibility(dVar.f33620a.containsKey("visibility") ? cg.q.a(dVar.f33620a.get("visibility")) : 0);
        notificationChannelA.enableVibration(dVar.f33620a.getBoolean("vibration", true));
        if (dVar.f33620a.containsKey("vibrationPattern")) {
            ArrayList parcelableArrayList = dVar.f33620a.getParcelableArrayList("vibrationPattern");
            Objects.requireNonNull(parcelableArrayList);
            long[] jArr2 = new long[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                jArr2[i10] = ((Integer) parcelableArrayList.get(i10)).longValue();
            }
            jArr = jArr2;
        } else {
            jArr = new long[0];
        }
        if (jArr.length > 0) {
            notificationChannelA.setVibrationPattern(jArr);
        }
        if ((!dVar.f33620a.containsKey("sound") ? null : dVar.f33620a.getString("sound")) != null) {
            Uri uriE = cg.s.e(!dVar.f33620a.containsKey("sound") ? null : dVar.f33620a.getString("sound"));
            if (uriE != null) {
                notificationChannelA.setSound(uriE, new AudioAttributes.Builder().setUsage(5).setContentType(4).build());
            } else {
                Logger.w("ChannelManager", "Unable to retrieve sound for channel, sound was specified as: " + notificationChannelA.getSound());
            }
        } else {
            notificationChannelA.setSound(null, null);
        }
        androidx.core.app.q.i(cg.f.f33622a).e(notificationChannelA);
        return null;
    }

    public static com.google.common.util.concurrent.p m(final String str) {
        return Notifee.getListeningExecutorService().submit(new Callable() { // from class: r4.Y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC6244b0.u(str);
            }
        });
    }

    public static /* synthetic */ Void n(List list) throws ExecutionException, InterruptedException {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d((cg.c) it.next()).get();
        }
        return null;
    }

    public static List o() {
        List listN = androidx.core.app.q.i(cg.f.f33622a).n();
        if (listN.size() == 0 || Build.VERSION.SDK_INT < 26) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(listN.size());
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(b(androidx.core.app.p.a(it.next())));
        }
        return arrayList;
    }

    public static com.google.common.util.concurrent.p p(final String str) {
        return Notifee.getListeningExecutorService().submit(new Callable() { // from class: r4.S
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC6244b0.v(str);
            }
        });
    }

    public static /* synthetic */ Void q(List list) throws ExecutionException, InterruptedException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((cg.d) it.next()).get();
        }
        return null;
    }

    public static List r() {
        List listO = androidx.core.app.q.i(cg.f.f33622a).o();
        if (listO.size() == 0 || Build.VERSION.SDK_INT < 26) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(listO.size());
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            arrayList.add(a(N.a(it.next())));
        }
        return arrayList;
    }

    public static Bundle s(String str) {
        return a(androidx.core.app.q.i(cg.f.f33622a).l(str));
    }

    public static Bundle t(String str) {
        return b(androidx.core.app.q.i(cg.f.f33622a).m(str));
    }

    public static Boolean u(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return Boolean.FALSE;
        }
        NotificationChannel notificationChannelL = androidx.core.app.q.i(cg.f.f33622a).l(str);
        if (notificationChannelL == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(notificationChannelL.getImportance() == 0);
    }

    public static Boolean v(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(androidx.core.app.q.i(cg.f.f33622a).l(str) != null);
    }
}
