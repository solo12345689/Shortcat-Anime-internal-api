package A4;

import A4.i;
import Df.r;
import Td.AbstractC2156g;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.adjust.sdk.Constants;
import dg.C;
import dg.C4623d;
import dg.E;
import dg.F;
import dg.x;
import java.io.IOException;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.AbstractC6690o;
import tg.InterfaceC6685j;
import tg.K;
import v4.InterfaceC6845d;
import x4.p;
import x4.q;
import y4.InterfaceC7199a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f283f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C4623d f284g = new C4623d.a().d().e().a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C4623d f285h = new C4623d.a().d().f().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G4.m f287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f290e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Lazy f291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lazy f292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f293c;

        public b(Lazy lazy, Lazy lazy2, boolean z10) {
            this.f291a = lazy;
            this.f292b = lazy2;
            this.f293c = z10;
        }

        private final boolean c(Uri uri) {
            return AbstractC5504s.c(uri.getScheme(), "http") || AbstractC5504s.c(uri.getScheme(), Constants.SCHEME);
        }

        @Override // A4.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, G4.m mVar, InterfaceC6845d interfaceC6845d) {
            if (c(uri)) {
                return new k(uri.toString(), mVar, this.f291a, this.f292b, this.f293c);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f294a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f296c;

        c(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f294a = obj;
            this.f296c |= Integer.MIN_VALUE;
            return k.this.c(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f300d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f302f;

        d(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f300d = obj;
            this.f302f |= Integer.MIN_VALUE;
            return k.this.a(this);
        }
    }

    public k(String str, G4.m mVar, Lazy lazy, Lazy lazy2, boolean z10) {
        this.f286a = str;
        this.f287b = mVar;
        this.f288c = lazy;
        this.f289d = lazy2;
        this.f290e = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(dg.C r5, Zd.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof A4.k.c
            if (r0 == 0) goto L13
            r0 = r6
            A4.k$c r0 = (A4.k.c) r0
            int r1 = r0.f296c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f296c = r1
            goto L18
        L13:
            A4.k$c r0 = new A4.k$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f294a
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f296c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Td.v.b(r6)
            goto L72
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Td.v.b(r6)
            boolean r6 = L4.j.q()
            if (r6 == 0) goto L5d
            G4.m r6 = r4.f287b
            G4.b r6 = r6.k()
            boolean r6 = r6.b()
            if (r6 != 0) goto L57
            kotlin.Lazy r6 = r4.f288c
            java.lang.Object r6 = r6.getValue()
            dg.e$a r6 = (dg.InterfaceC4624e.a) r6
            dg.e r5 = r6.a(r5)
            dg.E r5 = r5.b()
            goto L75
        L57:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L5d:
            kotlin.Lazy r6 = r4.f288c
            java.lang.Object r6 = r6.getValue()
            dg.e$a r6 = (dg.InterfaceC4624e.a) r6
            dg.e r5 = r6.a(r5)
            r0.f296c = r3
            java.lang.Object r6 = L4.b.a(r5, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            r5 = r6
            dg.E r5 = (dg.E) r5
        L75:
            boolean r6 = r5.J()
            if (r6 != 0) goto L92
            int r6 = r5.o()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto L92
            dg.F r6 = r5.j()
            if (r6 == 0) goto L8c
            L4.j.d(r6)
        L8c:
            F4.d r6 = new F4.d
            r6.<init>(r5)
            throw r6
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.k.c(dg.C, Zd.e):java.lang.Object");
    }

    private final String d() {
        String strH = this.f287b.h();
        return strH == null ? this.f286a : strH;
    }

    private final AbstractC6690o e() {
        Object value = this.f289d.getValue();
        AbstractC5504s.e(value);
        return ((InterfaceC7199a) value).getFileSystem();
    }

    private final boolean g(C c10, E e10) {
        if (this.f287b.i().c()) {
            return !this.f290e || F4.b.f6542c.c(c10, e10);
        }
        return false;
    }

    private final C h() {
        C.a aVarF = new C.a().m(this.f286a).f(this.f287b.j());
        for (Map.Entry entry : this.f287b.o().a().entrySet()) {
            Object key = entry.getKey();
            AbstractC5504s.f(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            aVarF.j((Class) key, entry.getValue());
        }
        boolean zB = this.f287b.i().b();
        boolean zB2 = this.f287b.k().b();
        if (!zB2 && zB) {
            aVarF.c(C4623d.f45362p);
        } else if (!zB2 || zB) {
            if (!zB2 && !zB) {
                aVarF.c(f285h);
            }
        } else if (this.f287b.i().c()) {
            aVarF.c(C4623d.f45361o);
        } else {
            aVarF.c(f284g);
        }
        return aVarF.b();
    }

    private final InterfaceC7199a.c i() {
        InterfaceC7199a interfaceC7199a;
        if (!this.f287b.i().b() || (interfaceC7199a = (InterfaceC7199a) this.f289d.getValue()) == null) {
            return null;
        }
        return interfaceC7199a.b(d());
    }

    private final F4.a j(InterfaceC7199a.c cVar) throws Throwable {
        Throwable th2;
        F4.a aVar;
        try {
            InterfaceC6685j interfaceC6685jD = K.d(e().q(cVar.getMetadata()));
            try {
                aVar = new F4.a(interfaceC6685jD);
                if (interfaceC6685jD != null) {
                    try {
                        interfaceC6685jD.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } else {
                    th2 = null;
                }
            } catch (Throwable th4) {
                if (interfaceC6685jD != null) {
                    try {
                        interfaceC6685jD.close();
                    } catch (Throwable th5) {
                        AbstractC2156g.a(th4, th5);
                    }
                }
                th2 = th4;
                aVar = null;
            }
            if (th2 != null) {
                throw th2;
            }
            AbstractC5504s.e(aVar);
            return aVar;
        } catch (IOException unused) {
            return null;
        }
    }

    private final x4.f k(E e10) {
        return e10.S() != null ? x4.f.NETWORK : x4.f.DISK;
    }

    private final p l(F f10) {
        return q.a(f10.k(), this.f287b.g());
    }

    private final p m(InterfaceC7199a.c cVar) {
        return q.c(cVar.e(), e(), d(), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2 A[Catch: all -> 0x007e, Exception -> 0x0081, TRY_LEAVE, TryCatch #10 {Exception -> 0x0081, blocks: (B:15:0x002b, B:18:0x0036, B:37:0x0089, B:71:0x0103, B:38:0x008e, B:30:0x007a, B:39:0x008f, B:55:0x00c2, B:70:0x0100, B:74:0x010b, B:67:0x00f8, B:75:0x010c, B:52:0x00bb), top: B:99:0x002b, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010c A[Catch: all -> 0x007e, Exception -> 0x0081, TRY_LEAVE, TryCatch #10 {Exception -> 0x0081, blocks: (B:15:0x002b, B:18:0x0036, B:37:0x0089, B:71:0x0103, B:38:0x008e, B:30:0x007a, B:39:0x008f, B:55:0x00c2, B:70:0x0100, B:74:0x010b, B:67:0x00f8, B:75:0x010c, B:52:0x00bb), top: B:99:0x002b, outer: #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final y4.InterfaceC7199a.c n(y4.InterfaceC7199a.c r6, dg.C r7, dg.E r8, F4.a r9) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.k.n(y4.a$c, dg.C, dg.E, F4.a):y4.a$c");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x012d A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:72:0x0189, B:54:0x011f, B:56:0x012d, B:58:0x013b, B:61:0x0144, B:63:0x014e, B:65:0x0156, B:67:0x016e), top: B:81:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:72:0x0189, B:54:0x011f, B:56:0x012d, B:58:0x013b, B:61:0x0144, B:63:0x014e, B:65:0x0156, B:67:0x016e), top: B:81:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // A4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(Zd.e r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.k.a(Zd.e):java.lang.Object");
    }

    public final String f(String str, x xVar) {
        String strJ;
        String string = xVar != null ? xVar.toString() : null;
        if ((string == null || r.Q(string, "text/plain", false, 2, null)) && (strJ = L4.j.j(MimeTypeMap.getSingleton(), str)) != null) {
            return strJ;
        }
        if (string != null) {
            return r.d1(string, ';', null, 2, null);
        }
        return null;
    }
}
