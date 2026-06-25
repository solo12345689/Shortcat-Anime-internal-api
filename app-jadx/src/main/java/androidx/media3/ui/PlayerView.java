package androidx.media3.ui;

import P9.AbstractC2011u;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.C2926d;
import androidx.media3.ui.PlayerView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import q2.C6086a;
import q2.InterfaceC6084P;
import q2.InterfaceC6103r;
import q2.Y;
import q2.h0;
import q2.l0;
import s2.C6407e;
import t2.AbstractC6614a;
import t2.a0;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class PlayerView extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f31320A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private CharSequence f31321B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f31322C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f31323D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f31324E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f31325F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f31326G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f31327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AspectRatioFrameLayout f31328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f31329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f31330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f31331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f31332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ImageView f31333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ImageView f31334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SubtitleView f31335i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View f31336j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final TextView f31337k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C2926d f31338l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final FrameLayout f31339m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FrameLayout f31340n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Handler f31341o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Class f31342p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Method f31343q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f31344r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private InterfaceC6084P f31345s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f31346t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private C2926d.m f31347u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private e f31348v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f31349w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f31350x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Drawable f31351y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f31352z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {
        public static void a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c implements InterfaceC6084P.d, View.OnClickListener, C2926d.m, C2926d.InterfaceC0523d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Y.b f31353a = new Y.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f31354b;

        public c() {
        }

        @Override // androidx.media3.ui.C2926d.m
        public void G(int i10) {
            PlayerView.this.Y();
            PlayerView.o(PlayerView.this);
        }

        @Override // q2.InterfaceC6084P.d
        public void J(int i10) throws IllegalAccessException, InvocationTargetException {
            PlayerView.this.X();
            PlayerView.this.a0();
            PlayerView.this.Z();
        }

        @Override // androidx.media3.ui.C2926d.InterfaceC0523d
        public void K(boolean z10) {
            if (PlayerView.this.f31348v != null) {
                PlayerView.this.f31348v.a(z10);
            }
        }

        @Override // q2.InterfaceC6084P.d
        public void T() {
            if (PlayerView.this.f31329c != null) {
                PlayerView.this.f31329c.setVisibility(4);
                if (PlayerView.this.B()) {
                    PlayerView.this.G();
                } else {
                    PlayerView.this.D();
                }
            }
        }

        @Override // q2.InterfaceC6084P.d
        public void W(int i10, int i11) {
            if (Build.VERSION.SDK_INT == 34 && (PlayerView.this.f31330d instanceof SurfaceView) && PlayerView.this.f31326G) {
                f fVar = (f) AbstractC6614a.e(PlayerView.this.f31332f);
                Handler handler = PlayerView.this.f31341o;
                SurfaceView surfaceView = (SurfaceView) PlayerView.this.f31330d;
                final PlayerView playerView = PlayerView.this;
                fVar.d(handler, surfaceView, new Runnable() { // from class: G3.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        playerView.invalidate();
                    }
                });
            }
        }

        @Override // q2.InterfaceC6084P.d
        public void b(l0 l0Var) {
            if (l0Var.equals(l0.f56919e) || PlayerView.this.f31345s == null || PlayerView.this.f31345s.p() == 1) {
                return;
            }
            PlayerView.this.W();
        }

        @Override // q2.InterfaceC6084P.d
        public void g0(h0 h0Var) {
            InterfaceC6084P interfaceC6084P = (InterfaceC6084P) AbstractC6614a.e(PlayerView.this.f31345s);
            Y yH0 = interfaceC6084P.k(17) ? interfaceC6084P.h0() : Y.f56642a;
            if (yH0.u()) {
                this.f31354b = null;
            } else if (!interfaceC6084P.k(30) || interfaceC6084P.Y().c()) {
                Object obj = this.f31354b;
                if (obj != null) {
                    int iF = yH0.f(obj);
                    if (iF != -1) {
                        if (interfaceC6084P.K0() == yH0.j(iF, this.f31353a).f56653c) {
                            return;
                        }
                    }
                    this.f31354b = null;
                }
            } else {
                this.f31354b = yH0.k(interfaceC6084P.u0(), this.f31353a, true).f56652b;
            }
            PlayerView.this.b0(false);
        }

        @Override // q2.InterfaceC6084P.d
        public void m0(InterfaceC6084P.e eVar, InterfaceC6084P.e eVar2, int i10) {
            if (PlayerView.this.J() && PlayerView.this.f31324E) {
                PlayerView.this.F();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, InvocationTargetException {
            PlayerView.this.V();
        }

        @Override // q2.InterfaceC6084P.d
        public void s0(boolean z10, int i10) throws IllegalAccessException, InvocationTargetException {
            PlayerView.this.X();
            PlayerView.this.Z();
        }

        @Override // q2.InterfaceC6084P.d
        public void t(C6407e c6407e) {
            if (PlayerView.this.f31335i != null) {
                PlayerView.this.f31335i.setCues(c6407e.f59086a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface e {
        void a(boolean z10);
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B() {
        InterfaceC6084P interfaceC6084P = this.f31345s;
        return interfaceC6084P != null && this.f31344r != null && interfaceC6084P.k(30) && interfaceC6084P.Y().d(4);
    }

    private boolean C() {
        InterfaceC6084P interfaceC6084P = this.f31345s;
        return interfaceC6084P != null && interfaceC6084P.k(30) && interfaceC6084P.Y().d(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        G();
        ImageView imageView = this.f31333g;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    private void E() {
        ImageView imageView = this.f31334h;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f31334h.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        ImageView imageView = this.f31333g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    private boolean H(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    private boolean I() {
        Drawable drawable;
        ImageView imageView = this.f31333g;
        return (imageView == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean J() {
        InterfaceC6084P interfaceC6084P = this.f31345s;
        return interfaceC6084P != null && interfaceC6084P.k(16) && this.f31345s.D() && this.f31345s.q0();
    }

    private void K(boolean z10) throws IllegalAccessException, InvocationTargetException {
        if (!(J() && this.f31324E) && e0()) {
            boolean z11 = this.f31338l.k0() && this.f31338l.getShowTimeoutMs() <= 0;
            boolean zQ = Q();
            if (z10 || z11 || zQ) {
                S(zQ);
            }
        }
    }

    private void M(final Bitmap bitmap) {
        this.f31341o.post(new Runnable() { // from class: G3.j
            @Override // java.lang.Runnable
            public final void run() {
                PlayerView.a(this.f7143a, bitmap);
            }
        });
    }

    private boolean N(InterfaceC6084P interfaceC6084P) {
        byte[] bArr;
        if (interfaceC6084P == null || !interfaceC6084P.k(18) || (bArr = interfaceC6084P.V0().f56528k) == null) {
            return false;
        }
        return O(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private boolean O(Drawable drawable) {
        if (this.f31334h != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f31349w == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                L(this.f31328b, width);
                this.f31334h.setScaleType(scaleType);
                this.f31334h.setImageDrawable(drawable);
                this.f31334h.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void P(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    private boolean Q() {
        InterfaceC6084P interfaceC6084P = this.f31345s;
        if (interfaceC6084P == null) {
            return true;
        }
        int iP = interfaceC6084P.p();
        if (!this.f31323D) {
            return false;
        }
        if (this.f31345s.k(17) && this.f31345s.h0().u()) {
            return false;
        }
        return iP == 1 || iP == 4 || !((InterfaceC6084P) AbstractC6614a.e(this.f31345s)).q0();
    }

    private void S(boolean z10) throws IllegalAccessException, InvocationTargetException {
        if (e0()) {
            this.f31338l.setShowTimeoutMs(z10 ? 0 : this.f31322C);
            this.f31338l.v0();
        }
    }

    private void T() {
        ImageView imageView = this.f31333g;
        if (imageView != null) {
            imageView.setVisibility(0);
            c0();
        }
    }

    public static void U(InterfaceC6084P interfaceC6084P, PlayerView playerView, PlayerView playerView2) {
        if (playerView == playerView2) {
            return;
        }
        if (playerView2 != null) {
            playerView2.setPlayer(interfaceC6084P);
        }
        if (playerView != null) {
            playerView.setPlayer(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() throws IllegalAccessException, InvocationTargetException {
        if (!e0() || this.f31345s == null) {
            return;
        }
        if (!this.f31338l.k0()) {
            K(true);
        } else if (this.f31325F) {
            this.f31338l.e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        InterfaceC6084P interfaceC6084P = this.f31345s;
        l0 l0VarW0 = interfaceC6084P != null ? interfaceC6084P.w0() : l0.f56919e;
        int i10 = l0VarW0.f56923a;
        int i11 = l0VarW0.f56924b;
        L(this.f31328b, this.f31331e ? 0.0f : (i11 == 0 || i10 == 0) ? 0.0f : (i10 * l0VarW0.f56926d) / i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void X() {
        /*
            r4 = this;
            android.view.View r0 = r4.f31336j
            if (r0 == 0) goto L2b
            q2.P r0 = r4.f31345s
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.p()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.f31352z
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            q2.P r0 = r4.f31345s
            boolean r0 = r0.q0()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = r1
        L21:
            android.view.View r0 = r4.f31336j
            if (r3 == 0) goto L26
            goto L28
        L26:
            r1 = 8
        L28:
            r0.setVisibility(r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.X():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        C2926d c2926d = this.f31338l;
        if (c2926d == null || !this.f31346t) {
            setContentDescription(null);
        } else if (c2926d.k0()) {
            setContentDescription(this.f31325F ? getResources().getString(G3.B.f7035e) : null);
        } else {
            setContentDescription(getResources().getString(G3.B.f7042l));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() throws IllegalAccessException, InvocationTargetException {
        if (J() && this.f31324E) {
            F();
        } else {
            K(false);
        }
    }

    public static /* synthetic */ void a(PlayerView playerView, Bitmap bitmap) {
        playerView.getClass();
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        if (playerView.C()) {
            return;
        }
        playerView.T();
        playerView.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        TextView textView = this.f31337k;
        if (textView != null) {
            CharSequence charSequence = this.f31321B;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f31337k.setVisibility(0);
            } else {
                InterfaceC6084P interfaceC6084P = this.f31345s;
                if (interfaceC6084P != null) {
                    interfaceC6084P.y();
                }
                this.f31337k.setVisibility(8);
            }
        }
    }

    public static /* synthetic */ Object b(PlayerView playerView, Object obj, Method method, Object[] objArr) {
        playerView.getClass();
        if (!method.getName().equals("onImageAvailable")) {
            return null;
        }
        playerView.M((Bitmap) objArr[1]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(boolean z10) {
        InterfaceC6084P interfaceC6084P = this.f31345s;
        boolean z11 = false;
        boolean z12 = (interfaceC6084P == null || !interfaceC6084P.k(30) || interfaceC6084P.Y().c()) ? false : true;
        if (!this.f31320A && (!z12 || z10)) {
            E();
            y();
            D();
        }
        if (z12) {
            boolean zC = C();
            boolean zB = B();
            if (!zC && !zB) {
                y();
                D();
            }
            View view = this.f31329c;
            if (view != null && view.getVisibility() == 4 && I()) {
                z11 = true;
            }
            if (zB && !zC && z11) {
                y();
                T();
            } else if (zC && !zB && z11) {
                D();
            }
            if (zC || zB || !d0() || !(N(interfaceC6084P) || O(this.f31351y))) {
                E();
            }
        }
    }

    private void c0() {
        Drawable drawable;
        ImageView imageView = this.f31333g;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f31350x == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (this.f31333g.getVisibility() == 0) {
            L(this.f31328b, width);
        }
        this.f31333g.setScaleType(scaleType);
    }

    private boolean d0() {
        if (this.f31349w == 0) {
            return false;
        }
        AbstractC6614a.i(this.f31334h);
        return true;
    }

    private boolean e0() {
        if (!this.f31346t) {
            return false;
        }
        AbstractC6614a.i(this.f31338l);
        return true;
    }

    static /* synthetic */ d o(PlayerView playerView) {
        playerView.getClass();
        return null;
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f31333g;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        c0();
    }

    private void setImageOutput(InterfaceC6084P interfaceC6084P) {
        Class cls = this.f31342p;
        if (cls == null || !cls.isAssignableFrom(interfaceC6084P.getClass())) {
            return;
        }
        try {
            ((Method) AbstractC6614a.e(this.f31343q)).invoke(interfaceC6084P, AbstractC6614a.e(this.f31344r));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void x(InterfaceC6084P interfaceC6084P) {
        Class cls = this.f31342p;
        if (cls == null || !cls.isAssignableFrom(interfaceC6084P.getClass())) {
            return;
        }
        try {
            ((Method) AbstractC6614a.e(this.f31343q)).invoke(interfaceC6084P, null);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void y() {
        View view = this.f31329c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void z(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(a0.c0(context, resources, G3.v.f7152a));
        imageView.setBackgroundColor(resources.getColor(G3.t.f7147a, null));
    }

    public boolean A(KeyEvent keyEvent) {
        return e0() && this.f31338l.a0(keyEvent);
    }

    public void F() {
        C2926d c2926d = this.f31338l;
        if (c2926d != null) {
            c2926d.e0();
        }
    }

    protected void L(AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    public void R() throws IllegalAccessException, InvocationTargetException {
        S(Q());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        f fVar;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34 && (fVar = this.f31332f) != null && this.f31326G) {
            fVar.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) throws IllegalAccessException, InvocationTargetException {
        InterfaceC6084P interfaceC6084P = this.f31345s;
        if (interfaceC6084P != null && interfaceC6084P.k(16) && this.f31345s.D()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zH = H(keyEvent.getKeyCode());
        if (zH && e0() && !this.f31338l.k0()) {
            K(true);
            return true;
        }
        if (A(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            K(true);
            return true;
        }
        if (zH && e0()) {
            K(true);
        }
        return false;
    }

    public List<C6086a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f31340n;
        if (frameLayout != null) {
            arrayList.add(new C6086a.C0865a(frameLayout, 4).b("Transparent overlay does not impact viewability").a());
        }
        C2926d c2926d = this.f31338l;
        if (c2926d != null) {
            arrayList.add(new C6086a.C0865a(c2926d, 1).a());
        }
        return AbstractC2011u.w(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) AbstractC6614a.j(this.f31339m, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.f31349w;
    }

    public boolean getControllerAutoShow() {
        return this.f31323D;
    }

    public boolean getControllerHideOnTouch() {
        return this.f31325F;
    }

    public int getControllerShowTimeoutMs() {
        return this.f31322C;
    }

    public Drawable getDefaultArtwork() {
        return this.f31351y;
    }

    public int getImageDisplayMode() {
        return this.f31350x;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f31340n;
    }

    public InterfaceC6084P getPlayer() {
        return this.f31345s;
    }

    public int getResizeMode() {
        AbstractC6614a.i(this.f31328b);
        return this.f31328b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f31335i;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f31349w != 0;
    }

    public boolean getUseController() {
        return this.f31346t;
    }

    public View getVideoSurfaceView() {
        return this.f31330d;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) throws IllegalAccessException, InvocationTargetException {
        if (!e0() || this.f31345s == null) {
            return false;
        }
        K(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() throws IllegalAccessException, InvocationTargetException {
        V();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i10) {
        AbstractC6614a.g(i10 == 0 || this.f31334h != null);
        if (this.f31349w != i10) {
            this.f31349w = i10;
            b0(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        AbstractC6614a.i(this.f31328b);
        this.f31328b.setAspectRatioListener(bVar);
    }

    public void setControllerAnimationEnabled(boolean z10) {
        AbstractC6614a.i(this.f31338l);
        this.f31338l.setAnimationEnabled(z10);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f31323D = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f31324E = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        AbstractC6614a.i(this.f31338l);
        this.f31325F = z10;
        Y();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(C2926d.InterfaceC0523d interfaceC0523d) {
        AbstractC6614a.i(this.f31338l);
        this.f31348v = null;
        this.f31338l.setOnFullScreenModeChangedListener(interfaceC0523d);
    }

    public void setControllerShowTimeoutMs(int i10) throws IllegalAccessException, InvocationTargetException {
        AbstractC6614a.i(this.f31338l);
        this.f31322C = i10;
        if (this.f31338l.k0()) {
            R();
        }
    }

    public void setControllerVisibilityListener(d dVar) {
        if (dVar != null) {
            setControllerVisibilityListener((C2926d.m) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        AbstractC6614a.g(this.f31337k != null);
        this.f31321B = charSequence;
        a0();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f31351y != drawable) {
            this.f31351y = drawable;
            b0(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z10) {
        this.f31326G = z10;
    }

    public void setErrorMessageProvider(InterfaceC6103r interfaceC6103r) {
        if (interfaceC6103r != null) {
            a0();
        }
    }

    public void setFullscreenButtonClickListener(e eVar) {
        AbstractC6614a.i(this.f31338l);
        this.f31348v = eVar;
        this.f31338l.setOnFullScreenModeChangedListener(this.f31327a);
    }

    public void setFullscreenButtonState(boolean z10) {
        AbstractC6614a.i(this.f31338l);
        this.f31338l.B0(z10);
    }

    public void setImageDisplayMode(int i10) {
        AbstractC6614a.g(this.f31333g != null);
        if (this.f31350x != i10) {
            this.f31350x = i10;
            c0();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f31320A != z10) {
            this.f31320A = z10;
            b0(false);
        }
    }

    public void setPlayer(InterfaceC6084P interfaceC6084P) throws IllegalAccessException, InvocationTargetException {
        AbstractC6614a.g(Looper.myLooper() == Looper.getMainLooper());
        AbstractC6614a.a(interfaceC6084P == null || interfaceC6084P.m() == Looper.getMainLooper());
        InterfaceC6084P interfaceC6084P2 = this.f31345s;
        if (interfaceC6084P2 == interfaceC6084P) {
            return;
        }
        if (interfaceC6084P2 != null) {
            interfaceC6084P2.H(this.f31327a);
            if (interfaceC6084P2.k(27)) {
                View view = this.f31330d;
                if (view instanceof TextureView) {
                    interfaceC6084P2.v0((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC6084P2.L0((SurfaceView) view);
                }
            }
            x(interfaceC6084P2);
        }
        SubtitleView subtitleView = this.f31335i;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f31345s = interfaceC6084P;
        if (e0()) {
            this.f31338l.setPlayer(interfaceC6084P);
        }
        X();
        a0();
        b0(true);
        if (interfaceC6084P == null) {
            F();
            return;
        }
        if (interfaceC6084P.k(27)) {
            View view2 = this.f31330d;
            if (view2 instanceof TextureView) {
                interfaceC6084P.l0((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                interfaceC6084P.O((SurfaceView) view2);
            }
            if (!interfaceC6084P.k(30) || interfaceC6084P.Y().e(2)) {
                W();
            }
        }
        if (this.f31335i != null && interfaceC6084P.k(28)) {
            this.f31335i.setCues(interfaceC6084P.b0().f59086a);
        }
        interfaceC6084P.a0(this.f31327a);
        setImageOutput(interfaceC6084P);
        K(false);
    }

    public void setRepeatToggleModes(int i10) {
        AbstractC6614a.i(this.f31338l);
        this.f31338l.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        AbstractC6614a.i(this.f31328b);
        this.f31328b.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f31352z != i10) {
            this.f31352z = i10;
            X();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        AbstractC6614a.i(this.f31338l);
        this.f31338l.setShowFastForwardButton(z10);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) throws IllegalAccessException, InvocationTargetException {
        AbstractC6614a.i(this.f31338l);
        this.f31338l.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        AbstractC6614a.i(this.f31338l);
        this.f31338l.setShowNextButton(z10);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        AbstractC6614a.i(this.f31338l);
        this.f31338l.setShowPlayButtonIfPlaybackIsSuppressed(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        AbstractC6614a.i(this.f31338l);
        this.f31338l.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        AbstractC6614a.i(this.f31338l);
        this.f31338l.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        AbstractC6614a.i(this.f31338l);
        this.f31338l.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        AbstractC6614a.i(this.f31338l);
        this.f31338l.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        AbstractC6614a.i(this.f31338l);
        this.f31338l.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f31329c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z10) {
        AbstractC6614a.i(this.f31338l);
        this.f31338l.setTimeBarScrubbingEnabled(z10);
    }

    @Deprecated
    public void setUseArtwork(boolean z10) {
        setArtworkDisplayMode(!z10 ? 1 : 0);
    }

    public void setUseController(boolean z10) throws IllegalAccessException, InvocationTargetException {
        boolean z11 = true;
        AbstractC6614a.g((z10 && this.f31338l == null) ? false : true);
        if (!z10 && !hasOnClickListeners()) {
            z11 = false;
        }
        setClickable(z11);
        if (this.f31346t == z10) {
            return;
        }
        this.f31346t = z10;
        if (e0()) {
            this.f31338l.setPlayer(this.f31345s);
        } else {
            C2926d c2926d = this.f31338l;
            if (c2926d != null) {
                c2926d.e0();
                this.f31338l.setPlayer(null);
            }
        }
        Y();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f31330d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z14;
        boolean z15;
        a aVar;
        boolean z16;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        int i20;
        super(context, attributeSet, i10);
        c cVar = new c();
        this.f31327a = cVar;
        this.f31341o = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f31328b = null;
            this.f31329c = null;
            this.f31330d = null;
            this.f31331e = false;
            this.f31332f = null;
            this.f31333g = null;
            this.f31334h = null;
            this.f31335i = null;
            this.f31336j = null;
            this.f31337k = null;
            this.f31338l = null;
            this.f31339m = null;
            this.f31340n = null;
            this.f31342p = null;
            this.f31343q = null;
            this.f31344r = null;
            ImageView imageView = new ImageView(context);
            z(context, getResources(), imageView);
            addView(imageView);
            return;
        }
        int i21 = G3.z.f7224c;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, G3.D.f7089c0, i10, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(G3.D.f7113o0);
                int color = typedArrayObtainStyledAttributes.getColor(G3.D.f7113o0, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(G3.D.f7105k0, i21);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(G3.D.f7117q0, true);
                int i22 = typedArrayObtainStyledAttributes.getInt(G3.D.f7091d0, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(G3.D.f7095f0, 0);
                int i23 = typedArrayObtainStyledAttributes.getInt(G3.D.f7101i0, 0);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(G3.D.f7119r0, true);
                int i24 = typedArrayObtainStyledAttributes.getInt(G3.D.f7115p0, 1);
                int i25 = typedArrayObtainStyledAttributes.getInt(G3.D.f7107l0, 0);
                i11 = typedArrayObtainStyledAttributes.getInt(G3.D.f7111n0, 5000);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(G3.D.f7099h0, true);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(G3.D.f7093e0, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(G3.D.f7109m0, 0);
                this.f31320A = typedArrayObtainStyledAttributes.getBoolean(G3.D.f7103j0, this.f31320A);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(G3.D.f7097g0, true);
                typedArrayObtainStyledAttributes.recycle();
                i14 = resourceId2;
                z11 = z19;
                z14 = zHasValue;
                i15 = i25;
                z13 = z21;
                i12 = resourceId;
                z10 = z18;
                z12 = z20;
                z15 = z17;
                i17 = i23;
                i19 = i22;
                i18 = color;
                i16 = i24;
                i13 = integer;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = 5000;
            i12 = i21;
            z10 = true;
            z11 = true;
            z12 = true;
            z13 = true;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 1;
            i17 = 0;
            i18 = 0;
            i19 = 1;
            z14 = false;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i12, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(G3.x.f7202i);
        this.f31328b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            P(aspectRatioFrameLayout, i15);
        }
        View viewFindViewById = findViewById(G3.x.f7187N);
        this.f31329c = viewFindViewById;
        if (viewFindViewById != null && z14) {
            viewFindViewById.setBackgroundColor(i18);
        }
        if (aspectRatioFrameLayout == null || i16 == 0) {
            aVar = null;
            this.f31330d = null;
            z16 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i16 == 2) {
                this.f31330d = new TextureView(context);
            } else if (i16 == 3) {
                try {
                    int i26 = T2.l.f17081m;
                    this.f31330d = (View) T2.l.class.getConstructor(Context.class).newInstance(context);
                    z16 = true;
                    this.f31330d.setLayoutParams(layoutParams);
                    this.f31330d.setOnClickListener(cVar);
                    this.f31330d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f31330d, 0);
                    aVar = null;
                } catch (Exception e10) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            } else if (i16 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (Build.VERSION.SDK_INT >= 34) {
                    b.a(surfaceView);
                }
                this.f31330d = surfaceView;
            } else {
                try {
                    int i27 = S2.s.f15833b;
                    this.f31330d = (View) S2.s.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e11) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                }
            }
            z16 = false;
            this.f31330d.setLayoutParams(layoutParams);
            this.f31330d.setOnClickListener(cVar);
            this.f31330d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f31330d, 0);
            aVar = null;
        }
        this.f31331e = z16;
        this.f31332f = Build.VERSION.SDK_INT == 34 ? new f() : null;
        this.f31339m = (FrameLayout) findViewById(G3.x.f7194a);
        this.f31340n = (FrameLayout) findViewById(G3.x.f7175B);
        this.f31333g = (ImageView) findViewById(G3.x.f7214u);
        this.f31350x = i17;
        try {
            cls = ExoPlayer.class;
            ImageOutput imageOutput = ImageOutput.f31024a;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: G3.i
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    return PlayerView.b(this.f7142a, obj, method2, objArr);
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f31342p = cls;
        this.f31343q = method;
        this.f31344r = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(G3.x.f7195b);
        this.f31334h = imageView2;
        this.f31349w = (!z15 || i19 == 0 || imageView2 == null) ? 0 : i19;
        if (i14 != 0) {
            this.f31351y = AbstractC7194b.e(getContext(), i14);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(G3.x.f7190Q);
        this.f31335i = subtitleView;
        if (subtitleView != null) {
            subtitleView.e();
            subtitleView.f();
        }
        View viewFindViewById2 = findViewById(G3.x.f7199f);
        this.f31336j = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f31352z = i13;
        TextView textView = (TextView) findViewById(G3.x.f7207n);
        this.f31337k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C2926d c2926d = (C2926d) findViewById(G3.x.f7203j);
        View viewFindViewById3 = findViewById(G3.x.f7204k);
        if (c2926d != null) {
            this.f31338l = c2926d;
            i20 = 0;
        } else if (viewFindViewById3 != null) {
            i20 = 0;
            C2926d c2926d2 = new C2926d(context, null, 0, attributeSet);
            this.f31338l = c2926d2;
            c2926d2.setId(G3.x.f7203j);
            c2926d2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(c2926d2, iIndexOfChild);
        } else {
            i20 = 0;
            this.f31338l = null;
        }
        C2926d c2926d3 = this.f31338l;
        this.f31322C = c2926d3 != null ? i11 : i20;
        this.f31325F = z11;
        this.f31323D = z12;
        this.f31324E = z13;
        this.f31346t = (!z10 || c2926d3 == null) ? i20 : 1;
        if (c2926d3 != null) {
            c2926d3.f0();
            this.f31338l.Y(this.f31327a);
        }
        if (z10) {
            setClickable(true);
        }
        Y();
    }

    @Deprecated
    public void setControllerVisibilityListener(C2926d.m mVar) {
        AbstractC6614a.i(this.f31338l);
        C2926d.m mVar2 = this.f31347u;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.f31338l.s0(mVar2);
        }
        this.f31347u = mVar;
        if (mVar != null) {
            this.f31338l.Y(mVar);
            setControllerVisibilityListener((d) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SurfaceSyncGroup f31356a;

        private f() {
        }

        public static /* synthetic */ void a(f fVar, SurfaceView surfaceView, Runnable runnable) {
            fVar.getClass();
            AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup surfaceSyncGroupA = G3.m.a("exo-sync-b-334901521");
            fVar.f31356a = surfaceSyncGroupA;
            AbstractC6614a.g(surfaceSyncGroupA.add(rootSurfaceControl, new Runnable() { // from class: androidx.media3.ui.y
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.f.b();
                }
            }));
            runnable.run();
            rootSurfaceControl.applyTransactionOnDraw(G3.n.a());
        }

        public void c() {
            SurfaceSyncGroup surfaceSyncGroup = this.f31356a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.f31356a = null;
            }
        }

        public void d(Handler handler, final SurfaceView surfaceView, final Runnable runnable) {
            handler.post(new Runnable() { // from class: androidx.media3.ui.x
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.f.a(this.f31598a, surfaceView, runnable);
                }
            });
        }

        public static /* synthetic */ void b() {
        }
    }
}
