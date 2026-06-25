package zd;

import Cd.e;
import Td.L;
import Td.r;
import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pd.C5998c;
import wd.i;
import wd.u;
import wd.v;
import wd.w;
import xd.C7136g;
import yd.n;
import yd.q;
import zd.AbstractC7365j;

/* JADX INFO: renamed from: zd.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7359d extends AbstractC7365j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f66080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final expo.modules.updates.d f66081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C7136g f66082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5998c f66083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f66084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wd.g f66085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bd.h f66086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final rd.d f66087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Function1 f66088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f66089j;

    /* JADX INFO: renamed from: zd.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f66090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f66091b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f66093d;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f66091b = obj;
            this.f66093d |= Integer.MIN_VALUE;
            return C7359d.this.g(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zd.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f66094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f66095b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f66097d;

        b(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f66095b = obj;
            this.f66097d |= Integer.MIN_VALUE;
            return C7359d.this.b(null, this);
        }
    }

    /* JADX INFO: renamed from: zd.d$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f66098a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f66100c;

        c(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f66098a = obj;
            this.f66100c |= Integer.MIN_VALUE;
            return C7359d.this.h(null, null, this);
        }
    }

    public C7359d(Context context, expo.modules.updates.d updatesConfiguration, C7136g logger, C5998c databaseHolder, File updatesDirectory, wd.g fileDownloader, Bd.h selectionPolicy, rd.d dVar, Function1 callback) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(updatesConfiguration, "updatesConfiguration");
        AbstractC5504s.h(logger, "logger");
        AbstractC5504s.h(databaseHolder, "databaseHolder");
        AbstractC5504s.h(updatesDirectory, "updatesDirectory");
        AbstractC5504s.h(fileDownloader, "fileDownloader");
        AbstractC5504s.h(selectionPolicy, "selectionPolicy");
        AbstractC5504s.h(callback, "callback");
        this.f66080a = context;
        this.f66081b = updatesConfiguration;
        this.f66082c = logger;
        this.f66083d = databaseHolder;
        this.f66084e = updatesDirectory;
        this.f66085f = fileDownloader;
        this.f66086g = selectionPolicy;
        this.f66087h = dVar;
        this.f66088i = callback;
        this.f66089j = "timer-fetch-update";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(wd.i.d r12, zd.AbstractC7365j.a r13, Zd.e r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof zd.C7359d.a
            if (r0 == 0) goto L14
            r0 = r14
            zd.d$a r0 = (zd.C7359d.a) r0
            int r1 = r0.f66093d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f66093d = r1
        L12:
            r10 = r0
            goto L1a
        L14:
            zd.d$a r0 = new zd.d$a
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r10.f66091b
            java.lang.Object r0 = ae.AbstractC2605b.f()
            int r1 = r10.f66093d
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r12 = r10.f66090a
            r13 = r12
            zd.j$a r13 = (zd.AbstractC7365j.a) r13
            Td.v.b(r14)
            goto L5c
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            Td.v.b(r14)
            wd.s$a r1 = wd.s.f63135w
            r14 = r2
            android.content.Context r2 = r11.f66080a
            expo.modules.updates.d r3 = r11.f66081b
            xd.g r4 = r11.f66082c
            pd.c r5 = r11.f66083d
            expo.modules.updates.db.UpdatesDatabase r5 = r5.c()
            Bd.h r6 = r11.f66086g
            java.io.File r7 = r11.f66084e
            rd.d r8 = r11.f66087h
            r10.f66090a = r13
            r10.f66093d = r14
            r9 = r12
            java.lang.Object r14 = r1.e(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r14 != r0) goto L5c
            return r0
        L5c:
            wd.p r14 = (wd.p) r14
            rd.d r12 = r14.a()
            boolean r14 = r14.b()
            if (r14 == 0) goto L7b
            Cd.e$h r12 = new Cd.e$h
            r12.<init>()
            r13.a(r12)
            kotlin.jvm.functions.Function1 r12 = r11.f66088i
            expo.modules.updates.c$b$c r13 = new expo.modules.updates.c$b$c
            r13.<init>()
            r12.invoke(r13)
            goto La6
        L7b:
            if (r12 != 0) goto L90
            Cd.e$g r12 = new Cd.e$g
            r12.<init>()
            r13.a(r12)
            kotlin.jvm.functions.Function1 r12 = r11.f66088i
            expo.modules.updates.c$b$b r13 = new expo.modules.updates.c$b$b
            r13.<init>()
            r12.invoke(r13)
            goto La6
        L90:
            Cd.e$i r14 = new Cd.e$i
            org.json.JSONObject r0 = r12.i()
            r14.<init>(r0)
            r13.a(r14)
            kotlin.jvm.functions.Function1 r13 = r11.f66088i
            expo.modules.updates.c$b$e r14 = new expo.modules.updates.c$b$e
            r14.<init>(r12)
            r13.invoke(r14)
        La6:
            Td.L r12 = Td.L.f17438a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.C7359d.g(wd.i$d, zd.j$a, Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(expo.modules.updates.db.UpdatesDatabase r13, final zd.AbstractC7365j.a r14, Zd.e r15) throws java.lang.Exception {
        /*
            r12 = this;
            boolean r0 = r15 instanceof zd.C7359d.c
            if (r0 == 0) goto L13
            r0 = r15
            zd.d$c r0 = (zd.C7359d.c) r0
            int r1 = r0.f66100c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f66100c = r1
            goto L18
        L13:
            zd.d$c r0 = new zd.d$c
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f66098a
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f66100c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            Td.v.b(r15)     // Catch: java.util.concurrent.CancellationException -> L29
            goto L5f
        L29:
            r0 = move-exception
            r13 = r0
            goto L62
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            Td.v.b(r15)
            wd.s r4 = new wd.s
            android.content.Context r5 = r12.f66080a
            expo.modules.updates.d r6 = r12.f66081b
            xd.g r7 = r12.f66082c
            wd.g r9 = r12.f66085f
            java.io.File r10 = r12.f66084e
            rd.d r11 = r12.f66087h
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            zd.b r13 = new zd.b
            r13.<init>()
            r4.q(r13)
            zd.c r13 = new zd.c     // Catch: java.util.concurrent.CancellationException -> L29
            r13.<init>()     // Catch: java.util.concurrent.CancellationException -> L29
            r0.f66100c = r3     // Catch: java.util.concurrent.CancellationException -> L29
            java.lang.Object r15 = r4.k(r13, r0)     // Catch: java.util.concurrent.CancellationException -> L29
            if (r15 != r1) goto L5f
            return r1
        L5f:
            wd.i$d r15 = (wd.i.d) r15     // Catch: java.util.concurrent.CancellationException -> L29
            return r15
        L62:
            xd.g r14 = r12.f66082c
            java.lang.String r15 = "Remote loader cancelled during fetch update procedure"
            r0 = 2
            r1 = 0
            xd.C7136g.k(r14, r15, r1, r0, r1)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.C7359d.h(expo.modules.updates.db.UpdatesDatabase, zd.j$a, Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L i(AbstractC7365j.a aVar, double d10) {
        aVar.a(new e.k(d10));
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i.e j(C7359d c7359d, v updateResponse) {
        q qVarA;
        AbstractC5504s.h(updateResponse, "updateResponse");
        w.a aVarA = updateResponse.a();
        u uVarA = aVarA != null ? aVarA.a() : null;
        if (uVarA != null) {
            if ((uVarA instanceof u.c) || (uVarA instanceof u.b)) {
                return new i.e(false);
            }
            throw new r();
        }
        w.b bVarB = updateResponse.b();
        if (bVarB == null || (qVarA = bVarB.a()) == null) {
            return new i.e(false);
        }
        Bd.h hVar = c7359d.f66086g;
        rd.d dVarC = qVarA.c();
        rd.d dVar = c7359d.f66087h;
        n nVarC = updateResponse.c();
        return new i.e(hVar.c(dVarC, dVar, nVarC != null ? nVarC.d() : null));
    }

    @Override // zd.AbstractC7365j
    public String a() {
        return this.f66089j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (g((wd.i.d) r8, r7, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // zd.AbstractC7365j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(zd.AbstractC7365j.a r7, Zd.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zd.C7359d.b
            if (r0 == 0) goto L13
            r0 = r8
            zd.d$b r0 = (zd.C7359d.b) r0
            int r1 = r0.f66097d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f66097d = r1
            goto L18
        L13:
            zd.d$b r0 = new zd.d$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f66095b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f66097d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f66094a
            zd.j$a r7 = (zd.AbstractC7365j.a) r7
            Td.v.b(r8)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            goto L71
        L30:
            r0 = move-exception
            r8 = r0
            goto Laa
        L34:
            r0 = move-exception
            r8 = r0
            r2 = r8
            goto L75
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f66094a
            zd.j$a r7 = (zd.AbstractC7365j.a) r7
            Td.v.b(r8)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            goto L64
        L48:
            Td.v.b(r8)
            Cd.e$f r8 = new Cd.e$f
            r8.<init>()
            r7.a(r8)
            pd.c r8 = r6.f66083d
            expo.modules.updates.db.UpdatesDatabase r8 = r8.c()
            r0.f66094a = r7     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            r0.f66097d = r4     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            java.lang.Object r8 = r6.h(r8, r7, r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            if (r8 != r1) goto L64
            goto L70
        L64:
            wd.i$d r8 = (wd.i.d) r8     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            r0.f66094a = r7     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            r0.f66097d = r3     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            java.lang.Object r8 = r6.g(r8, r7, r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            if (r8 != r1) goto L71
        L70:
            return r1
        L71:
            r7.c()
            goto La7
        L75:
            xd.g r0 = r6.f66082c     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "Failed to download new update"
            r4 = 4
            r5 = 0
            r3 = 0
            xd.C7136g.h(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L30
            Cd.e$j r8 = new Cd.e$j     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r1.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "Failed to download new update: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L30
            r1.append(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L30
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L30
            r7.a(r8)     // Catch: java.lang.Throwable -> L30
            kotlin.jvm.functions.Function1 r8 = r6.f66088i     // Catch: java.lang.Throwable -> L30
            expo.modules.updates.c$b$a r0 = new expo.modules.updates.c$b$a     // Catch: java.lang.Throwable -> L30
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L30
            r8.invoke(r0)     // Catch: java.lang.Throwable -> L30
            goto L71
        La7:
            Td.L r7 = Td.L.f17438a
            return r7
        Laa:
            r7.c()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.C7359d.b(zd.j$a, Zd.e):java.lang.Object");
    }
}
