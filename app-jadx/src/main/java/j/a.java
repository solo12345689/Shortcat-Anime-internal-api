package J;

import i1.EnumC5027t;
import i1.InterfaceC5011d;
import r0.C6230l;
import s0.AbstractC6362i1;
import s0.E1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements E1 {

    /* JADX INFO: renamed from: a */
    private final b f9188a;

    /* JADX INFO: renamed from: b */
    private final b f9189b;

    /* JADX INFO: renamed from: c */
    private final b f9190c;

    /* JADX INFO: renamed from: d */
    private final b f9191d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f9188a = bVar;
        this.f9189b = bVar2;
        this.f9190c = bVar3;
        this.f9191d = bVar4;
    }

    public static /* synthetic */ a b(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            bVar = aVar.f9188a;
        }
        if ((i10 & 2) != 0) {
            bVar2 = aVar.f9189b;
        }
        if ((i10 & 4) != 0) {
            bVar3 = aVar.f9190c;
        }
        if ((i10 & 8) != 0) {
            bVar4 = aVar.f9191d;
        }
        return aVar.a(bVar, bVar2, bVar3, bVar4);
    }

    public abstract a a(b bVar, b bVar2, b bVar3, b bVar4);

    public abstract AbstractC6362i1 c(long j10, float f10, float f11, float f12, float f13, EnumC5027t enumC5027t);

    @Override // s0.E1
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final AbstractC6362i1 mo6createOutlinePq9zytI(long j10, EnumC5027t enumC5027t, InterfaceC5011d interfaceC5011d) {
        float fA = this.f9188a.a(j10, interfaceC5011d);
        float fA2 = this.f9189b.a(j10, interfaceC5011d);
        float fA3 = this.f9190c.a(j10, interfaceC5011d);
        float fA4 = this.f9191d.a(j10, interfaceC5011d);
        float fH = C6230l.h(j10);
        float f10 = fA + fA4;
        if (f10 > fH) {
            float f11 = fH / f10;
            fA *= f11;
            fA4 *= f11;
        }
        float f12 = fA2 + fA3;
        if (f12 > fH) {
            float f13 = fH / f12;
            fA2 *= f13;
            fA3 *= f13;
        }
        if (fA >= 0.0f && fA2 >= 0.0f && fA3 >= 0.0f && fA4 >= 0.0f) {
            return c(j10, fA, fA2, fA3, fA4, enumC5027t);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!").toString());
    }

    public final b d() {
        return this.f9190c;
    }

    public final b e() {
        return this.f9191d;
    }

    public final b f() {
        return this.f9189b;
    }

    public final b g() {
        return this.f9188a;
    }
}
