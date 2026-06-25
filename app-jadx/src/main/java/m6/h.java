package M6;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12245a;

    public h(int i10) {
        this.f12245a = i10;
    }

    @Override // M6.d
    public c createImageTranscoder(q6.c cVar, boolean z10) {
        return new g(z10, this.f12245a);
    }
}
