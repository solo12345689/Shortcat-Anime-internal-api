package Y;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface A0 extends InterfaceC2417j0, C0 {
    @Override // Y.InterfaceC2417j0
    int b();

    void f(int i10);

    default void h(int i10) {
        f(i10);
    }

    @Override // Y.C0
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    @Override // Y.h2
    default Integer getValue() {
        return Integer.valueOf(b());
    }
}
