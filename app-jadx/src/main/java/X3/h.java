package x3;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import r3.j;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C7051c f63870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f63871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f63872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f63873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f63874e;

    public h(C7051c c7051c, Map map, Map map2, Map map3) {
        this.f63870a = c7051c;
        this.f63873d = map2;
        this.f63874e = map3;
        this.f63872c = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f63871b = c7051c.j();
    }

    @Override // r3.j
    public int a(long j10) {
        int iG = a0.g(this.f63871b, j10, false, false);
        if (iG < this.f63871b.length) {
            return iG;
        }
        return -1;
    }

    @Override // r3.j
    public List b(long j10) {
        return this.f63870a.h(j10, this.f63872c, this.f63873d, this.f63874e);
    }

    @Override // r3.j
    public long c(int i10) {
        return this.f63871b[i10];
    }

    @Override // r3.j
    public int h() {
        return this.f63871b.length;
    }
}
