package Y;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Y.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2398d {
    Object a();

    void b(int i10, int i11);

    void c(int i10, int i11, int i12);

    void clear();

    default void d(Function2 function2, Object obj) {
        function2.invoke(a(), obj);
    }

    void e(int i10, Object obj);

    void g(int i10, Object obj);

    void h(Object obj);

    void i();

    void k();

    default void f() {
    }

    default void j() {
    }
}
