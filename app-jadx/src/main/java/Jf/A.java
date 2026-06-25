package Jf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class A {

    /* JADX INFO: renamed from: a */
    public static final Lf.E f9513a = new Lf.E("NO_VALUE");

    public static final t a(int i10, int i11, If.a aVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        }
        if (i10 > 0 || i11 > 0 || aVar == If.a.f9114a) {
            int i12 = i11 + i10;
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            return new z(i10, i12, aVar);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
    }

    public static /* synthetic */ t b(int i10, int i11, If.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            aVar = If.a.f9114a;
        }
        return a(i10, i11, aVar);
    }

    public static final InterfaceC1742e e(y yVar, Zd.i iVar, int i10, If.a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == If.a.f9114a) ? yVar : new Kf.h(yVar, iVar, i10, aVar);
    }

    public static final Object f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    public static final void g(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
