package Gf;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class O0 extends Zd.a implements C0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O0 f7527b = new O0();

    private O0() {
        super(C0.f7490K);
    }

    @Override // Gf.C0
    public InterfaceC1612h0 C(boolean z10, boolean z11, Function1 function1) {
        return P0.f7528a;
    }

    @Override // Gf.C0
    public CancellationException D() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // Gf.C0
    public InterfaceC1612h0 H(Function1 function1) {
        return P0.f7528a;
    }

    @Override // Gf.C0
    public boolean b() {
        return true;
    }

    @Override // Gf.C0
    public Object h0(Zd.e eVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // Gf.C0
    public boolean start() {
        return false;
    }

    @Override // Gf.C0
    public InterfaceC1636u t1(InterfaceC1640w interfaceC1640w) {
        return P0.f7528a;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // Gf.C0
    public void k(CancellationException cancellationException) {
    }
}
