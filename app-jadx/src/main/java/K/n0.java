package K;

import U0.C2197e;
import a1.InterfaceC2517J;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC2517J f10266a = new m0(InterfaceC2517J.f23518a.a(), 0, 0);

    public static final a1.d0 c(a1.f0 f0Var, C2197e c2197e) {
        a1.d0 d0VarA = f0Var.a(c2197e);
        f(d0VarA, c2197e.length(), 0, 2, null);
        return new a1.d0(d0VarA.b(), new m0(d0VarA.a(), c2197e.length(), d0VarA.b().length()));
    }

    public static final InterfaceC2517J d() {
        return f10266a;
    }

    public static final void e(a1.d0 d0Var, int i10, int i11) {
        int length = d0Var.b().length();
        int iMin = Math.min(i10, i11);
        for (int i12 = 0; i12 < iMin; i12++) {
            g(d0Var.a().b(i12), length, i12);
        }
        g(d0Var.a().b(i10), length, i10);
        int iMin2 = Math.min(length, i11);
        for (int i13 = 0; i13 < iMin2; i13++) {
            h(d0Var.a().a(i13), i10, i13);
        }
        h(d0Var.a().a(length), i10, length);
    }

    public static /* synthetic */ void f(a1.d0 d0Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 100;
        }
        e(d0Var, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i11) {
            throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of transformed text [0, " + i11 + ']').toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i11) {
            throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of original text [0, " + i11 + ']').toString());
        }
    }
}
