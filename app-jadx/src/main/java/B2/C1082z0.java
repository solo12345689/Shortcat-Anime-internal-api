package B2;

import B2.H1;
import B2.InterfaceC1024b;
import M2.D;
import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import q2.Y;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: B2.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1082z0 implements H1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final O9.t f1038i = new O9.t() { // from class: B2.y0
        @Override // O9.t
        public final Object get() {
            return C1082z0.m();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Random f1039j = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y.d f1040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y.b f1041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f1042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O9.t f1043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private H1.a f1044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q2.Y f1045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f1046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f1047h;

    /* JADX INFO: renamed from: B2.z0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f1050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private D.b f1051d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1052e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1053f;

        public a(String str, int i10, D.b bVar) {
            this.f1048a = str;
            this.f1049b = i10;
            this.f1050c = bVar == null ? -1L : bVar.f11665d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f1051d = bVar;
        }

        private int l(q2.Y y10, q2.Y y11, int i10) {
            if (i10 >= y10.t()) {
                if (i10 < y11.t()) {
                    return i10;
                }
                return -1;
            }
            y10.r(i10, C1082z0.this.f1040a);
            for (int i11 = C1082z0.this.f1040a.f56691n; i11 <= C1082z0.this.f1040a.f56692o; i11++) {
                int iF = y11.f(y10.q(i11));
                if (iF != -1) {
                    return y11.j(iF, C1082z0.this.f1041b).f56653c;
                }
            }
            return -1;
        }

        public boolean i(int i10, D.b bVar) {
            if (bVar == null) {
                return i10 == this.f1049b;
            }
            D.b bVar2 = this.f1051d;
            return bVar2 == null ? !bVar.b() && bVar.f11665d == this.f1050c : bVar.f11665d == bVar2.f11665d && bVar.f11663b == bVar2.f11663b && bVar.f11664c == bVar2.f11664c;
        }

        public boolean j(InterfaceC1024b.a aVar) {
            D.b bVar = aVar.f914d;
            if (bVar == null) {
                return this.f1049b != aVar.f913c;
            }
            long j10 = this.f1050c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f11665d > j10) {
                return true;
            }
            if (this.f1051d == null) {
                return false;
            }
            int iF = aVar.f912b.f(bVar.f11662a);
            int iF2 = aVar.f912b.f(this.f1051d.f11662a);
            D.b bVar2 = aVar.f914d;
            if (bVar2.f11665d < this.f1051d.f11665d || iF < iF2) {
                return false;
            }
            if (iF > iF2) {
                return true;
            }
            if (!bVar2.b()) {
                int i10 = aVar.f914d.f11666e;
                return i10 == -1 || i10 > this.f1051d.f11663b;
            }
            D.b bVar3 = aVar.f914d;
            int i11 = bVar3.f11663b;
            int i12 = bVar3.f11664c;
            D.b bVar4 = this.f1051d;
            int i13 = bVar4.f11663b;
            return i11 > i13 || (i11 == i13 && i12 > bVar4.f11664c);
        }

        public void k(int i10, D.b bVar) {
            if (this.f1050c != -1 || i10 != this.f1049b || bVar == null || bVar.f11665d < C1082z0.this.n()) {
                return;
            }
            this.f1050c = bVar.f11665d;
        }

        public boolean m(q2.Y y10, q2.Y y11) {
            int iL = l(y10, y11, this.f1049b);
            this.f1049b = iL;
            if (iL == -1) {
                return false;
            }
            D.b bVar = this.f1051d;
            return bVar == null || y11.f(bVar.f11662a) != -1;
        }
    }

    public C1082z0() {
        this(f1038i);
    }

    private void l(a aVar) {
        if (aVar.f1050c != -1) {
            this.f1047h = aVar.f1050c;
        }
        this.f1046g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m() {
        byte[] bArr = new byte[12];
        f1039j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long n() {
        a aVar = (a) this.f1042c.get(this.f1046g);
        return (aVar == null || aVar.f1050c == -1) ? this.f1047h + 1 : aVar.f1050c;
    }

    private a o(int i10, D.b bVar) {
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f1042c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long j11 = aVar2.f1050c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) t2.a0.l(aVar)).f1051d != null && aVar2.f1051d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.f1043d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f1042c.put(str, aVar3);
        return aVar3;
    }

    private void p(InterfaceC1024b.a aVar) {
        if (aVar.f912b.u()) {
            String str = this.f1046g;
            if (str != null) {
                l((a) AbstractC6614a.e((a) this.f1042c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = (a) this.f1042c.get(this.f1046g);
        a aVarO = o(aVar.f913c, aVar.f914d);
        this.f1046g = aVarO.f1048a;
        b(aVar);
        D.b bVar = aVar.f914d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f1050c == aVar.f914d.f11665d && aVar2.f1051d != null && aVar2.f1051d.f11663b == aVar.f914d.f11663b && aVar2.f1051d.f11664c == aVar.f914d.f11664c) {
            return;
        }
        D.b bVar2 = aVar.f914d;
        this.f1044e.y(aVar, o(aVar.f913c, new D.b(bVar2.f11662a, bVar2.f11665d)).f1048a, aVarO.f1048a);
    }

    @Override // B2.H1
    public synchronized String a() {
        return this.f1046g;
    }

    @Override // B2.H1
    public synchronized void b(InterfaceC1024b.a aVar) {
        AbstractC6614a.e(this.f1044e);
        if (aVar.f912b.u()) {
            return;
        }
        D.b bVar = aVar.f914d;
        if (bVar != null) {
            if (bVar.f11665d < n()) {
                return;
            }
            a aVar2 = (a) this.f1042c.get(this.f1046g);
            if (aVar2 != null && aVar2.f1050c == -1 && aVar2.f1049b != aVar.f913c) {
                return;
            }
        }
        a aVarO = o(aVar.f913c, aVar.f914d);
        if (this.f1046g == null) {
            this.f1046g = aVarO.f1048a;
        }
        D.b bVar2 = aVar.f914d;
        if (bVar2 != null && bVar2.b()) {
            D.b bVar3 = aVar.f914d;
            D.b bVar4 = new D.b(bVar3.f11662a, bVar3.f11665d, bVar3.f11663b);
            a aVarO2 = o(aVar.f913c, bVar4);
            if (!aVarO2.f1052e) {
                aVarO2.f1052e = true;
                aVar.f912b.l(aVar.f914d.f11662a, this.f1041b);
                this.f1044e.z0(new InterfaceC1024b.a(aVar.f911a, aVar.f912b, aVar.f913c, bVar4, Math.max(0L, t2.a0.F1(this.f1041b.g(aVar.f914d.f11663b)) + this.f1041b.n()), aVar.f916f, aVar.f917g, aVar.f918h, aVar.f919i, aVar.f920j), aVarO2.f1048a);
            }
        }
        if (!aVarO.f1052e) {
            aVarO.f1052e = true;
            this.f1044e.z0(aVar, aVarO.f1048a);
        }
        if (aVarO.f1048a.equals(this.f1046g) && !aVarO.f1053f) {
            aVarO.f1053f = true;
            this.f1044e.u0(aVar, aVarO.f1048a);
        }
    }

    @Override // B2.H1
    public void c(H1.a aVar) {
        this.f1044e = aVar;
    }

    @Override // B2.H1
    public synchronized String d(q2.Y y10, D.b bVar) {
        return o(y10.l(bVar.f11662a, this.f1041b).f56653c, bVar).f1048a;
    }

    @Override // B2.H1
    public synchronized void e(InterfaceC1024b.a aVar) {
        try {
            AbstractC6614a.e(this.f1044e);
            q2.Y y10 = this.f1045f;
            this.f1045f = aVar.f912b;
            Iterator it = this.f1042c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (!aVar2.m(y10, this.f1045f) || aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f1052e) {
                        if (aVar2.f1048a.equals(this.f1046g)) {
                            l(aVar2);
                        }
                        this.f1044e.M(aVar, aVar2.f1048a, false);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // B2.H1
    public synchronized void f(InterfaceC1024b.a aVar) {
        H1.a aVar2;
        try {
            String str = this.f1046g;
            if (str != null) {
                l((a) AbstractC6614a.e((a) this.f1042c.get(str)));
            }
            Iterator it = this.f1042c.values().iterator();
            while (it.hasNext()) {
                a aVar3 = (a) it.next();
                it.remove();
                if (aVar3.f1052e && (aVar2 = this.f1044e) != null) {
                    aVar2.M(aVar, aVar3.f1048a, false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // B2.H1
    public synchronized void g(InterfaceC1024b.a aVar, int i10) {
        try {
            AbstractC6614a.e(this.f1044e);
            boolean z10 = i10 == 0;
            Iterator it = this.f1042c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f1052e) {
                        boolean zEquals = aVar2.f1048a.equals(this.f1046g);
                        boolean z11 = z10 && zEquals && aVar2.f1053f;
                        if (zEquals) {
                            l(aVar2);
                        }
                        this.f1044e.M(aVar, aVar2.f1048a, z11);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C1082z0(O9.t tVar) {
        this.f1043d = tVar;
        this.f1040a = new Y.d();
        this.f1041b = new Y.b();
        this.f1042c = new HashMap();
        this.f1045f = q2.Y.f56642a;
        this.f1047h = -1L;
    }
}
