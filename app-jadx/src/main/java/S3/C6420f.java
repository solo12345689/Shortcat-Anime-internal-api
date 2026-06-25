package s3;

import java.util.Collections;
import java.util.List;
import r3.j;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: s3.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C6420f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f59202a;

    public C6420f(List list) {
        this.f59202a = list;
    }

    @Override // r3.j
    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // r3.j
    public List b(long j10) {
        return j10 >= 0 ? this.f59202a : Collections.EMPTY_LIST;
    }

    @Override // r3.j
    public long c(int i10) {
        AbstractC6614a.a(i10 == 0);
        return 0L;
    }

    @Override // r3.j
    public int h() {
        return 1;
    }
}
