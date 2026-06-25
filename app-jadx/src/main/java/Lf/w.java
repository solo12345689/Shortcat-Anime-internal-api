package Lf;

import Gf.InterfaceC1612h0;
import Gf.InterfaceC1623n;
import Gf.V;
import Gf.Y;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class w extends Gf.K implements Y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Y f11602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Gf.K f11603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f11604e;

    /* JADX WARN: Multi-variable type inference failed */
    public w(Gf.K k10, String str) {
        Y y10 = k10 instanceof Y ? (Y) k10 : null;
        this.f11602c = y10 == null ? V.a() : y10;
        this.f11603d = k10;
        this.f11604e = str;
    }

    @Override // Gf.Y
    public InterfaceC1612h0 B0(long j10, Runnable runnable, Zd.i iVar) {
        return this.f11602c.B0(j10, runnable, iVar);
    }

    @Override // Gf.K
    public void D1(Zd.i iVar, Runnable runnable) {
        this.f11603d.D1(iVar, runnable);
    }

    @Override // Gf.Y
    public void G0(long j10, InterfaceC1623n interfaceC1623n) {
        this.f11602c.G0(j10, interfaceC1623n);
    }

    @Override // Gf.K
    public void O1(Zd.i iVar, Runnable runnable) {
        this.f11603d.O1(iVar, runnable);
    }

    @Override // Gf.K
    public boolean S1(Zd.i iVar) {
        return this.f11603d.S1(iVar);
    }

    @Override // Gf.K
    public String toString() {
        return this.f11604e;
    }
}
