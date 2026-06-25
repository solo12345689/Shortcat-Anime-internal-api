package s6;

import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC5504s;
import w5.g;
import x6.n;
import z6.InterfaceC7302p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f59249a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f59250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static InterfaceC6436a f59251c;

    private b() {
    }

    public static final InterfaceC6436a a(w6.d dVar, InterfaceC7302p interfaceC7302p, n nVar, boolean z10, boolean z11, int i10, int i11, ExecutorService executorService) {
        if (!f59250b) {
            try {
                Class cls = Boolean.TYPE;
                Class cls2 = Integer.TYPE;
                Object objNewInstance = AnimatedFactoryV2Impl.class.getConstructor(w6.d.class, InterfaceC7302p.class, n.class, cls, cls, cls2, cls2, g.class).newInstance(dVar, interfaceC7302p, nVar, Boolean.valueOf(z10), Boolean.valueOf(z11), Integer.valueOf(i10), Integer.valueOf(i11), executorService);
                AbstractC5504s.f(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
                f59251c = (InterfaceC6436a) objNewInstance;
            } catch (Throwable unused) {
            }
            if (f59251c != null) {
                f59250b = true;
            }
        }
        return f59251c;
    }
}
