package tg;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class V {

    /* JADX INFO: renamed from: a */
    public static final V f60993a = new V();

    /* JADX INFO: renamed from: b */
    private static final int f60994b = 65536;

    /* JADX INFO: renamed from: c */
    private static final U f60995c = new U(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d */
    private static final int f60996d;

    /* JADX INFO: renamed from: e */
    private static final AtomicReference[] f60997e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f60996d = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f60997e = atomicReferenceArr;
    }

    private V() {
    }

    private final AtomicReference a() {
        return f60997e[(int) (Thread.currentThread().getId() & (((long) f60996d) - 1))];
    }

    public static final void b(U segment) {
        AbstractC5504s.h(segment, "segment");
        if (segment.f60991f != null || segment.f60992g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f60989d) {
            return;
        }
        AtomicReference atomicReferenceA = f60993a.a();
        U u10 = f60995c;
        U u11 = (U) atomicReferenceA.getAndSet(u10);
        if (u11 == u10) {
            return;
        }
        int i10 = u11 != null ? u11.f60988c : 0;
        if (i10 >= f60994b) {
            atomicReferenceA.set(u11);
            return;
        }
        segment.f60991f = u11;
        segment.f60987b = 0;
        segment.f60988c = i10 + 8192;
        atomicReferenceA.set(segment);
    }

    public static final U c() {
        AtomicReference atomicReferenceA = f60993a.a();
        U u10 = f60995c;
        U u11 = (U) atomicReferenceA.getAndSet(u10);
        if (u11 == u10) {
            return new U();
        }
        if (u11 == null) {
            atomicReferenceA.set(null);
            return new U();
        }
        atomicReferenceA.set(u11.f60991f);
        u11.f60991f = null;
        u11.f60988c = 0;
        return u11;
    }
}
