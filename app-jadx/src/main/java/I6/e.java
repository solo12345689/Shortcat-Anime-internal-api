package I6;

import H6.D;
import H6.i;
import android.os.Build;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f8852a = new e();

    private e() {
    }

    public static final d a(D poolFactory, boolean z10, boolean z11, f platformDecoderOptions) {
        AbstractC5504s.h(poolFactory, "poolFactory");
        AbstractC5504s.h(platformDecoderOptions, "platformDecoderOptions");
        if (Build.VERSION.SDK_INT >= 26) {
            i iVarB = poolFactory.b();
            AbstractC5504s.g(iVarB, "getBitmapPool(...)");
            return new c(iVarB, b(poolFactory, z11), platformDecoderOptions);
        }
        i iVarB2 = poolFactory.b();
        AbstractC5504s.g(iVarB2, "getBitmapPool(...)");
        return new a(iVarB2, b(poolFactory, z11), platformDecoderOptions);
    }

    public static final K1.d b(D poolFactory, boolean z10) {
        AbstractC5504s.h(poolFactory, "poolFactory");
        if (z10) {
            B5.b INSTANCE = B5.b.f1565a;
            AbstractC5504s.g(INSTANCE, "INSTANCE");
            return INSTANCE;
        }
        int iE = poolFactory.e();
        K1.e eVar = new K1.e(iE);
        for (int i10 = 0; i10 < iE; i10++) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(B5.b.e());
            AbstractC5504s.g(byteBufferAllocate, "allocate(...)");
            eVar.a(byteBufferAllocate);
        }
        return eVar;
    }
}
