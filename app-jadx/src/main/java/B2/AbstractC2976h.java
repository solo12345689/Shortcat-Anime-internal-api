package b2;

import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.AbstractC2747a0;
import b2.C2971c;
import java.util.ArrayList;

/* JADX INFO: renamed from: b2.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2976h implements C2971c.InterfaceC0555c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f33054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f33055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f33056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f33057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AbstractC2978j f33058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f33059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f33060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f33061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f33062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f33063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList f33064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList f33065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C2971c f33066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f33041n = new g("translationX");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f33042o = new C0556h("translationY");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f33043p = new i("translationZ");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s f33044q = new j("scaleX");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f33045r = new k("scaleY");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f33046s = new l("rotation");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f33047t = new m("rotationX");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f33048u = new n("rotationY");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s f33049v = new o("x");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s f33050w = new a("y");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f33051x = new b("z");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s f33052y = new c("alpha");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final s f33053z = new d("scrollX");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final s f33040A = new e("scrollY");

    /* JADX INFO: renamed from: b2.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends s {
        a(String str) {
            super(str, null);
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setY(f10);
        }
    }

    /* JADX INFO: renamed from: b2.h$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends s {
        b(String str) {
            super(str, null);
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return AbstractC2747a0.L(view);
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            AbstractC2747a0.D0(view, f10);
        }
    }

    /* JADX INFO: renamed from: b2.h$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends s {
        c(String str) {
            super(str, null);
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    /* JADX INFO: renamed from: b2.h$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d extends s {
        d(String str) {
            super(str, null);
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    /* JADX INFO: renamed from: b2.h$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e extends s {
        e(String str) {
            super(str, null);
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    /* JADX INFO: renamed from: b2.h$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f extends AbstractC2978j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2979k f33067b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, C2979k c2979k) {
            super(str);
            this.f33067b = c2979k;
        }

        @Override // b2.AbstractC2978j
        public float a(Object obj) {
            return this.f33067b.a();
        }

        @Override // b2.AbstractC2978j
        public void b(Object obj, float f10) {
            this.f33067b.b(f10);
        }
    }

    /* JADX INFO: renamed from: b2.h$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class g extends s {
        g(String str) {
            super(str, null);
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    /* JADX INFO: renamed from: b2.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0556h extends s {
        C0556h(String str) {
            super(str, null);
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    /* JADX INFO: renamed from: b2.h$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class i extends s {
        i(String str) {
            super(str, null);
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return AbstractC2747a0.I(view);
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            AbstractC2747a0.B0(view, f10);
        }
    }

    /* JADX INFO: renamed from: b2.h$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class j extends s {
        j(String str) {
            super(str, null);
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    /* JADX INFO: renamed from: b2.h$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class k extends s {
        k(String str) {
            super(str, null);
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    /* JADX INFO: renamed from: b2.h$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class l extends s {
        l(String str) {
            super(str, null);
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotation(f10);
        }
    }

    /* JADX INFO: renamed from: b2.h$m */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class m extends s {
        m(String str) {
            super(str, null);
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    /* JADX INFO: renamed from: b2.h$n */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class n extends s {
        n(String str) {
            super(str, null);
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    /* JADX INFO: renamed from: b2.h$o */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class o extends s {
        o(String str) {
            super(str, null);
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setX(f10);
        }
    }

    /* JADX INFO: renamed from: b2.h$p */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f33069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f33070b;

        p() {
        }
    }

    /* JADX INFO: renamed from: b2.h$q */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface q {
        void a(AbstractC2976h abstractC2976h, boolean z10, float f10, float f11);
    }

    /* JADX INFO: renamed from: b2.h$r */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface r {
        void a(AbstractC2976h abstractC2976h, float f10, float f11);
    }

    /* JADX INFO: renamed from: b2.h$s */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class s extends AbstractC2978j {
        /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        private s(String str) {
            super(str);
        }
    }

    AbstractC2976h(C2979k c2979k) {
        this.f33054a = 0.0f;
        this.f33055b = Float.MAX_VALUE;
        this.f33056c = false;
        this.f33059f = false;
        this.f33060g = Float.MAX_VALUE;
        this.f33061h = -Float.MAX_VALUE;
        this.f33062i = 0L;
        this.f33064k = new ArrayList();
        this.f33065l = new ArrayList();
        this.f33057d = null;
        this.f33058e = new f("FloatValueHolder", c2979k);
        this.f33063j = 1.0f;
    }

    private void e(boolean z10) {
        this.f33059f = false;
        f().k(this);
        this.f33062i = 0L;
        this.f33056c = false;
        for (int i10 = 0; i10 < this.f33064k.size(); i10++) {
            if (this.f33064k.get(i10) != null) {
                ((q) this.f33064k.get(i10)).a(this, z10, this.f33055b, this.f33054a);
            }
        }
        j(this.f33064k);
    }

    private float g() {
        return this.f33058e.a(this.f33057d);
    }

    private static void j(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void s() {
        if (this.f33059f) {
            return;
        }
        this.f33059f = true;
        if (!this.f33056c) {
            this.f33055b = g();
        }
        float f10 = this.f33055b;
        if (f10 > this.f33060g || f10 < this.f33061h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        f().d(this, 0L);
    }

    @Override // b2.C2971c.InterfaceC0555c
    public boolean a(long j10) {
        long j11 = this.f33062i;
        if (j11 == 0) {
            this.f33062i = j10;
            n(this.f33055b);
            return false;
        }
        long j12 = j10 - j11;
        this.f33062i = j10;
        float fG = f().g();
        boolean zT = t(fG == 0.0f ? 2147483647L : (long) (j12 / fG));
        float fMin = Math.min(this.f33055b, this.f33060g);
        this.f33055b = fMin;
        float fMax = Math.max(fMin, this.f33061h);
        this.f33055b = fMax;
        n(fMax);
        if (zT) {
            e(false);
        }
        return zT;
    }

    public AbstractC2976h b(q qVar) {
        if (!this.f33064k.contains(qVar)) {
            this.f33064k.add(qVar);
        }
        return this;
    }

    public AbstractC2976h c(r rVar) {
        if (i()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f33065l.contains(rVar)) {
            this.f33065l.add(rVar);
        }
        return this;
    }

    public void d() {
        if (!f().j()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.f33059f) {
            e(true);
        }
    }

    public C2971c f() {
        C2971c c2971c = this.f33066m;
        return c2971c != null ? c2971c : C2971c.h();
    }

    float h() {
        return this.f33063j * 0.75f;
    }

    public boolean i() {
        return this.f33059f;
    }

    public AbstractC2976h k(float f10) {
        this.f33060g = f10;
        return this;
    }

    public AbstractC2976h l(float f10) {
        this.f33061h = f10;
        return this;
    }

    public AbstractC2976h m(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f33063j = f10;
        q(f10 * 0.75f);
        return this;
    }

    void n(float f10) {
        this.f33058e.b(this.f33057d, f10);
        for (int i10 = 0; i10 < this.f33065l.size(); i10++) {
            if (this.f33065l.get(i10) != null) {
                ((r) this.f33065l.get(i10)).a(this, this.f33055b, this.f33054a);
            }
        }
        j(this.f33065l);
    }

    public AbstractC2976h o(float f10) {
        this.f33055b = f10;
        this.f33056c = true;
        return this;
    }

    public AbstractC2976h p(float f10) {
        this.f33054a = f10;
        return this;
    }

    abstract void q(float f10);

    public void r() {
        if (!f().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f33059f) {
            return;
        }
        s();
    }

    abstract boolean t(long j10);

    AbstractC2976h(Object obj, AbstractC2978j abstractC2978j) {
        this.f33054a = 0.0f;
        this.f33055b = Float.MAX_VALUE;
        this.f33056c = false;
        this.f33059f = false;
        this.f33060g = Float.MAX_VALUE;
        this.f33061h = -Float.MAX_VALUE;
        this.f33062i = 0L;
        this.f33064k = new ArrayList();
        this.f33065l = new ArrayList();
        this.f33057d = obj;
        this.f33058e = abstractC2978j;
        if (abstractC2978j != f33046s && abstractC2978j != f33047t && abstractC2978j != f33048u) {
            if (abstractC2978j == f33052y) {
                this.f33063j = 0.00390625f;
                return;
            } else if (abstractC2978j != f33044q && abstractC2978j != f33045r) {
                this.f33063j = 1.0f;
                return;
            } else {
                this.f33063j = 0.002f;
                return;
            }
        }
        this.f33063j = 0.1f;
    }
}
