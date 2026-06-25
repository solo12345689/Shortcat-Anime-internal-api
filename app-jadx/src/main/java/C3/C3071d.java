package c3;

import U2.InterfaceC2256q;
import U2.z;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: c3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C3071d extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f33451b;

    public C3071d(InterfaceC2256q interfaceC2256q, long j10) {
        super(interfaceC2256q);
        AbstractC6614a.a(interfaceC2256q.getPosition() >= j10);
        this.f33451b = j10;
    }

    @Override // U2.z, U2.InterfaceC2256q
    public long getLength() {
        return super.getLength() - this.f33451b;
    }

    @Override // U2.z, U2.InterfaceC2256q
    public long getPosition() {
        return super.getPosition() - this.f33451b;
    }

    @Override // U2.z, U2.InterfaceC2256q
    public long j() {
        return super.j() - this.f33451b;
    }
}
