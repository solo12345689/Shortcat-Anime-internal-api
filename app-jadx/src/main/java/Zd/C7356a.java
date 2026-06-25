package zd;

import Cd.e;
import Td.r;
import android.content.Context;
import expo.modules.updates.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pd.C5998c;
import wd.o;
import wd.u;
import wd.v;
import wd.w;
import xd.C7136g;
import yd.n;
import yd.q;
import zd.AbstractC7365j;

/* JADX INFO: renamed from: zd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7356a extends AbstractC7365j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f66061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final expo.modules.updates.d f66062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5998c f66063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C7136g f66064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wd.g f66065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bd.h f66066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final rd.d f66067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Function1 f66068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f66069i;

    /* JADX INFO: renamed from: zd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0997a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f66070a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f66072c;

        C0997a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f66070a = obj;
            this.f66072c |= Integer.MIN_VALUE;
            return C7356a.this.d(null, this);
        }
    }

    /* JADX INFO: renamed from: zd.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f66073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f66074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f66075c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66077e;

        b(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f66075c = obj;
            this.f66077e |= Integer.MIN_VALUE;
            return C7356a.this.b(null, this);
        }
    }

    public C7356a(Context context, expo.modules.updates.d updatesConfiguration, C5998c databaseHolder, C7136g updatesLogger, wd.g fileDownloader, Bd.h selectionPolicy, rd.d dVar, Function1 callback) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(updatesConfiguration, "updatesConfiguration");
        AbstractC5504s.h(databaseHolder, "databaseHolder");
        AbstractC5504s.h(updatesLogger, "updatesLogger");
        AbstractC5504s.h(fileDownloader, "fileDownloader");
        AbstractC5504s.h(selectionPolicy, "selectionPolicy");
        AbstractC5504s.h(callback, "callback");
        this.f66061a = context;
        this.f66062b = updatesConfiguration;
        this.f66063c = databaseHolder;
        this.f66064d = updatesLogger;
        this.f66065e = fileDownloader;
        this.f66066f = selectionPolicy;
        this.f66067g = dVar;
        this.f66068h = callback;
        this.f66069i = "timer-check-for-update";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(org.json.JSONObject r5, Zd.e r6) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zd.C7356a.C0997a
            if (r0 == 0) goto L13
            r0 = r6
            zd.a$a r0 = (zd.C7356a.C0997a) r0
            int r1 = r0.f66072c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f66072c = r1
            goto L18
        L13:
            zd.a$a r0 = new zd.a$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f66070a
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f66072c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            Td.v.b(r6)     // Catch: java.util.concurrent.CancellationException -> L29
            return r6
        L29:
            r5 = move-exception
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            Td.v.b(r6)
            wd.g r6 = r4.f66065e     // Catch: java.util.concurrent.CancellationException -> L29
            r0.f66072c = r3     // Catch: java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r6.r(r5, r0)     // Catch: java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L41
            return r1
        L41:
            return r5
        L42:
            xd.g r6 = r4.f66064d
            java.lang.String r0 = "Download cancelled for remote update check"
            r1 = 2
            r2 = 0
            xd.C7136g.k(r6, r0, r2, r1, r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.C7356a.d(org.json.JSONObject, Zd.e):java.lang.Object");
    }

    private final void e(v vVar, AbstractC7365j.a aVar, rd.d dVar) {
        boolean z10;
        rd.d dVarO;
        w.a aVarA = vVar.a();
        u uVarA = aVarA != null ? aVarA.a() : null;
        w.b bVarB = vVar.b();
        q qVarA = bVarB != null ? bVarB.a() : null;
        if (uVarA != null) {
            if (uVarA instanceof u.b) {
                aVar.a(new e.b());
                this.f66068h.invoke(new c.a.b(o.d.f63094b));
                aVar.c();
                return;
            }
            if (!(uVarA instanceof u.c)) {
                throw new r();
            }
            if (!this.f66062b.j()) {
                aVar.a(new e.b());
                this.f66068h.invoke(new c.a.b(o.d.f63098f));
                aVar.c();
                return;
            }
            if (dVar == null) {
                aVar.a(new e.b());
                this.f66068h.invoke(new c.a.b(o.d.f63098f));
                aVar.c();
                return;
            }
            Bd.h hVar = this.f66066f;
            u.c cVar = (u.c) uVarA;
            rd.d dVar2 = this.f66067g;
            n nVarC = vVar.c();
            if (hVar.d(cVar, dVar, dVar2, nVarC != null ? nVarC.d() : null)) {
                aVar.a(new e.c(cVar.b()));
                this.f66068h.invoke(new c.a.C0739c(cVar.b()));
                aVar.c();
                return;
            } else {
                aVar.a(new e.b());
                this.f66068h.invoke(new c.a.b(o.d.f63097e));
                aVar.c();
                return;
            }
        }
        if (qVarA == null) {
            aVar.a(new e.b());
            this.f66068h.invoke(new c.a.b(o.d.f63094b));
            aVar.c();
            return;
        }
        if (this.f66067g == null) {
            aVar.a(new e.d(qVarA.d().i()));
            this.f66068h.invoke(new c.a.e(qVarA));
            aVar.c();
            return;
        }
        Bd.h hVar2 = this.f66066f;
        rd.d dVarC = qVarA.c();
        rd.d dVar3 = this.f66067g;
        n nVarC2 = vVar.c();
        boolean zC = hVar2.c(dVarC, dVar3, nVarC2 != null ? nVarC2.d() : null);
        if (zC) {
            rd.d dVarC2 = qVarA.c();
            if (dVarC2 == null || (dVarO = this.f66063c.c().Q().o(dVarC2.d())) == null) {
                z10 = false;
                z = true;
            } else {
                z = dVarO.c() == 0;
                C7136g.k(this.f66064d, "Stored update found: ID = " + dVarC2.d() + ", failureCount = " + dVarO.c(), null, 2, null);
                z10 = z ^ true;
            }
        } else {
            z10 = false;
        }
        if (z) {
            aVar.a(new e.d(qVarA.d().i()));
            this.f66068h.invoke(new c.a.e(qVarA));
            aVar.c();
        } else {
            o.d dVar4 = z10 ? o.d.f63096d : o.d.f63095c;
            aVar.a(new e.b());
            this.f66068h.invoke(new c.a.b(dVar4));
            aVar.c();
        }
    }

    @Override // zd.AbstractC7365j
    public String a() {
        return this.f66069i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // zd.AbstractC7365j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(zd.AbstractC7365j.a r9, Zd.e r10) throws org.json.JSONException {
        /*
            r8 = this;
            boolean r0 = r10 instanceof zd.C7356a.b
            if (r0 == 0) goto L13
            r0 = r10
            zd.a$b r0 = (zd.C7356a.b) r0
            int r1 = r0.f66077e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f66077e = r1
            goto L18
        L13:
            zd.a$b r0 = new zd.a$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f66075c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f66077e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r9 = r0.f66074b
            rd.d r9 = (rd.d) r9
            java.lang.Object r0 = r0.f66073a
            zd.j$a r0 = (zd.AbstractC7365j.a) r0
            Td.v.b(r10)     // Catch: java.lang.Exception -> L35
            r7 = r10
            r10 = r9
            r9 = r0
            r0 = r7
            goto L79
        L35:
            r9 = move-exception
            goto L82
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            Td.v.b(r10)
            Cd.e$a r10 = new Cd.e$a
            r10.<init>()
            r9.a(r10)
            yd.a r10 = yd.C7221a.f64999a
            android.content.Context r2 = r8.f66061a
            expo.modules.updates.d r4 = r8.f66062b
            yd.d r10 = r10.b(r2, r4)
            if (r10 == 0) goto L5b
            rd.d r10 = r10.c()
            goto L5c
        L5b:
            r10 = 0
        L5c:
            wd.g$b r2 = wd.g.f62964h
            pd.c r4 = r8.f66063c
            expo.modules.updates.db.UpdatesDatabase r4 = r4.c()
            expo.modules.updates.d r5 = r8.f66062b
            rd.d r6 = r8.f66067g
            org.json.JSONObject r2 = r2.b(r4, r5, r6, r10)
            r0.f66073a = r9     // Catch: java.lang.Exception -> L7f
            r0.f66074b = r10     // Catch: java.lang.Exception -> L7f
            r0.f66077e = r3     // Catch: java.lang.Exception -> L7f
            java.lang.Object r0 = r8.d(r2, r0)     // Catch: java.lang.Exception -> L7f
            if (r0 != r1) goto L79
            return r1
        L79:
            wd.v r0 = (wd.v) r0     // Catch: java.lang.Exception -> L7f
            r8.e(r0, r9, r10)     // Catch: java.lang.Exception -> L7f
            goto L9b
        L7f:
            r10 = move-exception
            r0 = r9
            r9 = r10
        L82:
            Cd.e$e r10 = new Cd.e$e
            java.lang.String r1 = ub.AbstractC6754f.a(r9)
            r10.<init>(r1)
            r0.a(r10)
            kotlin.jvm.functions.Function1 r10 = r8.f66068h
            expo.modules.updates.c$a$a r1 = new expo.modules.updates.c$a$a
            r1.<init>(r9)
            r10.invoke(r1)
            r0.c()
        L9b:
            Td.L r9 = Td.L.f17438a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.C7356a.b(zd.j$a, Zd.e):java.lang.Object");
    }
}
