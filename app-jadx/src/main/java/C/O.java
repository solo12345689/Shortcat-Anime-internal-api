package C;

import K0.s0;
import androidx.compose.ui.e;
import i1.InterfaceC5011d;
import l0.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class O extends e.c implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e.c f2032a;

    public O(e.c cVar) {
        this.f2032a = cVar;
    }

    @Override // K0.s0
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
    public F b(InterfaceC5011d interfaceC5011d, Object obj) {
        F f10 = obj instanceof F ? (F) obj : null;
        if (f10 == null) {
            f10 = new F(0.0f, false, null, null, 15, null);
        }
        f10.e(AbstractC1141l.f2145a.b(this.f2032a));
        return f10;
    }

    public final void F1(e.c cVar) {
        this.f2032a = cVar;
    }
}
