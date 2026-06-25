package G4;

import E4.c;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends i {

    /* JADX INFO: renamed from: a */
    private final Drawable f7376a;

    /* JADX INFO: renamed from: b */
    private final h f7377b;

    /* JADX INFO: renamed from: c */
    private final x4.f f7378c;

    /* JADX INFO: renamed from: d */
    private final c.b f7379d;

    /* JADX INFO: renamed from: e */
    private final String f7380e;

    /* JADX INFO: renamed from: f */
    private final boolean f7381f;

    /* JADX INFO: renamed from: g */
    private final boolean f7382g;

    public /* synthetic */ q(Drawable drawable, h hVar, x4.f fVar, c.b bVar, String str, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, hVar, fVar, (i10 & 8) != 0 ? null : bVar, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? false : z11);
    }

    @Override // G4.i
    public Drawable a() {
        return this.f7376a;
    }

    @Override // G4.i
    public h b() {
        return this.f7377b;
    }

    public final x4.f c() {
        return this.f7378c;
    }

    public final boolean d() {
        return this.f7382g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return AbstractC5504s.c(a(), qVar.a()) && AbstractC5504s.c(b(), qVar.b()) && this.f7378c == qVar.f7378c && AbstractC5504s.c(this.f7379d, qVar.f7379d) && AbstractC5504s.c(this.f7380e, qVar.f7380e) && this.f7381f == qVar.f7381f && this.f7382g == qVar.f7382g;
    }

    public int hashCode() {
        int iHashCode = ((((a().hashCode() * 31) + b().hashCode()) * 31) + this.f7378c.hashCode()) * 31;
        c.b bVar = this.f7379d;
        int iHashCode2 = (iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.f7380e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f7381f)) * 31) + Boolean.hashCode(this.f7382g);
    }

    public q(Drawable drawable, h hVar, x4.f fVar, c.b bVar, String str, boolean z10, boolean z11) {
        super(null);
        this.f7376a = drawable;
        this.f7377b = hVar;
        this.f7378c = fVar;
        this.f7379d = bVar;
        this.f7380e = str;
        this.f7381f = z10;
        this.f7382g = z11;
    }
}
