package If;

import Gf.AbstractC1597a;
import Gf.D0;
import Gf.I0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h extends AbstractC1597a implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f9162d;

    public h(Zd.i iVar, g gVar, boolean z10, boolean z11) {
        super(iVar, z10, z11);
        this.f9162d = gVar;
    }

    @Override // Gf.I0
    public void A(Throwable th2) {
        CancellationException cancellationExceptionI0 = I0.I0(this, th2, null, 1, null);
        this.f9162d.k(cancellationExceptionI0);
        x(cancellationExceptionI0);
    }

    protected final g U0() {
        return this.f9162d;
    }

    @Override // If.v
    public Object a(Zd.e eVar) {
        return this.f9162d.a(eVar);
    }

    @Override // If.w
    public void c(Function1 function1) {
        this.f9162d.c(function1);
    }

    @Override // If.w
    public Object d(Object obj) {
        return this.f9162d.d(obj);
    }

    @Override // If.w
    public Object e(Object obj, Zd.e eVar) {
        return this.f9162d.e(obj, eVar);
    }

    @Override // If.v
    public Object f() {
        return this.f9162d.f();
    }

    @Override // If.w
    public boolean i(Throwable th2) {
        return this.f9162d.i(th2);
    }

    @Override // If.v
    public i iterator() {
        return this.f9162d.iterator();
    }

    @Override // Gf.I0, Gf.C0
    public final void k(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new D0(J(), null, this);
        }
        A(cancellationException);
    }

    @Override // If.w
    public boolean m() {
        return this.f9162d.m();
    }
}
