package com.amazon.a.a.n.a;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import com.amazon.d.a.d;
import com.amazon.d.a.e;
import com.amazon.d.a.i;
import com.amazon.d.a.j;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a */
    private static final com.amazon.a.a.o.c f34502a = new com.amazon.a.a.o.c("CommandServiceClient");

    /* JADX INFO: renamed from: b */
    private static final String f34503b = "com.amazon.venezia.service.command.CommandServiceImpl";

    /* JADX INFO: renamed from: c */
    private static final String f34504c = "com.amazon.venezia.CommandService";

    /* JADX INFO: renamed from: d */
    private com.amazon.d.a.d f34505d;

    /* JADX INFO: renamed from: e */
    private String f34506e;

    /* JADX INFO: renamed from: h */
    @com.amazon.a.a.k.a
    private Application f34509h;

    /* JADX INFO: renamed from: i */
    @com.amazon.a.a.k.a
    private b f34510i;

    /* JADX INFO: renamed from: j */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f34511j;

    /* JADX INFO: renamed from: f */
    private final BlockingQueue<c> f34507f = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: g */
    private final BlockingQueue<com.amazon.d.a.d> f34508g = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: k */
    private final ServiceConnection f34512k = new ServiceConnection() { // from class: com.amazon.a.a.n.a.d.1
        AnonymousClass1() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.f34502a.a("onServiceConnected");
            d.this.f34508g.add(d.a.a(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            d.f34502a.a("onServiceDisconnected!!!");
        }
    };

    /* JADX INFO: renamed from: l */
    private final com.amazon.d.a.i f34513l = new i.a() { // from class: com.amazon.a.a.n.a.d.2
        AnonymousClass2() {
        }

        @Override // com.amazon.d.a.i
        public void a(j jVar) {
            d.this.f34507f.add(new c(jVar));
        }

        @Override // com.amazon.d.a.i
        public void a(com.amazon.d.a.h hVar) {
            d.this.f34507f.add(new c(hVar));
        }

        @Override // com.amazon.d.a.i
        public void a(com.amazon.d.a.f fVar) {
            d.this.f34507f.add(new c(fVar));
        }

        @Override // com.amazon.d.a.i
        public void a(com.amazon.d.a.g gVar) {
            d.this.f34507f.add(new c(gVar));
        }
    };

    /* JADX INFO: renamed from: com.amazon.a.a.n.a.d$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class AnonymousClass1 implements ServiceConnection {
        AnonymousClass1() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.f34502a.a("onServiceConnected");
            d.this.f34508g.add(d.a.a(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            d.f34502a.a("onServiceDisconnected!!!");
        }
    }

    /* JADX INFO: renamed from: com.amazon.a.a.n.a.d$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class AnonymousClass2 extends i.a {
        AnonymousClass2() {
        }

        @Override // com.amazon.d.a.i
        public void a(j jVar) {
            d.this.f34507f.add(new c(jVar));
        }

        @Override // com.amazon.d.a.i
        public void a(com.amazon.d.a.h hVar) {
            d.this.f34507f.add(new c(hVar));
        }

        @Override // com.amazon.d.a.i
        public void a(com.amazon.d.a.f fVar) {
            d.this.f34507f.add(new c(fVar));
        }

        @Override // com.amazon.d.a.i
        public void a(com.amazon.d.a.g gVar) {
            d.this.f34507f.add(new c(gVar));
        }
    }

    /* JADX INFO: renamed from: com.amazon.a.a.n.a.d$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class AnonymousClass3 extends e.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ e f34516a;

        AnonymousClass3(e eVar) {
            eVar = eVar;
        }

        @Override // com.amazon.d.a.e
        public String a() {
            return eVar.name();
        }

        @Override // com.amazon.d.a.e
        public Map b() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a */
        int f34518a;

        /* JADX INFO: renamed from: b */
        boolean f34519b;

        /* JADX INFO: renamed from: c */
        long f34520c;

        a() {
        }
    }

    private boolean d() {
        return this.f34505d != null;
    }

    private void e() throws com.amazon.a.a.n.a.a.c, com.amazon.a.a.n.a.a.b {
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.amazon.a.a.o.c cVar = f34502a;
        cVar.a("Binding Service!!!");
        Intent intentF = f();
        if (!a(this.f34509h, intentF)) {
            throw new com.amazon.a.a.n.a.a.c();
        }
        cVar.a("Found service on one or more packages");
        Intent intentA = a(intentF);
        String packageName = intentA.getComponent().getPackageName();
        cVar.a("Attempting to bind to service on " + packageName);
        if (!this.f34509h.bindService(intentA, this.f34512k, 1)) {
            throw new com.amazon.a.a.n.a.a.b();
        }
        try {
            cVar.a("Blocking while service is being bound!!");
            this.f34505d = this.f34508g.take();
            cVar.a("service bound, returning!!");
            if (com.amazon.a.a.o.c.f34699a) {
                cVar.a("Kiwi.BindService Time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
            }
            this.f34511j.a(com.amazon.a.a.m.c.f34466f, packageName);
            this.f34506e = packageName;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new com.amazon.a.a.n.a.a.b();
        }
    }

    private Intent f() {
        Intent intent = new Intent();
        intent.setAction(f34504c);
        f34502a.a("Created intent with  action  com.amazon.venezia.CommandService");
        return intent;
    }

    private c g() {
        try {
            com.amazon.a.a.o.c cVar = f34502a;
            cVar.a("Blocking for result from service");
            c cVarTake = this.f34507f.take();
            cVar.a("Received result from service");
            return cVarTake;
        } catch (InterruptedException unused) {
            f34502a.a("TaskThread interrupted, returning null result");
            return null;
        }
    }

    private c b(com.amazon.d.a.c cVar) {
        this.f34511j.a(com.amazon.a.a.m.c.f34467g, cVar.b());
        this.f34505d.a(cVar, this.f34513l);
        return g();
    }

    public c a(com.amazon.d.a.c cVar) throws com.amazon.a.a.n.a.a.c, com.amazon.a.a.n.a.a.b {
        a aVar = new a();
        aVar.f34518a = 6;
        aVar.f34520c = 100L;
        while (true) {
            try {
                if (!d()) {
                    e();
                }
                return b(cVar);
            } catch (com.amazon.a.a.n.a.a.b e10) {
                a(e10, aVar);
                if (!aVar.f34519b) {
                    throw e10;
                }
            } catch (com.amazon.a.a.n.a.a.c e11) {
                a(e11, aVar);
                if (!aVar.f34519b) {
                    throw e11;
                }
            }
        }
    }

    public void b() {
        com.amazon.a.a.o.c cVar = f34502a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Finishing CommandServiceClient, unbinding service: ");
        sb2.append(this.f34505d != null);
        cVar.a(sb2.toString());
        if (this.f34505d != null) {
            this.f34509h.unbindService(this.f34512k);
            this.f34505d = null;
        }
    }

    private boolean b(String str) {
        f34502a.a("isPackageSignatureTrusted " + str);
        return this.f34510i.a(str, i.f34569a);
    }

    static void a(com.amazon.a.a.d.b bVar, a aVar) {
        com.amazon.a.a.o.c cVar = f34502a;
        cVar.b("CommandServiceException happened, retriesLeft=" + aVar.f34518a, bVar);
        int i10 = aVar.f34518a;
        if (i10 == 0) {
            aVar.f34519b = false;
            return;
        }
        aVar.f34518a = i10 - 1;
        aVar.f34519b = true;
        try {
            cVar.a("Sleeping for " + aVar.f34520c + " ms");
            Thread.sleep(aVar.f34520c);
        } catch (InterruptedException unused) {
            aVar.f34519b = false;
        }
        aVar.f34520c *= 2;
    }

    public String a() {
        return this.f34506e;
    }

    private boolean a(Context context, Intent intent) {
        return context.getPackageManager().resolveService(intent, 64) != null;
    }

    private Intent a(String str) {
        Intent intent = new Intent();
        intent.setAction(f34504c);
        intent.setClassName(str, f34503b);
        return intent;
    }

    private Intent a(Intent intent) throws com.amazon.a.a.n.a.a.c {
        if (this.f34506e != null) {
            f34502a.a("Using previously determined package " + this.f34506e);
            return a(this.f34506e);
        }
        com.amazon.a.a.o.c cVar = f34502a;
        cVar.a("No previously determined package found, checking for suitable package.");
        Intent intentA = a(this.f34509h.getPackageManager().queryIntentServices(intent, 64));
        if (intentA != null) {
            return intentA;
        }
        cVar.a("No app with valid signature was providing our service.");
        throw new com.amazon.a.a.n.a.a.c();
    }

    private Intent a(List<ResolveInfo> list) {
        int i10 = 0;
        String str = null;
        while (true) {
            try {
                if (i10 >= list.size()) {
                    i10 = -1;
                    break;
                }
                ResolveInfo resolveInfo = list.get(i10);
                String str2 = resolveInfo.serviceInfo.applicationInfo.packageName;
                com.amazon.a.a.o.c cVar = f34502a;
                cVar.a("Examining package " + str2);
                cVar.a("Priority is " + resolveInfo.filter.getPriority());
                cVar.a("Checking signature of package " + str2);
                if (b(str2)) {
                    cVar.a("Signature of package " + str2 + " is okay");
                    str = str2;
                    break;
                }
                cVar.a("Signature of package " + str2 + " is bad");
                i10++;
                str = str2;
            } catch (Exception e10) {
                f34502a.a("Caught exception " + e10);
            }
        }
        if (i10 > -1) {
            return a(str);
        }
        return null;
    }

    public c a(com.amazon.d.a.a aVar) {
        aVar.a(null);
        return g();
    }

    public c a(com.amazon.d.a.f fVar, e eVar) {
        fVar.a(new e.a() { // from class: com.amazon.a.a.n.a.d.3

            /* JADX INFO: renamed from: a */
            final /* synthetic */ e f34516a;

            AnonymousClass3(e eVar2) {
                eVar = eVar2;
            }

            @Override // com.amazon.d.a.e
            public String a() {
                return eVar.name();
            }

            @Override // com.amazon.d.a.e
            public Map b() {
                return null;
            }
        });
        return g();
    }
}
