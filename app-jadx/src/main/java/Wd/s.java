package wd;

import Td.L;
import android.content.Context;
import expo.modules.updates.db.UpdatesDatabase;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import rd.C6306a;
import wd.i;
import xd.C7136g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends i {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f63135w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f63136x = s.class.getSimpleName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final g f63137t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final rd.d f63138u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final j f63139v;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: wd.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0951a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f63140a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f63141b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f63142c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f63143d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f63145f;

            C0951a(Zd.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f63143d = obj;
                this.f63145f |= Integer.MIN_VALUE;
                return a.this.c(null, null, null, null, null, null, null, null, this);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f63146a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f63148c;

            b(Zd.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f63146a = obj;
                this.f63148c |= Integer.MIN_VALUE;
                return a.this.e(null, null, null, null, null, null, null, null, this);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(android.content.Context r12, expo.modules.updates.d r13, xd.C7136g r14, expo.modules.updates.db.UpdatesDatabase r15, Bd.h r16, java.io.File r17, rd.d r18, wd.u.c r19, Zd.e r20) {
            /*
                r11 = this;
                r6 = r19
                r0 = r20
                boolean r1 = r0 instanceof wd.s.a.C0951a
                if (r1 == 0) goto L18
                r1 = r0
                wd.s$a$a r1 = (wd.s.a.C0951a) r1
                int r2 = r1.f63145f
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r2 & r3
                if (r5 == 0) goto L18
                int r2 = r2 - r3
                r1.f63145f = r2
            L16:
                r7 = r1
                goto L1e
            L18:
                wd.s$a$a r1 = new wd.s$a$a
                r1.<init>(r0)
                goto L16
            L1e:
                java.lang.Object r0 = r7.f63143d
                java.lang.Object r8 = ae.AbstractC2605b.f()
                int r1 = r7.f63145f
                r9 = 0
                r10 = 1
                if (r1 == 0) goto L4a
                if (r1 != r10) goto L42
                java.lang.Object r12 = r7.f63142c
                wd.u$c r12 = (wd.u.c) r12
                java.lang.Object r13 = r7.f63141b
                expo.modules.updates.db.UpdatesDatabase r13 = (expo.modules.updates.db.UpdatesDatabase) r13
                java.lang.Object r1 = r7.f63140a
                xd.g r1 = (xd.C7136g) r1
                Td.v.b(r0)     // Catch: java.lang.Exception -> L3d
                r6 = r12
                goto La2
            L3d:
                r0 = move-exception
                r12 = r0
                r3 = r1
                goto Lbb
            L42:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L4a:
                Td.v.b(r0)
                boolean r0 = r13.j()
                if (r0 != 0) goto L58
                java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.b.a(r9)
                return r12
            L58:
                yd.a r0 = yd.C7221a.f64999a
                yd.d r0 = r0.b(r12, r13)
                kotlin.jvm.internal.AbstractC5504s.e(r0)
                rd.d r0 = r0.c()
                yd.k r1 = yd.k.f65039a
                org.json.JSONObject r1 = r1.f(r15, r13)
                r2 = r16
                r3 = r18
                boolean r1 = r2.d(r6, r0, r3, r1)
                if (r1 != 0) goto L7a
                java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.b.a(r9)
                return r12
            L7a:
                java.util.Date r1 = r6.b()
                r0.p(r1)
                wd.a r0 = new wd.a     // Catch: java.lang.Exception -> Lb8
                r1 = r12
                r2 = r13
                r3 = r14
                r4 = r15
                r5 = r17
                r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> Lb8
                wd.r r12 = new wd.r     // Catch: java.lang.Exception -> Lb8
                r12.<init>()     // Catch: java.lang.Exception -> Lb8
                r7.f63140a = r14     // Catch: java.lang.Exception -> Lb8
                r7.f63141b = r15     // Catch: java.lang.Exception -> Lb8
                r7.f63142c = r6     // Catch: java.lang.Exception -> Lb8
                r7.f63145f = r10     // Catch: java.lang.Exception -> Lb8
                java.lang.Object r0 = r0.k(r12, r7)     // Catch: java.lang.Exception -> Lb8
                if (r0 != r8) goto La0
                return r8
            La0:
                r1 = r14
                r13 = r15
            La2:
                wd.i$d r0 = (wd.i.d) r0     // Catch: java.lang.Exception -> L3d
                rd.d r12 = r0.b()     // Catch: java.lang.Exception -> L3d
                qd.e r13 = r13.Q()     // Catch: java.lang.Exception -> L3d
                kotlin.jvm.internal.AbstractC5504s.e(r12)     // Catch: java.lang.Exception -> L3d
                java.util.Date r0 = r6.b()     // Catch: java.lang.Exception -> L3d
                r13.v(r12, r0)     // Catch: java.lang.Exception -> L3d
                r9 = r10
                goto Lc2
            Lb8:
                r0 = move-exception
                r12 = r0
                r3 = r14
            Lbb:
                java.lang.String r13 = "Embedded update erroneously null when applying roll back to embedded directive"
                xd.b r0 = xd.EnumC7131b.f64346h
                r3.f(r13, r12, r0)
            Lc2:
                java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.b.a(r9)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: wd.s.a.c(android.content.Context, expo.modules.updates.d, xd.g, expo.modules.updates.db.UpdatesDatabase, Bd.h, java.io.File, rd.d, wd.u$c, Zd.e):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i.e d(v it) {
            AbstractC5504s.h(it, "it");
            return new i.e(true);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object e(android.content.Context r13, expo.modules.updates.d r14, xd.C7136g r15, expo.modules.updates.db.UpdatesDatabase r16, Bd.h r17, java.io.File r18, rd.d r19, wd.i.d r20, Zd.e r21) {
            /*
                r12 = this;
                r0 = r21
                boolean r1 = r0 instanceof wd.s.a.b
                if (r1 == 0) goto L16
                r1 = r0
                wd.s$a$b r1 = (wd.s.a.b) r1
                int r2 = r1.f63148c
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L16
                int r2 = r2 - r3
                r1.f63148c = r2
            L14:
                r11 = r1
                goto L1c
            L16:
                wd.s$a$b r1 = new wd.s$a$b
                r1.<init>(r0)
                goto L14
            L1c:
                java.lang.Object r0 = r11.f63146a
                java.lang.Object r1 = ae.AbstractC2605b.f()
                int r2 = r11.f63148c
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                Td.v.b(r0)
                goto L5e
            L2d:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L35:
                Td.v.b(r0)
                rd.d r0 = r20.b()
                wd.u r2 = r20.a()
                if (r2 == 0) goto L6b
                boolean r4 = r2 instanceof wd.u.c
                if (r4 == 0) goto L6b
                r10 = r2
                wd.u$c r10 = (wd.u.c) r10
                r11.f63148c = r3
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r8 = r18
                r9 = r19
                java.lang.Object r0 = r2.c(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r1) goto L5e
                return r1
            L5e:
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r13 = r0.booleanValue()
                wd.p r14 = new wd.p
                r15 = 0
                r14.<init>(r15, r13)
                return r14
            L6b:
                wd.p r13 = new wd.p
                r14 = 0
                r13.<init>(r0, r14)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: wd.s.a.e(android.content.Context, expo.modules.updates.d, xd.g, expo.modules.updates.db.UpdatesDatabase, Bd.h, java.io.File, rd.d, wd.i$d, Zd.e):java.lang.Object");
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, expo.modules.updates.d configuration, C7136g logger, UpdatesDatabase database, g mFileDownloader, File updatesDirectory, rd.d dVar, j loaderFiles) {
        super(context, configuration, logger, database, updatesDirectory, loaderFiles, null, 64, null);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(configuration, "configuration");
        AbstractC5504s.h(logger, "logger");
        AbstractC5504s.h(database, "database");
        AbstractC5504s.h(mFileDownloader, "mFileDownloader");
        AbstractC5504s.h(updatesDirectory, "updatesDirectory");
        AbstractC5504s.h(loaderFiles, "loaderFiles");
        this.f63137t = mFileDownloader;
        this.f63138u = dVar;
        this.f63139v = loaderFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L s(s sVar, C6306a c6306a, double d10) {
        sVar.e(c6306a, d10);
        return L.f17438a;
    }

    @Override // wd.i
    protected Object l(final C6306a c6306a, File file, expo.modules.updates.d dVar, rd.d dVar2, rd.d dVar3, Zd.e eVar) throws JSONException {
        return this.f63137t.l(c6306a, file, g.f62964h.a(this.f63138u, dVar3, dVar2), this.f63138u, dVar2, new Function1() { // from class: wd.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.s(this.f63133a, c6306a, ((Double) obj).doubleValue());
            }
        }, eVar);
    }

    @Override // wd.i
    protected Object m(UpdatesDatabase updatesDatabase, expo.modules.updates.d dVar, Zd.e eVar) {
        yd.q qVarE = this.f63139v.e(h(), dVar);
        return this.f63137t.r(g.f62964h.b(updatesDatabase, dVar, this.f63138u, qVarE != null ? qVarE.c() : null), eVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(Context context, expo.modules.updates.d configuration, C7136g logger, UpdatesDatabase database, g fileDownloader, File updatesDirectory, rd.d dVar) {
        this(context, configuration, logger, database, fileDownloader, updatesDirectory, dVar, new j());
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(configuration, "configuration");
        AbstractC5504s.h(logger, "logger");
        AbstractC5504s.h(database, "database");
        AbstractC5504s.h(fileDownloader, "fileDownloader");
        AbstractC5504s.h(updatesDirectory, "updatesDirectory");
    }
}
