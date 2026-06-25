package l1;

import i1.C5015h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import p1.C5913a;
import q1.b;

/* JADX INFO: renamed from: l1.i */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5527i {

    /* JADX INFO: renamed from: a */
    private final List f52470a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final p1.f f52471b;

    /* JADX INFO: renamed from: c */
    private int f52472c;

    /* JADX INFO: renamed from: d */
    private final int f52473d;

    /* JADX INFO: renamed from: e */
    private int f52474e;

    /* JADX INFO: renamed from: l1.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final Object f52475a;

        /* JADX INFO: renamed from: b */
        private final AbstractC5542x f52476b;

        public a(Object obj, AbstractC5542x abstractC5542x) {
            this.f52475a = obj;
            this.f52476b = abstractC5542x;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC5504s.c(this.f52475a, aVar.f52475a) && AbstractC5504s.c(this.f52476b, aVar.f52476b);
        }

        public int hashCode() {
            return (this.f52475a.hashCode() * 31) + this.f52476b.hashCode();
        }

        public String toString() {
            return "BaselineAnchor(id=" + this.f52475a + ", reference=" + this.f52476b + ')';
        }
    }

    /* JADX INFO: renamed from: l1.i$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final Object f52477a;

        /* JADX INFO: renamed from: b */
        private final int f52478b;

        /* JADX INFO: renamed from: c */
        private final AbstractC5542x f52479c;

        public b(Object obj, int i10, AbstractC5542x abstractC5542x) {
            this.f52477a = obj;
            this.f52478b = i10;
            this.f52479c = abstractC5542x;
        }

        public final Object a() {
            return this.f52477a;
        }

        public final int b() {
            return this.f52478b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC5504s.c(this.f52477a, bVar.f52477a) && this.f52478b == bVar.f52478b && AbstractC5504s.c(this.f52479c, bVar.f52479c);
        }

        public int hashCode() {
            return (((this.f52477a.hashCode() * 31) + Integer.hashCode(this.f52478b)) * 31) + this.f52479c.hashCode();
        }

        public String toString() {
            return "HorizontalAnchor(id=" + this.f52477a + ", index=" + this.f52478b + ", reference=" + this.f52479c + ')';
        }
    }

    /* JADX INFO: renamed from: l1.i$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final Object f52480a;

        /* JADX INFO: renamed from: b */
        private final int f52481b;

        /* JADX INFO: renamed from: c */
        private final AbstractC5542x f52482c;

        public c(Object obj, int i10, AbstractC5542x abstractC5542x) {
            this.f52480a = obj;
            this.f52481b = i10;
            this.f52482c = abstractC5542x;
        }

        public final Object a() {
            return this.f52480a;
        }

        public final int b() {
            return this.f52481b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC5504s.c(this.f52480a, cVar.f52480a) && this.f52481b == cVar.f52481b && AbstractC5504s.c(this.f52482c, cVar.f52482c);
        }

        public int hashCode() {
            return (((this.f52480a.hashCode() * 31) + Integer.hashCode(this.f52481b)) * 31) + this.f52482c.hashCode();
        }

        public String toString() {
            return "VerticalAnchor(id=" + this.f52480a + ", index=" + this.f52481b + ", reference=" + this.f52482c + ')';
        }
    }

    public AbstractC5527i(p1.f fVar) {
        p1.f fVarClone;
        this.f52471b = (fVar == null || (fVarClone = fVar.clone()) == null) ? new p1.f(new char[0]) : fVarClone;
        this.f52473d = 1000;
        this.f52474e = 1000;
    }

    public static /* synthetic */ b d(AbstractC5527i abstractC5527i, AbstractC5542x[] abstractC5542xArr, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBottomBarrier-3ABfNKs");
        }
        if ((i10 & 2) != 0) {
            f10 = C5015h.n(0);
        }
        return abstractC5527i.c(abstractC5542xArr, f10);
    }

    private final int f() {
        int i10 = this.f52474e;
        this.f52474e = i10 + 1;
        return i10;
    }

    private final void j(int i10) {
        this.f52472c = ((this.f52472c * 1009) + i10) % 1000000007;
    }

    public final void a(C5515C c5515c) {
        q1.b.v(this.f52471b, c5515c, new b.d());
    }

    public final p1.f b(AbstractC5542x abstractC5542x) {
        String string = abstractC5542x.a().toString();
        if (this.f52471b.L(string) == null) {
            this.f52471b.V(string, new p1.f(new char[0]));
        }
        return this.f52471b.K(string);
    }

    public final b c(AbstractC5542x[] abstractC5542xArr, float f10) {
        C5543y c5543y = new C5543y(Integer.valueOf(f()));
        C5913a c5913a = new C5913a(new char[0]);
        for (AbstractC5542x abstractC5542x : abstractC5542xArr) {
            c5913a.u(p1.i.u(abstractC5542x.a().toString()));
        }
        p1.f fVarB = b(c5543y);
        fVarB.X("type", "barrier");
        fVarB.X("direction", "bottom");
        fVarB.W("margin", f10);
        fVarB.V("contains", c5913a);
        j(15);
        for (AbstractC5542x abstractC5542x2 : abstractC5542xArr) {
            j(abstractC5542x2.hashCode());
        }
        j(C5015h.r(f10));
        return new b(c5543y.a(), 0, c5543y);
    }

    public final c e(AbstractC5542x[] abstractC5542xArr, float f10) {
        C5543y c5543y = new C5543y(Integer.valueOf(f()));
        C5913a c5913a = new C5913a(new char[0]);
        for (AbstractC5542x abstractC5542x : abstractC5542xArr) {
            c5913a.u(p1.i.u(abstractC5542x.a().toString()));
        }
        p1.f fVarB = b(c5543y);
        fVarB.X("type", "barrier");
        fVarB.X("direction", "end");
        fVarB.W("margin", f10);
        fVarB.V("contains", c5913a);
        j(13);
        for (AbstractC5542x abstractC5542x2 : abstractC5542xArr) {
            j(abstractC5542x2.hashCode());
        }
        j(C5015h.r(f10));
        return new c(c5543y.a(), 0, c5543y);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC5527i) {
            return AbstractC5504s.c(this.f52471b, ((AbstractC5527i) obj).f52471b);
        }
        return false;
    }

    public final p1.f g() {
        return this.f52471b;
    }

    public final int h() {
        return this.f52472c;
    }

    public int hashCode() {
        return this.f52471b.hashCode();
    }

    public void i() {
        this.f52471b.clear();
        this.f52474e = this.f52473d;
        this.f52472c = 0;
    }
}
