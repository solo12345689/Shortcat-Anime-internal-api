package G4;

import Gf.C1608f0;
import Gf.K;
import K4.c;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a */
    private final K f7237a;

    /* JADX INFO: renamed from: b */
    private final K f7238b;

    /* JADX INFO: renamed from: c */
    private final K f7239c;

    /* JADX INFO: renamed from: d */
    private final K f7240d;

    /* JADX INFO: renamed from: e */
    private final c.a f7241e;

    /* JADX INFO: renamed from: f */
    private final H4.e f7242f;

    /* JADX INFO: renamed from: g */
    private final Bitmap.Config f7243g;

    /* JADX INFO: renamed from: h */
    private final boolean f7244h;

    /* JADX INFO: renamed from: i */
    private final boolean f7245i;

    /* JADX INFO: renamed from: j */
    private final Drawable f7246j;

    /* JADX INFO: renamed from: k */
    private final Drawable f7247k;

    /* JADX INFO: renamed from: l */
    private final Drawable f7248l;

    /* JADX INFO: renamed from: m */
    private final b f7249m;

    /* JADX INFO: renamed from: n */
    private final b f7250n;

    /* JADX INFO: renamed from: o */
    private final b f7251o;

    public c(K k10, K k11, K k12, K k13, c.a aVar, H4.e eVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, b bVar, b bVar2, b bVar3) {
        this.f7237a = k10;
        this.f7238b = k11;
        this.f7239c = k12;
        this.f7240d = k13;
        this.f7241e = aVar;
        this.f7242f = eVar;
        this.f7243g = config;
        this.f7244h = z10;
        this.f7245i = z11;
        this.f7246j = drawable;
        this.f7247k = drawable2;
        this.f7248l = drawable3;
        this.f7249m = bVar;
        this.f7250n = bVar2;
        this.f7251o = bVar3;
    }

    public final boolean a() {
        return this.f7244h;
    }

    public final boolean b() {
        return this.f7245i;
    }

    public final Bitmap.Config c() {
        return this.f7243g;
    }

    public final K d() {
        return this.f7239c;
    }

    public final b e() {
        return this.f7250n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC5504s.c(this.f7237a, cVar.f7237a) && AbstractC5504s.c(this.f7238b, cVar.f7238b) && AbstractC5504s.c(this.f7239c, cVar.f7239c) && AbstractC5504s.c(this.f7240d, cVar.f7240d) && AbstractC5504s.c(this.f7241e, cVar.f7241e) && this.f7242f == cVar.f7242f && this.f7243g == cVar.f7243g && this.f7244h == cVar.f7244h && this.f7245i == cVar.f7245i && AbstractC5504s.c(this.f7246j, cVar.f7246j) && AbstractC5504s.c(this.f7247k, cVar.f7247k) && AbstractC5504s.c(this.f7248l, cVar.f7248l) && this.f7249m == cVar.f7249m && this.f7250n == cVar.f7250n && this.f7251o == cVar.f7251o;
    }

    public final Drawable f() {
        return this.f7247k;
    }

    public final Drawable g() {
        return this.f7248l;
    }

    public final K h() {
        return this.f7238b;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.f7237a.hashCode() * 31) + this.f7238b.hashCode()) * 31) + this.f7239c.hashCode()) * 31) + this.f7240d.hashCode()) * 31) + this.f7241e.hashCode()) * 31) + this.f7242f.hashCode()) * 31) + this.f7243g.hashCode()) * 31) + Boolean.hashCode(this.f7244h)) * 31) + Boolean.hashCode(this.f7245i)) * 31;
        Drawable drawable = this.f7246j;
        int iHashCode2 = (iHashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f7247k;
        int iHashCode3 = (iHashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f7248l;
        return ((((((iHashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.f7249m.hashCode()) * 31) + this.f7250n.hashCode()) * 31) + this.f7251o.hashCode();
    }

    public final K i() {
        return this.f7237a;
    }

    public final b j() {
        return this.f7249m;
    }

    public final b k() {
        return this.f7251o;
    }

    public final Drawable l() {
        return this.f7246j;
    }

    public final H4.e m() {
        return this.f7242f;
    }

    public final K n() {
        return this.f7240d;
    }

    public final c.a o() {
        return this.f7241e;
    }

    public /* synthetic */ c(K k10, K k11, K k12, K k13, c.a aVar, H4.e eVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, b bVar, b bVar2, b bVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C1608f0.c().d2() : k10, (i10 & 2) != 0 ? C1608f0.b() : k11, (i10 & 4) != 0 ? C1608f0.b() : k12, (i10 & 8) != 0 ? C1608f0.b() : k13, (i10 & 16) != 0 ? c.a.f10876b : aVar, (i10 & 32) != 0 ? H4.e.AUTOMATIC : eVar, (i10 & 64) != 0 ? L4.j.f() : config, (i10 & 128) != 0 ? true : z10, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? false : z11, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : drawable, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : drawable2, (i10 & 2048) == 0 ? drawable3 : null, (i10 & 4096) != 0 ? b.ENABLED : bVar, (i10 & 8192) != 0 ? b.ENABLED : bVar2, (i10 & 16384) != 0 ? b.ENABLED : bVar3);
    }
}
