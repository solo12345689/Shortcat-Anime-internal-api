package g1;

/* JADX INFO: renamed from: g1.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4827g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i10, int i11, int i12) {
        return i10 | (i11 << 8) | (i12 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(int i10) {
        return i10 & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int i10) {
        return (i10 >> 8) & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i10) {
        return (i10 >> 16) & 255;
    }
}
