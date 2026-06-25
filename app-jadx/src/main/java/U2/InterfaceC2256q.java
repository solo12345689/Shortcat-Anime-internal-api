package U2;

import q2.InterfaceC6098m;

/* JADX INFO: renamed from: U2.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2256q extends InterfaceC6098m {
    int b(int i10);

    boolean d(int i10, boolean z10);

    boolean e(byte[] bArr, int i10, int i11, boolean z10);

    void g();

    long getLength();

    long getPosition();

    boolean h(byte[] bArr, int i10, int i11, boolean z10);

    long j();

    void k(int i10);

    int l(byte[] bArr, int i10, int i11);

    void m(int i10);

    boolean n(int i10, boolean z10);

    void o(byte[] bArr, int i10, int i11);

    @Override // q2.InterfaceC6098m
    int read(byte[] bArr, int i10, int i11);

    void readFully(byte[] bArr, int i10, int i11);
}
