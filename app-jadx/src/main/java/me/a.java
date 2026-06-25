package Me;

import Ud.a0;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.AbstractC6183d0;
import qf.G;
import qf.I0;
import ye.m0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends G {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I0 f12398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f12399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f12400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f12401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f12402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC6183d0 f12403i;

    public /* synthetic */ a(I0 i02, c cVar, boolean z10, boolean z11, Set set, AbstractC6183d0 abstractC6183d0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i02, (i10 & 2) != 0 ? c.f12404a : cVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, (i10 & 32) != 0 ? null : abstractC6183d0);
    }

    public static /* synthetic */ a f(a aVar, I0 i02, c cVar, boolean z10, boolean z11, Set set, AbstractC6183d0 abstractC6183d0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i02 = aVar.f12398d;
        }
        if ((i10 & 2) != 0) {
            cVar = aVar.f12399e;
        }
        if ((i10 & 4) != 0) {
            z10 = aVar.f12400f;
        }
        if ((i10 & 8) != 0) {
            z11 = aVar.f12401g;
        }
        if ((i10 & 16) != 0) {
            set = aVar.f12402h;
        }
        if ((i10 & 32) != 0) {
            abstractC6183d0 = aVar.f12403i;
        }
        Set set2 = set;
        AbstractC6183d0 abstractC6183d02 = abstractC6183d0;
        return aVar.e(i02, cVar, z10, z11, set2, abstractC6183d02);
    }

    @Override // qf.G
    public AbstractC6183d0 a() {
        return this.f12403i;
    }

    @Override // qf.G
    public I0 b() {
        return this.f12398d;
    }

    @Override // qf.G
    public Set c() {
        return this.f12402h;
    }

    public final a e(I0 howThisTypeIsUsed, c flexibility, boolean z10, boolean z11, Set set, AbstractC6183d0 abstractC6183d0) {
        AbstractC5504s.h(howThisTypeIsUsed, "howThisTypeIsUsed");
        AbstractC5504s.h(flexibility, "flexibility");
        return new a(howThisTypeIsUsed, flexibility, z10, z11, set, abstractC6183d0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC5504s.c(aVar.a(), a()) && aVar.b() == b() && aVar.f12399e == this.f12399e && aVar.f12400f == this.f12400f && aVar.f12401g == this.f12401g;
    }

    public final c g() {
        return this.f12399e;
    }

    public final boolean h() {
        return this.f12401g;
    }

    @Override // qf.G
    public int hashCode() {
        AbstractC6183d0 abstractC6183d0A = a();
        int iHashCode = abstractC6183d0A != null ? abstractC6183d0A.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + b().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f12399e.hashCode();
        int i10 = iHashCode3 + (iHashCode3 * 31) + (this.f12400f ? 1 : 0);
        return i10 + (i10 * 31) + (this.f12401g ? 1 : 0);
    }

    public final boolean i() {
        return this.f12400f;
    }

    public final a j(boolean z10) {
        return f(this, null, null, z10, false, null, null, 59, null);
    }

    public a k(AbstractC6183d0 abstractC6183d0) {
        return f(this, null, null, false, false, null, abstractC6183d0, 31, null);
    }

    public final a l(c flexibility) {
        AbstractC5504s.h(flexibility, "flexibility");
        return f(this, null, flexibility, false, false, null, null, 61, null);
    }

    @Override // qf.G
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a d(m0 typeParameter) {
        AbstractC5504s.h(typeParameter, "typeParameter");
        return f(this, null, null, false, false, c() != null ? a0.m(c(), typeParameter) : a0.c(typeParameter), null, 47, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f12398d + ", flexibility=" + this.f12399e + ", isRaw=" + this.f12400f + ", isForAnnotationParameter=" + this.f12401g + ", visitedTypeParameters=" + this.f12402h + ", defaultType=" + this.f12403i + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(I0 howThisTypeIsUsed, c flexibility, boolean z10, boolean z11, Set set, AbstractC6183d0 abstractC6183d0) {
        super(howThisTypeIsUsed, set, abstractC6183d0);
        AbstractC5504s.h(howThisTypeIsUsed, "howThisTypeIsUsed");
        AbstractC5504s.h(flexibility, "flexibility");
        this.f12398d = howThisTypeIsUsed;
        this.f12399e = flexibility;
        this.f12400f = z10;
        this.f12401g = z11;
        this.f12402h = set;
        this.f12403i = abstractC6183d0;
    }
}
