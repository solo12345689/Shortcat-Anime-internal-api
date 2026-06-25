package O5;

import E6.m;
import V5.AbstractC2310a;
import V5.InterfaceC2312c;
import V5.o;
import V5.q;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import l6.l;
import s5.InterfaceC6433d;
import x6.x;
import y5.i;
import y5.k;
import y5.n;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e extends S5.a {

    /* JADX INFO: renamed from: M */
    private static final Class f13011M = e.class;

    /* JADX INFO: renamed from: A */
    private final D6.a f13012A;

    /* JADX INFO: renamed from: B */
    private final y5.f f13013B;

    /* JADX INFO: renamed from: C */
    private final x f13014C;

    /* JADX INFO: renamed from: D */
    private InterfaceC6433d f13015D;

    /* JADX INFO: renamed from: E */
    private n f13016E;

    /* JADX INFO: renamed from: F */
    private boolean f13017F;

    /* JADX INFO: renamed from: G */
    private y5.f f13018G;

    /* JADX INFO: renamed from: H */
    private P5.a f13019H;

    /* JADX INFO: renamed from: I */
    private Set f13020I;

    /* JADX INFO: renamed from: J */
    private K6.b f13021J;

    /* JADX INFO: renamed from: K */
    private K6.b[] f13022K;

    /* JADX INFO: renamed from: L */
    private K6.b f13023L;

    /* JADX INFO: renamed from: z */
    private final Resources f13024z;

    public e(Resources resources, R5.a aVar, D6.a aVar2, D6.a aVar3, Executor executor, x xVar, y5.f fVar) {
        super(aVar, executor, null, null);
        this.f13024z = resources;
        this.f13012A = new a(resources, aVar2, aVar3);
        this.f13013B = fVar;
        this.f13014C = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o l0(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof o) {
            return (o) drawable;
        }
        if (drawable instanceof InterfaceC2312c) {
            return l0(((InterfaceC2312c) drawable).b());
        }
        if (drawable instanceof AbstractC2310a) {
            AbstractC2310a abstractC2310a = (AbstractC2310a) drawable;
            int iD = abstractC2310a.d();
            for (int i10 = 0; i10 < iD; i10++) {
                o oVarL0 = l0(abstractC2310a.b(i10));
                if (oVarL0 != null) {
                    return oVarL0;
                }
            }
        }
        return null;
    }

    private void r0(n nVar) {
        this.f13016E = nVar;
        v0(null);
    }

    private Drawable u0(y5.f fVar, E6.e eVar) {
        Drawable drawableB;
        if (fVar == null) {
            return null;
        }
        Iterator<E> it = fVar.iterator();
        while (it.hasNext()) {
            D6.a aVar = (D6.a) it.next();
            if (aVar.a(eVar) && (drawableB = aVar.b(eVar)) != null) {
                return drawableB;
            }
        }
        return null;
    }

    private void v0(E6.e eVar) {
        if (this.f13017F) {
            if (s() == null) {
                T5.a aVar = new T5.a();
                k(new U5.a(aVar));
                b0(aVar);
            }
            if (s() instanceof T5.a) {
                C0(eVar, (T5.a) s());
            }
        }
    }

    @Override // S5.a
    protected Uri A() {
        return l.a(this.f13021J, this.f13023L, this.f13022K, K6.b.f10883A);
    }

    public void A0(y5.f fVar) {
        this.f13018G = fVar;
    }

    public void B0(boolean z10) {
        this.f13017F = z10;
    }

    protected void C0(E6.e eVar, T5.a aVar) {
        o oVarL0;
        aVar.j(w());
        Y5.b bVarF = f();
        q qVarA = null;
        if (bVarF != null && (oVarL0 = l0(bVarF.d())) != null) {
            qVarA = oVarL0.A();
        }
        aVar.m(qVarA);
        String strN0 = n0();
        if (strN0 != null) {
            aVar.b("cc", strN0);
        }
        if (eVar == null) {
            aVar.i();
        } else {
            aVar.k(eVar.getWidth(), eVar.getHeight());
            aVar.l(eVar.A());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // S5.a
    protected void Q(Drawable drawable) {
        if (drawable instanceof N5.a) {
            ((N5.a) drawable).a();
        }
    }

    @Override // S5.a, Y5.a
    public void g(Y5.b bVar) {
        super.g(bVar);
        v0(null);
    }

    public synchronized void j0(G6.e eVar) {
        try {
            if (this.f13020I == null) {
                this.f13020I = new HashSet();
            }
            this.f13020I.add(eVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // S5.a
    /* JADX INFO: renamed from: k0 */
    public Drawable m(C5.a aVar) {
        try {
            if (L6.b.d()) {
                L6.b.a("PipelineDraweeController#createDrawable");
            }
            k.i(C5.a.H(aVar));
            E6.e eVar = (E6.e) aVar.C();
            v0(eVar);
            Drawable drawableU0 = u0(this.f13018G, eVar);
            if (drawableU0 != null) {
                if (L6.b.d()) {
                    L6.b.b();
                }
                return drawableU0;
            }
            Drawable drawableU02 = u0(this.f13013B, eVar);
            if (drawableU02 != null) {
                if (L6.b.d()) {
                    L6.b.b();
                }
                return drawableU02;
            }
            Drawable drawableB = this.f13012A.b(eVar);
            if (drawableB != null) {
                if (L6.b.d()) {
                    L6.b.b();
                }
                return drawableB;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + eVar);
        } catch (Throwable th2) {
            if (L6.b.d()) {
                L6.b.b();
            }
            throw th2;
        }
    }

    @Override // S5.a
    /* JADX INFO: renamed from: m0 */
    public C5.a o() {
        InterfaceC6433d interfaceC6433d;
        if (L6.b.d()) {
            L6.b.a("PipelineDraweeController#getCachedImage");
        }
        try {
            x xVar = this.f13014C;
            if (xVar != null && (interfaceC6433d = this.f13015D) != null) {
                C5.a aVar = xVar.get(interfaceC6433d);
                if (aVar != null && !((E6.e) aVar.C()).x1().a()) {
                    aVar.close();
                    return null;
                }
                if (L6.b.d()) {
                    L6.b.b();
                }
                return aVar;
            }
            if (L6.b.d()) {
                L6.b.b();
            }
            return null;
        } finally {
            if (L6.b.d()) {
                L6.b.b();
            }
        }
    }

    protected String n0() {
        Object objP = p();
        if (objP == null) {
            return null;
        }
        return objP.toString();
    }

    @Override // S5.a
    /* JADX INFO: renamed from: o0 */
    public int y(C5.a aVar) {
        if (aVar != null) {
            return aVar.D();
        }
        return 0;
    }

    @Override // S5.a
    /* JADX INFO: renamed from: p0 */
    public m z(C5.a aVar) {
        k.i(C5.a.H(aVar));
        return ((E6.e) aVar.C()).B1();
    }

    public synchronized G6.e q0() {
        Set set = this.f13020I;
        if (set == null) {
            return null;
        }
        return new G6.c(set);
    }

    public void s0(n nVar, String str, InterfaceC6433d interfaceC6433d, Object obj, y5.f fVar) {
        if (L6.b.d()) {
            L6.b.a("PipelineDraweeController#initialize");
        }
        super.E(str, obj);
        r0(nVar);
        this.f13015D = interfaceC6433d;
        A0(fVar);
        v0(null);
        if (L6.b.d()) {
            L6.b.b();
        }
    }

    @Override // S5.a
    protected I5.c t() {
        if (L6.b.d()) {
            L6.b.a("PipelineDraweeController#getDataSource");
        }
        if (AbstractC7283a.w(2)) {
            AbstractC7283a.y(f13011M, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        I5.c cVar = (I5.c) this.f13016E.get();
        if (L6.b.d()) {
            L6.b.b();
        }
        return cVar;
    }

    protected synchronized void t0(l6.g gVar, S5.b bVar) {
        try {
            P5.a aVar = this.f13019H;
            if (aVar != null) {
                aVar.f();
            }
            if (gVar != null) {
                if (this.f13019H == null) {
                    this.f13019H = new P5.a(AwakeTimeSinceBootClock.get(), this);
                }
                this.f13019H.c(gVar);
                this.f13019H.g(true);
            }
            this.f13021J = (K6.b) bVar.l();
            this.f13022K = (K6.b[]) bVar.k();
            this.f13023L = (K6.b) bVar.m();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // S5.a
    public String toString() {
        return i.b(this).b("super", super.toString()).b("dataSourceSupplier", this.f13016E).toString();
    }

    @Override // S5.a
    /* JADX INFO: renamed from: w0 */
    public Map L(m mVar) {
        if (mVar == null) {
            return null;
        }
        return mVar.getExtras();
    }

    @Override // S5.a
    /* JADX INFO: renamed from: x0 */
    public void N(String str, C5.a aVar) {
        super.N(str, aVar);
        synchronized (this) {
        }
    }

    @Override // S5.a
    /* JADX INFO: renamed from: y0 */
    public void S(C5.a aVar) {
        C5.a.m(aVar);
    }

    public synchronized void z0(G6.e eVar) {
        Set set = this.f13020I;
        if (set == null) {
            return;
        }
        set.remove(eVar);
    }
}
