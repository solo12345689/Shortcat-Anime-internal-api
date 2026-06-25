package K;

import U0.C2197e;
import U0.Y0;
import Y0.AbstractC2485u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.InterfaceC5011d;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class I {
    public static final int a(float f10) {
        return Math.round((float) Math.ceil(f10));
    }

    public static final H b(H h10, C2197e c2197e, Y0 y02, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar, boolean z10, int i10, int i11, int i12, List list) {
        AbstractC2485u.b bVar2;
        boolean z11;
        int i13;
        int i14;
        int i15;
        List list2;
        if (AbstractC5504s.c(h10.k(), c2197e) && AbstractC5504s.c(h10.j(), y02)) {
            z11 = z10;
            if (h10.i() == z11) {
                i13 = i10;
                if (!g1.v.g(h10.g(), i13)) {
                    bVar2 = bVar;
                    i14 = i11;
                    i15 = i12;
                    list2 = list;
                    return new H(c2197e, y02, i14, i15, z11, i13, interfaceC5011d, bVar2, list2, null);
                }
                i14 = i11;
                if (h10.d() != i14) {
                    bVar2 = bVar;
                    i15 = i12;
                    list2 = list;
                    return new H(c2197e, y02, i14, i15, z11, i13, interfaceC5011d, bVar2, list2, null);
                }
                i15 = i12;
                if (h10.e() != i15 || !AbstractC5504s.c(h10.a(), interfaceC5011d)) {
                    bVar2 = bVar;
                    list2 = list;
                    return new H(c2197e, y02, i14, i15, z11, i13, interfaceC5011d, bVar2, list2, null);
                }
                list2 = list;
                if (AbstractC5504s.c(h10.h(), list2)) {
                    bVar2 = bVar;
                    if (h10.b() == bVar2) {
                        return h10;
                    }
                } else {
                    bVar2 = bVar;
                }
                return new H(c2197e, y02, i14, i15, z11, i13, interfaceC5011d, bVar2, list2, null);
            }
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            z11 = z10;
        }
        i13 = i10;
        i14 = i11;
        i15 = i12;
        list2 = list;
        return new H(c2197e, y02, i14, i15, z11, i13, interfaceC5011d, bVar2, list2, null);
    }

    public static /* synthetic */ H c(H h10, C2197e c2197e, Y0 y02, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar, boolean z10, int i10, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            z10 = true;
        }
        if ((i13 & 64) != 0) {
            i10 = g1.v.f47323a.a();
        }
        if ((i13 & 128) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            i12 = 1;
        }
        return b(h10, c2197e, y02, interfaceC5011d, bVar, z10, i10, i11, i12, list);
    }
}
