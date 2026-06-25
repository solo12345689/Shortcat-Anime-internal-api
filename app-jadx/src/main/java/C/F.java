package C;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f2014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC1141l f2016c;

    public F(float f10, boolean z10, AbstractC1141l abstractC1141l, AbstractC1146q abstractC1146q) {
        this.f2014a = f10;
        this.f2015b = z10;
        this.f2016c = abstractC1141l;
    }

    public final AbstractC1141l a() {
        return this.f2016c;
    }

    public final boolean b() {
        return this.f2015b;
    }

    public final AbstractC1146q c() {
        return null;
    }

    public final float d() {
        return this.f2014a;
    }

    public final void e(AbstractC1141l abstractC1141l) {
        this.f2016c = abstractC1141l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return Float.compare(this.f2014a, f10.f2014a) == 0 && this.f2015b == f10.f2015b && AbstractC5504s.c(this.f2016c, f10.f2016c) && AbstractC5504s.c(null, null);
    }

    public final void f(boolean z10) {
        this.f2015b = z10;
    }

    public final void g(float f10) {
        this.f2014a = f10;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.f2014a) * 31) + Boolean.hashCode(this.f2015b)) * 31;
        AbstractC1141l abstractC1141l = this.f2016c;
        return (iHashCode + (abstractC1141l == null ? 0 : abstractC1141l.hashCode())) * 31;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.f2014a + ", fill=" + this.f2015b + ", crossAxisAlignment=" + this.f2016c + ", flowLayoutData=" + ((Object) null) + ')';
    }

    public /* synthetic */ F(float f10, boolean z10, AbstractC1141l abstractC1141l, AbstractC1146q abstractC1146q, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : abstractC1141l, (i10 & 8) != 0 ? null : abstractC1146q);
    }
}
