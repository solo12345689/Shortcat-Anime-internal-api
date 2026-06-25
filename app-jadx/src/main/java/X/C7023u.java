package x;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.W0;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ke.AbstractC5466a;
import kotlin.jvm.functions.Function1;
import r0.C6224f;
import r0.C6230l;
import s0.InterfaceC6364j0;
import u0.InterfaceC6708c;
import u0.InterfaceC6709d;
import v0.C6811c;

/* JADX INFO: renamed from: x.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C7023u extends W0 implements p0.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C7003a f63374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C7025w f63375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RenderNode f63376e;

    public C7023u(C7003a c7003a, C7025w c7025w, Function1 function1) {
        super(function1);
        this.f63374c = c7003a;
        this.f63375d = c7025w;
    }

    private final boolean a(EdgeEffect edgeEffect, Canvas canvas) {
        return j(180.0f, edgeEffect, canvas);
    }

    private final boolean c(EdgeEffect edgeEffect, Canvas canvas) {
        return j(270.0f, edgeEffect, canvas);
    }

    private final boolean h(EdgeEffect edgeEffect, Canvas canvas) {
        return j(90.0f, edgeEffect, canvas);
    }

    private final boolean i(EdgeEffect edgeEffect, Canvas canvas) {
        return j(0.0f, edgeEffect, canvas);
    }

    private final boolean j(float f10, EdgeEffect edgeEffect, Canvas canvas) {
        if (f10 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f10);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final RenderNode k() {
        RenderNode renderNode = this.f63376e;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeA = AbstractC7018p.a("AndroidEdgeEffectOverscrollEffect");
        this.f63376e = renderNodeA;
        return renderNodeA;
    }

    private final boolean l() {
        C7025w c7025w = this.f63375d;
        return c7025w.r() || c7025w.s() || c7025w.u() || c7025w.v();
    }

    private final boolean m() {
        C7025w c7025w = this.f63375d;
        return c7025w.y() || c7025w.z() || c7025w.o() || c7025w.p();
    }

    @Override // p0.i
    public void draw(InterfaceC6708c interfaceC6708c) {
        boolean zC;
        float f10;
        float f11;
        this.f63374c.r(interfaceC6708c.f());
        if (C6230l.k(interfaceC6708c.f())) {
            interfaceC6708c.B1();
            return;
        }
        this.f63374c.j().getValue();
        float fL1 = interfaceC6708c.l1(AbstractC7014l.b());
        Canvas canvasD = s0.E.d(interfaceC6708c.n1().b());
        C7025w c7025w = this.f63375d;
        boolean zM = m();
        boolean zL = l();
        if (zM && zL) {
            k().setPosition(0, 0, canvasD.getWidth(), canvasD.getHeight());
        } else if (zM) {
            k().setPosition(0, 0, canvasD.getWidth() + (AbstractC5466a.d(fL1) * 2), canvasD.getHeight());
        } else {
            if (!zL) {
                interfaceC6708c.B1();
                return;
            }
            k().setPosition(0, 0, canvasD.getWidth(), canvasD.getHeight() + (AbstractC5466a.d(fL1) * 2));
        }
        RecordingCanvas recordingCanvasBeginRecording = k().beginRecording();
        if (c7025w.s()) {
            EdgeEffect edgeEffectI = c7025w.i();
            h(edgeEffectI, recordingCanvasBeginRecording);
            edgeEffectI.finish();
        }
        if (c7025w.r()) {
            EdgeEffect edgeEffectH = c7025w.h();
            zC = c(edgeEffectH, recordingCanvasBeginRecording);
            if (c7025w.t()) {
                float fN = C6224f.n(this.f63374c.i());
                C7024v c7024v = C7024v.f63377a;
                c7024v.d(c7025w.i(), c7024v.b(edgeEffectH), 1 - fN);
            }
        } else {
            zC = false;
        }
        if (c7025w.z()) {
            EdgeEffect edgeEffectM = c7025w.m();
            a(edgeEffectM, recordingCanvasBeginRecording);
            edgeEffectM.finish();
        }
        if (c7025w.y()) {
            EdgeEffect edgeEffectL = c7025w.l();
            zC = i(edgeEffectL, recordingCanvasBeginRecording) || zC;
            if (c7025w.A()) {
                float fM = C6224f.m(this.f63374c.i());
                C7024v c7024v2 = C7024v.f63377a;
                c7024v2.d(c7025w.m(), c7024v2.b(edgeEffectL), fM);
            }
        }
        if (c7025w.v()) {
            EdgeEffect edgeEffectK = c7025w.k();
            c(edgeEffectK, recordingCanvasBeginRecording);
            edgeEffectK.finish();
        }
        if (c7025w.u()) {
            EdgeEffect edgeEffectJ = c7025w.j();
            zC = h(edgeEffectJ, recordingCanvasBeginRecording) || zC;
            if (c7025w.w()) {
                float fN2 = C6224f.n(this.f63374c.i());
                C7024v c7024v3 = C7024v.f63377a;
                c7024v3.d(c7025w.k(), c7024v3.b(edgeEffectJ), fN2);
            }
        }
        if (c7025w.p()) {
            EdgeEffect edgeEffectG = c7025w.g();
            i(edgeEffectG, recordingCanvasBeginRecording);
            edgeEffectG.finish();
        }
        if (c7025w.o()) {
            EdgeEffect edgeEffectF = c7025w.f();
            boolean z10 = a(edgeEffectF, recordingCanvasBeginRecording) || zC;
            if (c7025w.q()) {
                float fM2 = C6224f.m(this.f63374c.i());
                C7024v c7024v4 = C7024v.f63377a;
                c7024v4.d(c7025w.g(), c7024v4.b(edgeEffectF), 1 - fM2);
            }
            zC = z10;
        }
        if (zC) {
            this.f63374c.k();
        }
        float f12 = zL ? 0.0f : fL1;
        if (zM) {
            fL1 = 0.0f;
        }
        EnumC5027t layoutDirection = interfaceC6708c.getLayoutDirection();
        InterfaceC6364j0 interfaceC6364j0B = s0.E.b(recordingCanvasBeginRecording);
        long jF = interfaceC6708c.f();
        InterfaceC5011d density = interfaceC6708c.n1().getDensity();
        EnumC5027t layoutDirection2 = interfaceC6708c.n1().getLayoutDirection();
        InterfaceC6364j0 interfaceC6364j0B2 = interfaceC6708c.n1().b();
        long jF2 = interfaceC6708c.n1().f();
        C6811c c6811cG = interfaceC6708c.n1().g();
        InterfaceC6709d interfaceC6709dN1 = interfaceC6708c.n1();
        interfaceC6709dN1.c(interfaceC6708c);
        interfaceC6709dN1.d(layoutDirection);
        interfaceC6709dN1.h(interfaceC6364j0B);
        interfaceC6709dN1.e(jF);
        interfaceC6709dN1.i(null);
        interfaceC6364j0B.p();
        try {
            interfaceC6708c.n1().a().d(f12, fL1);
            try {
                interfaceC6708c.B1();
                interfaceC6364j0B.k();
                InterfaceC6709d interfaceC6709dN12 = interfaceC6708c.n1();
                interfaceC6709dN12.c(density);
                interfaceC6709dN12.d(layoutDirection2);
                interfaceC6709dN12.h(interfaceC6364j0B2);
                interfaceC6709dN12.e(jF2);
                interfaceC6709dN12.i(c6811cG);
                k().endRecording();
                int iSave = canvasD.save();
                canvasD.translate(f10, f11);
                canvasD.drawRenderNode(k());
                canvasD.restoreToCount(iSave);
            } finally {
                interfaceC6708c.n1().a().d(-f12, -fL1);
            }
        } catch (Throwable th2) {
            interfaceC6364j0B.k();
            InterfaceC6709d interfaceC6709dN13 = interfaceC6708c.n1();
            interfaceC6709dN13.c(density);
            interfaceC6709dN13.d(layoutDirection2);
            interfaceC6709dN13.h(interfaceC6364j0B2);
            interfaceC6709dN13.e(jF2);
            interfaceC6709dN13.i(c6811cG);
            throw th2;
        }
    }
}
