package q5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q5.C6116b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: g */
    private static boolean f57205g = true;

    /* JADX INFO: renamed from: a */
    private F f57206a = null;

    /* JADX INFO: renamed from: b */
    private String f57207b = "";

    /* JADX INFO: renamed from: c */
    private String f57208c = "";

    /* JADX INFO: renamed from: d */
    private float f57209d = 96.0f;

    /* JADX INFO: renamed from: e */
    private C6116b.r f57210e = new C6116b.r();

    /* JADX INFO: renamed from: f */
    private Map f57211f = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class A extends C6141z {
        A() {
        }

        @Override // q5.g.C6141z, q5.g.N
        String o() {
            return "polygon";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class B extends AbstractC6127l {

        /* JADX INFO: renamed from: o */
        C6131p f57212o;

        /* JADX INFO: renamed from: p */
        C6131p f57213p;

        /* JADX INFO: renamed from: q */
        C6131p f57214q;

        /* JADX INFO: renamed from: r */
        C6131p f57215r;

        /* JADX INFO: renamed from: s */
        C6131p f57216s;

        /* JADX INFO: renamed from: t */
        C6131p f57217t;

        B() {
        }

        @Override // q5.g.N
        String o() {
            return "rect";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class E implements Cloneable {

        /* JADX INFO: renamed from: A */
        Boolean f57219A;

        /* JADX INFO: renamed from: B */
        Boolean f57220B;

        /* JADX INFO: renamed from: C */
        O f57221C;

        /* JADX INFO: renamed from: D */
        Float f57222D;

        /* JADX INFO: renamed from: E */
        String f57223E;

        /* JADX INFO: renamed from: F */
        a f57224F;

        /* JADX INFO: renamed from: G */
        String f57225G;

        /* JADX INFO: renamed from: H */
        O f57226H;

        /* JADX INFO: renamed from: I */
        Float f57227I;

        /* JADX INFO: renamed from: X */
        O f57228X;

        /* JADX INFO: renamed from: Y */
        Float f57229Y;

        /* JADX INFO: renamed from: Z */
        i f57230Z;

        /* JADX INFO: renamed from: a */
        long f57231a = 0;

        /* JADX INFO: renamed from: b */
        O f57232b;

        /* JADX INFO: renamed from: c */
        a f57233c;

        /* JADX INFO: renamed from: d */
        Float f57234d;

        /* JADX INFO: renamed from: e */
        O f57235e;

        /* JADX INFO: renamed from: f */
        Float f57236f;

        /* JADX INFO: renamed from: g */
        C6131p f57237g;

        /* JADX INFO: renamed from: h */
        c f57238h;

        /* JADX INFO: renamed from: i */
        d f57239i;

        /* JADX INFO: renamed from: j */
        Float f57240j;

        /* JADX INFO: renamed from: k */
        C6131p[] f57241k;

        /* JADX INFO: renamed from: l */
        C6131p f57242l;

        /* JADX INFO: renamed from: l0 */
        e f57243l0;

        /* JADX INFO: renamed from: m */
        Float f57244m;

        /* JADX INFO: renamed from: n */
        C6122f f57245n;

        /* JADX INFO: renamed from: o */
        List f57246o;

        /* JADX INFO: renamed from: p */
        C6131p f57247p;

        /* JADX INFO: renamed from: q */
        Integer f57248q;

        /* JADX INFO: renamed from: r */
        b f57249r;

        /* JADX INFO: renamed from: s */
        EnumC0868g f57250s;

        /* JADX INFO: renamed from: t */
        h f57251t;

        /* JADX INFO: renamed from: u */
        f f57252u;

        /* JADX INFO: renamed from: v */
        Boolean f57253v;

        /* JADX INFO: renamed from: w */
        C6119c f57254w;

        /* JADX INFO: renamed from: x */
        String f57255x;

        /* JADX INFO: renamed from: y */
        String f57256y;

        /* JADX INFO: renamed from: z */
        String f57257z;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public enum a {
            NonZero,
            EvenOdd
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public enum b {
            Normal,
            Italic,
            Oblique
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public enum c {
            Butt,
            Round,
            Square
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public enum d {
            Miter,
            Round,
            Bevel
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public enum f {
            Start,
            Middle,
            End
        }

        /* JADX INFO: renamed from: q5.g$E$g */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public enum EnumC0868g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public enum h {
            LTR,
            RTL
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public enum i {
            None,
            NonScalingStroke
        }

        E() {
        }

        static E a() {
            E e10 = new E();
            e10.f57231a = -1L;
            C6122f c6122f = C6122f.f57369b;
            e10.f57232b = c6122f;
            a aVar = a.NonZero;
            e10.f57233c = aVar;
            Float fValueOf = Float.valueOf(1.0f);
            e10.f57234d = fValueOf;
            e10.f57235e = null;
            e10.f57236f = fValueOf;
            e10.f57237g = new C6131p(1.0f);
            e10.f57238h = c.Butt;
            e10.f57239i = d.Miter;
            e10.f57240j = Float.valueOf(4.0f);
            e10.f57241k = null;
            e10.f57242l = new C6131p(0.0f);
            e10.f57244m = fValueOf;
            e10.f57245n = c6122f;
            e10.f57246o = null;
            e10.f57247p = new C6131p(12.0f, d0.pt);
            e10.f57248q = 400;
            e10.f57249r = b.Normal;
            e10.f57250s = EnumC0868g.None;
            e10.f57251t = h.LTR;
            e10.f57252u = f.Start;
            Boolean bool = Boolean.TRUE;
            e10.f57253v = bool;
            e10.f57254w = null;
            e10.f57255x = null;
            e10.f57256y = null;
            e10.f57257z = null;
            e10.f57219A = bool;
            e10.f57220B = bool;
            e10.f57221C = c6122f;
            e10.f57222D = fValueOf;
            e10.f57223E = null;
            e10.f57224F = aVar;
            e10.f57225G = null;
            e10.f57226H = null;
            e10.f57227I = fValueOf;
            e10.f57228X = null;
            e10.f57229Y = fValueOf;
            e10.f57230Z = i.None;
            e10.f57243l0 = e.auto;
            return e10;
        }

        void c(boolean z10) {
            Float fValueOf = Float.valueOf(1.0f);
            Boolean bool = Boolean.TRUE;
            this.f57219A = bool;
            if (!z10) {
                bool = Boolean.FALSE;
            }
            this.f57253v = bool;
            this.f57254w = null;
            this.f57223E = null;
            this.f57244m = fValueOf;
            this.f57221C = C6122f.f57369b;
            this.f57222D = fValueOf;
            this.f57225G = null;
            this.f57226H = null;
            this.f57227I = fValueOf;
            this.f57228X = null;
            this.f57229Y = fValueOf;
            this.f57230Z = i.None;
        }

        protected Object clone() {
            E e10 = (E) super.clone();
            C6131p[] c6131pArr = this.f57241k;
            if (c6131pArr != null) {
                e10.f57241k = (C6131p[]) c6131pArr.clone();
            }
            return e10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class F extends R {

        /* JADX INFO: renamed from: q */
        C6131p f57293q;

        /* JADX INFO: renamed from: r */
        C6131p f57294r;

        /* JADX INFO: renamed from: s */
        C6131p f57295s;

        /* JADX INFO: renamed from: t */
        C6131p f57296t;

        /* JADX INFO: renamed from: u */
        public String f57297u;

        F() {
        }

        @Override // q5.g.N
        String o() {
            return "svg";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface G {
        Set a();

        String b();

        void c(Set set);

        void e(Set set);

        Set f();

        void i(Set set);

        void j(Set set);

        void k(String str);

        Set m();

        Set n();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class H extends K implements J, G {

        /* JADX INFO: renamed from: i */
        List f57298i = new ArrayList();

        /* JADX INFO: renamed from: j */
        Set f57299j = null;

        /* JADX INFO: renamed from: k */
        String f57300k = null;

        /* JADX INFO: renamed from: l */
        Set f57301l = null;

        /* JADX INFO: renamed from: m */
        Set f57302m = null;

        /* JADX INFO: renamed from: n */
        Set f57303n = null;

        H() {
        }

        @Override // q5.g.G
        public Set a() {
            return null;
        }

        @Override // q5.g.G
        public String b() {
            return this.f57300k;
        }

        @Override // q5.g.G
        public void c(Set set) {
            this.f57303n = set;
        }

        @Override // q5.g.G
        public void e(Set set) {
            this.f57299j = set;
        }

        @Override // q5.g.G
        public Set f() {
            return this.f57299j;
        }

        @Override // q5.g.J
        public List g() {
            return this.f57298i;
        }

        @Override // q5.g.J
        public void h(N n10) {
            this.f57298i.add(n10);
        }

        @Override // q5.g.G
        public void i(Set set) {
            this.f57301l = set;
        }

        @Override // q5.g.G
        public void j(Set set) {
            this.f57302m = set;
        }

        @Override // q5.g.G
        public void k(String str) {
            this.f57300k = str;
        }

        @Override // q5.g.G
        public Set m() {
            return this.f57302m;
        }

        @Override // q5.g.G
        public Set n() {
            return this.f57303n;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class I extends K implements G {

        /* JADX INFO: renamed from: i */
        Set f57304i = null;

        /* JADX INFO: renamed from: j */
        String f57305j = null;

        /* JADX INFO: renamed from: k */
        Set f57306k = null;

        /* JADX INFO: renamed from: l */
        Set f57307l = null;

        /* JADX INFO: renamed from: m */
        Set f57308m = null;

        I() {
        }

        @Override // q5.g.G
        public Set a() {
            return this.f57306k;
        }

        @Override // q5.g.G
        public String b() {
            return this.f57305j;
        }

        @Override // q5.g.G
        public void c(Set set) {
            this.f57308m = set;
        }

        @Override // q5.g.G
        public void e(Set set) {
            this.f57304i = set;
        }

        @Override // q5.g.G
        public Set f() {
            return this.f57304i;
        }

        @Override // q5.g.G
        public void i(Set set) {
            this.f57306k = set;
        }

        @Override // q5.g.G
        public void j(Set set) {
            this.f57307l = set;
        }

        @Override // q5.g.G
        public void k(String str) {
            this.f57305j = str;
        }

        @Override // q5.g.G
        public Set m() {
            return this.f57307l;
        }

        @Override // q5.g.G
        public Set n() {
            return this.f57308m;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface J {
        List g();

        void h(N n10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class K extends L {

        /* JADX INFO: renamed from: h */
        C6118b f57309h = null;

        K() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class L extends N {

        /* JADX INFO: renamed from: c */
        String f57310c = null;

        /* JADX INFO: renamed from: d */
        Boolean f57311d = null;

        /* JADX INFO: renamed from: e */
        E f57312e = null;

        /* JADX INFO: renamed from: f */
        E f57313f = null;

        /* JADX INFO: renamed from: g */
        List f57314g = null;

        L() {
        }

        public String toString() {
            return o();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class M extends AbstractC6125j {

        /* JADX INFO: renamed from: m */
        C6131p f57315m;

        /* JADX INFO: renamed from: n */
        C6131p f57316n;

        /* JADX INFO: renamed from: o */
        C6131p f57317o;

        /* JADX INFO: renamed from: p */
        C6131p f57318p;

        M() {
        }

        @Override // q5.g.N
        String o() {
            return "linearGradient";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class N {

        /* JADX INFO: renamed from: a */
        g f57319a;

        /* JADX INFO: renamed from: b */
        J f57320b;

        N() {
        }

        abstract String o();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class O implements Cloneable {
        O() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class P extends H {

        /* JADX INFO: renamed from: o */
        e f57321o = null;

        P() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class Q extends AbstractC6125j {

        /* JADX INFO: renamed from: m */
        C6131p f57322m;

        /* JADX INFO: renamed from: n */
        C6131p f57323n;

        /* JADX INFO: renamed from: o */
        C6131p f57324o;

        /* JADX INFO: renamed from: p */
        C6131p f57325p;

        /* JADX INFO: renamed from: q */
        C6131p f57326q;

        Q() {
        }

        @Override // q5.g.N
        String o() {
            return "radialGradient";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class R extends P {

        /* JADX INFO: renamed from: p */
        C6118b f57327p;

        R() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class S extends C6128m {
        S() {
        }

        @Override // q5.g.C6128m, q5.g.N
        String o() {
            return "switch";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class T extends R implements InterfaceC6135t {
        T() {
        }

        @Override // q5.g.N
        String o() {
            return "symbol";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class U extends Y implements X {

        /* JADX INFO: renamed from: o */
        String f57328o;

        /* JADX INFO: renamed from: p */
        private b0 f57329p;

        U() {
        }

        @Override // q5.g.X
        public b0 d() {
            return this.f57329p;
        }

        @Override // q5.g.N
        String o() {
            return "tref";
        }

        public void p(b0 b0Var) {
            this.f57329p = b0Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class V extends a0 implements X {

        /* JADX INFO: renamed from: s */
        private b0 f57330s;

        V() {
        }

        @Override // q5.g.X
        public b0 d() {
            return this.f57330s;
        }

        @Override // q5.g.N
        String o() {
            return "tspan";
        }

        public void p(b0 b0Var) {
            this.f57330s = b0Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class W extends a0 implements b0, InterfaceC6129n {

        /* JADX INFO: renamed from: s */
        Matrix f57331s;

        W() {
        }

        @Override // q5.g.InterfaceC6129n
        public void l(Matrix matrix) {
            this.f57331s = matrix;
        }

        @Override // q5.g.N
        String o() {
            return "text";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface X {
        b0 d();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class Y extends H {
        Y() {
        }

        @Override // q5.g.H, q5.g.J
        public void h(N n10) throws j {
            if (n10 instanceof X) {
                this.f57298i.add(n10);
                return;
            }
            throw new j("Text content elements cannot contain " + n10 + " elements.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class Z extends Y implements X {

        /* JADX INFO: renamed from: o */
        String f57332o;

        /* JADX INFO: renamed from: p */
        C6131p f57333p;

        /* JADX INFO: renamed from: q */
        private b0 f57334q;

        Z() {
        }

        @Override // q5.g.X
        public b0 d() {
            return this.f57334q;
        }

        @Override // q5.g.N
        String o() {
            return "textPath";
        }

        public void p(b0 b0Var) {
            this.f57334q = b0Var;
        }
    }

    /* JADX INFO: renamed from: q5.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class C6117a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f57335a;

        static {
            int[] iArr = new int[d0.values().length];
            f57335a = iArr;
            try {
                iArr[d0.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57335a[d0.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57335a[d0.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57335a[d0.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57335a[d0.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57335a[d0.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57335a[d0.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57335a[d0.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f57335a[d0.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class a0 extends Y {

        /* JADX INFO: renamed from: o */
        List f57336o;

        /* JADX INFO: renamed from: p */
        List f57337p;

        /* JADX INFO: renamed from: q */
        List f57338q;

        /* JADX INFO: renamed from: r */
        List f57339r;

        a0() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface b0 {
    }

    /* JADX INFO: renamed from: q5.g$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6119c {

        /* JADX INFO: renamed from: a */
        C6131p f57344a;

        /* JADX INFO: renamed from: b */
        C6131p f57345b;

        /* JADX INFO: renamed from: c */
        C6131p f57346c;

        /* JADX INFO: renamed from: d */
        C6131p f57347d;

        C6119c(C6131p c6131p, C6131p c6131p2, C6131p c6131p3, C6131p c6131p4) {
            this.f57344a = c6131p;
            this.f57345b = c6131p2;
            this.f57346c = c6131p3;
            this.f57347d = c6131p4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c0 extends N implements X {

        /* JADX INFO: renamed from: c */
        String f57348c;

        /* JADX INFO: renamed from: d */
        private b0 f57349d;

        c0(String str) {
            this.f57348c = str;
        }

        @Override // q5.g.X
        public b0 d() {
            return this.f57349d;
        }

        public String toString() {
            return "TextChild: '" + this.f57348c + "'";
        }
    }

    /* JADX INFO: renamed from: q5.g$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6120d extends AbstractC6127l {

        /* JADX INFO: renamed from: o */
        C6131p f57350o;

        /* JADX INFO: renamed from: p */
        C6131p f57351p;

        /* JADX INFO: renamed from: q */
        C6131p f57352q;

        C6120d() {
        }

        @Override // q5.g.N
        String o() {
            return "circle";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    enum d0 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    /* JADX INFO: renamed from: q5.g$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6121e extends C6128m implements InterfaceC6135t {

        /* JADX INFO: renamed from: p */
        Boolean f57363p;

        C6121e() {
        }

        @Override // q5.g.C6128m, q5.g.N
        String o() {
            return "clipPath";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class e0 extends C6128m {

        /* JADX INFO: renamed from: p */
        String f57364p;

        /* JADX INFO: renamed from: q */
        C6131p f57365q;

        /* JADX INFO: renamed from: r */
        C6131p f57366r;

        /* JADX INFO: renamed from: s */
        C6131p f57367s;

        /* JADX INFO: renamed from: t */
        C6131p f57368t;

        e0() {
        }

        @Override // q5.g.C6128m, q5.g.N
        String o() {
            return "use";
        }
    }

    /* JADX INFO: renamed from: q5.g$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6122f extends O {

        /* JADX INFO: renamed from: b */
        static final C6122f f57369b = new C6122f(-16777216);

        /* JADX INFO: renamed from: c */
        static final C6122f f57370c = new C6122f(0);

        /* JADX INFO: renamed from: a */
        int f57371a;

        C6122f(int i10) {
            this.f57371a = i10;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f57371a));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class f0 extends R implements InterfaceC6135t {
        f0() {
        }

        @Override // q5.g.N
        String o() {
            return "view";
        }
    }

    /* JADX INFO: renamed from: q5.g$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C0869g extends O {

        /* JADX INFO: renamed from: a */
        private static C0869g f57372a = new C0869g();

        private C0869g() {
        }

        static C0869g a() {
            return f57372a;
        }
    }

    /* JADX INFO: renamed from: q5.g$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6123h extends C6128m implements InterfaceC6135t {
        C6123h() {
        }

        @Override // q5.g.C6128m, q5.g.N
        String o() {
            return "defs";
        }
    }

    /* JADX INFO: renamed from: q5.g$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6124i extends AbstractC6127l {

        /* JADX INFO: renamed from: o */
        C6131p f57373o;

        /* JADX INFO: renamed from: p */
        C6131p f57374p;

        /* JADX INFO: renamed from: q */
        C6131p f57375q;

        /* JADX INFO: renamed from: r */
        C6131p f57376r;

        C6124i() {
        }

        @Override // q5.g.N
        String o() {
            return "ellipse";
        }
    }

    /* JADX INFO: renamed from: q5.g$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class AbstractC6125j extends L implements J {

        /* JADX INFO: renamed from: h */
        List f57377h = new ArrayList();

        /* JADX INFO: renamed from: i */
        Boolean f57378i;

        /* JADX INFO: renamed from: j */
        Matrix f57379j;

        /* JADX INFO: renamed from: k */
        EnumC6126k f57380k;

        /* JADX INFO: renamed from: l */
        String f57381l;

        AbstractC6125j() {
        }

        @Override // q5.g.J
        public List g() {
            return this.f57377h;
        }

        @Override // q5.g.J
        public void h(N n10) throws j {
            if (n10 instanceof D) {
                this.f57377h.add(n10);
                return;
            }
            throw new j("Gradient elements cannot contain " + n10 + " elements.");
        }
    }

    /* JADX INFO: renamed from: q5.g$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    enum EnumC6126k {
        pad,
        reflect,
        repeat
    }

    /* JADX INFO: renamed from: q5.g$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class AbstractC6127l extends I implements InterfaceC6129n {

        /* JADX INFO: renamed from: n */
        Matrix f57386n;

        AbstractC6127l() {
        }

        @Override // q5.g.InterfaceC6129n
        public void l(Matrix matrix) {
            this.f57386n = matrix;
        }
    }

    /* JADX INFO: renamed from: q5.g$m */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6128m extends H implements InterfaceC6129n {

        /* JADX INFO: renamed from: o */
        Matrix f57387o;

        C6128m() {
        }

        @Override // q5.g.InterfaceC6129n
        public void l(Matrix matrix) {
            this.f57387o = matrix;
        }

        @Override // q5.g.N
        String o() {
            return "group";
        }
    }

    /* JADX INFO: renamed from: q5.g$n */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface InterfaceC6129n {
        void l(Matrix matrix);
    }

    /* JADX INFO: renamed from: q5.g$o */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6130o extends P implements InterfaceC6129n {

        /* JADX INFO: renamed from: p */
        String f57388p;

        /* JADX INFO: renamed from: q */
        C6131p f57389q;

        /* JADX INFO: renamed from: r */
        C6131p f57390r;

        /* JADX INFO: renamed from: s */
        C6131p f57391s;

        /* JADX INFO: renamed from: t */
        C6131p f57392t;

        /* JADX INFO: renamed from: u */
        Matrix f57393u;

        C6130o() {
        }

        @Override // q5.g.InterfaceC6129n
        public void l(Matrix matrix) {
            this.f57393u = matrix;
        }

        @Override // q5.g.N
        String o() {
            return "image";
        }
    }

    /* JADX INFO: renamed from: q5.g$q */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6132q extends AbstractC6127l {

        /* JADX INFO: renamed from: o */
        C6131p f57396o;

        /* JADX INFO: renamed from: p */
        C6131p f57397p;

        /* JADX INFO: renamed from: q */
        C6131p f57398q;

        /* JADX INFO: renamed from: r */
        C6131p f57399r;

        C6132q() {
        }

        @Override // q5.g.N
        String o() {
            return "line";
        }
    }

    /* JADX INFO: renamed from: q5.g$r */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6133r extends R implements InterfaceC6135t {

        /* JADX INFO: renamed from: q */
        boolean f57400q;

        /* JADX INFO: renamed from: r */
        C6131p f57401r;

        /* JADX INFO: renamed from: s */
        C6131p f57402s;

        /* JADX INFO: renamed from: t */
        C6131p f57403t;

        /* JADX INFO: renamed from: u */
        C6131p f57404u;

        /* JADX INFO: renamed from: v */
        Float f57405v;

        C6133r() {
        }

        @Override // q5.g.N
        String o() {
            return "marker";
        }
    }

    /* JADX INFO: renamed from: q5.g$s */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6134s extends H implements InterfaceC6135t {

        /* JADX INFO: renamed from: o */
        Boolean f57406o;

        /* JADX INFO: renamed from: p */
        Boolean f57407p;

        /* JADX INFO: renamed from: q */
        C6131p f57408q;

        /* JADX INFO: renamed from: r */
        C6131p f57409r;

        /* JADX INFO: renamed from: s */
        C6131p f57410s;

        /* JADX INFO: renamed from: t */
        C6131p f57411t;

        C6134s() {
        }

        @Override // q5.g.N
        String o() {
            return "mask";
        }
    }

    /* JADX INFO: renamed from: q5.g$t */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface InterfaceC6135t {
    }

    /* JADX INFO: renamed from: q5.g$u */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6136u extends O {

        /* JADX INFO: renamed from: a */
        String f57412a;

        /* JADX INFO: renamed from: b */
        O f57413b;

        C6136u(String str, O o10) {
            this.f57412a = str;
            this.f57413b = o10;
        }

        public String toString() {
            return this.f57412a + " " + this.f57413b;
        }
    }

    /* JADX INFO: renamed from: q5.g$v */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6137v extends AbstractC6127l {

        /* JADX INFO: renamed from: o */
        C6138w f57414o;

        /* JADX INFO: renamed from: p */
        Float f57415p;

        C6137v() {
        }

        @Override // q5.g.N
        String o() {
            return "path";
        }
    }

    /* JADX INFO: renamed from: q5.g$w */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6138w implements InterfaceC6139x {

        /* JADX INFO: renamed from: b */
        private int f57417b = 0;

        /* JADX INFO: renamed from: d */
        private int f57419d = 0;

        /* JADX INFO: renamed from: a */
        private byte[] f57416a = new byte[8];

        /* JADX INFO: renamed from: c */
        private float[] f57418c = new float[16];

        C6138w() {
        }

        private void f(byte b10) {
            int i10 = this.f57417b;
            byte[] bArr = this.f57416a;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f57416a = bArr2;
            }
            byte[] bArr3 = this.f57416a;
            int i11 = this.f57417b;
            this.f57417b = i11 + 1;
            bArr3[i11] = b10;
        }

        private void g(int i10) {
            float[] fArr = this.f57418c;
            if (fArr.length < this.f57419d + i10) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f57418c = fArr2;
            }
        }

        @Override // q5.g.InterfaceC6139x
        public void a(float f10, float f11) {
            f((byte) 0);
            g(2);
            float[] fArr = this.f57418c;
            int i10 = this.f57419d;
            int i11 = i10 + 1;
            this.f57419d = i11;
            fArr[i10] = f10;
            this.f57419d = i10 + 2;
            fArr[i11] = f11;
        }

        @Override // q5.g.InterfaceC6139x
        public void b(float f10, float f11, float f12, float f13, float f14, float f15) {
            f((byte) 2);
            g(6);
            float[] fArr = this.f57418c;
            int i10 = this.f57419d;
            int i11 = i10 + 1;
            this.f57419d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f57419d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f57419d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f57419d = i14;
            fArr[i13] = f13;
            int i15 = i10 + 5;
            this.f57419d = i15;
            fArr[i14] = f14;
            this.f57419d = i10 + 6;
            fArr[i15] = f15;
        }

        @Override // q5.g.InterfaceC6139x
        public void c(float f10, float f11) {
            f((byte) 1);
            g(2);
            float[] fArr = this.f57418c;
            int i10 = this.f57419d;
            int i11 = i10 + 1;
            this.f57419d = i11;
            fArr[i10] = f10;
            this.f57419d = i10 + 2;
            fArr[i11] = f11;
        }

        @Override // q5.g.InterfaceC6139x
        public void close() {
            f((byte) 8);
        }

        @Override // q5.g.InterfaceC6139x
        public void d(float f10, float f11, float f12, float f13) {
            f((byte) 3);
            g(4);
            float[] fArr = this.f57418c;
            int i10 = this.f57419d;
            int i11 = i10 + 1;
            this.f57419d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f57419d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f57419d = i13;
            fArr[i12] = f12;
            this.f57419d = i10 + 4;
            fArr[i13] = f13;
        }

        @Override // q5.g.InterfaceC6139x
        public void e(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            f((byte) ((z10 ? 2 : 0) | 4 | (z11 ? 1 : 0)));
            g(5);
            float[] fArr = this.f57418c;
            int i10 = this.f57419d;
            int i11 = i10 + 1;
            this.f57419d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f57419d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f57419d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f57419d = i14;
            fArr[i13] = f13;
            this.f57419d = i10 + 5;
            fArr[i14] = f14;
        }

        void h(InterfaceC6139x interfaceC6139x) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f57417b; i11++) {
                byte b10 = this.f57416a[i11];
                if (b10 == 0) {
                    float[] fArr = this.f57418c;
                    int i12 = i10 + 1;
                    float f10 = fArr[i10];
                    i10 += 2;
                    interfaceC6139x.a(f10, fArr[i12]);
                } else if (b10 == 1) {
                    float[] fArr2 = this.f57418c;
                    int i13 = i10 + 1;
                    float f11 = fArr2[i10];
                    i10 += 2;
                    interfaceC6139x.c(f11, fArr2[i13]);
                } else if (b10 == 2) {
                    float[] fArr3 = this.f57418c;
                    interfaceC6139x.b(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], fArr3[i10 + 3], fArr3[i10 + 4], fArr3[i10 + 5]);
                    i10 += 6;
                } else if (b10 == 3) {
                    float[] fArr4 = this.f57418c;
                    float f12 = fArr4[i10];
                    float f13 = fArr4[i10 + 1];
                    int i14 = i10 + 3;
                    float f14 = fArr4[i10 + 2];
                    i10 += 4;
                    interfaceC6139x.d(f12, f13, f14, fArr4[i14]);
                } else if (b10 != 8) {
                    boolean z10 = (b10 & 2) != 0;
                    boolean z11 = (b10 & 1) != 0;
                    float[] fArr5 = this.f57418c;
                    interfaceC6139x.e(fArr5[i10], fArr5[i10 + 1], fArr5[i10 + 2], z10, z11, fArr5[i10 + 3], fArr5[i10 + 4]);
                    i10 += 5;
                } else {
                    interfaceC6139x.close();
                }
            }
        }

        boolean i() {
            return this.f57417b == 0;
        }
    }

    /* JADX INFO: renamed from: q5.g$x */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface InterfaceC6139x {
        void a(float f10, float f11);

        void b(float f10, float f11, float f12, float f13, float f14, float f15);

        void c(float f10, float f11);

        void close();

        void d(float f10, float f11, float f12, float f13);

        void e(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14);
    }

    /* JADX INFO: renamed from: q5.g$y */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6140y extends R implements InterfaceC6135t {

        /* JADX INFO: renamed from: q */
        Boolean f57420q;

        /* JADX INFO: renamed from: r */
        Boolean f57421r;

        /* JADX INFO: renamed from: s */
        Matrix f57422s;

        /* JADX INFO: renamed from: t */
        C6131p f57423t;

        /* JADX INFO: renamed from: u */
        C6131p f57424u;

        /* JADX INFO: renamed from: v */
        C6131p f57425v;

        /* JADX INFO: renamed from: w */
        C6131p f57426w;

        /* JADX INFO: renamed from: x */
        String f57427x;

        C6140y() {
        }

        @Override // q5.g.N
        String o() {
            return "pattern";
        }
    }

    /* JADX INFO: renamed from: q5.g$z */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6141z extends AbstractC6127l {

        /* JADX INFO: renamed from: o */
        float[] f57428o;

        C6141z() {
        }

        @Override // q5.g.N
        String o() {
            return "polyline";
        }
    }

    g() {
    }

    private String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    private C6118b e(float f10) {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        d0 d0Var4;
        float fC;
        d0 d0Var5;
        F f11 = this.f57206a;
        C6131p c6131p = f11.f57295s;
        C6131p c6131p2 = f11.f57296t;
        if (c6131p == null || c6131p.i() || (d0Var = c6131p.f57395b) == (d0Var2 = d0.percent) || d0Var == (d0Var3 = d0.em) || d0Var == (d0Var4 = d0.ex)) {
            return new C6118b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fC2 = c6131p.c(f10);
        if (c6131p2 == null) {
            C6118b c6118b = this.f57206a.f57327p;
            fC = c6118b != null ? (c6118b.f57343d * fC2) / c6118b.f57342c : fC2;
        } else {
            if (c6131p2.i() || (d0Var5 = c6131p2.f57395b) == d0Var2 || d0Var5 == d0Var3 || d0Var5 == d0Var4) {
                return new C6118b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fC = c6131p2.c(f10);
        }
        return new C6118b(0.0f, 0.0f, fC2, fC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private L j(J j10, String str) {
        L lJ;
        L l10 = (L) j10;
        if (str.equals(l10.f57310c)) {
            return l10;
        }
        for (Object obj : j10.g()) {
            if (obj instanceof L) {
                L l11 = (L) obj;
                if (str.equals(l11.f57310c)) {
                    return l11;
                }
                if ((obj instanceof J) && (lJ = j((J) obj, str)) != null) {
                    return lJ;
                }
            }
        }
        return null;
    }

    static i k() {
        return null;
    }

    public static g l(InputStream inputStream) {
        return new k().z(inputStream, f57205g);
    }

    void a(C6116b.r rVar) {
        this.f57210e.b(rVar);
    }

    void b() {
        this.f57210e.e(C6116b.u.RenderOptions);
    }

    List d() {
        return this.f57210e.c();
    }

    public float f() {
        if (this.f57206a != null) {
            return e(this.f57209d).f57343d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        F f10 = this.f57206a;
        if (f10 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        C6118b c6118b = f10.f57327p;
        if (c6118b == null) {
            return null;
        }
        return c6118b.d();
    }

    public float h() {
        if (this.f57206a != null) {
            return e(this.f57209d).f57342c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    L i(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f57206a.f57310c)) {
            return this.f57206a;
        }
        if (this.f57211f.containsKey(str)) {
            return (L) this.f57211f.get(str);
        }
        L lJ = j(this.f57206a, str);
        this.f57211f.put(str, lJ);
        return lJ;
    }

    F m() {
        return this.f57206a;
    }

    boolean n() {
        return !this.f57210e.d();
    }

    public Picture o() {
        return q(null);
    }

    public Picture p(int i10, int i11, f fVar) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i10, i11);
        if (fVar == null || fVar.f57204f == null) {
            fVar = fVar == null ? new f() : new f(fVar);
            fVar.g(0.0f, 0.0f, i10, i11);
        }
        new h(canvasBeginRecording, this.f57209d).G0(this, fVar);
        picture.endRecording();
        return picture;
    }

    public Picture q(f fVar) {
        C6131p c6131p;
        C6118b c6118b = (fVar == null || !fVar.e()) ? this.f57206a.f57327p : fVar.f57202d;
        if (fVar != null && fVar.f()) {
            return p((int) Math.ceil(fVar.f57204f.b()), (int) Math.ceil(fVar.f57204f.c()), fVar);
        }
        F f10 = this.f57206a;
        C6131p c6131p2 = f10.f57295s;
        if (c6131p2 != null) {
            d0 d0Var = c6131p2.f57395b;
            d0 d0Var2 = d0.percent;
            if (d0Var != d0Var2 && (c6131p = f10.f57296t) != null && c6131p.f57395b != d0Var2) {
                return p((int) Math.ceil(c6131p2.c(this.f57209d)), (int) Math.ceil(this.f57206a.f57296t.c(this.f57209d)), fVar);
            }
        }
        if (c6131p2 != null && c6118b != null) {
            return p((int) Math.ceil(c6131p2.c(this.f57209d)), (int) Math.ceil((c6118b.f57343d * r1) / c6118b.f57342c), fVar);
        }
        C6131p c6131p3 = f10.f57296t;
        if (c6131p3 == null || c6118b == null) {
            return p(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, fVar);
        }
        return p((int) Math.ceil((c6118b.f57342c * r1) / c6118b.f57343d), (int) Math.ceil(c6131p3.c(this.f57209d)), fVar);
    }

    N r(String str) {
        if (str == null) {
            return null;
        }
        String strC = c(str);
        if (strC.length() <= 1 || !strC.startsWith("#")) {
            return null;
        }
        return i(strC.substring(1));
    }

    void s(String str) {
        this.f57208c = str;
    }

    public void t(float f10) {
        F f11 = this.f57206a;
        if (f11 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f11.f57296t = new C6131p(f10);
    }

    public void u(float f10, float f11, float f12, float f13) {
        F f14 = this.f57206a;
        if (f14 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f14.f57327p = new C6118b(f10, f11, f12, f13);
    }

    public void v(float f10) {
        F f11 = this.f57206a;
        if (f11 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f11.f57295s = new C6131p(f10);
    }

    void w(F f10) {
        this.f57206a = f10;
    }

    void x(String str) {
        this.f57207b = str;
    }

    /* JADX INFO: renamed from: q5.g$p */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6131p implements Cloneable {

        /* JADX INFO: renamed from: a */
        float f57394a;

        /* JADX INFO: renamed from: b */
        d0 f57395b;

        C6131p(float f10, d0 d0Var) {
            this.f57394a = f10;
            this.f57395b = d0Var;
        }

        float a() {
            return this.f57394a;
        }

        float c(float f10) {
            int i10 = C6117a.f57335a[this.f57395b.ordinal()];
            if (i10 == 1) {
                return this.f57394a;
            }
            switch (i10) {
                case 4:
                    return this.f57394a * f10;
                case 5:
                    return (this.f57394a * f10) / 2.54f;
                case 6:
                    return (this.f57394a * f10) / 25.4f;
                case 7:
                    return (this.f57394a * f10) / 72.0f;
                case 8:
                    return (this.f57394a * f10) / 6.0f;
                default:
                    return this.f57394a;
            }
        }

        float d(h hVar) {
            if (this.f57395b != d0.percent) {
                return f(hVar);
            }
            C6118b c6118bS = hVar.S();
            if (c6118bS == null) {
                return this.f57394a;
            }
            float f10 = c6118bS.f57342c;
            if (f10 == c6118bS.f57343d) {
                return (this.f57394a * f10) / 100.0f;
            }
            return (this.f57394a * ((float) (Math.sqrt((f10 * f10) + (r6 * r6)) / 1.414213562373095d))) / 100.0f;
        }

        float e(h hVar, float f10) {
            return this.f57395b == d0.percent ? (this.f57394a * f10) / 100.0f : f(hVar);
        }

        float f(h hVar) {
            switch (C6117a.f57335a[this.f57395b.ordinal()]) {
                case 9:
                    C6118b c6118bS = hVar.S();
                    if (c6118bS != null) {
                    }
                    break;
            }
            return this.f57394a;
        }

        float g(h hVar) {
            if (this.f57395b != d0.percent) {
                return f(hVar);
            }
            C6118b c6118bS = hVar.S();
            return c6118bS == null ? this.f57394a : (this.f57394a * c6118bS.f57343d) / 100.0f;
        }

        boolean h() {
            return this.f57394a < 0.0f;
        }

        boolean i() {
            return this.f57394a == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f57394a) + this.f57395b;
        }

        C6131p(float f10) {
            this.f57394a = f10;
            this.f57395b = d0.px;
        }
    }

    /* JADX INFO: renamed from: q5.g$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C6118b {

        /* JADX INFO: renamed from: a */
        float f57340a;

        /* JADX INFO: renamed from: b */
        float f57341b;

        /* JADX INFO: renamed from: c */
        float f57342c;

        /* JADX INFO: renamed from: d */
        float f57343d;

        C6118b(float f10, float f11, float f12, float f13) {
            this.f57340a = f10;
            this.f57341b = f11;
            this.f57342c = f12;
            this.f57343d = f13;
        }

        static C6118b a(float f10, float f11, float f12, float f13) {
            return new C6118b(f10, f11, f12 - f10, f13 - f11);
        }

        float b() {
            return this.f57340a + this.f57342c;
        }

        float c() {
            return this.f57341b + this.f57343d;
        }

        RectF d() {
            return new RectF(this.f57340a, this.f57341b, b(), c());
        }

        void e(C6118b c6118b) {
            float f10 = c6118b.f57340a;
            if (f10 < this.f57340a) {
                this.f57340a = f10;
            }
            float f11 = c6118b.f57341b;
            if (f11 < this.f57341b) {
                this.f57341b = f11;
            }
            if (c6118b.b() > b()) {
                this.f57342c = c6118b.b() - this.f57340a;
            }
            if (c6118b.c() > c()) {
                this.f57343d = c6118b.c() - this.f57341b;
            }
        }

        public String toString() {
            return "[" + this.f57340a + " " + this.f57341b + " " + this.f57342c + " " + this.f57343d + "]";
        }

        C6118b(C6118b c6118b) {
            this.f57340a = c6118b.f57340a;
            this.f57341b = c6118b.f57341b;
            this.f57342c = c6118b.f57342c;
            this.f57343d = c6118b.f57343d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C extends L implements J {
        C() {
        }

        @Override // q5.g.J
        public List g() {
            return Collections.EMPTY_LIST;
        }

        @Override // q5.g.N
        String o() {
            return "solidColor";
        }

        @Override // q5.g.J
        public void h(N n10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class D extends L implements J {

        /* JADX INFO: renamed from: h */
        Float f57218h;

        D() {
        }

        @Override // q5.g.J
        public List g() {
            return Collections.EMPTY_LIST;
        }

        @Override // q5.g.N
        String o() {
            return "stop";
        }

        @Override // q5.g.J
        public void h(N n10) {
        }
    }
}
