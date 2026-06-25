package U0;

import Ud.AbstractC2279u;
import b1.AbstractC2968a;
import java.util.List;
import k1.AbstractC5436a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: U0.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2226t {
    public static final int b(List list, int i10) {
        int i11;
        int iB = ((C2232w) AbstractC2279u.y0(list)).b();
        boolean z10 = false;
        if (!(i10 <= ((C2232w) AbstractC2279u.y0(list)).b())) {
            AbstractC2968a.a("Index " + i10 + " should be less or equal than last line's end " + iB);
        }
        int size = list.size() - 1;
        int i12 = 0;
        while (true) {
            if (i12 > size) {
                i11 = -(i12 + 1);
                break;
            }
            i11 = (i12 + size) >>> 1;
            C2232w c2232w = (C2232w) list.get(i11);
            byte b10 = c2232w.f() > i10 ? (byte) 1 : c2232w.b() <= i10 ? (byte) -1 : (byte) 0;
            if (b10 >= 0) {
                if (b10 <= 0) {
                    break;
                }
                size = i11 - 1;
            } else {
                i12 = i11 + 1;
            }
        }
        if (i11 >= 0 && i11 < list.size()) {
            z10 = true;
        }
        if (!z10) {
            AbstractC2968a.a("Found paragraph index " + i11 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i10 + ", paragraphs=[" + AbstractC5436a.e(list, null, null, null, 0, null, new Function1() { // from class: U0.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC2226t.c((C2232w) obj);
                }
            }, 31, null) + ']');
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c(C2232w c2232w) {
        return '[' + c2232w.f() + ", " + c2232w.b() + ')';
    }

    public static final int d(List list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            C2232w c2232w = (C2232w) list.get(i12);
            byte b10 = c2232w.g() > i10 ? (byte) 1 : c2232w.c() <= i10 ? (byte) -1 : (byte) 0;
            if (b10 < 0) {
                i11 = i12 + 1;
            } else {
                if (b10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int e(List list, float f10) {
        if (f10 <= 0.0f) {
            return 0;
        }
        if (f10 >= ((C2232w) AbstractC2279u.y0(list)).a()) {
            return AbstractC2279u.o(list);
        }
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            C2232w c2232w = (C2232w) list.get(i11);
            byte b10 = c2232w.h() > f10 ? (byte) 1 : c2232w.a() <= f10 ? (byte) -1 : (byte) 0;
            if (b10 < 0) {
                i10 = i11 + 1;
            } else {
                if (b10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final void f(List list, long j10, Function1 function1) {
        int size = list.size();
        for (int iB = b(list, W0.l(j10)); iB < size; iB++) {
            C2232w c2232w = (C2232w) list.get(iB);
            if (c2232w.f() >= W0.k(j10)) {
                return;
            }
            if (c2232w.f() != c2232w.b()) {
                function1.invoke(c2232w);
            }
        }
    }
}
