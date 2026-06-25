package androidx.compose.ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import androidx.compose.ui.graphics.c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final BlendMode a(int i10) {
        c.a aVar = c.f26737b;
        return c.G(i10, aVar.a()) ? BlendMode.CLEAR : c.G(i10, aVar.x()) ? BlendMode.SRC : c.G(i10, aVar.g()) ? BlendMode.DST : c.G(i10, aVar.B()) ? BlendMode.SRC_OVER : c.G(i10, aVar.k()) ? BlendMode.DST_OVER : c.G(i10, aVar.z()) ? BlendMode.SRC_IN : c.G(i10, aVar.i()) ? BlendMode.DST_IN : c.G(i10, aVar.A()) ? BlendMode.SRC_OUT : c.G(i10, aVar.j()) ? BlendMode.DST_OUT : c.G(i10, aVar.y()) ? BlendMode.SRC_ATOP : c.G(i10, aVar.h()) ? BlendMode.DST_ATOP : c.G(i10, aVar.C()) ? BlendMode.XOR : c.G(i10, aVar.t()) ? BlendMode.PLUS : c.G(i10, aVar.q()) ? BlendMode.MODULATE : c.G(i10, aVar.v()) ? BlendMode.SCREEN : c.G(i10, aVar.s()) ? BlendMode.OVERLAY : c.G(i10, aVar.e()) ? BlendMode.DARKEN : c.G(i10, aVar.o()) ? BlendMode.LIGHTEN : c.G(i10, aVar.d()) ? BlendMode.COLOR_DODGE : c.G(i10, aVar.c()) ? BlendMode.COLOR_BURN : c.G(i10, aVar.m()) ? BlendMode.HARD_LIGHT : c.G(i10, aVar.w()) ? BlendMode.SOFT_LIGHT : c.G(i10, aVar.f()) ? BlendMode.DIFFERENCE : c.G(i10, aVar.l()) ? BlendMode.EXCLUSION : c.G(i10, aVar.r()) ? BlendMode.MULTIPLY : c.G(i10, aVar.n()) ? BlendMode.HUE : c.G(i10, aVar.u()) ? BlendMode.SATURATION : c.G(i10, aVar.b()) ? BlendMode.COLOR : c.G(i10, aVar.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode b(int i10) {
        c.a aVar = c.f26737b;
        return c.G(i10, aVar.a()) ? PorterDuff.Mode.CLEAR : c.G(i10, aVar.x()) ? PorterDuff.Mode.SRC : c.G(i10, aVar.g()) ? PorterDuff.Mode.DST : c.G(i10, aVar.B()) ? PorterDuff.Mode.SRC_OVER : c.G(i10, aVar.k()) ? PorterDuff.Mode.DST_OVER : c.G(i10, aVar.z()) ? PorterDuff.Mode.SRC_IN : c.G(i10, aVar.i()) ? PorterDuff.Mode.DST_IN : c.G(i10, aVar.A()) ? PorterDuff.Mode.SRC_OUT : c.G(i10, aVar.j()) ? PorterDuff.Mode.DST_OUT : c.G(i10, aVar.y()) ? PorterDuff.Mode.SRC_ATOP : c.G(i10, aVar.h()) ? PorterDuff.Mode.DST_ATOP : c.G(i10, aVar.C()) ? PorterDuff.Mode.XOR : c.G(i10, aVar.t()) ? PorterDuff.Mode.ADD : c.G(i10, aVar.v()) ? PorterDuff.Mode.SCREEN : c.G(i10, aVar.s()) ? PorterDuff.Mode.OVERLAY : c.G(i10, aVar.e()) ? PorterDuff.Mode.DARKEN : c.G(i10, aVar.o()) ? PorterDuff.Mode.LIGHTEN : c.G(i10, aVar.q()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
