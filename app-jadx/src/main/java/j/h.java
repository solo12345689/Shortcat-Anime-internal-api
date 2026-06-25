package J;

import i1.EnumC5027t;
import kotlin.jvm.internal.AbstractC5504s;
import r0.AbstractC6220b;
import r0.AbstractC6229k;
import r0.AbstractC6231m;
import r0.C6226h;
import s0.AbstractC6362i1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a {
    public h(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
    }

    @Override // J.a
    public AbstractC6362i1 c(long j10, float f10, float f11, float f12, float f13, EnumC5027t enumC5027t) {
        if (f10 + f11 + f12 + f13 == 0.0f) {
            return new AbstractC6362i1.b(AbstractC6231m.c(j10));
        }
        C6226h c6226hC = AbstractC6231m.c(j10);
        EnumC5027t enumC5027t2 = EnumC5027t.f48573a;
        return new AbstractC6362i1.c(AbstractC6229k.b(c6226hC, AbstractC6220b.b(enumC5027t == enumC5027t2 ? f10 : f11, 0.0f, 2, null), AbstractC6220b.b(enumC5027t == enumC5027t2 ? f11 : f10, 0.0f, 2, null), AbstractC6220b.b(enumC5027t == enumC5027t2 ? f12 : f13, 0.0f, 2, null), AbstractC6220b.b(enumC5027t == enumC5027t2 ? f13 : f12, 0.0f, 2, null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC5504s.c(g(), hVar.g()) && AbstractC5504s.c(f(), hVar.f()) && AbstractC5504s.c(d(), hVar.d()) && AbstractC5504s.c(e(), hVar.e());
    }

    @Override // J.a
    /* JADX INFO: renamed from: h */
    public h a(b bVar, b bVar2, b bVar3, b bVar4) {
        return new h(bVar, bVar2, bVar3, bVar4);
    }

    public int hashCode() {
        return (((((g().hashCode() * 31) + f().hashCode()) * 31) + d().hashCode()) * 31) + e().hashCode();
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + g() + ", topEnd = " + f() + ", bottomEnd = " + d() + ", bottomStart = " + e() + ')';
    }
}
