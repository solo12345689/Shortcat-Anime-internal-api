package O2;

import r3.j;
import r3.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class b extends r3.i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final r f12905p;

    public b(String str, r rVar) {
        super(str);
        this.f12905p = rVar;
    }

    @Override // r3.i
    protected j C(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f12905p.reset();
        }
        return this.f12905p.b(bArr, 0, i10);
    }
}
