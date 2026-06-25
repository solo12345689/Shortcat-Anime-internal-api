package P7;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements LineHeightSpan, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13522a;

    public b(float f10) {
        this.f13522a = (int) Math.ceil(f10);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fm) {
        AbstractC5504s.h(text, "text");
        AbstractC5504s.h(fm, "fm");
        int i14 = this.f13522a;
        double d10 = (i14 - ((-r9) + fm.descent)) / 2.0f;
        fm.ascent = fm.ascent - ((int) Math.ceil(d10));
        fm.descent += (int) Math.floor(d10);
        if (i10 == 0) {
            fm.top = fm.ascent;
        }
        if (i11 == text.length()) {
            fm.bottom = fm.descent;
        }
    }
}
