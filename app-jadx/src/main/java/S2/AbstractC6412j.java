package s2;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: s2.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6412j {
    public static void a(Spannable spannable, float f10, int i10, int i11, int i12) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i10, i11, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i10 && spannable.getSpanEnd(relativeSizeSpan) >= i11) {
                f10 *= relativeSizeSpan.getSizeChange();
            }
            c(spannable, relativeSizeSpan, i10, i11, i12);
        }
        spannable.setSpan(new RelativeSizeSpan(f10), i10, i11, i12);
    }

    public static void b(Spannable spannable, Object obj, int i10, int i11, int i12) {
        for (Object obj2 : spannable.getSpans(i10, i11, obj.getClass())) {
            c(spannable, obj2, i10, i11, i12);
        }
        spannable.setSpan(obj, i10, i11, i12);
    }

    private static void c(Spannable spannable, Object obj, int i10, int i11, int i12) {
        if (spannable.getSpanStart(obj) == i10 && spannable.getSpanEnd(obj) == i11 && spannable.getSpanFlags(obj) == i12) {
            spannable.removeSpan(obj);
        }
    }
}
