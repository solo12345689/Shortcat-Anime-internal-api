package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.m0;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2813q {

    /* JADX INFO: renamed from: d */
    private static final C2813q f29417d = new C2813q(true);

    /* JADX INFO: renamed from: a */
    private final d0 f29418a;

    /* JADX INFO: renamed from: b */
    private boolean f29419b;

    /* JADX INFO: renamed from: c */
    private boolean f29420c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f29421a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f29422b;

        static {
            int[] iArr = new int[m0.b.values().length];
            f29422b = iArr;
            try {
                iArr[m0.b.f29380c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29422b[m0.b.f29381d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29422b[m0.b.f29382e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29422b[m0.b.f29383f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29422b[m0.b.f29384g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29422b[m0.b.f29385h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29422b[m0.b.f29386i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29422b[m0.b.f29387j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29422b[m0.b.f29389l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f29422b[m0.b.f29390m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f29422b[m0.b.f29388k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f29422b[m0.b.f29391n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f29422b[m0.b.f29392o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f29422b[m0.b.f29394q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f29422b[m0.b.f29395r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f29422b[m0.b.f29396s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f29422b[m0.b.f29397t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f29422b[m0.b.f29393p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[m0.c.values().length];
            f29421a = iArr2;
            try {
                iArr2[m0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f29421a[m0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f29421a[m0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f29421a[m0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f29421a[m0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f29421a[m0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f29421a[m0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f29421a[m0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f29421a[m0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b extends Comparable {
        int d();

        boolean e();

        m0.b f();

        boolean g();
    }

    private C2813q() {
        this.f29418a = d0.r();
    }

    static int b(m0.b bVar, int i10, Object obj) {
        int iO = AbstractC2805i.O(i10);
        if (bVar == m0.b.f29389l) {
            iO *= 2;
        }
        return iO + c(bVar, obj);
    }

    static int c(m0.b bVar, Object obj) {
        switch (a.f29422b[bVar.ordinal()]) {
            case 1:
                return AbstractC2805i.i(((Double) obj).doubleValue());
            case 2:
                return AbstractC2805i.q(((Float) obj).floatValue());
            case 3:
                return AbstractC2805i.x(((Long) obj).longValue());
            case 4:
                return AbstractC2805i.S(((Long) obj).longValue());
            case 5:
                return AbstractC2805i.v(((Integer) obj).intValue());
            case 6:
                return AbstractC2805i.o(((Long) obj).longValue());
            case 7:
                return AbstractC2805i.m(((Integer) obj).intValue());
            case 8:
                return AbstractC2805i.d(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC2805i.s((K) obj);
            case 10:
                return AbstractC2805i.A((K) obj);
            case 11:
                return obj instanceof AbstractC2802f ? AbstractC2805i.g((AbstractC2802f) obj) : AbstractC2805i.N((String) obj);
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return obj instanceof AbstractC2802f ? AbstractC2805i.g((AbstractC2802f) obj) : AbstractC2805i.e((byte[]) obj);
            case 13:
                return AbstractC2805i.Q(((Integer) obj).intValue());
            case 14:
                return AbstractC2805i.F(((Integer) obj).intValue());
            case 15:
                return AbstractC2805i.H(((Long) obj).longValue());
            case 16:
                return AbstractC2805i.J(((Integer) obj).intValue());
            case 17:
                return AbstractC2805i.L(((Long) obj).longValue());
            case 18:
                return AbstractC2805i.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        m0.b bVarF = bVar.f();
        int iD = bVar.d();
        if (!bVar.e()) {
            return b(bVarF, iD, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!bVar.g()) {
            int iB = 0;
            while (i10 < size) {
                iB += b(bVarF, iD, list.get(i10));
                i10++;
            }
            return iB;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iC = 0;
        while (i10 < size) {
            iC += c(bVarF, list.get(i10));
            i10++;
        }
        return AbstractC2805i.O(iD) + iC + AbstractC2805i.Q(iC);
    }

    private int g(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    static int i(m0.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.b();
    }

    private static boolean l(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        throw null;
    }

    private static boolean m(m0.b bVar, Object obj) {
        AbstractC2816u.a(obj);
        switch (a.f29421a[bVar.a().ordinal()]) {
            case 7:
                if ((obj instanceof AbstractC2802f) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                }
                break;
            case 9:
                if (!(obj instanceof K)) {
                }
                break;
        }
        return false;
    }

    private void q(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static C2813q r() {
        return new C2813q();
    }

    private void t(b bVar, Object obj) {
        if (!m(bVar.f(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.d()), bVar.f().a(), obj.getClass().getName()));
        }
    }

    static void u(AbstractC2805i abstractC2805i, m0.b bVar, int i10, Object obj) {
        if (bVar == m0.b.f29389l) {
            abstractC2805i.q0(i10, (K) obj);
        } else {
            abstractC2805i.M0(i10, i(bVar, false));
            v(abstractC2805i, bVar, obj);
        }
    }

    static void v(AbstractC2805i abstractC2805i, m0.b bVar, Object obj) {
        switch (a.f29422b[bVar.ordinal()]) {
            case 1:
                abstractC2805i.h0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC2805i.p0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC2805i.x0(((Long) obj).longValue());
                break;
            case 4:
                abstractC2805i.Q0(((Long) obj).longValue());
                break;
            case 5:
                abstractC2805i.v0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC2805i.n0(((Long) obj).longValue());
                break;
            case 7:
                abstractC2805i.l0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC2805i.b0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC2805i.s0((K) obj);
                break;
            case 10:
                abstractC2805i.z0((K) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC2802f)) {
                    abstractC2805i.L0((String) obj);
                } else {
                    abstractC2805i.f0((AbstractC2802f) obj);
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                if (!(obj instanceof AbstractC2802f)) {
                    abstractC2805i.c0((byte[]) obj);
                } else {
                    abstractC2805i.f0((AbstractC2802f) obj);
                }
                break;
            case 13:
                abstractC2805i.O0(((Integer) obj).intValue());
                break;
            case 14:
                abstractC2805i.D0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC2805i.F0(((Long) obj).longValue());
                break;
            case 16:
                abstractC2805i.H0(((Integer) obj).intValue());
                break;
            case 17:
                abstractC2805i.J0(((Long) obj).longValue());
                break;
            case 18:
                abstractC2805i.j0(((Integer) obj).intValue());
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public C2813q clone() {
        C2813q c2813qR = r();
        int iL = this.f29418a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry entryK = this.f29418a.k(i10);
            android.support.v4.media.session.b.a(entryK.getKey());
            c2813qR.s(null, entryK.getValue());
        }
        for (Map.Entry entry : this.f29418a.n()) {
            android.support.v4.media.session.b.a(entry.getKey());
            c2813qR.s(null, entry.getValue());
        }
        c2813qR.f29420c = this.f29420c;
        return c2813qR;
    }

    Iterator e() {
        return j() ? Collections.emptyIterator() : this.f29420c ? new C2819x(this.f29418a.i().iterator()) : this.f29418a.i().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2813q) {
            return this.f29418a.equals(((C2813q) obj).f29418a);
        }
        return false;
    }

    public int f() {
        int iL = this.f29418a.l();
        int iG = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            iG += g(this.f29418a.k(i10));
        }
        Iterator it = this.f29418a.n().iterator();
        while (it.hasNext()) {
            iG += g((Map.Entry) it.next());
        }
        return iG;
    }

    public int h() {
        int iL = this.f29418a.l();
        int iD = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry entryK = this.f29418a.k(i10);
            android.support.v4.media.session.b.a(entryK.getKey());
            iD += d(null, entryK.getValue());
        }
        for (Map.Entry entry : this.f29418a.n()) {
            android.support.v4.media.session.b.a(entry.getKey());
            iD += d(null, entry.getValue());
        }
        return iD;
    }

    public int hashCode() {
        return this.f29418a.hashCode();
    }

    boolean j() {
        return this.f29418a.isEmpty();
    }

    public boolean k() {
        int iL = this.f29418a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            if (!l(this.f29418a.k(i10))) {
                return false;
            }
        }
        Iterator it = this.f29418a.n().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return j() ? Collections.emptyIterator() : this.f29420c ? new C2819x(this.f29418a.entrySet().iterator()) : this.f29418a.entrySet().iterator();
    }

    public void o() {
        if (this.f29419b) {
            return;
        }
        int iL = this.f29418a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry entryK = this.f29418a.k(i10);
            if (entryK.getValue() instanceof AbstractC2815t) {
                ((AbstractC2815t) entryK.getValue()).D();
            }
        }
        this.f29418a.q();
        this.f29419b = true;
    }

    public void p(C2813q c2813q) {
        int iL = c2813q.f29418a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            q(c2813q.f29418a.k(i10));
        }
        Iterator it = c2813q.f29418a.n().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public void s(b bVar, Object obj) {
        if (!bVar.e()) {
            t(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar, it.next());
            }
            obj = arrayList;
        }
        this.f29418a.t(bVar, obj);
    }

    private C2813q(boolean z10) {
        this(d0.r());
        o();
    }

    private C2813q(d0 d0Var) {
        this.f29418a = d0Var;
        o();
    }
}
