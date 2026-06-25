package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.E;
import androidx.work.impl.InterfaceC2955e;
import i4.i;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import k4.InterfaceC5447c;
import k4.InterfaceC5448d;
import k4.e;
import n4.AbstractC5748x;
import n4.C5737m;
import n4.C5745u;
import p4.InterfaceC5931b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements InterfaceC5447c, InterfaceC2955e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f32863k = i.i("SystemFgDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f32864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private E f32865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5931b f32866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f32867d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    C5737m f32868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Map f32869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map f32870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Set f32871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final InterfaceC5448d f32872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceC0549b f32873j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32874a;

        a(String str) {
            this.f32874a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5745u c5745uH = b.this.f32865b.s().h(this.f32874a);
            if (c5745uH == null || !c5745uH.h()) {
                return;
            }
            synchronized (b.this.f32867d) {
                b.this.f32870g.put(AbstractC5748x.a(c5745uH), c5745uH);
                b.this.f32871h.add(c5745uH);
                b bVar = b.this;
                bVar.f32872i.a(bVar.f32871h);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.foreground.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface InterfaceC0549b {
        void a(int i10, Notification notification);

        void c(int i10, int i11, Notification notification);

        void d(int i10);

        void stop();
    }

    b(Context context) {
        this.f32864a = context;
        E eQ = E.q(context);
        this.f32865b = eQ;
        this.f32866c = eQ.w();
        this.f32868e = null;
        this.f32869f = new LinkedHashMap();
        this.f32871h = new HashSet();
        this.f32870g = new HashMap();
        this.f32872i = new e(this.f32865b.u(), this);
        this.f32865b.s().g(this);
    }

    public static Intent c(Context context, C5737m c5737m, i4.e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", c5737m.b());
        intent.putExtra("KEY_GENERATION", c5737m.a());
        return intent;
    }

    public static Intent d(Context context, C5737m c5737m, i4.e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c5737m.b());
        intent.putExtra("KEY_GENERATION", c5737m.a());
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void h(Intent intent) {
        i.e().f(f32863k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f32865b.k(UUID.fromString(stringExtra));
    }

    private void i(Intent intent) {
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        C5737m c5737m = new C5737m(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        i.e().a(f32863k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.f32873j == null) {
            return;
        }
        this.f32869f.put(c5737m, new i4.e(intExtra, notification, intExtra2));
        if (this.f32868e == null) {
            this.f32868e = c5737m;
            this.f32873j.c(intExtra, intExtra2, notification);
            return;
        }
        this.f32873j.a(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.f32869f.entrySet().iterator();
        while (it.hasNext()) {
            iA |= ((i4.e) ((Map.Entry) it.next()).getValue()).a();
        }
        i4.e eVar = (i4.e) this.f32869f.get(this.f32868e);
        if (eVar != null) {
            this.f32873j.c(eVar.c(), iA, eVar.b());
        }
    }

    private void j(Intent intent) {
        i.e().f(f32863k, "Started foreground service " + intent);
        this.f32866c.c(new a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // k4.InterfaceC5447c
    public void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5745u c5745u = (C5745u) it.next();
            String str = c5745u.f53943a;
            i.e().a(f32863k, "Constraints unmet for WorkSpec " + str);
            this.f32865b.D(AbstractC5748x.a(c5745u));
        }
    }

    @Override // androidx.work.impl.InterfaceC2955e
    public void f(C5737m c5737m, boolean z10) {
        Map.Entry entry;
        synchronized (this.f32867d) {
            try {
                C5745u c5745u = (C5745u) this.f32870g.remove(c5737m);
                if (c5745u != null ? this.f32871h.remove(c5745u) : false) {
                    this.f32872i.a(this.f32871h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i4.e eVar = (i4.e) this.f32869f.remove(c5737m);
        if (c5737m.equals(this.f32868e) && this.f32869f.size() > 0) {
            Iterator it = this.f32869f.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f32868e = (C5737m) entry.getKey();
            if (this.f32873j != null) {
                i4.e eVar2 = (i4.e) entry.getValue();
                this.f32873j.c(eVar2.c(), eVar2.a(), eVar2.b());
                this.f32873j.d(eVar2.c());
            }
        }
        InterfaceC0549b interfaceC0549b = this.f32873j;
        if (eVar == null || interfaceC0549b == null) {
            return;
        }
        i.e().a(f32863k, "Removing Notification (id: " + eVar.c() + ", workSpecId: " + c5737m + ", notificationType: " + eVar.a());
        interfaceC0549b.d(eVar.c());
    }

    void k(Intent intent) {
        i.e().f(f32863k, "Stopping foreground service");
        InterfaceC0549b interfaceC0549b = this.f32873j;
        if (interfaceC0549b != null) {
            interfaceC0549b.stop();
        }
    }

    void l() {
        this.f32873j = null;
        synchronized (this.f32867d) {
            this.f32872i.reset();
        }
        this.f32865b.s().l(this);
    }

    void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent);
        }
    }

    void n(InterfaceC0549b interfaceC0549b) {
        if (this.f32873j != null) {
            i.e().c(f32863k, "A callback already exists.");
        } else {
            this.f32873j = interfaceC0549b;
        }
    }

    @Override // k4.InterfaceC5447c
    public void e(List list) {
    }
}
