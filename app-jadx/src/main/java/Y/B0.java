package Y;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface B0 extends InterfaceC2443s0, C0 {
    @Override // Y.InterfaceC2443s0
    long a();

    default void g(long j10) {
        m(j10);
    }

    void m(long j10);

    @Override // Y.C0
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        g(((Number) obj).longValue());
    }

    @Override // Y.h2
    default Long getValue() {
        return Long.valueOf(a());
    }
}
