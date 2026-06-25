package x;

import K0.AbstractC1792i;
import K0.InterfaceC1790h;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC2739w0;
import q0.InterfaceC6065k;

/* JADX INFO: renamed from: x.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7026x extends e.c implements InterfaceC1790h, InterfaceC6065k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f63389a;

    private final A0.b E1() {
        return (A0.b) AbstractC1792i.a(this, AbstractC2739w0.j());
    }

    @Override // q0.InterfaceC6065k
    public void P0(androidx.compose.ui.focus.i iVar) {
        iVar.g(!A0.a.f(E1().a(), A0.a.f96b.b()));
    }

    @Override // androidx.compose.ui.e.c
    public boolean getShouldAutoInvalidate() {
        return this.f63389a;
    }
}
