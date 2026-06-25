package K;

import a1.C2527U;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f10238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f10239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f10241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10242f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f10243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C2527U f10244b;

        public a(a aVar, C2527U c2527u) {
            this.f10243a = aVar;
            this.f10244b = c2527u;
        }

        public final a a() {
            return this.f10243a;
        }

        public final C2527U b() {
            return this.f10244b;
        }

        public final void c(a aVar) {
            this.f10243a = aVar;
        }

        public final void d(C2527U c2527u) {
            this.f10244b = c2527u;
        }
    }

    public j0(int i10) {
        this.f10237a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d() {
        /*
            r3 = this;
            K.j0$a r0 = r3.f10238b
            r1 = 0
            if (r0 == 0) goto La
            K.j0$a r2 = r0.a()
            goto Lb
        La:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            goto L25
        Le:
            if (r0 == 0) goto L1b
            K.j0$a r2 = r0.a()
            if (r2 == 0) goto L1b
            K.j0$a r2 = r2.a()
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L23
            K.j0$a r0 = r0.a()
            goto Le
        L23:
            if (r0 != 0) goto L26
        L25:
            return
        L26:
            r0.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K.j0.d():void");
    }

    public static /* synthetic */ void f(j0 j0Var, C2527U c2527u, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = l0.a();
        }
        j0Var.e(c2527u, j10);
    }

    public final void a() {
        this.f10242f = true;
    }

    public final void b(C2527U c2527u) {
        C2527U c2527uB;
        this.f10242f = false;
        a aVar = this.f10238b;
        if (AbstractC5504s.c(c2527u, aVar != null ? aVar.b() : null)) {
            return;
        }
        String strL = c2527u.l();
        a aVar2 = this.f10238b;
        if (AbstractC5504s.c(strL, (aVar2 == null || (c2527uB = aVar2.b()) == null) ? null : c2527uB.l())) {
            a aVar3 = this.f10238b;
            if (aVar3 == null) {
                return;
            }
            aVar3.d(c2527u);
            return;
        }
        this.f10238b = new a(this.f10238b, c2527u);
        this.f10239c = null;
        int length = this.f10240d + c2527u.l().length();
        this.f10240d = length;
        if (length > this.f10237a) {
            d();
        }
    }

    public final C2527U c() {
        a aVar = this.f10239c;
        if (aVar == null) {
            return null;
        }
        this.f10239c = aVar.a();
        this.f10238b = new a(this.f10238b, aVar.b());
        this.f10240d += aVar.b().l().length();
        return aVar.b();
    }

    public final void e(C2527U c2527u, long j10) {
        if (!this.f10242f) {
            Long l10 = this.f10241e;
            if (j10 <= (l10 != null ? l10.longValue() : 0L) + ((long) k0.a())) {
                return;
            }
        }
        this.f10241e = Long.valueOf(j10);
        b(c2527u);
    }

    public final C2527U g() {
        a aVarA;
        a aVar = this.f10238b;
        if (aVar == null || (aVarA = aVar.a()) == null) {
            return null;
        }
        this.f10238b = aVarA;
        this.f10240d -= aVar.b().l().length();
        this.f10239c = new a(this.f10239c, aVar.b());
        return aVarA.b();
    }

    public /* synthetic */ j0(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 100000 : i10);
    }
}
