package S;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.C5015h;
import kotlin.jvm.internal.AbstractC5504s;
import s0.C6385r0;
import s0.F1;
import s0.G1;
import s0.H1;
import x0.AbstractC7043o;
import x0.C7032d;
import x0.C7034f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static C7032d f15611a;

    public static final C7032d a(R.a aVar) {
        C7032d c7032d = f15611a;
        if (c7032d != null) {
            AbstractC5504s.e(c7032d);
            return c7032d;
        }
        C7032d.a aVar2 = new C7032d.a("Filled.Close", C5015h.n(24.0f), C5015h.n(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iA = AbstractC7043o.a();
        F1 f12 = new F1(C6385r0.f58985b.a(), null);
        int iA2 = G1.f58877a.a();
        int iA3 = H1.f58881a.a();
        C7034f c7034f = new C7034f();
        c7034f.i(19.0f, 6.41f);
        c7034f.g(17.59f, 5.0f);
        c7034f.g(12.0f, 10.59f);
        c7034f.g(6.41f, 5.0f);
        c7034f.g(5.0f, 6.41f);
        c7034f.g(10.59f, 12.0f);
        c7034f.g(5.0f, 17.59f);
        c7034f.g(6.41f, 19.0f);
        c7034f.g(12.0f, 13.41f);
        c7034f.g(17.59f, 19.0f);
        c7034f.g(19.0f, 17.59f);
        c7034f.g(13.41f, 12.0f);
        c7034f.a();
        C7032d c7032dF = aVar2.c(c7034f.d(), (14336 & 2) != 0 ? AbstractC7043o.a() : iA, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : f12, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? AbstractC7043o.b() : iA2, (14336 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? AbstractC7043o.c() : iA3, (14336 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).f();
        f15611a = c7032dF;
        AbstractC5504s.e(c7032dF);
        return c7032dF;
    }
}
