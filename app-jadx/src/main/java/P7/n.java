package P7;

import android.text.TextPaint;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f13536a;

    public n(TextPaint textPaint) {
        AbstractC5504s.h(textPaint, "textPaint");
        this.f13536a = textPaint;
    }

    public final TextPaint a() {
        return this.f13536a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && AbstractC5504s.c(this.f13536a, ((n) obj).f13536a);
    }

    public int hashCode() {
        return this.f13536a.hashCode();
    }

    public String toString() {
        return "ReactTextPaintHolderSpan(textPaint=" + this.f13536a + ")";
    }
}
