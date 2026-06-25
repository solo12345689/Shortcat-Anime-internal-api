package G4;

import Gf.K;
import K4.c;
import android.graphics.Bitmap;
import androidx.lifecycle.AbstractC2857k;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2857k f7252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H4.i f7253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H4.g f7254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K f7255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final K f7256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final K f7257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final K f7258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c.a f7259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final H4.e f7260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Bitmap.Config f7261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Boolean f7262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Boolean f7263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b f7264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f7265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f7266o;

    public d(AbstractC2857k abstractC2857k, H4.i iVar, H4.g gVar, K k10, K k11, K k12, K k13, c.a aVar, H4.e eVar, Bitmap.Config config, Boolean bool, Boolean bool2, b bVar, b bVar2, b bVar3) {
        this.f7252a = abstractC2857k;
        this.f7253b = iVar;
        this.f7254c = gVar;
        this.f7255d = k10;
        this.f7256e = k11;
        this.f7257f = k12;
        this.f7258g = k13;
        this.f7259h = aVar;
        this.f7260i = eVar;
        this.f7261j = config;
        this.f7262k = bool;
        this.f7263l = bool2;
        this.f7264m = bVar;
        this.f7265n = bVar2;
        this.f7266o = bVar3;
    }

    public final Boolean a() {
        return this.f7262k;
    }

    public final Boolean b() {
        return this.f7263l;
    }

    public final Bitmap.Config c() {
        return this.f7261j;
    }

    public final K d() {
        return this.f7257f;
    }

    public final b e() {
        return this.f7265n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC5504s.c(this.f7252a, dVar.f7252a) && AbstractC5504s.c(this.f7253b, dVar.f7253b) && this.f7254c == dVar.f7254c && AbstractC5504s.c(this.f7255d, dVar.f7255d) && AbstractC5504s.c(this.f7256e, dVar.f7256e) && AbstractC5504s.c(this.f7257f, dVar.f7257f) && AbstractC5504s.c(this.f7258g, dVar.f7258g) && AbstractC5504s.c(this.f7259h, dVar.f7259h) && this.f7260i == dVar.f7260i && this.f7261j == dVar.f7261j && AbstractC5504s.c(this.f7262k, dVar.f7262k) && AbstractC5504s.c(this.f7263l, dVar.f7263l) && this.f7264m == dVar.f7264m && this.f7265n == dVar.f7265n && this.f7266o == dVar.f7266o;
    }

    public final K f() {
        return this.f7256e;
    }

    public final K g() {
        return this.f7255d;
    }

    public final AbstractC2857k h() {
        return this.f7252a;
    }

    public int hashCode() {
        AbstractC2857k abstractC2857k = this.f7252a;
        int iHashCode = (abstractC2857k != null ? abstractC2857k.hashCode() : 0) * 31;
        H4.i iVar = this.f7253b;
        int iHashCode2 = (iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        H4.g gVar = this.f7254c;
        int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        K k10 = this.f7255d;
        int iHashCode4 = (iHashCode3 + (k10 != null ? k10.hashCode() : 0)) * 31;
        K k11 = this.f7256e;
        int iHashCode5 = (iHashCode4 + (k11 != null ? k11.hashCode() : 0)) * 31;
        K k12 = this.f7257f;
        int iHashCode6 = (iHashCode5 + (k12 != null ? k12.hashCode() : 0)) * 31;
        K k13 = this.f7258g;
        int iHashCode7 = (iHashCode6 + (k13 != null ? k13.hashCode() : 0)) * 31;
        c.a aVar = this.f7259h;
        int iHashCode8 = (iHashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        H4.e eVar = this.f7260i;
        int iHashCode9 = (iHashCode8 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        Bitmap.Config config = this.f7261j;
        int iHashCode10 = (iHashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f7262k;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f7263l;
        int iHashCode12 = (iHashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        b bVar = this.f7264m;
        int iHashCode13 = (iHashCode12 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b bVar2 = this.f7265n;
        int iHashCode14 = (iHashCode13 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        b bVar3 = this.f7266o;
        return iHashCode14 + (bVar3 != null ? bVar3.hashCode() : 0);
    }

    public final b i() {
        return this.f7264m;
    }

    public final b j() {
        return this.f7266o;
    }

    public final H4.e k() {
        return this.f7260i;
    }

    public final H4.g l() {
        return this.f7254c;
    }

    public final H4.i m() {
        return this.f7253b;
    }

    public final K n() {
        return this.f7258g;
    }

    public final c.a o() {
        return this.f7259h;
    }
}
