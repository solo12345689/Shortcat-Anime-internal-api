package mf;

import java.util.List;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;

/* JADX INFO: renamed from: mf.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC5691w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC5691w f53478a = new a();

    /* JADX INFO: renamed from: mf.w$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a implements InterfaceC5691w {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i10 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // mf.InterfaceC5691w
        public void a(InterfaceC7224b interfaceC7224b) {
            if (interfaceC7224b == null) {
                c(2);
            }
        }

        @Override // mf.InterfaceC5691w
        public void b(InterfaceC7227e interfaceC7227e, List list) {
            if (interfaceC7227e == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    }

    void a(InterfaceC7224b interfaceC7224b);

    void b(InterfaceC7227e interfaceC7227e, List list);
}
