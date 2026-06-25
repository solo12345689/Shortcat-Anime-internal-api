package s0;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;
import r0.C6230l;

/* JADX INFO: renamed from: s0.h0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6358h0 {
    public static final a Companion = new a(null);
    private final long intrinsicSize;

    /* JADX INFO: renamed from: s0.h0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AbstractC6358h0 c(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = I1.f58895a.a();
            }
            return aVar.b(list, f10, f11, i10);
        }

        public final AbstractC6358h0 a(List list, long j10, long j11, int i10) {
            return new C6353f1(list, null, j10, j11, i10, null);
        }

        public final AbstractC6358h0 b(List list, float f10, float f11, int i10) {
            return a(list, C6224f.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L)), C6224f.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L)), i10);
        }

        private a() {
        }
    }

    public /* synthetic */ AbstractC6358h0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: applyTo-Pq9zytI */
    public abstract void mo965applyToPq9zytI(long j10, InterfaceC6368k1 interfaceC6368k1, float f10);

    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo968getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    private AbstractC6358h0() {
        this.intrinsicSize = C6230l.f58350b.a();
    }
}
