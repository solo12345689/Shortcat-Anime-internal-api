package X0;

import Td.C2160k;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import b1.AbstractC2968a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ReplacementSpan {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f21588k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f21589l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f21590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f21592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f21594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f21595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint.FontMetricsInt f21596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21599j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f21596g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC5504s.u("fontMetrics");
        return null;
    }

    public final int b() {
        if (!this.f21599j) {
            AbstractC2968a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.f21598i;
    }

    public final int c() {
        return this.f21595f;
    }

    public final int d() {
        if (!this.f21599j) {
            AbstractC2968a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.f21597h;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float f10;
        int iA;
        this.f21599j = true;
        float textSize = paint.getTextSize();
        this.f21596g = paint.getFontMetricsInt();
        if (!(a().descent > a().ascent)) {
            AbstractC2968a.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i12 = this.f21591b;
        if (i12 == 0) {
            f10 = this.f21590a * this.f21594e;
        } else {
            if (i12 != 1) {
                AbstractC2968a.b("Unsupported unit.");
                throw new C2160k();
            }
            f10 = this.f21590a * textSize;
        }
        this.f21597h = k.a(f10);
        int i13 = this.f21593d;
        if (i13 == 0) {
            iA = k.a(this.f21592c * this.f21594e);
        } else {
            if (i13 != 1) {
                AbstractC2968a.b("Unsupported unit.");
                throw new C2160k();
            }
            iA = k.a(this.f21592c * textSize);
        }
        this.f21598i = iA;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f21595f) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + b();
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int iB = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iB;
                        fontMetricsInt.descent = iB + b();
                    }
                    break;
                default:
                    AbstractC2968a.a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return d();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }
}
