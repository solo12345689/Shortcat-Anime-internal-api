package C;

import I0.InterfaceC1686l;
import java.util.List;

/* JADX INFO: renamed from: C.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1151w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1151w f2186a = new C1151w();

    private C1151w() {
    }

    public final int a(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC1686l interfaceC1686l = (InterfaceC1686l) list.get(i12);
            float fE = C.e(C.c(interfaceC1686l));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC1686l.q0(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1686l.I(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC1686l interfaceC1686l2 = (InterfaceC1686l) list.get(i13);
            float fE2 = C.e(C.c(interfaceC1686l2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC1686l2.I(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int b(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC1686l interfaceC1686l = (InterfaceC1686l) list.get(i13);
            float fE = C.e(C.c(interfaceC1686l));
            int iQ0 = interfaceC1686l.q0(i10);
            if (fE == 0.0f) {
                i12 += iQ0;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iQ0 / fE));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    public final int c(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC1686l interfaceC1686l = (InterfaceC1686l) list.get(i12);
            float fE = C.e(C.c(interfaceC1686l));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC1686l.q0(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1686l.Z(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC1686l interfaceC1686l2 = (InterfaceC1686l) list.get(i13);
            float fE2 = C.e(C.c(interfaceC1686l2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC1686l2.Z(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int d(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC1686l interfaceC1686l = (InterfaceC1686l) list.get(i13);
            float fE = C.e(C.c(interfaceC1686l));
            int iL0 = interfaceC1686l.l0(i10);
            if (fE == 0.0f) {
                i12 += iL0;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iL0 / fE));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    public final int e(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC1686l interfaceC1686l = (InterfaceC1686l) list.get(i13);
            float fE = C.e(C.c(interfaceC1686l));
            int I10 = interfaceC1686l.I(i10);
            if (fE == 0.0f) {
                i12 += I10;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(I10 / fE));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    public final int f(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC1686l interfaceC1686l = (InterfaceC1686l) list.get(i12);
            float fE = C.e(C.c(interfaceC1686l));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC1686l.I(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1686l.q0(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC1686l interfaceC1686l2 = (InterfaceC1686l) list.get(i13);
            float fE2 = C.e(C.c(interfaceC1686l2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC1686l2.q0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int g(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC1686l interfaceC1686l = (InterfaceC1686l) list.get(i13);
            float fE = C.e(C.c(interfaceC1686l));
            int iZ = interfaceC1686l.Z(i10);
            if (fE == 0.0f) {
                i12 += iZ;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iZ / fE));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    public final int h(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC1686l interfaceC1686l = (InterfaceC1686l) list.get(i12);
            float fE = C.e(C.c(interfaceC1686l));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC1686l.I(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1686l.l0(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC1686l interfaceC1686l2 = (InterfaceC1686l) list.get(i13);
            float fE2 = C.e(C.c(interfaceC1686l2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC1686l2.l0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }
}
