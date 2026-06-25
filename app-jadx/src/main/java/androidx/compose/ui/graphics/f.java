package androidx.compose.ui.graphics;

import androidx.compose.ui.platform.T0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;
import s0.AbstractC6338a1;
import s0.E1;
import s0.t1;
import s0.u1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, Function1 function1) {
        return eVar.then(new BlockGraphicsLayerElement(function1));
    }

    public static final /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, E1 e12, boolean z10, u1 u1Var, long j11, long j12, int i10) {
        return d(eVar, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, e12, z10, u1Var, j11, j12, i10, c.f26737b.B(), null);
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, E1 e12, boolean z10, u1 u1Var, long j11, long j12, int i10, int i11, d dVar) {
        return eVar.then(new GraphicsLayerElement(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, e12, z10, u1Var, j11, j12, i10, i11, dVar, null));
    }

    public static /* synthetic */ androidx.compose.ui.e e(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, E1 e12, boolean z10, u1 u1Var, long j11, long j12, int i10, int i11, d dVar, int i12, Object obj) {
        return d(eVar, (i12 & 1) != 0 ? 1.0f : f10, (i12 & 2) != 0 ? 1.0f : f11, (i12 & 4) == 0 ? f12 : 1.0f, (i12 & 8) != 0 ? 0.0f : f13, (i12 & 16) != 0 ? 0.0f : f14, (i12 & 32) != 0 ? 0.0f : f15, (i12 & 64) != 0 ? 0.0f : f16, (i12 & 128) != 0 ? 0.0f : f17, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0 ? f18 : 0.0f, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? 8.0f : f19, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? j.f26818b.a() : j10, (i12 & 2048) != 0 ? t1.a() : e12, (i12 & 4096) != 0 ? false : z10, (i12 & 8192) != 0 ? null : u1Var, (i12 & 16384) != 0 ? AbstractC6338a1.a() : j11, (32768 & i12) != 0 ? AbstractC6338a1.a() : j12, (65536 & i12) != 0 ? e.f26765b.a() : i10, (i12 & 131072) != 0 ? c.f26737b.B() : i11, (i12 & 262144) != 0 ? null : dVar);
    }

    public static final androidx.compose.ui.e f(androidx.compose.ui.e eVar) {
        return T0.b() ? eVar.then(e(androidx.compose.ui.e.f26613a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524287, null)) : eVar;
    }
}
