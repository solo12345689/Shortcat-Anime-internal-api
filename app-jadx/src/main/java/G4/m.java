package G4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import dg.t;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap.Config f7355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ColorSpace f7356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final H4.h f7357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final H4.g f7358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f7359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f7360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f7361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f7362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t f7363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final r f7364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final n f7365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b f7366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f7367n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f7368o;

    public m(Context context, Bitmap.Config config, ColorSpace colorSpace, H4.h hVar, H4.g gVar, boolean z10, boolean z11, boolean z12, String str, t tVar, r rVar, n nVar, b bVar, b bVar2, b bVar3) {
        this.f7354a = context;
        this.f7355b = config;
        this.f7356c = colorSpace;
        this.f7357d = hVar;
        this.f7358e = gVar;
        this.f7359f = z10;
        this.f7360g = z11;
        this.f7361h = z12;
        this.f7362i = str;
        this.f7363j = tVar;
        this.f7364k = rVar;
        this.f7365l = nVar;
        this.f7366m = bVar;
        this.f7367n = bVar2;
        this.f7368o = bVar3;
    }

    public final m a(Context context, Bitmap.Config config, ColorSpace colorSpace, H4.h hVar, H4.g gVar, boolean z10, boolean z11, boolean z12, String str, t tVar, r rVar, n nVar, b bVar, b bVar2, b bVar3) {
        return new m(context, config, colorSpace, hVar, gVar, z10, z11, z12, str, tVar, rVar, nVar, bVar, bVar2, bVar3);
    }

    public final boolean c() {
        return this.f7359f;
    }

    public final boolean d() {
        return this.f7360g;
    }

    public final ColorSpace e() {
        return this.f7356c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (AbstractC5504s.c(this.f7354a, mVar.f7354a) && this.f7355b == mVar.f7355b) {
            return (Build.VERSION.SDK_INT < 26 || AbstractC5504s.c(this.f7356c, mVar.f7356c)) && AbstractC5504s.c(this.f7357d, mVar.f7357d) && this.f7358e == mVar.f7358e && this.f7359f == mVar.f7359f && this.f7360g == mVar.f7360g && this.f7361h == mVar.f7361h && AbstractC5504s.c(this.f7362i, mVar.f7362i) && AbstractC5504s.c(this.f7363j, mVar.f7363j) && AbstractC5504s.c(this.f7364k, mVar.f7364k) && AbstractC5504s.c(this.f7365l, mVar.f7365l) && this.f7366m == mVar.f7366m && this.f7367n == mVar.f7367n && this.f7368o == mVar.f7368o;
        }
        return false;
    }

    public final Bitmap.Config f() {
        return this.f7355b;
    }

    public final Context g() {
        return this.f7354a;
    }

    public final String h() {
        return this.f7362i;
    }

    public int hashCode() {
        int iHashCode = ((this.f7354a.hashCode() * 31) + this.f7355b.hashCode()) * 31;
        ColorSpace colorSpace = this.f7356c;
        int iHashCode2 = (((((((((((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.f7357d.hashCode()) * 31) + this.f7358e.hashCode()) * 31) + Boolean.hashCode(this.f7359f)) * 31) + Boolean.hashCode(this.f7360g)) * 31) + Boolean.hashCode(this.f7361h)) * 31;
        String str = this.f7362i;
        return ((((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f7363j.hashCode()) * 31) + this.f7364k.hashCode()) * 31) + this.f7365l.hashCode()) * 31) + this.f7366m.hashCode()) * 31) + this.f7367n.hashCode()) * 31) + this.f7368o.hashCode();
    }

    public final b i() {
        return this.f7367n;
    }

    public final t j() {
        return this.f7363j;
    }

    public final b k() {
        return this.f7368o;
    }

    public final boolean l() {
        return this.f7361h;
    }

    public final H4.g m() {
        return this.f7358e;
    }

    public final H4.h n() {
        return this.f7357d;
    }

    public final r o() {
        return this.f7364k;
    }
}
