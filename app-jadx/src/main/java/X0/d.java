package X0;

import V0.q0;
import android.graphics.Paint;
import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21571a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f21571a = iArr;
        }
    }

    public static final float a(Layout layout, int i10, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i10);
        if (!q0.m(layout, i10) || layout.getParagraphDirection(i10) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i10) + layout.getEllipsisStart(i10)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment == null ? -1 : a.f21571a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return fAbs + width;
    }

    public static /* synthetic */ float b(Layout layout, int i10, Paint paint, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            paint = layout.getPaint();
        }
        return a(layout, i10, paint);
    }

    public static final float c(Layout layout, int i10, Paint paint) {
        float width;
        float width2;
        if (!q0.m(layout, i10)) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i10) != -1 || layout.getWidth() >= layout.getLineRight(i10)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i10) - layout.getPrimaryHorizontal(layout.getLineStart(i10) + layout.getEllipsisStart(i10))) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment != null ? a.f21571a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = (layout.getWidth() - lineRight) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = layout.getWidth() - lineRight;
        }
        return width - width2;
    }

    public static /* synthetic */ float d(Layout layout, int i10, Paint paint, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            paint = layout.getPaint();
        }
        return c(layout, i10, paint);
    }
}
