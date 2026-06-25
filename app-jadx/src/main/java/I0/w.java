package I0;

import androidx.compose.ui.e;
import i1.C5009b;
import ie.InterfaceC5096o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends e.c implements K0.E {

    /* JADX INFO: renamed from: a */
    private InterfaceC5096o f8731a;

    public w(InterfaceC5096o interfaceC5096o) {
        this.f8731a = interfaceC5096o;
    }

    public final void E1(InterfaceC5096o interfaceC5096o) {
        this.f8731a = interfaceC5096o;
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo5measure3p2s80s(androidx.compose.ui.layout.l lVar, A a10, long j10) {
        return (C) this.f8731a.invoke(lVar, a10, C5009b.a(j10));
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f8731a + ')';
    }
}
