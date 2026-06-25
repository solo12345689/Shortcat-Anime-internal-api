package P7;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import h7.C4914b;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends MetricAffectingSpan implements k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f13523f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f13526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f13527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AssetManager f13528e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(Paint paint, int i10, int i11, String str, String str2, AssetManager assetManager) {
            Typeface typefaceA = com.facebook.react.views.text.p.a(paint.getTypeface(), i10, i11, str2, assetManager);
            paint.setFontFeatureSettings(str);
            paint.setTypeface(typefaceA);
            paint.setSubpixelText(true);
            if (C4914b.g()) {
                paint.setLinearText(true);
            }
        }

        private a() {
        }
    }

    public c(int i10, int i11, String str, String str2, AssetManager assetManager) {
        AbstractC5504s.h(assetManager, "assetManager");
        this.f13524a = i10;
        this.f13525b = i11;
        this.f13526c = str;
        this.f13527d = str2;
        this.f13528e = assetManager;
    }

    public final String a() {
        return this.f13527d;
    }

    public final String b() {
        return this.f13526c;
    }

    public final int c() {
        int i10 = this.f13524a;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public final int d() {
        int i10 = this.f13525b;
        if (i10 == -1) {
            return 400;
        }
        return i10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        AbstractC5504s.h(ds, "ds");
        f13523f.b(ds, this.f13524a, this.f13525b, this.f13526c, this.f13527d, this.f13528e);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        AbstractC5504s.h(paint, "paint");
        f13523f.b(paint, this.f13524a, this.f13525b, this.f13526c, this.f13527d, this.f13528e);
    }
}
