package O5;

import K6.b;
import S5.b;
import android.content.Context;
import java.util.Set;
import s5.InterfaceC6433d;
import x6.k;
import z6.C7305t;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f extends S5.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C7305t f13025t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final h f13026u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private y5.f f13027v;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13028a;

        static {
            int[] iArr = new int[b.c.values().length];
            f13028a = iArr;
            try {
                iArr[b.c.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13028a[b.c.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13028a[b.c.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(Context context, h hVar, C7305t c7305t, Set set, Set set2) {
        super(context, set, set2);
        this.f13025t = c7305t;
        this.f13026u = hVar;
    }

    public static b.c F(b.c cVar) {
        int i10 = a.f13028a[cVar.ordinal()];
        if (i10 == 1) {
            return b.c.FULL_FETCH;
        }
        if (i10 == 2) {
            return b.c.DISK_CACHE;
        }
        if (i10 == 3) {
            return b.c.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + cVar + "is not supported. ");
    }

    private InterfaceC6433d G() {
        K6.b bVar = (K6.b) l();
        k kVarR = this.f13025t.r();
        if (kVarR == null || bVar == null) {
            return null;
        }
        return bVar.l() != null ? kVarR.b(bVar, d()) : kVarR.a(bVar, d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // S5.b
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public I5.c g(Y5.a aVar, String str, K6.b bVar, Object obj, b.c cVar) {
        return this.f13025t.m(bVar, obj, F(cVar), I(aVar), str);
    }

    protected G6.e I(Y5.a aVar) {
        if (aVar instanceof e) {
            return ((e) aVar).q0();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // S5.b
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public e v() {
        if (L6.b.d()) {
            L6.b.a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            Y5.a aVarN = n();
            String strC = S5.b.c();
            e eVarC = aVarN instanceof e ? (e) aVarN : this.f13026u.c();
            eVarC.s0(w(eVarC, strC), strC, G(), d(), this.f13027v);
            eVarC.t0(null, this);
            if (L6.b.d()) {
                L6.b.b();
            }
            return eVarC;
        } catch (Throwable th2) {
            if (L6.b.d()) {
                L6.b.b();
            }
            throw th2;
        }
    }

    public f K(l6.g gVar) {
        return (f) p();
    }
}
