package Md;

import Td.AbstractC2163n;
import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import android.view.OrientationEventListener;
import expo.modules.video.enums.FullscreenOrientation;
import expo.modules.video.records.FullscreenOptions;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FullscreenOptions f12377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5082a f12378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC5082a f12379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f12381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f12382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Lazy f12383h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends OrientationEventListener {
        a(Context context) {
            super(context, 3);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x001b  */
        @Override // android.view.OrientationEventListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onOrientationChanged(int r6) {
            /*
                r5 = this;
                r0 = 0
                r1 = 2
                r2 = 1
                if (r6 < 0) goto L9
                r3 = 10
                if (r6 <= r3) goto L11
            L9:
                r3 = 350(0x15e, float:4.9E-43)
                if (r6 < r3) goto L13
                r3 = 360(0x168, float:5.04E-43)
                if (r6 >= r3) goto L13
            L11:
                r6 = r2
                goto L30
            L13:
                r3 = 80
                if (r6 < r3) goto L1d
                r3 = 100
                if (r6 > r3) goto L1d
            L1b:
                r6 = r1
                goto L30
            L1d:
                r3 = 170(0xaa, float:2.38E-43)
                if (r6 < r3) goto L26
                r3 = 190(0xbe, float:2.66E-43)
                if (r6 > r3) goto L26
                goto L11
            L26:
                r3 = 260(0x104, float:3.64E-43)
                if (r6 < r3) goto L2f
                r3 = 280(0x118, float:3.92E-43)
                if (r6 > r3) goto L2f
                goto L1b
            L2f:
                r6 = r0
            L30:
                Md.c r3 = Md.c.this
                expo.modules.video.records.FullscreenOptions r3 = r3.g()
                boolean r3 = r3.getAutoExitOnRotate()
                if (r3 != 0) goto L3e
                goto Lac
            L3e:
                if (r6 != r2) goto L52
                Md.c r3 = Md.c.this
                boolean r3 = Md.c.c(r3)
                if (r3 == 0) goto L52
                Md.c r3 = Md.c.this
                boolean r3 = Md.c.b(r3)
                if (r3 == 0) goto L52
                r3 = r2
                goto L53
            L52:
                r3 = r0
            L53:
                if (r6 != r1) goto L66
                Md.c r4 = Md.c.this
                boolean r4 = Md.c.d(r4)
                if (r4 == 0) goto L66
                Md.c r4 = Md.c.this
                boolean r4 = Md.c.b(r4)
                if (r4 == 0) goto L66
                goto L68
            L66:
                if (r3 == 0) goto L7f
            L68:
                Md.c r3 = Md.c.this
                boolean r3 = r3.i()
                if (r3 != 0) goto L71
                goto Lac
            L71:
                Md.c r3 = Md.c.this
                ie.a r3 = r3.f()
                r3.invoke()
                Md.c r3 = Md.c.this
                r3.m()
            L7f:
                if (r6 != r2) goto L93
                Md.c r3 = Md.c.this
                boolean r3 = Md.c.d(r3)
                if (r3 == 0) goto L93
                Md.c r3 = Md.c.this
                boolean r3 = Md.c.b(r3)
                if (r3 != 0) goto L93
                r3 = r2
                goto L94
            L93:
                r3 = r0
            L94:
                if (r6 != r1) goto La7
                Md.c r6 = Md.c.this
                boolean r6 = Md.c.c(r6)
                if (r6 == 0) goto La7
                Md.c r6 = Md.c.this
                boolean r6 = Md.c.b(r6)
                if (r6 != 0) goto La7
                r0 = r2
            La7:
                if (r3 != 0) goto Lad
                if (r0 == 0) goto Lac
                goto Lad
            Lac:
                return
            Lad:
                Md.c r6 = Md.c.this
                Md.c.e(r6, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Md.c.a.onOrientationChanged(int):void");
        }
    }

    public c(Context context, FullscreenOptions options, InterfaceC5082a onShouldAutoExit, InterfaceC5082a onShouldReleaseOrientation) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(options, "options");
        AbstractC5504s.h(onShouldAutoExit, "onShouldAutoExit");
        AbstractC5504s.h(onShouldReleaseOrientation, "onShouldReleaseOrientation");
        this.f12376a = context;
        this.f12377b = options;
        this.f12378c = onShouldAutoExit;
        this.f12379d = onShouldReleaseOrientation;
        boolean z10 = true;
        this.f12381f = options.getOrientation() == FullscreenOrientation.LANDSCAPE || options.getOrientation() == FullscreenOrientation.LANDSCAPE_LEFT || options.getOrientation() == FullscreenOrientation.LANDSCAPE_RIGHT;
        if (options.getOrientation() != FullscreenOrientation.PORTRAIT && options.getOrientation() != FullscreenOrientation.PORTRAIT_UP && options.getOrientation() != FullscreenOrientation.PORTRAIT_DOWN) {
            z10 = false;
        }
        this.f12382g = z10;
        this.f12383h = AbstractC2163n.b(new InterfaceC5082a() { // from class: Md.b
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return c.k(this.f12375a);
            }
        });
    }

    private final a h() {
        return (a) this.f12383h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a k(c cVar) {
        return cVar.new a(cVar.f12376a);
    }

    public final InterfaceC5082a f() {
        return this.f12379d;
    }

    public final FullscreenOptions g() {
        return this.f12377b;
    }

    public final boolean i() {
        return Settings.System.getInt(this.f12376a.getContentResolver(), "accelerometer_rotation", 0) == 1;
    }

    public final void j(Configuration newConfig) {
        AbstractC5504s.h(newConfig, "newConfig");
        int i10 = newConfig.orientation;
        if (this.f12377b.getAutoExitOnRotate()) {
            if (this.f12382g && i10 == 2) {
                this.f12378c.invoke();
            } else if (this.f12381f && i10 == 1) {
                this.f12378c.invoke();
            }
        }
    }

    public final void l() {
        if (h().canDetectOrientation()) {
            h().enable();
        }
    }

    public final void m() {
        h().disable();
    }
}
