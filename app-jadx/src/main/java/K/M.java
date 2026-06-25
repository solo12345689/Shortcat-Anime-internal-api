package K;

import U0.InterfaceC2230v;
import U0.Y0;
import Ud.AbstractC2279u;
import Y0.AbstractC2485u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.AbstractC5010c;
import i1.AbstractC5026s;
import i1.InterfaceC5011d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f9789a = Df.r.G("H", 10);

    public static final long a(Y0 y02, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar, String str, int i10) {
        InterfaceC2230v interfaceC2230vA = U0.A.a(str, y02, AbstractC5010c.b(0, 0, 0, 0, 15, null), interfaceC5011d, bVar, (64 & 32) != 0 ? AbstractC2279u.m() : AbstractC2279u.m(), (64 & 64) != 0 ? AbstractC2279u.m() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : i10, (64 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? false : false);
        return AbstractC5026s.a(I.a(interfaceC2230vA.f()), I.a(interfaceC2230vA.getHeight()));
    }

    public static /* synthetic */ long b(Y0 y02, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar, String str, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = f9789a;
        }
        if ((i11 & 16) != 0) {
            i10 = 1;
        }
        return a(y02, interfaceC5011d, bVar, str, i10);
    }

    public static final String c() {
        return f9789a;
    }
}
