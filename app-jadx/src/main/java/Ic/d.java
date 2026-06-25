package Ic;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;
import androidx.core.app.q;
import java.util.List;
import qb.C6167a;
import qb.InterfaceC6168b;
import r4.AbstractC6254i;
import r4.N;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f9024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f9025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Dc.e f9026c;

    public d(Context context, e eVar) {
        this.f9024a = q.i(context);
        this.f9026c = new Dc.e(context);
        this.f9025b = eVar;
    }

    @Override // Ic.f
    public void a(String str) {
        this.f9024a.g(str);
    }

    @Override // Ic.f
    public NotificationChannel b(String str) {
        return this.f9024a.l(str);
    }

    @Override // Ic.f
    public NotificationChannel c(String str, CharSequence charSequence, int i10, InterfaceC6168b interfaceC6168b) {
        NotificationChannel notificationChannelA = AbstractC6254i.a(str, charSequence, i10);
        f(notificationChannelA, interfaceC6168b);
        this.f9024a.e(notificationChannelA);
        return this.f9024a.l(str);
    }

    @Override // Ic.f
    public List d() {
        return this.f9024a.o();
    }

    @Override // Ic.f
    public boolean e(InterfaceC6168b interfaceC6168b) {
        String string;
        if (interfaceC6168b.f("sound") && (string = interfaceC6168b.getString("sound")) != null) {
            return this.f9026c.c(string);
        }
        return true;
    }

    protected void f(Object obj, InterfaceC6168b interfaceC6168b) {
        Mc.e eVarB;
        if (c.a(obj)) {
            NotificationChannel notificationChannelA = N.a(obj);
            if (interfaceC6168b.f("bypassDnd")) {
                notificationChannelA.setBypassDnd(interfaceC6168b.getBoolean("bypassDnd"));
            }
            if (interfaceC6168b.f(com.amazon.a.a.o.b.f34645c)) {
                notificationChannelA.setDescription(interfaceC6168b.getString(com.amazon.a.a.o.b.f34645c));
            }
            if (interfaceC6168b.f("lightColor")) {
                notificationChannelA.setLightColor(Color.parseColor(interfaceC6168b.getString("lightColor")));
            }
            if (interfaceC6168b.f("groupId")) {
                String string = interfaceC6168b.getString("groupId");
                NotificationChannelGroup notificationChannelGroupC = this.f9025b.c(string);
                if (notificationChannelGroupC == null) {
                    notificationChannelGroupC = this.f9025b.a(string, string, new C6167a());
                }
                notificationChannelA.setGroup(notificationChannelGroupC.getId());
            }
            if (interfaceC6168b.f("lockscreenVisibility") && (eVarB = Mc.e.b(interfaceC6168b.getInt("lockscreenVisibility"))) != null) {
                notificationChannelA.setLockscreenVisibility(eVarB.k());
            }
            if (interfaceC6168b.f("showBadge")) {
                notificationChannelA.setShowBadge(interfaceC6168b.getBoolean("showBadge"));
            }
            if (interfaceC6168b.f("sound") || interfaceC6168b.f("audioAttributes")) {
                notificationChannelA.setSound(h(interfaceC6168b), g(interfaceC6168b.c("audioAttributes")));
            }
            if (interfaceC6168b.f("vibrationPattern")) {
                notificationChannelA.setVibrationPattern(i(interfaceC6168b.a("vibrationPattern")));
            }
            if (interfaceC6168b.f("enableLights")) {
                notificationChannelA.enableLights(interfaceC6168b.getBoolean("enableLights"));
            }
            if (interfaceC6168b.f("enableVibrate")) {
                notificationChannelA.enableVibration(interfaceC6168b.getBoolean("enableVibrate"));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected AudioAttributes g(InterfaceC6168b interfaceC6168b) {
        if (interfaceC6168b == null) {
            return null;
        }
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        if (interfaceC6168b.f("usage")) {
            builder.setUsage(Mc.b.b(interfaceC6168b.getInt("usage")).k());
        }
        if (interfaceC6168b.f("contentType")) {
            builder.setContentType(Mc.a.b(interfaceC6168b.getInt("contentType")).k());
        }
        if (interfaceC6168b.f("flags")) {
            InterfaceC6168b interfaceC6168bC = interfaceC6168b.c("flags");
            boolean z10 = interfaceC6168bC.getBoolean("enforceAudibility");
            int i10 = z10;
            if (interfaceC6168bC.getBoolean("requestHardwareAudioVideoSynchronization")) {
                i10 = (z10 ? 1 : 0) | 16;
            }
            builder.setFlags(i10);
        }
        return builder.build();
    }

    protected Uri h(InterfaceC6168b interfaceC6168b) {
        if (!interfaceC6168b.f("sound")) {
            return Settings.System.DEFAULT_NOTIFICATION_URI;
        }
        String string = interfaceC6168b.getString("sound");
        if (string == null) {
            return null;
        }
        return this.f9026c.b(string);
    }

    protected long[] i(List list) {
        if (list == null) {
            return null;
        }
        long[] jArr = new long[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!(list.get(i10) instanceof Number)) {
                throw new Hc.f(i10, list.get(i10));
            }
            jArr[i10] = ((Number) list.get(i10)).longValue();
        }
        return jArr;
    }
}
