package w;

/* JADX INFO: renamed from: w.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6918w {
    public static final C6917v a(double d10) {
        return d10 < 0.0d ? new C6917v(0.0d, Math.sqrt(Math.abs(d10))) : new C6917v(Math.sqrt(d10), 0.0d);
    }
}
