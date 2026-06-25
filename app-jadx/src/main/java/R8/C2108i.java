package R8;

/* JADX INFO: renamed from: R8.i */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2108i {

    /* JADX INFO: renamed from: a */
    private final String f15323a;

    /* JADX INFO: renamed from: b */
    private final String f15324b;

    public C2108i(String str) {
        this(str, null);
    }

    public C2108i(String str, String str2) {
        AbstractC2115p.m(str, "log tag cannot be null");
        AbstractC2115p.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f15323a = str;
        this.f15324b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
