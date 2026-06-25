package U4;

import U4.f;
import U4.i;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import o5.AbstractC5830g;
import p5.AbstractC5933a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class h implements f.a, Runnable, Comparable, AbstractC5933a.f {

    /* JADX INFO: renamed from: I */
    public static final S4.g f19163I = S4.g.e("glide_thread_priority_override");

    /* JADX INFO: renamed from: A */
    private S4.f f19164A;

    /* JADX INFO: renamed from: B */
    private Object f19165B;

    /* JADX INFO: renamed from: C */
    private S4.a f19166C;

    /* JADX INFO: renamed from: D */
    private com.bumptech.glide.load.data.d f19167D;

    /* JADX INFO: renamed from: E */
    private volatile U4.f f19168E;

    /* JADX INFO: renamed from: F */
    private volatile boolean f19169F;

    /* JADX INFO: renamed from: G */
    private volatile boolean f19170G;

    /* JADX INFO: renamed from: H */
    private boolean f19171H;

    /* JADX INFO: renamed from: d */
    private final e f19175d;

    /* JADX INFO: renamed from: e */
    private final K1.d f19176e;

    /* JADX INFO: renamed from: h */
    private com.bumptech.glide.d f19179h;

    /* JADX INFO: renamed from: i */
    private S4.f f19180i;

    /* JADX INFO: renamed from: j */
    private com.bumptech.glide.g f19181j;

    /* JADX INFO: renamed from: k */
    private n f19182k;

    /* JADX INFO: renamed from: l */
    private int f19183l;

    /* JADX INFO: renamed from: m */
    private int f19184m;

    /* JADX INFO: renamed from: n */
    private j f19185n;

    /* JADX INFO: renamed from: o */
    private S4.h f19186o;

    /* JADX INFO: renamed from: p */
    private b f19187p;

    /* JADX INFO: renamed from: q */
    private int f19188q;

    /* JADX INFO: renamed from: r */
    private EnumC0328h f19189r;

    /* JADX INFO: renamed from: s */
    private g f19190s;

    /* JADX INFO: renamed from: t */
    private long f19191t;

    /* JADX INFO: renamed from: u */
    private boolean f19192u;

    /* JADX INFO: renamed from: v */
    private Object f19193v;

    /* JADX INFO: renamed from: w */
    private com.bumptech.glide.e f19194w;

    /* JADX INFO: renamed from: x */
    private Supplier f19195x;

    /* JADX INFO: renamed from: y */
    private Thread f19196y;

    /* JADX INFO: renamed from: z */
    private S4.f f19197z;

    /* JADX INFO: renamed from: a */
    private final U4.g f19172a = new U4.g();

    /* JADX INFO: renamed from: b */
    private final List f19173b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final p5.c f19174c = p5.c.a();

    /* JADX INFO: renamed from: f */
    private final d f19177f = new d();

    /* JADX INFO: renamed from: g */
    private final f f19178g = new f();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f19198a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f19199b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f19200c;

        static {
            int[] iArr = new int[S4.c.values().length];
            f19200c = iArr;
            try {
                iArr[S4.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19200c[S4.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0328h.values().length];
            f19199b = iArr2;
            try {
                iArr2[EnumC0328h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19199b[EnumC0328h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19199b[EnumC0328h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19199b[EnumC0328h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19199b[EnumC0328h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f19198a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19198a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19198a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface b {
        void a(q qVar);

        void b(v vVar, S4.a aVar, boolean z10);

        void c(h hVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c implements i.a {

        /* JADX INFO: renamed from: a */
        private final S4.a f19201a;

        c(S4.a aVar) {
            this.f19201a = aVar;
        }

        @Override // U4.i.a
        public v a(v vVar) {
            return h.this.D(this.f19201a, vVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d {

        /* JADX INFO: renamed from: a */
        private S4.f f19203a;

        /* JADX INFO: renamed from: b */
        private S4.k f19204b;

        /* JADX INFO: renamed from: c */
        private u f19205c;

        d() {
        }

        void a() {
            this.f19203a = null;
            this.f19204b = null;
            this.f19205c = null;
        }

        void b(e eVar, S4.h hVar) {
            p5.b.a("DecodeJob.encode");
            try {
                eVar.a().b(this.f19203a, new U4.e(this.f19204b, this.f19205c, hVar));
            } finally {
                this.f19205c.e();
                p5.b.e();
            }
        }

        boolean c() {
            return this.f19205c != null;
        }

        void d(S4.f fVar, S4.k kVar, u uVar) {
            this.f19203a = fVar;
            this.f19204b = kVar;
            this.f19205c = uVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface e {
        W4.a a();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class f {

        /* JADX INFO: renamed from: a */
        private boolean f19206a;

        /* JADX INFO: renamed from: b */
        private boolean f19207b;

        /* JADX INFO: renamed from: c */
        private boolean f19208c;

        f() {
        }

        private boolean a(boolean z10) {
            return (this.f19208c || z10 || this.f19207b) && this.f19206a;
        }

        synchronized boolean b() {
            this.f19207b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f19208c = true;
            return a(false);
        }

        synchronized boolean d(boolean z10) {
            this.f19206a = true;
            return a(z10);
        }

        synchronized void e() {
            this.f19207b = false;
            this.f19206a = false;
            this.f19208c = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: renamed from: U4.h$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private enum EnumC0328h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, K1.d dVar) {
        this.f19175d = eVar;
        this.f19176e = dVar;
    }

    private void A() {
        if (this.f19194w.a(c.d.class)) {
            H();
        }
        L();
        this.f19187p.a(new q("Failed to load resource", new ArrayList(this.f19173b)));
        C();
    }

    private void B() {
        if (this.f19178g.b()) {
            F();
        }
    }

    private void C() {
        if (this.f19178g.c()) {
            F();
        }
    }

    private void F() {
        this.f19178g.e();
        this.f19177f.a();
        this.f19172a.a();
        this.f19169F = false;
        this.f19179h = null;
        this.f19180i = null;
        this.f19186o = null;
        this.f19181j = null;
        this.f19182k = null;
        this.f19187p = null;
        this.f19189r = null;
        this.f19168E = null;
        this.f19196y = null;
        this.f19197z = null;
        this.f19165B = null;
        this.f19166C = null;
        this.f19167D = null;
        this.f19191t = 0L;
        this.f19170G = false;
        this.f19193v = null;
        this.f19173b.clear();
        this.f19176e.a(this);
    }

    private void G(g gVar) {
        this.f19190s = gVar;
        this.f19187p.c(this);
    }

    private void H() {
        if (!this.f19194w.a(c.d.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.f19195x;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e10) {
            this.f19195x = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e10);
            }
        }
    }

    private void I() {
        this.f19196y = Thread.currentThread();
        this.f19191t = AbstractC5830g.b();
        boolean zB = false;
        while (!this.f19170G && this.f19168E != null && !(zB = this.f19168E.b())) {
            this.f19189r = s(this.f19189r);
            this.f19168E = r();
            if (this.f19189r == EnumC0328h.SOURCE) {
                G(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f19189r == EnumC0328h.FINISHED || this.f19170G) && !zB) {
            A();
        }
    }

    private v J(Object obj, S4.a aVar, t tVar) {
        S4.h hVarT = t(aVar);
        com.bumptech.glide.load.data.e eVarL = this.f19179h.h().l(obj);
        try {
            return tVar.a(eVarL, hVarT, this.f19183l, this.f19184m, new c(aVar));
        } finally {
            eVarL.b();
        }
    }

    private void K() {
        int i10 = a.f19198a[this.f19190s.ordinal()];
        if (i10 == 1) {
            this.f19189r = s(EnumC0328h.INITIALIZE);
            this.f19168E = r();
            I();
        } else if (i10 == 2) {
            I();
        } else {
            if (i10 == 3) {
                q();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f19190s);
        }
    }

    private void L() {
        Throwable th2;
        this.f19174c.c();
        if (!this.f19169F) {
            this.f19169F = true;
            return;
        }
        if (this.f19173b.isEmpty()) {
            th2 = null;
        } else {
            List list = this.f19173b;
            th2 = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th2);
    }

    private v n(com.bumptech.glide.load.data.d dVar, Object obj, S4.a aVar) {
        if (obj == null) {
            dVar.b();
            return null;
        }
        try {
            long jB = AbstractC5830g.b();
            v vVarP = p(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                w("Decoded result " + vVarP, jB);
            }
            return vVarP;
        } finally {
            dVar.b();
        }
    }

    private v p(Object obj, S4.a aVar) {
        return J(obj, aVar, this.f19172a.h(obj.getClass()));
    }

    private void q() {
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            x("Retrieved data", this.f19191t, "data: " + this.f19165B + ", cache key: " + this.f19197z + ", fetcher: " + this.f19167D);
        }
        v vVarN = null;
        if (this.f19194w.a(c.d.class) && (supplier = this.f19195x) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f19195x.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e10) {
                this.f19195x = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e10);
                }
            }
        }
        try {
            vVarN = n(this.f19167D, this.f19165B, this.f19166C);
        } catch (q e11) {
            e11.i(this.f19164A, this.f19166C);
            this.f19173b.add(e11);
        }
        if (vVarN != null) {
            z(vVarN, this.f19166C, this.f19171H);
        } else {
            I();
        }
    }

    private U4.f r() {
        int i10 = a.f19199b[this.f19189r.ordinal()];
        if (i10 == 1) {
            return new w(this.f19172a, this);
        }
        if (i10 == 2) {
            return new U4.c(this.f19172a, this);
        }
        if (i10 == 3) {
            return new z(this.f19172a, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f19189r);
    }

    private EnumC0328h s(EnumC0328h enumC0328h) {
        int i10 = a.f19199b[enumC0328h.ordinal()];
        if (i10 == 1) {
            return this.f19185n.a() ? EnumC0328h.DATA_CACHE : s(EnumC0328h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f19192u ? EnumC0328h.FINISHED : EnumC0328h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return EnumC0328h.FINISHED;
        }
        if (i10 == 5) {
            return this.f19185n.b() ? EnumC0328h.RESOURCE_CACHE : s(EnumC0328h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0328h);
    }

    private S4.h t(S4.a aVar) {
        S4.h hVar = this.f19186o;
        if (Build.VERSION.SDK_INT < 26) {
            return hVar;
        }
        boolean z10 = aVar == S4.a.RESOURCE_DISK_CACHE || this.f19172a.x();
        S4.g gVar = b5.r.f33190j;
        Boolean bool = (Boolean) hVar.c(gVar);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return hVar;
        }
        S4.h hVar2 = new S4.h();
        hVar2.d(this.f19186o);
        hVar2.e(gVar, Boolean.valueOf(z10));
        return hVar2;
    }

    private int u() {
        return this.f19181j.ordinal();
    }

    private void w(String str, long j10) {
        x(str, j10, null);
    }

    private void x(String str, long j10, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(AbstractC5830g.a(j10));
        sb2.append(", load key: ");
        sb2.append(this.f19182k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb2.toString());
    }

    private void y(v vVar, S4.a aVar, boolean z10) {
        if (this.f19194w.a(c.d.class)) {
            H();
        }
        L();
        this.f19187p.b(vVar, aVar, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void z(v vVar, S4.a aVar, boolean z10) {
        u uVar;
        p5.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (vVar instanceof r) {
                ((r) vVar).initialize();
            }
            if (this.f19177f.c()) {
                vVar = u.c(vVar);
                uVar = vVar;
            } else {
                uVar = 0;
            }
            y(vVar, aVar, z10);
            this.f19189r = EnumC0328h.ENCODE;
            try {
                if (this.f19177f.c()) {
                    this.f19177f.b(this.f19175d, this.f19186o);
                }
                B();
                p5.b.e();
            } finally {
                if (uVar != 0) {
                    uVar.e();
                }
            }
        } catch (Throwable th2) {
            p5.b.e();
            throw th2;
        }
    }

    v D(S4.a aVar, v vVar) {
        v vVarA;
        S4.l lVar;
        S4.c cVarA;
        S4.f dVar;
        Class<?> cls = vVar.get().getClass();
        S4.k kVarN = null;
        if (aVar != S4.a.RESOURCE_DISK_CACHE) {
            S4.l lVarS = this.f19172a.s(cls);
            lVar = lVarS;
            vVarA = lVarS.a(this.f19179h, vVar, this.f19183l, this.f19184m);
        } else {
            vVarA = vVar;
            lVar = null;
        }
        if (!vVar.equals(vVarA)) {
            vVar.recycle();
        }
        if (this.f19172a.w(vVarA)) {
            kVarN = this.f19172a.n(vVarA);
            cVarA = kVarN.a(this.f19186o);
        } else {
            cVarA = S4.c.NONE;
        }
        S4.k kVar = kVarN;
        if (!this.f19185n.d(!this.f19172a.y(this.f19197z), aVar, cVarA)) {
            return vVarA;
        }
        if (kVar == null) {
            throw new h.d(vVarA.get().getClass());
        }
        int i10 = a.f19200c[cVarA.ordinal()];
        if (i10 == 1) {
            dVar = new U4.d(this.f19197z, this.f19180i);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVarA);
            }
            dVar = new x(this.f19172a.b(), this.f19197z, this.f19180i, this.f19183l, this.f19184m, lVar, cls, this.f19186o);
        }
        u uVarC = u.c(vVarA);
        this.f19177f.d(dVar, kVar, uVarC);
        return uVarC;
    }

    void E(boolean z10) {
        if (this.f19178g.d(z10)) {
            F();
        }
    }

    boolean M() {
        EnumC0328h enumC0328hS = s(EnumC0328h.INITIALIZE);
        return enumC0328hS == EnumC0328h.RESOURCE_CACHE || enumC0328hS == EnumC0328h.DATA_CACHE;
    }

    @Override // U4.f.a
    public void a(S4.f fVar, Object obj, com.bumptech.glide.load.data.d dVar, S4.a aVar, S4.f fVar2) {
        this.f19197z = fVar;
        this.f19165B = obj;
        this.f19167D = dVar;
        this.f19166C = aVar;
        this.f19164A = fVar2;
        this.f19171H = fVar != this.f19172a.c().get(0);
        if (Thread.currentThread() != this.f19196y) {
            G(g.DECODE_DATA);
            return;
        }
        p5.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            q();
        } finally {
            p5.b.e();
        }
    }

    public void b() {
        this.f19170G = true;
        U4.f fVar = this.f19168E;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // U4.f.a
    public void c(S4.f fVar, Exception exc, com.bumptech.glide.load.data.d dVar, S4.a aVar) {
        dVar.b();
        q qVar = new q("Fetching data failed", exc);
        qVar.j(fVar, aVar, dVar.a());
        this.f19173b.add(qVar);
        if (Thread.currentThread() != this.f19196y) {
            G(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            I();
        }
    }

    @Override // p5.AbstractC5933a.f
    public p5.c h() {
        return this.f19174c;
    }

    @Override // U4.f.a
    public void k() {
        G(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: m */
    public int compareTo(h hVar) {
        int iU = u() - hVar.u();
        return iU == 0 ? this.f19188q - hVar.f19188q : iU;
    }

    @Override // java.lang.Runnable
    public void run() {
        p5.b.c("DecodeJob#run(reason=%s, model=%s)", this.f19190s, this.f19193v);
        com.bumptech.glide.load.data.d dVar = this.f19167D;
        try {
            try {
                try {
                    if (this.f19170G) {
                        A();
                        if (dVar != null) {
                            dVar.b();
                        }
                        p5.b.e();
                        return;
                    }
                    K();
                    if (dVar != null) {
                        dVar.b();
                    }
                    p5.b.e();
                } catch (Throwable th2) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f19170G + ", stage: " + this.f19189r, th2);
                    }
                    if (this.f19189r != EnumC0328h.ENCODE) {
                        this.f19173b.add(th2);
                        A();
                    }
                    if (!this.f19170G) {
                        throw th2;
                    }
                    throw th2;
                }
            } catch (U4.b e10) {
                throw e10;
            }
        } catch (Throwable th3) {
            if (dVar != null) {
                dVar.b();
            }
            p5.b.e();
            throw th3;
        }
    }

    h v(com.bumptech.glide.d dVar, Object obj, n nVar, S4.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, j jVar, Map map, boolean z10, boolean z11, boolean z12, S4.h hVar, b bVar, int i12) {
        this.f19172a.v(dVar, obj, fVar, i10, i11, jVar, cls, cls2, gVar, hVar, map, z10, z11, this.f19175d);
        this.f19179h = dVar;
        this.f19180i = fVar;
        this.f19181j = gVar;
        this.f19182k = nVar;
        this.f19183l = i10;
        this.f19184m = i11;
        this.f19185n = jVar;
        this.f19192u = z12;
        this.f19186o = hVar;
        this.f19187p = bVar;
        this.f19188q = i12;
        this.f19190s = g.INITIALIZE;
        this.f19193v = obj;
        this.f19194w = dVar.f();
        this.f19195x = (Supplier) hVar.c(f19163I);
        return this;
    }
}
