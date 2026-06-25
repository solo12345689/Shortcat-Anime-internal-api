package z8;

import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import z8.C7324a;

/* JADX INFO: renamed from: z8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC7328e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final AbstractC7328e f65993a = a().f(10485760).d(200).b(ColorExtractionConstants.MAX_PIXEL_SAMPLES).c(604800000).e(81920).a();

    /* JADX INFO: renamed from: z8.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class a {
        a() {
        }

        abstract AbstractC7328e a();

        abstract a b(int i10);

        abstract a c(long j10);

        abstract a d(int i10);

        abstract a e(int i10);

        abstract a f(long j10);
    }

    AbstractC7328e() {
    }

    static a a() {
        return new C7324a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();
}
