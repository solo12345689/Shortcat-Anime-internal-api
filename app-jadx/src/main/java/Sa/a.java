package Sa;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final int a(BottomSheetBehavior bottomSheetBehavior) {
        AbstractC5504s.h(bottomSheetBehavior, "<this>");
        return bottomSheetBehavior.p0();
    }

    public static final BottomSheetBehavior b(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2) {
        AbstractC5504s.h(bottomSheetBehavior, "<this>");
        if (num != null) {
            bottomSheetBehavior.P0(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.K0(num2.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior c(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            num2 = null;
        }
        return b(bottomSheetBehavior, num, num2);
    }

    public static final BottomSheetBehavior d(BottomSheetBehavior bottomSheetBehavior, Integer num, boolean z10) {
        AbstractC5504s.h(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.V0(true);
        bottomSheetBehavior.L0(true);
        if (z10) {
            bottomSheetBehavior.W0(3);
        }
        if (num != null) {
            bottomSheetBehavior.P0(num.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior e(BottomSheetBehavior bottomSheetBehavior, Integer num, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return d(bottomSheetBehavior, num, z10);
    }

    public static final BottomSheetBehavior f(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3, Float f10, Integer num4) {
        AbstractC5504s.h(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.V0(false);
        bottomSheetBehavior.L0(false);
        if (num != null) {
            bottomSheetBehavior.W0(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.R0(num2.intValue());
        }
        if (f10 != null) {
            bottomSheetBehavior.N0(f10.floatValue());
        }
        if (num4 != null) {
            bottomSheetBehavior.K0(num4.intValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.P0(num3.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior g(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3, Float f10, Integer num4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            num2 = null;
        }
        if ((i10 & 4) != 0) {
            num3 = null;
        }
        if ((i10 & 8) != 0) {
            f10 = null;
        }
        if ((i10 & 16) != 0) {
            num4 = null;
        }
        return f(bottomSheetBehavior, num, num2, num3, f10, num4);
    }

    public static final BottomSheetBehavior h(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3) {
        AbstractC5504s.h(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.V0(false);
        bottomSheetBehavior.L0(true);
        if (num != null) {
            bottomSheetBehavior.W0(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.R0(num2.intValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.P0(num3.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior i(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            num2 = null;
        }
        if ((i10 & 4) != 0) {
            num3 = null;
        }
        return h(bottomSheetBehavior, num, num2, num3);
    }
}
