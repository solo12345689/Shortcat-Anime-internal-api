package V0;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: V0.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2290f {

    /* JADX INFO: renamed from: a */
    public static final C2290f f19636a = new C2290f();

    private C2290f() {
    }

    public static final boolean b(Function2 function2, RectF rectF, RectF rectF2) {
        return ((Boolean) function2.invoke(rectF, rectF2)).booleanValue();
    }

    public final int[] c(o0 o0Var, RectF rectF, int i10, final Function2 function2) {
        SegmentFinder segmentFinderA;
        if (i10 == 1) {
            segmentFinderA = W0.a.f20599a.a(new W0.j(o0Var.G(), o0Var.I()));
        } else {
            AbstractC2286b.a();
            segmentFinderA = AbstractC2287c.a(AbstractC2285a.a(o0Var.G(), o0Var.H()));
        }
        return o0Var.i().getRangeForRect(rectF, segmentFinderA, new Layout.TextInclusionStrategy() { // from class: V0.e
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return C2290f.b(function2, rectF2, rectF3);
            }
        });
    }
}
