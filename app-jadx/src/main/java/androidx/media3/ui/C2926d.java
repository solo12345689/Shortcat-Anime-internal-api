package androidx.media3.ui;

import P9.AbstractC2011u;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.ui.C2926d;
import androidx.media3.ui.G;
import androidx.recyclerview.widget.RecyclerView;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import q2.AbstractC6076H;
import q2.C6109x;
import q2.InterfaceC6084P;
import q2.Y;
import q2.b0;
import q2.d0;
import q2.h0;
import t2.AbstractC6610J;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.a0;

/* JADX INFO: renamed from: androidx.media3.ui.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2926d extends FrameLayout {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private static final float[] f31430g1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final ImageView f31431A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private final Drawable f31432A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final ImageView f31433B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private final Drawable f31434B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final ImageView f31435C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private final float f31436C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final ImageView f31437D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private final float f31438D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final ImageView f31439E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private final String f31440E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final View f31441F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private final String f31442F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final View f31443G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private final Drawable f31444G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final View f31445H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private final Drawable f31446H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final TextView f31447I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private final String f31448I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private final String f31449J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private final Drawable f31450K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private final Drawable f31451L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private final String f31452M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private final String f31453N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private InterfaceC6084P f31454O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private InterfaceC0523d f31455P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private boolean f31456Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private boolean f31457R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private boolean f31458S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private boolean f31459T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private boolean f31460U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private boolean f31461V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private int f31462W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private boolean f31463X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private int f31464Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    private int f31465Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f31466a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private long[] f31467a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f31468b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private boolean[] f31469b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f31470c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private long[] f31471c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class f31472d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private boolean[] f31473d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f31474e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private long f31475e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Method f31476f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private boolean f31477f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f31478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Method f31479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Method f31480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArrayList f31481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final RecyclerView f31482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final h f31483l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final TextView f31484l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final e f31485m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final G f31486m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f31487n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final StringBuilder f31488n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f31489o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final Formatter f31490o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final G3.E f31491p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final Y.b f31492p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final PopupWindow f31493q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final Y.d f31494q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f31495r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final Runnable f31496r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ImageView f31497s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final Drawable f31498s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ImageView f31499t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private final Drawable f31500t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ImageView f31501u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private final Drawable f31502u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final View f31503v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final Drawable f31504v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final View f31505w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private final Drawable f31506w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final TextView f31507x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final String f31508x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final TextView f31509y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private final String f31510y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ImageView f31511z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final String f31512z0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.media3.ui.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class b extends l {
        private b() {
            super();
        }

        public static /* synthetic */ void B(b bVar, View view) {
            if (C2926d.this.f31454O0 == null || !C2926d.this.f31454O0.k(29)) {
                return;
            }
            ((InterfaceC6084P) a0.l(C2926d.this.f31454O0)).P(C2926d.this.f31454O0.j0().I().I(1).V(1, false).G());
            C2926d.this.f31483l.y(1, C2926d.this.getResources().getString(G3.B.f7053w));
            C2926d.this.f31493q.dismiss();
        }

        private boolean C(d0 d0Var) {
            for (int i10 = 0; i10 < this.f31533d.size(); i10++) {
                if (d0Var.f56805D.containsKey(((k) this.f31533d.get(i10)).f31530a.c())) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.ui.C2926d.l
        public void A(String str) {
            C2926d.this.f31483l.y(1, str);
        }

        public void D(List list) {
            this.f31533d = list;
            d0 d0VarJ0 = ((InterfaceC6084P) AbstractC6614a.e(C2926d.this.f31454O0)).j0();
            if (list.isEmpty()) {
                C2926d.this.f31483l.y(1, C2926d.this.getResources().getString(G3.B.f7054x));
                return;
            }
            if (!C(d0VarJ0)) {
                C2926d.this.f31483l.y(1, C2926d.this.getResources().getString(G3.B.f7053w));
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                k kVar = (k) list.get(i10);
                if (kVar.a()) {
                    C2926d.this.f31483l.y(1, kVar.f31532c);
                    return;
                }
            }
        }

        @Override // androidx.media3.ui.C2926d.l
        public void y(i iVar) {
            iVar.f31527u.setText(G3.B.f7053w);
            iVar.f31528v.setVisibility(C(((InterfaceC6084P) AbstractC6614a.e(C2926d.this.f31454O0)).j0()) ? 4 : 0);
            iVar.f31840a.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2926d.b.B(this.f31535a, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.d$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c implements InterfaceC6084P.d, G.a, View.OnClickListener, PopupWindow.OnDismissListener {
        private c() {
        }

        @Override // androidx.media3.ui.G.a
        public void G(G g10, long j10) {
            C2926d.this.f31461V0 = true;
            if (C2926d.this.f31484l0 != null) {
                C2926d.this.f31484l0.setText(a0.s0(C2926d.this.f31488n0, C2926d.this.f31490o0, j10));
            }
            C2926d.this.f31466a.R();
            if (C2926d.this.f31454O0 == null || !C2926d.this.f31463X0) {
                return;
            }
            C2926d c2926d = C2926d.this;
            if (c2926d.j0(c2926d.f31454O0)) {
                try {
                    ((Method) AbstractC6614a.e(C2926d.this.f31474e)).invoke(C2926d.this.f31454O0, Boolean.TRUE);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e10) {
                    throw new RuntimeException(e10);
                }
            }
            C2926d c2926d2 = C2926d.this;
            if (c2926d2.i0(c2926d2.f31454O0)) {
                try {
                    ((Method) AbstractC6614a.e(C2926d.this.f31479h)).invoke(C2926d.this.f31454O0, Boolean.TRUE);
                } catch (IllegalAccessException | InvocationTargetException e11) {
                    throw new RuntimeException(e11);
                }
            } else {
                AbstractC6635w.i("PlayerControlView", "Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=" + ((InterfaceC6084P) AbstractC6614a.e(C2926d.this.f31454O0)).getClass());
            }
        }

        @Override // androidx.media3.ui.G.a
        public void K(G g10, long j10) throws IllegalAccessException, InvocationTargetException {
            if (C2926d.this.f31484l0 != null) {
                C2926d.this.f31484l0.setText(a0.s0(C2926d.this.f31488n0, C2926d.this.f31490o0, j10));
            }
            C2926d c2926d = C2926d.this;
            if (c2926d.m0(c2926d.f31454O0)) {
                C2926d c2926d2 = C2926d.this;
                c2926d2.u0(c2926d2.f31454O0, j10);
            }
        }

        @Override // androidx.media3.ui.G.a
        public void O(G g10, long j10, boolean z10) throws IllegalAccessException, InvocationTargetException {
            C2926d.this.f31461V0 = false;
            if (C2926d.this.f31454O0 != null) {
                if (!z10) {
                    C2926d c2926d = C2926d.this;
                    c2926d.u0(c2926d.f31454O0, j10);
                }
                C2926d c2926d2 = C2926d.this;
                if (c2926d2.j0(c2926d2.f31454O0)) {
                    try {
                        ((Method) AbstractC6614a.e(C2926d.this.f31474e)).invoke(C2926d.this.f31454O0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e10) {
                        throw new RuntimeException(e10);
                    }
                } else {
                    C2926d c2926d3 = C2926d.this;
                    if (c2926d3.i0(c2926d3.f31454O0)) {
                        try {
                            ((Method) AbstractC6614a.e(C2926d.this.f31479h)).invoke(C2926d.this.f31454O0, Boolean.FALSE);
                        } catch (IllegalAccessException | InvocationTargetException e11) {
                            throw new RuntimeException(e11);
                        }
                    }
                }
            }
            C2926d.this.f31466a.S();
        }

        @Override // q2.InterfaceC6084P.d
        public void X(InterfaceC6084P interfaceC6084P, InterfaceC6084P.c cVar) throws IllegalAccessException, InvocationTargetException {
            if (cVar.a(4, 5, 13)) {
                C2926d.this.D0();
            }
            if (cVar.a(4, 5, 7, 13)) {
                C2926d.this.F0();
            }
            if (cVar.a(8, 13)) {
                C2926d.this.G0();
            }
            if (cVar.a(9, 13)) {
                C2926d.this.K0();
            }
            if (cVar.a(8, 9, 11, 0, 16, 17, 13)) {
                C2926d.this.C0();
            }
            if (cVar.a(11, 0, 13)) {
                C2926d.this.L0();
            }
            if (cVar.a(12, 13)) {
                C2926d.this.E0();
            }
            if (cVar.a(2, 13)) {
                C2926d.this.M0();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InterfaceC6084P interfaceC6084P = C2926d.this.f31454O0;
            if (interfaceC6084P == null) {
                return;
            }
            C2926d.this.f31466a.S();
            if (C2926d.this.f31499t == view) {
                if (interfaceC6084P.k(9)) {
                    interfaceC6084P.k0();
                    return;
                }
                return;
            }
            if (C2926d.this.f31497s == view) {
                if (interfaceC6084P.k(7)) {
                    interfaceC6084P.U();
                    return;
                }
                return;
            }
            if (C2926d.this.f31503v == view) {
                if (interfaceC6084P.p() == 4 || !interfaceC6084P.k(12)) {
                    return;
                }
                interfaceC6084P.T0();
                return;
            }
            if (C2926d.this.f31505w == view) {
                if (interfaceC6084P.k(11)) {
                    interfaceC6084P.U0();
                    return;
                }
                return;
            }
            if (C2926d.this.f31501u == view) {
                a0.C0(interfaceC6084P, C2926d.this.f31459T0);
                return;
            }
            if (C2926d.this.f31511z == view) {
                if (interfaceC6084P.k(15)) {
                    interfaceC6084P.v(AbstractC6610J.a(interfaceC6084P.x(), C2926d.this.f31465Z0));
                    return;
                }
                return;
            }
            if (C2926d.this.f31431A == view) {
                if (interfaceC6084P.k(14)) {
                    interfaceC6084P.r0(!interfaceC6084P.Q0());
                    return;
                }
                return;
            }
            if (C2926d.this.f31441F == view) {
                C2926d.this.f31466a.R();
                C2926d c2926d = C2926d.this;
                c2926d.b0(c2926d.f31483l, C2926d.this.f31441F);
                return;
            }
            if (C2926d.this.f31443G == view) {
                C2926d.this.f31466a.R();
                C2926d c2926d2 = C2926d.this;
                c2926d2.b0(c2926d2.f31485m, C2926d.this.f31443G);
            } else if (C2926d.this.f31445H == view) {
                C2926d.this.f31466a.R();
                C2926d c2926d3 = C2926d.this;
                c2926d3.b0(c2926d3.f31489o, C2926d.this.f31445H);
            } else if (C2926d.this.f31435C == view) {
                C2926d.this.f31466a.R();
                C2926d c2926d4 = C2926d.this;
                c2926d4.b0(c2926d4.f31487n, C2926d.this.f31435C);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (C2926d.this.f31477f1) {
                C2926d.this.f31466a.S();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0523d {
        void K(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.media3.ui.d$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class e extends RecyclerView.h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String[] f31515d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float[] f31516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f31517f;

        public e(String[] strArr, float[] fArr) {
            this.f31515d = strArr;
            this.f31516e = fArr;
        }

        public static /* synthetic */ void v(e eVar, int i10, View view) {
            if (i10 != eVar.f31517f) {
                C2926d.this.setPlaybackSpeed(eVar.f31516e[i10]);
            }
            C2926d.this.f31493q.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int e() {
            return this.f31515d.length;
        }

        public String w() {
            return this.f31515d[this.f31517f];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public void k(i iVar, final int i10) {
            String[] strArr = this.f31515d;
            if (i10 < strArr.length) {
                iVar.f31527u.setText(strArr[i10]);
            }
            if (i10 == this.f31517f) {
                iVar.f31840a.setSelected(true);
                iVar.f31528v.setVisibility(0);
            } else {
                iVar.f31840a.setSelected(false);
                iVar.f31528v.setVisibility(4);
            }
            iVar.f31840a.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2926d.e.v(this.f31536a, i10, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public i m(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(C2926d.this.getContext()).inflate(G3.z.f7227f, viewGroup, false));
        }

        public void z(float f10) {
            int i10 = 0;
            float f11 = Float.MAX_VALUE;
            int i11 = 0;
            while (true) {
                float[] fArr = this.f31516e;
                if (i10 >= fArr.length) {
                    this.f31517f = i11;
                    return;
                }
                float fAbs = Math.abs(f10 - fArr[i10]);
                if (fAbs < f11) {
                    i11 = i10;
                    f11 = fAbs;
                }
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.d$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface f {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.media3.ui.d$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class g extends RecyclerView.E {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final TextView f31519u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final TextView f31520v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final ImageView f31521w;

        public g(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.f31519u = (TextView) view.findViewById(G3.x.f7215v);
            this.f31520v = (TextView) view.findViewById(G3.x.f7188O);
            this.f31521w = (ImageView) view.findViewById(G3.x.f7213t);
            view.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C2926d.g gVar = this.f31538a;
                    C2926d.this.r0(gVar.k());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.media3.ui.d$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class h extends RecyclerView.h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String[] f31523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String[] f31524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Drawable[] f31525f;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f31523d = strArr;
            this.f31524e = new String[strArr.length];
            this.f31525f = drawableArr;
        }

        private boolean z(int i10) {
            if (C2926d.this.f31454O0 == null) {
                return false;
            }
            if (i10 == 0) {
                return C2926d.this.f31454O0.k(13);
            }
            if (i10 != 1) {
                return true;
            }
            return C2926d.this.f31454O0.k(30) && C2926d.this.f31454O0.k(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int e() {
            return this.f31523d.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long f(int i10) {
            return i10;
        }

        public boolean v() {
            return z(1) || z(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void k(g gVar, int i10) {
            if (z(i10)) {
                gVar.f31840a.setLayoutParams(new RecyclerView.q(-1, -2));
            } else {
                gVar.f31840a.setLayoutParams(new RecyclerView.q(0, 0));
            }
            gVar.f31519u.setText(this.f31523d[i10]);
            if (this.f31524e[i10] == null) {
                gVar.f31520v.setVisibility(8);
            } else {
                gVar.f31520v.setText(this.f31524e[i10]);
            }
            if (this.f31525f[i10] == null) {
                gVar.f31521w.setVisibility(8);
            } else {
                gVar.f31521w.setImageDrawable(this.f31525f[i10]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public g m(ViewGroup viewGroup, int i10) {
            return C2926d.this.new g(LayoutInflater.from(C2926d.this.getContext()).inflate(G3.z.f7226e, viewGroup, false));
        }

        public void y(int i10, String str) {
            this.f31524e[i10] = str;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.d$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class i extends RecyclerView.E {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final TextView f31527u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final View f31528v;

        public i(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.f31527u = (TextView) view.findViewById(G3.x.f7191R);
            this.f31528v = view.findViewById(G3.x.f7201h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.media3.ui.d$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h0.a f31530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f31531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f31532c;

        public k(h0 h0Var, int i10, int i11, String str) {
            this.f31530a = (h0.a) h0Var.b().get(i10);
            this.f31531b = i11;
            this.f31532c = str;
        }

        public boolean a() {
            return this.f31530a.i(this.f31531b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.media3.ui.d$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    abstract class l extends RecyclerView.h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected List f31533d = new ArrayList();

        protected l() {
        }

        public static /* synthetic */ void v(l lVar, InterfaceC6084P interfaceC6084P, q2.a0 a0Var, k kVar, View view) {
            lVar.getClass();
            if (interfaceC6084P.k(29)) {
                interfaceC6084P.P(interfaceC6084P.j0().I().R(new b0(a0Var, AbstractC2011u.B(Integer.valueOf(kVar.f31531b)))).V(kVar.f31530a.e(), false).G());
                lVar.A(kVar.f31532c);
                C2926d.this.f31493q.dismiss();
            }
        }

        protected abstract void A(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int e() {
            if (this.f31533d.isEmpty()) {
                return 0;
            }
            return this.f31533d.size() + 1;
        }

        protected void w() {
            this.f31533d = Collections.EMPTY_LIST;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: x */
        public void k(i iVar, int i10) {
            final InterfaceC6084P interfaceC6084P = C2926d.this.f31454O0;
            if (interfaceC6084P == null) {
                return;
            }
            if (i10 == 0) {
                y(iVar);
                return;
            }
            final k kVar = (k) this.f31533d.get(i10 - 1);
            final q2.a0 a0VarC = kVar.f31530a.c();
            boolean z10 = interfaceC6084P.j0().f56805D.get(a0VarC) != null && kVar.a();
            iVar.f31527u.setText(kVar.f31532c);
            iVar.f31528v.setVisibility(z10 ? 0 : 4);
            iVar.f31840a.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2926d.l.v(this.f31540a, interfaceC6084P, a0VarC, kVar, view);
                }
            });
        }

        protected abstract void y(i iVar);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public i m(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(C2926d.this.getContext()).inflate(G3.z.f7227f, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.d$m */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface m {
        void G(int i10);
    }

    static {
        AbstractC6076H.a("media3.ui");
        f31430g1 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05e0  */
    /* JADX WARN: Type inference failed for: r10v3, types: [androidx.media3.ui.G] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.view.View, android.view.ViewGroup, android.widget.TextView, androidx.media3.ui.d$a] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.LayoutInflater] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2926d(android.content.Context r36, android.util.AttributeSet r37, int r38, android.util.AttributeSet r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.C2926d.<init>(android.content.Context, android.util.AttributeSet, int, android.util.AttributeSet):void");
    }

    private static void A0(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0() {
        boolean zK;
        boolean zK2;
        boolean zK3;
        boolean zK4;
        boolean zK5;
        if (n0() && this.f31457R0) {
            InterfaceC6084P interfaceC6084P = this.f31454O0;
            if (interfaceC6084P != null) {
                zK = (this.f31458S0 && Z(interfaceC6084P, this.f31494q0)) ? interfaceC6084P.k(10) : interfaceC6084P.k(5);
                zK3 = interfaceC6084P.k(7);
                zK4 = interfaceC6084P.k(11);
                zK5 = interfaceC6084P.k(12);
                zK2 = interfaceC6084P.k(9);
            } else {
                zK = false;
                zK2 = false;
                zK3 = false;
                zK4 = false;
                zK5 = false;
            }
            if (zK4) {
                H0();
            }
            if (zK5) {
                y0();
            }
            x0(zK3, this.f31497s);
            x0(zK4, this.f31505w);
            x0(zK5, this.f31503v);
            x0(zK2, this.f31499t);
            G g10 = this.f31486m0;
            if (g10 != null) {
                g10.setEnabled(zK);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() {
        if (n0() && this.f31457R0 && this.f31501u != null) {
            boolean zS1 = a0.s1(this.f31454O0, this.f31459T0);
            Drawable drawable = zS1 ? this.f31498s0 : this.f31500t0;
            int i10 = zS1 ? G3.B.f7037g : G3.B.f7036f;
            this.f31501u.setImageDrawable(drawable);
            this.f31501u.setContentDescription(this.f31468b.getString(i10));
            x0(a0.r1(this.f31454O0), this.f31501u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0() {
        InterfaceC6084P interfaceC6084P = this.f31454O0;
        if (interfaceC6084P == null) {
            return;
        }
        this.f31485m.z(interfaceC6084P.c().f56601a);
        this.f31483l.y(0, this.f31485m.w());
        I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() throws IllegalAccessException, InvocationTargetException {
        long jG0;
        long jR0;
        if (n0() && this.f31457R0) {
            InterfaceC6084P interfaceC6084P = this.f31454O0;
            if (interfaceC6084P == null || !interfaceC6084P.k(16)) {
                jG0 = 0;
                jR0 = 0;
            } else {
                jG0 = this.f31475e1 + interfaceC6084P.G0();
                jR0 = this.f31475e1 + interfaceC6084P.R0();
            }
            TextView textView = this.f31484l0;
            if (textView != null && !this.f31461V0) {
                textView.setText(a0.s0(this.f31488n0, this.f31490o0, jG0));
            }
            G g10 = this.f31486m0;
            if (g10 != null) {
                g10.setPosition(jG0);
                G g11 = this.f31486m0;
                if (m0(interfaceC6084P)) {
                    jR0 = jG0;
                }
                g11.setBufferedPosition(jR0);
            }
            removeCallbacks(this.f31496r0);
            int iP = interfaceC6084P == null ? 1 : interfaceC6084P.p();
            if (interfaceC6084P == null || !interfaceC6084P.isPlaying()) {
                if (iP == 4 || iP == 1) {
                    return;
                }
                postDelayed(this.f31496r0, 1000L);
                return;
            }
            G g12 = this.f31486m0;
            long jMin = Math.min(g12 != null ? g12.getPreferredUpdateDelay() : 1000L, 1000 - (jG0 % 1000));
            float f10 = interfaceC6084P.c().f56601a;
            postDelayed(this.f31496r0, a0.s(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.f31464Y0, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0() {
        ImageView imageView;
        if (n0() && this.f31457R0 && (imageView = this.f31511z) != null) {
            if (this.f31465Z0 == 0) {
                x0(false, imageView);
                return;
            }
            InterfaceC6084P interfaceC6084P = this.f31454O0;
            if (interfaceC6084P == null || !interfaceC6084P.k(15)) {
                x0(false, this.f31511z);
                this.f31511z.setImageDrawable(this.f31502u0);
                this.f31511z.setContentDescription(this.f31508x0);
                return;
            }
            x0(true, this.f31511z);
            int iX = interfaceC6084P.x();
            if (iX == 0) {
                this.f31511z.setImageDrawable(this.f31502u0);
                this.f31511z.setContentDescription(this.f31508x0);
            } else if (iX == 1) {
                this.f31511z.setImageDrawable(this.f31504v0);
                this.f31511z.setContentDescription(this.f31510y0);
            } else {
                if (iX != 2) {
                    return;
                }
                this.f31511z.setImageDrawable(this.f31506w0);
                this.f31511z.setContentDescription(this.f31512z0);
            }
        }
    }

    private void H0() {
        InterfaceC6084P interfaceC6084P = this.f31454O0;
        int iX0 = (int) ((interfaceC6084P != null ? interfaceC6084P.X0() : HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS) / 1000);
        TextView textView = this.f31509y;
        if (textView != null) {
            textView.setText(String.valueOf(iX0));
        }
        View view = this.f31505w;
        if (view != null) {
            view.setContentDescription(this.f31468b.getQuantityString(G3.A.f7025b, iX0, Integer.valueOf(iX0)));
        }
    }

    private void I0() {
        x0(this.f31483l.v(), this.f31441F);
    }

    private void J0() {
        this.f31482k.measure(0, 0);
        this.f31493q.setWidth(Math.min(this.f31482k.getMeasuredWidth(), getWidth() - (this.f31495r * 2)));
        this.f31493q.setHeight(Math.min(getHeight() - (this.f31495r * 2), this.f31482k.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0() {
        ImageView imageView;
        if (n0() && this.f31457R0 && (imageView = this.f31431A) != null) {
            InterfaceC6084P interfaceC6084P = this.f31454O0;
            if (!this.f31466a.A(imageView)) {
                x0(false, this.f31431A);
                return;
            }
            if (interfaceC6084P == null || !interfaceC6084P.k(14)) {
                x0(false, this.f31431A);
                this.f31431A.setImageDrawable(this.f31434B0);
                this.f31431A.setContentDescription(this.f31442F0);
            } else {
                x0(true, this.f31431A);
                this.f31431A.setImageDrawable(interfaceC6084P.Q0() ? this.f31432A0 : this.f31434B0);
                this.f31431A.setContentDescription(interfaceC6084P.Q0() ? this.f31440E0 : this.f31442F0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0116  */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void L0() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.C2926d.L0():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0() {
        g0();
        x0(this.f31487n.e() > 0, this.f31435C);
        I0();
    }

    private static boolean Z(InterfaceC6084P interfaceC6084P, Y.d dVar) {
        Y yH0;
        int iT;
        if (!interfaceC6084P.k(17) || (iT = (yH0 = interfaceC6084P.h0()).t()) <= 1 || iT > 100) {
            return false;
        }
        for (int i10 = 0; i10 < iT; i10++) {
            if (yH0.r(i10, dVar).f56690m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(RecyclerView.h hVar, View view) {
        this.f31482k.setAdapter(hVar);
        J0();
        this.f31477f1 = false;
        this.f31493q.dismiss();
        this.f31477f1 = true;
        this.f31493q.showAsDropDown(view, (getWidth() - this.f31493q.getWidth()) - this.f31495r, (-this.f31493q.getHeight()) - this.f31495r);
    }

    private AbstractC2011u c0(h0 h0Var, int i10) {
        AbstractC2011u.a aVar = new AbstractC2011u.a();
        AbstractC2011u abstractC2011uB = h0Var.b();
        for (int i11 = 0; i11 < abstractC2011uB.size(); i11++) {
            h0.a aVar2 = (h0.a) abstractC2011uB.get(i11);
            if (aVar2.e() == i10) {
                for (int i12 = 0; i12 < aVar2.f56884a; i12++) {
                    if (aVar2.j(i12)) {
                        C6109x c6109xD = aVar2.d(i12);
                        if ((c6109xD.f57012e & 2) == 0) {
                            aVar.a(new k(h0Var, i11, i12, this.f31491p.a(c6109xD)));
                        }
                    }
                }
            }
        }
        return aVar.k();
    }

    private static int d0(TypedArray typedArray, int i10) {
        return typedArray.getInt(G3.D.f7069L, i10);
    }

    private void g0() {
        this.f31487n.w();
        this.f31489o.w();
        InterfaceC6084P interfaceC6084P = this.f31454O0;
        if (interfaceC6084P != null && interfaceC6084P.k(30) && this.f31454O0.k(29)) {
            h0 h0VarY = this.f31454O0.Y();
            this.f31489o.D(c0(h0VarY, 1));
            if (this.f31466a.A(this.f31435C)) {
                this.f31487n.C(c0(h0VarY, 3));
            } else {
                this.f31487n.C(AbstractC2011u.A());
            }
        }
    }

    private static void h0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i0(InterfaceC6084P interfaceC6084P) {
        Class cls;
        return (interfaceC6084P == null || (cls = this.f31478g) == null || !cls.isAssignableFrom(interfaceC6084P.getClass())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j0(InterfaceC6084P interfaceC6084P) {
        Class cls;
        return (interfaceC6084P == null || (cls = this.f31472d) == null || !cls.isAssignableFrom(interfaceC6084P.getClass())) ? false : true;
    }

    private static boolean l0(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m0(InterfaceC6084P interfaceC6084P) throws IllegalAccessException, InvocationTargetException {
        try {
            if (j0(interfaceC6084P) && ((Boolean) AbstractC6614a.e(((Method) AbstractC6614a.e(this.f31476f)).invoke(interfaceC6084P, null))).booleanValue()) {
                return true;
            }
            if (i0(interfaceC6084P)) {
                return ((Boolean) AbstractC6614a.e(((Method) AbstractC6614a.e(this.f31480i)).invoke(interfaceC6084P, null))).booleanValue();
            }
            return false;
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(View view) {
        B0(!this.f31456Q0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i13 - i11;
        int i19 = i17 - i15;
        if (!(i12 - i10 == i16 - i14 && i18 == i19) && this.f31493q.isShowing()) {
            J0();
            this.f31493q.update(view, (getWidth() - this.f31493q.getWidth()) - this.f31495r, (-this.f31493q.getHeight()) - this.f31495r, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(int i10) {
        if (i10 == 0) {
            b0(this.f31485m, (View) AbstractC6614a.e(this.f31441F));
        } else if (i10 == 1) {
            b0(this.f31489o, (View) AbstractC6614a.e(this.f31441F));
        } else {
            this.f31493q.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        InterfaceC6084P interfaceC6084P = this.f31454O0;
        if (interfaceC6084P == null || !interfaceC6084P.k(13)) {
            return;
        }
        InterfaceC6084P interfaceC6084P2 = this.f31454O0;
        interfaceC6084P2.e(interfaceC6084P2.c().d(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(InterfaceC6084P interfaceC6084P, long j10) throws IllegalAccessException, InvocationTargetException {
        if (this.f31460U0) {
            if (interfaceC6084P.k(17) && interfaceC6084P.k(10)) {
                Y yH0 = interfaceC6084P.h0();
                int iT = yH0.t();
                int i10 = 0;
                while (true) {
                    long jE = yH0.r(i10, this.f31494q0).e();
                    if (j10 < jE) {
                        break;
                    }
                    if (i10 == iT - 1) {
                        j10 = jE;
                        break;
                    } else {
                        j10 -= jE;
                        i10++;
                    }
                }
                interfaceC6084P.o0(i10, j10);
            }
        } else if (interfaceC6084P.k(5)) {
            interfaceC6084P.z(j10);
        }
        F0();
    }

    private void x0(boolean z10, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.f31436C0 : this.f31438D0);
    }

    private void y0() {
        InterfaceC6084P interfaceC6084P = this.f31454O0;
        int iF0 = (int) ((interfaceC6084P != null ? interfaceC6084P.F0() : 15000L) / 1000);
        TextView textView = this.f31507x;
        if (textView != null) {
            textView.setText(String.valueOf(iF0));
        }
        View view = this.f31503v;
        if (view != null) {
            view.setContentDescription(this.f31468b.getQuantityString(G3.A.f7024a, iF0, Integer.valueOf(iF0)));
        }
    }

    private void z0(ImageView imageView, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (z10) {
            imageView.setImageDrawable(this.f31450K0);
            imageView.setContentDescription(this.f31452M0);
        } else {
            imageView.setImageDrawable(this.f31451L0);
            imageView.setContentDescription(this.f31453N0);
        }
    }

    public void B0(boolean z10) {
        if (this.f31456Q0 == z10) {
            return;
        }
        this.f31456Q0 = z10;
        z0(this.f31437D, z10);
        z0(this.f31439E, z10);
        InterfaceC0523d interfaceC0523d = this.f31455P0;
        if (interfaceC0523d != null) {
            interfaceC0523d.K(z10);
        }
    }

    public void Y(m mVar) {
        AbstractC6614a.e(mVar);
        this.f31481j.add(mVar);
    }

    public boolean a0(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC6084P interfaceC6084P = this.f31454O0;
        if (interfaceC6084P == null || !l0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (interfaceC6084P.p() == 4 || !interfaceC6084P.k(12)) {
                return true;
            }
            interfaceC6084P.T0();
            return true;
        }
        if (keyCode == 89 && interfaceC6084P.k(11)) {
            interfaceC6084P.U0();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            a0.C0(interfaceC6084P, this.f31459T0);
            return true;
        }
        if (keyCode == 87) {
            if (!interfaceC6084P.k(9)) {
                return true;
            }
            interfaceC6084P.k0();
            return true;
        }
        if (keyCode == 88) {
            if (!interfaceC6084P.k(7)) {
                return true;
            }
            interfaceC6084P.U();
            return true;
        }
        if (keyCode == 126) {
            a0.B0(interfaceC6084P);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        a0.A0(interfaceC6084P);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a0(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void e0() {
        this.f31466a.C();
    }

    public void f0() {
        this.f31466a.F();
    }

    public InterfaceC6084P getPlayer() {
        return this.f31454O0;
    }

    public int getRepeatToggleModes() {
        return this.f31465Z0;
    }

    public boolean getShowShuffleButton() {
        return this.f31466a.A(this.f31431A);
    }

    public boolean getShowSubtitleButton() {
        return this.f31466a.A(this.f31435C);
    }

    public int getShowTimeoutMs() {
        return this.f31462W0;
    }

    public boolean getShowVrButton() {
        return this.f31466a.A(this.f31433B);
    }

    public boolean k0() {
        return this.f31466a.I();
    }

    public boolean n0() {
        return getVisibility() == 0;
    }

    void o0() {
        Iterator it = this.f31481j.iterator();
        while (it.hasNext()) {
            ((m) it.next()).G(getVisibility());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, InvocationTargetException {
        super.onAttachedToWindow();
        this.f31466a.K();
        this.f31457R0 = true;
        if (k0()) {
            this.f31466a.S();
        }
        w0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31466a.L();
        this.f31457R0 = false;
        removeCallbacks(this.f31496r0);
        this.f31466a.R();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f31466a.M(z10, i10, i11, i12, i13);
    }

    public void s0(m mVar) {
        this.f31481j.remove(mVar);
    }

    public void setAnimationEnabled(boolean z10) {
        this.f31466a.T(z10);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(InterfaceC0523d interfaceC0523d) {
        this.f31455P0 = interfaceC0523d;
        A0(this.f31437D, interfaceC0523d != null);
        A0(this.f31439E, interfaceC0523d != null);
    }

    public void setPlayer(InterfaceC6084P interfaceC6084P) throws IllegalAccessException, InvocationTargetException {
        AbstractC6614a.g(Looper.myLooper() == Looper.getMainLooper());
        AbstractC6614a.a(interfaceC6084P == null || interfaceC6084P.m() == Looper.getMainLooper());
        InterfaceC6084P interfaceC6084P2 = this.f31454O0;
        if (interfaceC6084P2 == interfaceC6084P) {
            return;
        }
        if (interfaceC6084P2 != null) {
            interfaceC6084P2.H(this.f31470c);
        }
        this.f31454O0 = interfaceC6084P;
        if (interfaceC6084P != null) {
            interfaceC6084P.a0(this.f31470c);
        }
        w0();
    }

    public void setRepeatToggleModes(int i10) {
        this.f31465Z0 = i10;
        InterfaceC6084P interfaceC6084P = this.f31454O0;
        if (interfaceC6084P != null && interfaceC6084P.k(15)) {
            int iX = this.f31454O0.x();
            if (i10 == 0 && iX != 0) {
                this.f31454O0.v(0);
            } else if (i10 == 1 && iX == 2) {
                this.f31454O0.v(1);
            } else if (i10 == 2 && iX == 1) {
                this.f31454O0.v(2);
            }
        }
        this.f31466a.U(this.f31511z, i10 != 0);
        G0();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f31466a.U(this.f31503v, z10);
        C0();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) throws IllegalAccessException, InvocationTargetException {
        this.f31458S0 = z10;
        L0();
    }

    public void setShowNextButton(boolean z10) {
        this.f31466a.U(this.f31499t, z10);
        C0();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        this.f31459T0 = z10;
        D0();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f31466a.U(this.f31497s, z10);
        C0();
    }

    public void setShowRewindButton(boolean z10) {
        this.f31466a.U(this.f31505w, z10);
        C0();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f31466a.U(this.f31431A, z10);
        K0();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f31466a.U(this.f31435C, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f31462W0 = i10;
        if (k0()) {
            this.f31466a.S();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f31466a.U(this.f31433B, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f31464Y0 = a0.r(i10, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z10) {
        this.f31463X0 = z10;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f31433B;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            x0(onClickListener != null, this.f31433B);
        }
    }

    void t0() {
        ImageView imageView = this.f31501u;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public void v0() throws IllegalAccessException, InvocationTargetException {
        this.f31466a.X();
    }

    void w0() throws IllegalAccessException, InvocationTargetException {
        D0();
        C0();
        G0();
        K0();
        M0();
        E0();
        L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.media3.ui.d$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class j extends l {
        private j() {
            super();
        }

        public static /* synthetic */ void B(j jVar, View view) {
            if (C2926d.this.f31454O0 == null || !C2926d.this.f31454O0.k(29)) {
                return;
            }
            C2926d.this.f31454O0.P(C2926d.this.f31454O0.j0().I().I(3).P(-3).S(null).U(0).G());
            C2926d.this.f31493q.dismiss();
        }

        public void C(List list) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((k) list.get(i10)).a()) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (C2926d.this.f31435C != null) {
                ImageView imageView = C2926d.this.f31435C;
                C2926d c2926d = C2926d.this;
                imageView.setImageDrawable(z10 ? c2926d.f31444G0 : c2926d.f31446H0);
                C2926d.this.f31435C.setContentDescription(z10 ? C2926d.this.f31448I0 : C2926d.this.f31449J0);
            }
            this.f31533d = list;
        }

        @Override // androidx.media3.ui.C2926d.l, androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public void k(i iVar, int i10) {
            super.k(iVar, i10);
            if (i10 > 0) {
                iVar.f31528v.setVisibility(((k) this.f31533d.get(i10 + (-1))).a() ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.C2926d.l
        public void y(i iVar) {
            boolean z10;
            iVar.f31527u.setText(G3.B.f7054x);
            int i10 = 0;
            while (true) {
                if (i10 >= this.f31533d.size()) {
                    z10 = true;
                    break;
                } else {
                    if (((k) this.f31533d.get(i10)).a()) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
            }
            iVar.f31528v.setVisibility(z10 ? 0 : 4);
            iVar.f31840a.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2926d.j.B(this.f31539a, view);
                }
            });
        }

        @Override // androidx.media3.ui.C2926d.l
        public void A(String str) {
        }
    }

    public void setProgressUpdateListener(f fVar) {
    }
}
