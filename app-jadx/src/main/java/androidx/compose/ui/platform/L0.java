package androidx.compose.ui.platform;

import Gf.AbstractC1617k;
import i0.AbstractC4993l;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L0 f27282a = new L0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f27283b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f27284c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f27285d = 8;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ If.g f27289d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(If.g gVar, Zd.e eVar) {
            super(2, eVar);
            this.f27289d = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new a(this.f27289d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0038, B:19:0x0040, B:14:0x002b, B:20:0x0054, B:13:0x0026), top: B:27:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0038, B:19:0x0040, B:14:0x002b, B:20:0x0054, B:13:0x0026), top: B:27:0x0007 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:17:0x0038). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r5.f27288c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r5.f27287b
                If.i r1 = (If.i) r1
                java.lang.Object r3 = r5.f27286a
                If.v r3 = (If.v) r3
                Td.v.b(r6)     // Catch: java.lang.Throwable -> L17
                goto L38
            L17:
                r6 = move-exception
                goto L5d
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L21:
                Td.v.b(r6)
                If.g r3 = r5.f27289d
                If.i r6 = r3.iterator()     // Catch: java.lang.Throwable -> L17
                r1 = r6
            L2b:
                r5.f27286a = r3     // Catch: java.lang.Throwable -> L17
                r5.f27287b = r1     // Catch: java.lang.Throwable -> L17
                r5.f27288c = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L17
                if (r6 != r0) goto L38
                return r0
            L38:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L17
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L17
                if (r6 == 0) goto L54
                java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L17
                Td.L r6 = (Td.L) r6     // Catch: java.lang.Throwable -> L17
                java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.L0.a()     // Catch: java.lang.Throwable -> L17
                r4 = 0
                r6.set(r4)     // Catch: java.lang.Throwable -> L17
                i0.l$a r6 = i0.AbstractC4993l.f48495e     // Catch: java.lang.Throwable -> L17
                r6.m()     // Catch: java.lang.Throwable -> L17
                goto L2b
            L54:
                Td.L r6 = Td.L.f17438a     // Catch: java.lang.Throwable -> L17
                r6 = 0
                If.n.a(r3, r6)
                Td.L r6 = Td.L.f17438a
                return r6
            L5d:
                throw r6     // Catch: java.lang.Throwable -> L5e
            L5e:
                r0 = move-exception
                If.n.a(r3, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.L0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ If.g f27290a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(If.g gVar) {
            super(1);
            this.f27290a = gVar;
        }

        public final void a(Object obj) {
            if (L0.f27284c.compareAndSet(false, true)) {
                this.f27290a.d(Td.L.f17438a);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return Td.L.f17438a;
        }
    }

    private L0() {
    }

    public final void b() {
        if (f27283b.compareAndSet(false, true)) {
            If.g gVarB = If.j.b(1, null, null, 6, null);
            AbstractC1617k.d(Gf.P.a(S.f27366m.b()), null, null, new a(gVarB, null), 3, null);
            AbstractC4993l.f48495e.j(new b(gVarB));
        }
    }
}
