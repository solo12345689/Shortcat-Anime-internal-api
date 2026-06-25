package J1;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Spannable {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextPaint f9225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f9226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f9227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f9228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f9229e;

        /* JADX INFO: renamed from: J1.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static class C0126a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextPaint f9230a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f9232c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f9233d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f9231b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0126a(TextPaint textPaint) {
                this.f9230a = textPaint;
            }

            public a a() {
                return new a(this.f9230a, this.f9231b, this.f9232c, this.f9233d);
            }

            public C0126a b(int i10) {
                this.f9232c = i10;
                return this;
            }

            public C0126a c(int i10) {
                this.f9233d = i10;
                return this;
            }

            public C0126a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f9231b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f9229e = l.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f9229e = null;
            }
            this.f9225a = textPaint;
            this.f9226b = textDirectionHeuristic;
            this.f9227c = i10;
            this.f9228d = i11;
        }

        public boolean a(a aVar) {
            if (this.f9227c == aVar.b() && this.f9228d == aVar.c() && this.f9225a.getTextSize() == aVar.e().getTextSize() && this.f9225a.getTextScaleX() == aVar.e().getTextScaleX() && this.f9225a.getTextSkewX() == aVar.e().getTextSkewX() && this.f9225a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f9225a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f9225a.getFlags() == aVar.e().getFlags() && this.f9225a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f9225a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f9225a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f9227c;
        }

        public int c() {
            return this.f9228d;
        }

        public TextDirectionHeuristic d() {
            return this.f9226b;
        }

        public TextPaint e() {
            return this.f9225a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f9226b == aVar.d();
        }

        public int hashCode() {
            return K1.b.b(Float.valueOf(this.f9225a.getTextSize()), Float.valueOf(this.f9225a.getTextScaleX()), Float.valueOf(this.f9225a.getTextSkewX()), Float.valueOf(this.f9225a.getLetterSpacing()), Integer.valueOf(this.f9225a.getFlags()), this.f9225a.getTextLocales(), this.f9225a.getTypeface(), Boolean.valueOf(this.f9225a.isElegantTextHeight()), this.f9226b, Integer.valueOf(this.f9227c), Integer.valueOf(this.f9228d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f9225a.getTextSize());
            sb2.append(", textScaleX=" + this.f9225a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f9225a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f9225a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f9225a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f9225a.getTextLocales());
            sb2.append(", typeface=" + this.f9225a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f9225a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f9226b);
            sb2.append(", breakStrategy=" + this.f9227c);
            sb2.append(", hyphenationFrequency=" + this.f9228d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f9225a = params.getTextPaint();
            this.f9226b = params.getTextDirection();
            this.f9227c = params.getBreakStrategy();
            this.f9228d = params.getHyphenationFrequency();
            this.f9229e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
