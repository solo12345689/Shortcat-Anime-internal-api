package ec;

/* JADX INFO: renamed from: ec.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4667b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f45856a;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b() {
        int i10 = f45856a;
        int i11 = 1 << i10;
        f45856a = i10 + 1;
        return i11;
    }
}
