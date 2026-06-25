package y6;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import y5.i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: m */
    private static final d f64836m = b().a();

    /* JADX INFO: renamed from: a */
    public final int f64837a;

    /* JADX INFO: renamed from: b */
    public final int f64838b;

    /* JADX INFO: renamed from: c */
    public final boolean f64839c;

    /* JADX INFO: renamed from: d */
    public final boolean f64840d;

    /* JADX INFO: renamed from: e */
    public final boolean f64841e;

    /* JADX INFO: renamed from: f */
    public final boolean f64842f;

    /* JADX INFO: renamed from: g */
    public final boolean f64843g;

    /* JADX INFO: renamed from: h */
    public final Bitmap.Config f64844h;

    /* JADX INFO: renamed from: i */
    public final Bitmap.Config f64845i;

    /* JADX INFO: renamed from: j */
    public final C6.c f64846j;

    /* JADX INFO: renamed from: k */
    public final ColorSpace f64847k;

    /* JADX INFO: renamed from: l */
    private final boolean f64848l;

    public d(e eVar) {
        this.f64837a = eVar.l();
        this.f64838b = eVar.k();
        this.f64839c = eVar.h();
        this.f64840d = eVar.n();
        this.f64841e = eVar.m();
        this.f64842f = eVar.g();
        this.f64843g = eVar.j();
        this.f64844h = eVar.c();
        this.f64845i = eVar.b();
        this.f64846j = eVar.f();
        eVar.d();
        this.f64847k = eVar.e();
        this.f64848l = eVar.i();
    }

    public static d a() {
        return f64836m;
    }

    public static e b() {
        return new e();
    }

    protected i.a c() {
        return y5.i.b(this).a("minDecodeIntervalMs", this.f64837a).a("maxDimensionPx", this.f64838b).c("decodePreviewFrame", this.f64839c).c("useLastFrameForPreview", this.f64840d).c("useEncodedImageForPreview", this.f64841e).c("decodeAllFrames", this.f64842f).c("forceStaticImage", this.f64843g).b("bitmapConfigName", this.f64844h.name()).b("animatedBitmapConfigName", this.f64845i.name()).b("customImageDecoder", this.f64846j).b("bitmapTransformation", null).b("colorSpace", this.f64847k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f64837a != dVar.f64837a || this.f64838b != dVar.f64838b || this.f64839c != dVar.f64839c || this.f64840d != dVar.f64840d || this.f64841e != dVar.f64841e || this.f64842f != dVar.f64842f || this.f64843g != dVar.f64843g) {
            return false;
        }
        boolean z10 = this.f64848l;
        if (z10 || this.f64844h == dVar.f64844h) {
            return (z10 || this.f64845i == dVar.f64845i) && this.f64846j == dVar.f64846j && this.f64847k == dVar.f64847k;
        }
        return false;
    }

    public int hashCode() {
        int iOrdinal = (((((((((((this.f64837a * 31) + this.f64838b) * 31) + (this.f64839c ? 1 : 0)) * 31) + (this.f64840d ? 1 : 0)) * 31) + (this.f64841e ? 1 : 0)) * 31) + (this.f64842f ? 1 : 0)) * 31) + (this.f64843g ? 1 : 0);
        if (!this.f64848l) {
            iOrdinal = (iOrdinal * 31) + this.f64844h.ordinal();
        }
        if (!this.f64848l) {
            int i10 = iOrdinal * 31;
            Bitmap.Config config = this.f64845i;
            iOrdinal = i10 + (config != null ? config.ordinal() : 0);
        }
        int i11 = iOrdinal * 31;
        C6.c cVar = this.f64846j;
        int iHashCode = (i11 + (cVar != null ? cVar.hashCode() : 0)) * 961;
        ColorSpace colorSpace = this.f64847k;
        return iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0);
    }

    public String toString() {
        return "ImageDecodeOptions{" + c().toString() + "}";
    }
}
