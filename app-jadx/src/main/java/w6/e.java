package w6;

import H6.D;
import H6.i;
import kotlin.jvm.internal.AbstractC5504s;
import z6.C7287a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f62937a = new e();

    private e() {
    }

    public static final d a(D poolFactory, I6.d platformDecoder, C7287a closeableReferenceFactory) {
        AbstractC5504s.h(poolFactory, "poolFactory");
        AbstractC5504s.h(platformDecoder, "platformDecoder");
        AbstractC5504s.h(closeableReferenceFactory, "closeableReferenceFactory");
        i iVarB = poolFactory.b();
        AbstractC5504s.g(iVarB, "getBitmapPool(...)");
        return new C6949a(iVarB, closeableReferenceFactory);
    }
}
