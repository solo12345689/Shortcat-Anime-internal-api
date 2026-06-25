package G5;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static int a(int i10, int i11) {
        return ((i10 + 31) * 31) + i11;
    }

    public static int b(Object obj, Object obj2) {
        return a(obj == null ? 0 : obj.hashCode(), obj2 != null ? obj2.hashCode() : 0);
    }
}
