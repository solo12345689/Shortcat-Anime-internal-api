package x;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.C5015h;
import i1.C5018k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: x.K */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6991K {

    /* JADX INFO: renamed from: a */
    private static final R0.B f63267a = new R0.B("MagnifierPositionInRoot", (Function2) null, 2, (DefaultConstructorMarker) null);

    public static final boolean a(float f10, float f11) {
        return (Float.isNaN(f10) && Float.isNaN(f11)) || f10 == f11;
    }

    public static final R0.B b() {
        return f63267a;
    }

    public static final boolean c(int i10) {
        return i10 >= 28;
    }

    public static /* synthetic */ boolean d(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Build.VERSION.SDK_INT;
        }
        return c(i10);
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, Function1 function1, Function1 function12, Function1 function13, float f10, boolean z10, long j10, float f11, float f12, boolean z11, InterfaceC7002W interfaceC7002W) {
        if (d(0, 1, null)) {
            return eVar.then(new MagnifierElement(function1, function12, function13, f10, z10, j10, f11, f12, z11, interfaceC7002W == null ? InterfaceC7002W.f63292a.a() : interfaceC7002W, null));
        }
        return eVar;
    }

    public static /* synthetic */ androidx.compose.ui.e f(androidx.compose.ui.e eVar, Function1 function1, Function1 function12, Function1 function13, float f10, boolean z10, long j10, float f11, float f12, boolean z11, InterfaceC7002W interfaceC7002W, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function12 = null;
        }
        if ((i10 & 4) != 0) {
            function13 = null;
        }
        if ((i10 & 8) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        if ((i10 & 32) != 0) {
            j10 = C5018k.f48556b.a();
        }
        if ((i10 & 64) != 0) {
            f11 = C5015h.f48547b.c();
        }
        if ((i10 & 128) != 0) {
            f12 = C5015h.f48547b.c();
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            z11 = true;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            interfaceC7002W = null;
        }
        return e(eVar, function1, function12, function13, f10, z10, j10, f11, f12, z11, interfaceC7002W);
    }
}
