package z6;

import K6.b;
import android.net.Uri;
import android.os.StrictMode;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.l0;
import com.facebook.imagepipeline.producers.p0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s5.InterfaceC6433d;
import u5.InterfaceC6739a;

/* JADX INFO: renamed from: z6.t */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7305t {

    /* JADX INFO: renamed from: n */
    public static final a f65740n = new a(null);

    /* JADX INFO: renamed from: o */
    private static final CancellationException f65741o = new CancellationException("Prefetching is not enabled");

    /* JADX INFO: renamed from: p */
    private static final CancellationException f65742p = new CancellationException("ImageRequest is null");

    /* JADX INFO: renamed from: q */
    private static final CancellationException f65743q = new CancellationException("Modified URL is null");

    /* JADX INFO: renamed from: a */
    private final W f65744a;

    /* JADX INFO: renamed from: b */
    private final y5.n f65745b;

    /* JADX INFO: renamed from: c */
    private final y5.n f65746c;

    /* JADX INFO: renamed from: d */
    private final G6.e f65747d;

    /* JADX INFO: renamed from: e */
    private final G6.d f65748e;

    /* JADX INFO: renamed from: f */
    private final x6.x f65749f;

    /* JADX INFO: renamed from: g */
    private final x6.x f65750g;

    /* JADX INFO: renamed from: h */
    private final x6.k f65751h;

    /* JADX INFO: renamed from: i */
    private final p0 f65752i;

    /* JADX INFO: renamed from: j */
    private final y5.n f65753j;

    /* JADX INFO: renamed from: k */
    private final AtomicLong f65754k;

    /* JADX INFO: renamed from: l */
    private final y5.n f65755l;

    /* JADX INFO: renamed from: m */
    private final InterfaceC7307v f65756m;

    /* JADX INFO: renamed from: z6.t$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: z6.t$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65757a;

        static {
            int[] iArr = new int[b.EnumC0172b.values().length];
            try {
                iArr[b.EnumC0172b.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.EnumC0172b.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.EnumC0172b.DYNAMIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65757a = iArr;
        }
    }

    public C7305t(W producerSequenceFactory, Set requestListeners, Set requestListener2s, y5.n isPrefetchEnabledSupplier, x6.x bitmapMemoryCache, x6.x encodedMemoryCache, y5.n diskCachesStoreSupplier, x6.k cacheKeyFactory, p0 threadHandoffProducerQueue, y5.n suppressBitmapPrefetchingSupplier, y5.n lazyDataSource, InterfaceC6739a interfaceC6739a, InterfaceC7307v config) {
        AbstractC5504s.h(producerSequenceFactory, "producerSequenceFactory");
        AbstractC5504s.h(requestListeners, "requestListeners");
        AbstractC5504s.h(requestListener2s, "requestListener2s");
        AbstractC5504s.h(isPrefetchEnabledSupplier, "isPrefetchEnabledSupplier");
        AbstractC5504s.h(bitmapMemoryCache, "bitmapMemoryCache");
        AbstractC5504s.h(encodedMemoryCache, "encodedMemoryCache");
        AbstractC5504s.h(diskCachesStoreSupplier, "diskCachesStoreSupplier");
        AbstractC5504s.h(cacheKeyFactory, "cacheKeyFactory");
        AbstractC5504s.h(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        AbstractC5504s.h(suppressBitmapPrefetchingSupplier, "suppressBitmapPrefetchingSupplier");
        AbstractC5504s.h(lazyDataSource, "lazyDataSource");
        AbstractC5504s.h(config, "config");
        this.f65744a = producerSequenceFactory;
        this.f65745b = isPrefetchEnabledSupplier;
        this.f65746c = diskCachesStoreSupplier;
        this.f65747d = new G6.c(requestListeners);
        this.f65748e = new G6.b(requestListener2s);
        this.f65754k = new AtomicLong();
        this.f65749f = bitmapMemoryCache;
        this.f65750g = encodedMemoryCache;
        this.f65751h = cacheKeyFactory;
        this.f65752i = threadHandoffProducerQueue;
        this.f65753j = suppressBitmapPrefetchingSupplier;
        this.f65755l = lazyDataSource;
        this.f65756m = config;
    }

    public static final boolean A(Uri uri, InterfaceC6433d key) {
        AbstractC5504s.h(uri, "$uri");
        AbstractC5504s.h(key, "key");
        return key.b(uri);
    }

    private final I5.c D(d0 d0Var, K6.b bVar, b.c cVar, Object obj, G6.e eVar, String str) {
        return E(d0Var, bVar, cVar, obj, eVar, str, null);
    }

    private final I5.c E(d0 d0Var, K6.b bVar, b.c cVar, Object obj, G6.e eVar, String str, Map map) {
        I5.c cVarB;
        if (!L6.b.d()) {
            com.facebook.imagepipeline.producers.F f10 = new com.facebook.imagepipeline.producers.F(s(bVar, eVar), this.f65748e);
            try {
                b.c cVarA = b.c.a(bVar.k(), cVar);
                AbstractC5504s.g(cVarA, "getMax(...)");
                l0 l0Var = new l0(bVar, p(), str, f10, obj, cVarA, false, bVar.p() || !G5.f.n(bVar.v()), bVar.o(), this.f65756m);
                l0Var.w(map);
                return A6.c.G(d0Var, l0Var, f10);
            } catch (Exception e10) {
                return I5.d.b(e10);
            }
        }
        L6.b.a("ImagePipeline#submitFetchRequest");
        try {
            com.facebook.imagepipeline.producers.F f11 = new com.facebook.imagepipeline.producers.F(s(bVar, eVar), this.f65748e);
            try {
                b.c cVarA2 = b.c.a(bVar.k(), cVar);
                AbstractC5504s.g(cVarA2, "getMax(...)");
                l0 l0Var2 = new l0(bVar, p(), str, f11, obj, cVarA2, false, bVar.p() || !G5.f.n(bVar.v()), bVar.o(), this.f65756m);
                l0Var2.w(map);
                cVarB = A6.c.G(d0Var, l0Var2, f11);
            } catch (Exception e11) {
                cVarB = I5.d.b(e11);
            }
            L6.b.b();
            return cVarB;
        } catch (Throwable th2) {
            L6.b.b();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final I5.c F(com.facebook.imagepipeline.producers.d0 r11, K6.b r12, K6.b.c r13, java.lang.Object r14, y6.f r15, G6.e r16) {
        /*
            r10 = this;
            com.facebook.imagepipeline.producers.F r3 = new com.facebook.imagepipeline.producers.F
            r0 = r16
            G6.e r0 = r10.s(r12, r0)
            G6.d r1 = r10.f65748e
            r3.<init>(r0, r1)
            android.net.Uri r0 = r12.v()
            java.lang.String r1 = "getSourceUri(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r0, r1)
            m6.c r1 = m6.C5644b.f53214b
            android.net.Uri r1 = r1.a(r0, r14)
            if (r1 != 0) goto L2a
            java.util.concurrent.CancellationException r11 = z6.C7305t.f65743q
            I5.c r11 = I5.d.b(r11)
            java.lang.String r12 = "immediateFailedDataSource(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r11, r12)
            return r11
        L2a:
            boolean r0 = kotlin.jvm.internal.AbstractC5504s.c(r0, r1)
            if (r0 == 0) goto L32
        L30:
            r1 = r12
            goto L3f
        L32:
            K6.c r12 = K6.c.b(r12)
            K6.c r12 = r12.R(r1)
            K6.b r12 = r12.a()
            goto L30
        L3f:
            K6.b$c r12 = r1.k()     // Catch: java.lang.Exception -> L69
            K6.b$c r5 = K6.b.c.a(r12, r13)     // Catch: java.lang.Exception -> L69
            java.lang.String r12 = "getMax(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r5, r12)     // Catch: java.lang.Exception -> L69
            com.facebook.imagepipeline.producers.l0 r0 = new com.facebook.imagepipeline.producers.l0     // Catch: java.lang.Exception -> L69
            java.lang.String r2 = r10.p()     // Catch: java.lang.Exception -> L69
            z6.v r12 = r10.f65756m     // Catch: java.lang.Exception -> L69
            z6.x r12 = r12.G()     // Catch: java.lang.Exception -> L69
            if (r12 == 0) goto L6c
            boolean r12 = r12.b()     // Catch: java.lang.Exception -> L69
            r13 = 1
            if (r12 != r13) goto L6c
            boolean r12 = r1.p()     // Catch: java.lang.Exception -> L69
            if (r12 == 0) goto L6c
        L67:
            r7 = r13
            goto L6e
        L69:
            r0 = move-exception
            r11 = r0
            goto L7d
        L6c:
            r13 = 0
            goto L67
        L6e:
            z6.v r9 = r10.f65756m     // Catch: java.lang.Exception -> L69
            r6 = 1
            r4 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L69
            A6.d$a r12 = A6.d.f317j     // Catch: java.lang.Exception -> L69
            I5.c r11 = r12.a(r11, r0, r3)     // Catch: java.lang.Exception -> L69
            return r11
        L7d:
            I5.c r11 = I5.d.b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.C7305t.F(com.facebook.imagepipeline.producers.d0, K6.b, K6.b$c, java.lang.Object, y6.f, G6.e):I5.c");
    }

    public static final boolean f(InterfaceC6433d it) {
        AbstractC5504s.h(it, "it");
        return true;
    }

    public static /* synthetic */ I5.c n(C7305t c7305t, K6.b bVar, Object obj, b.c cVar, G6.e eVar, String str, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            cVar = null;
        }
        if ((i10 & 8) != 0) {
            eVar = null;
        }
        if ((i10 & 16) != 0) {
            str = null;
        }
        return c7305t.m(bVar, obj, cVar, eVar, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean y(K6.b bVar) {
        Object obj = this.f65746c.get();
        AbstractC5504s.g(obj, "get(...)");
        InterfaceC7289c interfaceC7289c = (InterfaceC7289c) obj;
        InterfaceC6433d interfaceC6433dD = this.f65751h.d(bVar, null);
        String strF = bVar.f();
        if (strF != null) {
            x6.j jVar = (x6.j) interfaceC7289c.c().get(strF);
            if (jVar == null) {
                return false;
            }
            AbstractC5504s.e(interfaceC6433dD);
            return jVar.k(interfaceC6433dD);
        }
        Iterator it = interfaceC7289c.c().entrySet().iterator();
        while (it.hasNext()) {
            x6.j jVar2 = (x6.j) ((Map.Entry) it.next()).getValue();
            AbstractC5504s.e(interfaceC6433dD);
            if (jVar2.k(interfaceC6433dD)) {
                return true;
            }
        }
        return false;
    }

    private final y5.l z(final Uri uri) {
        return new y5.l() { // from class: z6.r
            @Override // y5.l
            public final boolean apply(Object obj) {
                return C7305t.A(uri, (InterfaceC6433d) obj);
            }
        };
    }

    public final I5.c B(K6.b bVar, Object obj) {
        return C(bVar, obj, y6.f.f64863c, null);
    }

    public final I5.c C(K6.b bVar, Object obj, y6.f priority, G6.e eVar) {
        AbstractC5504s.h(priority, "priority");
        if (!((Boolean) this.f65745b.get()).booleanValue()) {
            I5.c cVarB = I5.d.b(f65741o);
            AbstractC5504s.g(cVarB, "immediateFailedDataSource(...)");
            return cVarB;
        }
        if (bVar == null) {
            I5.c cVarB2 = I5.d.b(new NullPointerException("imageRequest is null"));
            AbstractC5504s.e(cVarB2);
            return cVarB2;
        }
        try {
            return F(this.f65744a.G(bVar), bVar, b.c.FULL_FETCH, obj, priority, eVar);
        } catch (Exception e10) {
            return I5.d.b(e10);
        }
    }

    public final void c() {
        e();
        d();
    }

    public final void d() {
        Object obj = this.f65746c.get();
        AbstractC5504s.g(obj, "get(...)");
        InterfaceC7289c interfaceC7289c = (InterfaceC7289c) obj;
        interfaceC7289c.b().h();
        interfaceC7289c.a().h();
        Iterator it = interfaceC7289c.c().entrySet().iterator();
        while (it.hasNext()) {
            ((x6.j) ((Map.Entry) it.next()).getValue()).h();
        }
    }

    public final void e() {
        y5.l lVar = new y5.l() { // from class: z6.s
            @Override // y5.l
            public final boolean apply(Object obj) {
                return C7305t.f((InterfaceC6433d) obj);
            }
        };
        this.f65749f.g(lVar);
        this.f65750g.g(lVar);
    }

    public final void g(Uri uri) {
        AbstractC5504s.h(uri, "uri");
        j(uri);
        i(uri);
    }

    public final void h(K6.b bVar) {
        if (bVar == null) {
            return;
        }
        InterfaceC6433d interfaceC6433dD = this.f65751h.d(bVar, null);
        Object obj = this.f65746c.get();
        AbstractC5504s.g(obj, "get(...)");
        InterfaceC7289c interfaceC7289c = (InterfaceC7289c) obj;
        x6.j jVarB = interfaceC7289c.b();
        AbstractC5504s.e(interfaceC6433dD);
        jVarB.s(interfaceC6433dD);
        interfaceC7289c.a().s(interfaceC6433dD);
        Iterator it = interfaceC7289c.c().entrySet().iterator();
        while (it.hasNext()) {
            ((x6.j) ((Map.Entry) it.next()).getValue()).s(interfaceC6433dD);
        }
    }

    public final void i(Uri uri) {
        K6.b bVarA = K6.b.a(uri);
        if (bVarA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        h(bVarA);
    }

    public final void j(Uri uri) {
        AbstractC5504s.h(uri, "uri");
        y5.l lVarZ = z(uri);
        this.f65749f.g(lVarZ);
        this.f65750g.g(lVarZ);
    }

    public final I5.c k(K6.b bVar, Object obj) {
        return n(this, bVar, obj, null, null, null, 24, null);
    }

    public final I5.c l(K6.b bVar, Object obj, b.c lowestPermittedRequestLevelOnSubmit) {
        AbstractC5504s.h(lowestPermittedRequestLevelOnSubmit, "lowestPermittedRequestLevelOnSubmit");
        return n(this, bVar, obj, lowestPermittedRequestLevelOnSubmit, null, null, 16, null);
    }

    public final I5.c m(K6.b bVar, Object obj, b.c cVar, G6.e eVar, String str) {
        if (bVar == null) {
            I5.c cVarB = I5.d.b(new NullPointerException());
            AbstractC5504s.g(cVarB, "immediateFailedDataSource(...)");
            return cVarB;
        }
        try {
            d0 d0VarE = this.f65744a.E(bVar);
            if (cVar == null) {
                cVar = b.c.FULL_FETCH;
            }
            return D(d0VarE, bVar, cVar, obj, eVar, str);
        } catch (Exception e10) {
            return I5.d.b(e10);
        }
    }

    public final I5.c o(K6.b imageRequest, Object obj) {
        AbstractC5504s.h(imageRequest, "imageRequest");
        return l(imageRequest, obj, b.c.BITMAP_MEMORY_CACHE);
    }

    public final String p() {
        return String.valueOf(this.f65754k.getAndIncrement());
    }

    public final x6.x q() {
        return this.f65749f;
    }

    public final x6.k r() {
        return this.f65751h;
    }

    public final G6.e s(K6.b bVar, G6.e eVar) {
        if (bVar != null) {
            return eVar == null ? bVar.q() == null ? this.f65747d : new G6.c(this.f65747d, bVar.q()) : bVar.q() == null ? new G6.c(this.f65747d, eVar) : new G6.c(this.f65747d, eVar, bVar.q());
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean t(K6.b bVar) {
        if (bVar == null) {
            return false;
        }
        InterfaceC6433d interfaceC6433dA = this.f65751h.a(bVar, null);
        x6.x xVar = this.f65749f;
        AbstractC5504s.e(interfaceC6433dA);
        C5.a aVar = xVar.get(interfaceC6433dA);
        try {
            return C5.a.H(aVar);
        } finally {
            C5.a.m(aVar);
        }
    }

    public final boolean u(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f65749f.f(z(uri));
    }

    public final boolean v(K6.b imageRequest) {
        boolean zK;
        AbstractC5504s.h(imageRequest, "imageRequest");
        Object obj = this.f65746c.get();
        AbstractC5504s.g(obj, "get(...)");
        InterfaceC7289c interfaceC7289c = (InterfaceC7289c) obj;
        InterfaceC6433d interfaceC6433dD = this.f65751h.d(imageRequest, null);
        b.EnumC0172b enumC0172bC = imageRequest.c();
        AbstractC5504s.g(enumC0172bC, "getCacheChoice(...)");
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            int i10 = b.f65757a[enumC0172bC.ordinal()];
            if (i10 == 1) {
                x6.j jVarB = interfaceC7289c.b();
                AbstractC5504s.e(interfaceC6433dD);
                zK = jVarB.k(interfaceC6433dD);
            } else if (i10 == 2) {
                x6.j jVarA = interfaceC7289c.a();
                AbstractC5504s.e(interfaceC6433dD);
                zK = jVarA.k(interfaceC6433dD);
            } else {
                if (i10 != 3) {
                    throw new Td.r();
                }
                zK = y(imageRequest);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return zK;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }

    public final boolean w(Uri uri) {
        return x(uri, b.EnumC0172b.SMALL) || x(uri, b.EnumC0172b.DEFAULT) || x(uri, b.EnumC0172b.DYNAMIC);
    }

    public final boolean x(Uri uri, b.EnumC0172b enumC0172b) {
        K6.b bVarA = K6.c.x(uri).A(enumC0172b).a();
        AbstractC5504s.e(bVarA);
        return v(bVarA);
    }
}
