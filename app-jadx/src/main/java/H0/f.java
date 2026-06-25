package h0;

import Y.InterfaceC2453v1;
import h0.p;
import ie.InterfaceC5082a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class f implements z, InterfaceC2453v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v f47550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p f47551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f47553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object[] f47554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p.a f47555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC5082a f47556g = new InterfaceC5082a() { // from class: h0.e
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return f.i(this.f47549a);
        }
    };

    public f(v vVar, p pVar, String str, Object obj, Object[] objArr) {
        this.f47550a = vVar;
        this.f47551b = pVar;
        this.f47552c = str;
        this.f47553d = obj;
        this.f47554e = objArr;
    }

    private final void g() {
        p pVar = this.f47551b;
        if (this.f47555f == null) {
            if (pVar != null) {
                d.h(pVar, this.f47556g.invoke());
                this.f47555f = pVar.f(this.f47552c, this.f47556g);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.f47555f + ") is not null").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(f fVar) {
        v vVar = fVar.f47550a;
        Object obj = fVar.f47553d;
        if (obj != null) {
            return vVar.a(fVar, obj);
        }
        throw new IllegalArgumentException("Value should be initialized");
    }

    @Override // h0.z
    public boolean a(Object obj) {
        p pVar = this.f47551b;
        return pVar == null || pVar.a(obj);
    }

    @Override // Y.InterfaceC2453v1
    public void c() {
        g();
    }

    @Override // Y.InterfaceC2453v1
    public void d() {
        p.a aVar = this.f47555f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // Y.InterfaceC2453v1
    public void e() {
        p.a aVar = this.f47555f;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final Object f(Object[] objArr) {
        if (Arrays.equals(objArr, this.f47554e)) {
            return this.f47553d;
        }
        return null;
    }

    public final void h(v vVar, p pVar, String str, Object obj, Object[] objArr) {
        boolean z10;
        boolean z11 = true;
        if (this.f47551b != pVar) {
            this.f47551b = pVar;
            z10 = true;
        } else {
            z10 = false;
        }
        if (AbstractC5504s.c(this.f47552c, str)) {
            z11 = z10;
        } else {
            this.f47552c = str;
        }
        this.f47550a = vVar;
        this.f47553d = obj;
        this.f47554e = objArr;
        p.a aVar = this.f47555f;
        if (aVar == null || !z11) {
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.f47555f = null;
        g();
    }
}
