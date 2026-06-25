package c0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final int a(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final b0.e b() {
        return l.f33410c.a();
    }

    public static final Object[] c(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int d(int i10) {
        return (i10 - 1) & (-32);
    }
}
