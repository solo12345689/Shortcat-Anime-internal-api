package d6;

import Td.L;
import a6.InterfaceC2580a;
import a6.InterfaceC2583d;
import b6.InterfaceC3025b;
import d6.InterfaceC4568a;
import f6.i;
import f6.j;
import f6.k;
import f6.l;
import ie.InterfaceC5082a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements InterfaceC4568a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2583d f45034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b6.c f45035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f45036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f45037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f45038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f45039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f45040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j f45041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f45042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f45043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a f45044k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f45045a;

        a() {
            this.f45045a = f.this.f45042i;
        }

        @Override // f6.i
        public int a() {
            return f.this.f45043j;
        }

        @Override // f6.i
        public void b(int i10) {
            if (i10 != f.this.f45043j) {
                f fVar = f.this;
                fVar.f45043j = AbstractC5874j.m(i10, 1, fVar.f45042i);
                j jVarM = f.this.m();
                if (jVarM != null) {
                    jVarM.d(f.this.f45043j);
                }
            }
        }

        @Override // f6.i
        public int c() {
            return this.f45045a;
        }
    }

    public f(String str, InterfaceC2583d animationInformation, b6.c bitmapFrameRenderer, k frameLoaderFactory, boolean z10) {
        AbstractC5504s.h(animationInformation, "animationInformation");
        AbstractC5504s.h(bitmapFrameRenderer, "bitmapFrameRenderer");
        AbstractC5504s.h(frameLoaderFactory, "frameLoaderFactory");
        this.f45034a = animationInformation;
        this.f45035b = bitmapFrameRenderer;
        this.f45036c = frameLoaderFactory;
        this.f45037d = z10;
        this.f45038e = str == null ? String.valueOf(hashCode()) : str;
        this.f45039f = animationInformation.m();
        this.f45040g = animationInformation.g();
        int iL = l(animationInformation);
        this.f45042i = iL;
        this.f45043j = iL;
        this.f45044k = new a();
    }

    private final g k(int i10, int i11) {
        if (!this.f45037d) {
            return new g(this.f45039f, this.f45040g);
        }
        int i12 = this.f45039f;
        int i13 = this.f45040g;
        if (i10 < i12 || i11 < i13) {
            double d10 = ((double) i12) / ((double) i13);
            if (i11 > i10) {
                i13 = AbstractC5874j.i(i11, i13);
                i12 = (int) (((double) i13) * d10);
            } else {
                i12 = AbstractC5874j.i(i10, i12);
                i13 = (int) (((double) i12) / d10);
            }
        }
        return new g(i12, i13);
    }

    private final int l(InterfaceC2583d interfaceC2583d) {
        return (int) AbstractC5874j.f(TimeUnit.SECONDS.toMillis(1L) / ((long) (interfaceC2583d.j() / interfaceC2583d.a())), 1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j m() {
        if (this.f45041h == null) {
            this.f45041h = this.f45036c.b(this.f45038e, this.f45035b, this.f45034a);
        }
        return this.f45041h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L n() {
        return L.f17438a;
    }

    @Override // d6.InterfaceC4568a
    public void a() {
        j jVarM = m();
        if (jVarM != null) {
            jVarM.a();
        }
        d();
    }

    @Override // d6.InterfaceC4568a
    public void b(int i10, int i11, InterfaceC5082a interfaceC5082a) {
        if (i10 <= 0 || i11 <= 0 || this.f45039f <= 0 || this.f45040g <= 0) {
            return;
        }
        g gVarK = k(i10, i11);
        j jVarM = m();
        if (jVarM != null) {
            int iB = gVarK.b();
            int iB2 = gVarK.b();
            if (interfaceC5082a == null) {
                interfaceC5082a = new InterfaceC5082a() { // from class: d6.e
                    @Override // ie.InterfaceC5082a
                    public final Object invoke() {
                        return f.n();
                    }
                };
            }
            jVarM.b(iB, iB2, interfaceC5082a);
        }
    }

    @Override // d6.InterfaceC4568a
    public C5.a c(int i10, int i11, int i12) {
        g gVarK = k(i11, i12);
        j jVarM = m();
        l lVarC = jVarM != null ? jVarM.c(i10, gVarK.b(), gVarK.a()) : null;
        if (lVarC != null) {
            f6.e.f46908a.h(this.f45044k, lVarC);
        }
        if (lVarC != null) {
            return lVarC.a();
        }
        return null;
    }

    @Override // d6.InterfaceC4568a
    public void d() {
        j jVarM = m();
        if (jVarM != null) {
            k.f46937d.b(this.f45038e, jVarM);
        }
        this.f45041h = null;
    }

    @Override // d6.InterfaceC4568a
    public void e(b bVar, InterfaceC3025b interfaceC3025b, InterfaceC2580a interfaceC2580a, int i10, InterfaceC5082a interfaceC5082a) {
        InterfaceC4568a.C0708a.e(this, bVar, interfaceC3025b, interfaceC2580a, i10, interfaceC5082a);
    }
}
