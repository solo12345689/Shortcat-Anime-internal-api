package i4;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends h {
        a() {
        }

        @Override // i4.h
        public g a(String str) {
            return null;
        }
    }

    public static h c() {
        return new a();
    }

    public abstract g a(String str);

    public final g b(String str) {
        g gVarA = a(str);
        return gVarA == null ? g.a(str) : gVarA;
    }
}
