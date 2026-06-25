package Yc;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import expo.modules.notifications.service.NotificationsService;
import java.io.IOException;
import java.io.InvalidClassException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements Zc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f22915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AlarmManager f22916c;

    public f(Context context) {
        AbstractC5504s.h(context, "context");
        this.f22914a = context;
        this.f22915b = new i(context);
        Object systemService = context.getSystemService("alarm");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        this.f22916c = (AlarmManager) systemService;
    }

    private final void h(long j10, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT < 31 || this.f22916c.canScheduleExactAlarms()) {
            androidx.core.app.e.d(this.f22916c, 0, j10, pendingIntent);
        } else {
            androidx.core.app.e.b(this.f22916c, 0, j10, pendingIntent);
        }
    }

    @Override // Zc.e
    public void a(String identifier) throws IOException {
        AbstractC5504s.h(identifier, "identifier");
        try {
            Pc.g gVarB = this.f22915b.b(identifier);
            AbstractC5504s.e(gVarB);
            NotificationsService.Companion companion = NotificationsService.INSTANCE;
            NotificationsService.Companion.t(companion, this.f22914a, new Pc.a(gVarB), null, 4, null);
            NotificationsService.Companion.z(companion, this.f22914a, gVarB, null, 4, null);
        } catch (InvalidClassException e10) {
            Log.e("expo-notifications", "An exception occurred while triggering notification " + identifier + ", removing. " + e10.getMessage());
            e10.printStackTrace();
            NotificationsService.Companion.w(NotificationsService.INSTANCE, this.f22914a, identifier, null, 4, null);
        } catch (ClassNotFoundException e11) {
            Log.e("expo-notifications", "An exception occurred while triggering notification " + identifier + ", removing. " + e11.getMessage());
            e11.printStackTrace();
            NotificationsService.Companion.w(NotificationsService.INSTANCE, this.f22914a, identifier, null, 4, null);
        } catch (NullPointerException e12) {
            Log.e("expo-notifications", "An exception occurred while triggering notification " + identifier + ", removing. " + e12.getMessage());
            e12.printStackTrace();
            NotificationsService.Companion.w(NotificationsService.INSTANCE, this.f22914a, identifier, null, 4, null);
        }
    }

    @Override // Zc.e
    public void b() {
        for (Pc.g gVar : this.f22915b.a()) {
            try {
                g(gVar);
            } catch (Exception e10) {
                Log.w("expo-notifications", "Notification " + gVar.b() + " could not have been scheduled: " + e10.getMessage());
                e10.printStackTrace();
            }
        }
    }

    @Override // Zc.e
    public void c() {
        Iterator it = this.f22915b.d().iterator();
        while (it.hasNext()) {
            this.f22916c.cancel(NotificationsService.INSTANCE.c(this.f22914a, (String) it.next()));
        }
    }

    @Override // Zc.e
    public void d(Collection identifiers) {
        AbstractC5504s.h(identifiers, "identifiers");
        Iterator it = identifiers.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            this.f22916c.cancel(NotificationsService.INSTANCE.c(this.f22914a, str));
            this.f22915b.f(str);
        }
    }

    @Override // Zc.e
    public Pc.g e(String identifier) {
        AbstractC5504s.h(identifier, "identifier");
        try {
            return this.f22915b.b(identifier);
        } catch (IOException | ClassNotFoundException | NullPointerException unused) {
            return null;
        }
    }

    @Override // Zc.e
    public Collection f() {
        return this.f22915b.a();
    }

    @Override // Zc.e
    public void g(Pc.g request) {
        AbstractC5504s.h(request, "request");
        if (request.c() == null) {
            NotificationsService.Companion.t(NotificationsService.INSTANCE, this.f22914a, new Pc.a(request), null, 4, null);
            return;
        }
        if (!(request.c() instanceof Oc.e)) {
            if (request.c() instanceof Uc.a) {
                NotificationsService.Companion.t(NotificationsService.INSTANCE, this.f22914a, new Pc.a(request), null, 4, null);
                return;
            }
            throw new IllegalArgumentException("Notification request \"" + request.b() + "\" does not have a schedulable trigger (it's " + request.c() + "). Refusing to schedule.");
        }
        Oc.d dVarC = request.c();
        AbstractC5504s.f(dVarC, "null cannot be cast to non-null type expo.modules.notifications.notifications.interfaces.SchedulableNotificationTrigger");
        Date dateN = ((Oc.e) dVarC).n();
        if (dateN != null) {
            this.f22915b.g(request);
            long time = dateN.getTime();
            NotificationsService.Companion companion = NotificationsService.INSTANCE;
            Context context = this.f22914a;
            String strB = request.b();
            AbstractC5504s.g(strB, "getIdentifier(...)");
            h(time, companion.c(context, strB));
            return;
        }
        Log.d("expo-notifications", "Notification request \"" + request.b() + "\" will not trigger in the future, removing.");
        NotificationsService.Companion companion2 = NotificationsService.INSTANCE;
        Context context2 = this.f22914a;
        String strB2 = request.b();
        AbstractC5504s.g(strB2, "getIdentifier(...)");
        NotificationsService.Companion.w(companion2, context2, strB2, null, 4, null);
    }
}
