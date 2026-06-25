package z;

import Td.L;
import ke.AbstractC5466a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.C5498l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w.C6909m;
import w.InterfaceC6904i;
import w.u0;
import w.v0;

/* JADX INFO: renamed from: z.E, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7258E {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f65257f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f65258g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C6909m f65259h = new C6909m(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f65260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f65261b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C6909m f65262c = f65259h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f65263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f65264e;

    /* JADX INFO: renamed from: z.E$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6909m a() {
            return C7258E.f65259h;
        }

        public final boolean b(float f10) {
            return Math.abs(f10) < 0.01f;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: z.E$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f65265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f65266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f65267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f65268d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f65269e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f65271g;

        b(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65269e = obj;
            this.f65271g |= Integer.MIN_VALUE;
            return C7258E.this.h(null, null, this);
        }
    }

    /* JADX INFO: renamed from: z.E$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f65273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f65274c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f10, Function1 function1) {
            super(1);
            this.f65273b = f10;
            this.f65274c = function1;
        }

        public final void a(long j10) {
            if (C7258E.this.f65261b == Long.MIN_VALUE) {
                C7258E.this.f65261b = j10;
            }
            C6909m c6909m = new C6909m(C7258E.this.i());
            long jB = this.f65273b == 0.0f ? C7258E.this.f65260a.b(new C6909m(C7258E.this.i()), C7258E.f65257f.a(), C7258E.this.f65262c) : AbstractC5466a.f((j10 - C7258E.this.f65261b) / this.f65273b);
            float f10 = ((C6909m) C7258E.this.f65260a.d(jB, c6909m, C7258E.f65257f.a(), C7258E.this.f65262c)).f();
            C7258E c7258e = C7258E.this;
            c7258e.f65262c = (C6909m) c7258e.f65260a.e(jB, c6909m, C7258E.f65257f.a(), C7258E.this.f65262c);
            C7258E.this.f65261b = j10;
            float fI = C7258E.this.i() - f10;
            C7258E.this.j(f10);
            this.f65274c.invoke(Float.valueOf(fI));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: z.E$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f65276b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function1 function1) {
            super(1);
            this.f65276b = function1;
        }

        public final void a(long j10) {
            float fI = C7258E.this.i();
            C7258E.this.j(0.0f);
            this.f65276b.invoke(Float.valueOf(fI));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return L.f17438a;
        }
    }

    public C7258E(InterfaceC6904i interfaceC6904i) {
        this.f65260a = interfaceC6904i.a(u0.f(C5498l.f52289a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        if (Y.AbstractC2452v0.c(r0, r2) == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[Catch: all -> 0x00ae, PHI: r0 r2 r12 r13 r14
  0x0082: PHI (r0v9 ??) = (r0v3 ??), (r0v15 ??) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r2v4 z.E$b) = (r2v2 z.E$b), (r2v5 z.E$b) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r12v7 float) = (r12v4 float), (r12v8 float) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r13v7 kotlin.jvm.functions.Function1) = (r13v4 kotlin.jvm.functions.Function1), (r13v8 kotlin.jvm.functions.Function1) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r14v15 z.E) = (r14v9 z.E), (r14v16 z.E) binds: [B:30:0x007b, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ae, blocks: (B:36:0x00a2, B:31:0x0082, B:33:0x008c), top: B:59:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:36:0x00a2, B:31:0x0082, B:33:0x008c), top: B:59:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9 A[PHI: r0 r2 r13 r14
  0x00a9: PHI (r0v4 ??) = (r0v16 ??), (r0v17 ??) binds: [B:32:0x008a, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r2v3 z.E$b) = (r2v4 z.E$b), (r2v5 z.E$b) binds: [B:32:0x008a, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r13v5 kotlin.jvm.functions.Function1) = (r13v7 kotlin.jvm.functions.Function1), (r13v8 kotlin.jvm.functions.Function1) binds: [B:32:0x008a, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r14v11 z.E) = (r14v15 z.E), (r14v16 z.E) binds: [B:32:0x008a, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [ie.a] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12, types: [ie.a] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [ie.a] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [z.E] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [z.E] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009f -> B:59:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(kotlin.jvm.functions.Function1 r12, ie.InterfaceC5082a r13, Zd.e r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C7258E.h(kotlin.jvm.functions.Function1, ie.a, Zd.e):java.lang.Object");
    }

    public final float i() {
        return this.f65264e;
    }

    public final void j(float f10) {
        this.f65264e = f10;
    }
}
