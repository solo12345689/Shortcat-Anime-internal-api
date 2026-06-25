package Pa;

import android.view.View;
import android.view.ViewParent;
import com.horcrux.svg.SvgView;
import com.horcrux.svg.VirtualView;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: a */
    public static final a f13751a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SvgView b(View view) {
            SvgView svgView;
            if (view instanceof VirtualView) {
                svgView = ((VirtualView) view).getSvgView();
                AbstractC5504s.e(svgView);
            } else {
                AbstractC5504s.f(view, "null cannot be cast to non-null type com.horcrux.svg.SvgView");
                svgView = (SvgView) view;
            }
            while (true) {
                ViewParent parent = svgView.getParent();
                AbstractC5504s.g(parent, "getParent(...)");
                if (!e(parent)) {
                    return svgView;
                }
                if (svgView.getParent() instanceof VirtualView) {
                    ViewParent parent2 = svgView.getParent();
                    AbstractC5504s.f(parent2, "null cannot be cast to non-null type com.horcrux.svg.VirtualView");
                    svgView = ((VirtualView) parent2).getSvgView();
                    AbstractC5504s.e(svgView);
                } else {
                    ViewParent parent3 = svgView.getParent();
                    AbstractC5504s.f(parent3, "null cannot be cast to non-null type com.horcrux.svg.SvgView");
                    svgView = (SvgView) parent3;
                }
            }
        }

        public static final int d(View it) {
            AbstractC5504s.h(it, "it");
            return it.getId();
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0056  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean c(android.view.View r11, float r12, float r13) {
            /*
                r10 = this;
                java.lang.String r0 = "view"
                kotlin.jvm.internal.AbstractC5504s.h(r11, r0)
                com.horcrux.svg.SvgView r0 = r10.b(r11)
                r1 = 0
                int[] r2 = new int[]{r1, r1}
                int[] r3 = new int[]{r1, r1}
                r11.getLocationOnScreen(r2)
                r0.getLocationOnScreen(r3)
                r4 = r2[r1]
                float r4 = (float) r4
                float r4 = r4 + r12
                r5 = r3[r1]
                float r5 = (float) r5
                float r4 = r4 - r5
                r5 = 1
                r2 = r2[r5]
                float r2 = (float) r2
                float r2 = r2 + r13
                r3 = r3[r5]
                float r3 = (float) r3
                float r2 = r2 - r3
                int r0 = r0.reactTagForTouch(r4, r2)
                int r2 = r11.getId()
                if (r2 != r0) goto L35
                r2 = r5
                goto L36
            L35:
                r2 = r1
            L36:
                int r3 = r11.getWidth()
                double r3 = (double) r3
                double r6 = (double) r12
                r8 = 0
                int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r12 > 0) goto L56
                int r12 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r12 > 0) goto L56
                int r12 = r11.getHeight()
                double r3 = (double) r12
                double r12 = (double) r13
                int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r6 > 0) goto L56
                int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
                if (r12 > 0) goto L56
                r12 = r5
                goto L57
            L56:
                r12 = r1
            L57:
                boolean r13 = r11 instanceof com.horcrux.svg.SvgView
                if (r13 == 0) goto L7a
                android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                Cf.i r11 = androidx.core.view.AbstractC2759g0.a(r11)
                Pa.f r13 = new Pa.f
                r13.<init>()
                Cf.i r11 = Cf.l.K(r11, r13)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
                boolean r11 = Cf.l.v(r11, r13)
                if (r2 != 0) goto L76
                if (r11 == 0) goto L79
            L76:
                if (r12 == 0) goto L79
                return r5
            L79:
                return r1
            L7a:
                if (r2 == 0) goto L7f
                if (r12 == 0) goto L7f
                return r5
            L7f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Pa.g.a.c(android.view.View, float, float):boolean");
        }

        public final boolean e(Object view) {
            AbstractC5504s.h(view, "view");
            return (view instanceof VirtualView) || (view instanceof SvgView);
        }

        private a() {
        }
    }
}
