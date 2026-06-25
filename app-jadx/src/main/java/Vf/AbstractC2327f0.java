package Vf;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Vf.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2327f0 {
    public static final void a(int i10, int i11, Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.l(i13));
            }
            i12 >>>= 1;
        }
        throw new Rf.c(arrayList, descriptor.o());
    }
}
