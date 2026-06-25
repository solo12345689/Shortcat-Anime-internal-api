package xa;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
import xa.AbstractC7091q;
import xa.e0;

/* JADX INFO: renamed from: xa.G */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C7073G implements S {

    /* JADX INFO: renamed from: r */
    private static final int[] f64073r = new int[0];

    /* JADX INFO: renamed from: s */
    private static final Unsafe f64074s = c0.B();

    /* JADX INFO: renamed from: a */
    private final int[] f64075a;

    /* JADX INFO: renamed from: b */
    private final Object[] f64076b;

    /* JADX INFO: renamed from: c */
    private final int f64077c;

    /* JADX INFO: renamed from: d */
    private final int f64078d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC7070D f64079e;

    /* JADX INFO: renamed from: f */
    private final boolean f64080f;

    /* JADX INFO: renamed from: g */
    private final boolean f64081g;

    /* JADX INFO: renamed from: h */
    private final M f64082h;

    /* JADX INFO: renamed from: i */
    private final boolean f64083i;

    /* JADX INFO: renamed from: j */
    private final int[] f64084j;

    /* JADX INFO: renamed from: k */
    private final int f64085k;

    /* JADX INFO: renamed from: l */
    private final int f64086l;

    /* JADX INFO: renamed from: m */
    private final I f64087m;

    /* JADX INFO: renamed from: n */
    private final AbstractC7094u f64088n;

    /* JADX INFO: renamed from: o */
    private final Y f64089o;

    /* JADX INFO: renamed from: p */
    private final AbstractC7085k f64090p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC7098y f64091q;

    private C7073G(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC7070D interfaceC7070D, M m10, boolean z10, int[] iArr2, int i12, int i13, I i14, AbstractC7094u abstractC7094u, Y y10, AbstractC7085k abstractC7085k, InterfaceC7098y interfaceC7098y) {
        this.f64075a = iArr;
        this.f64076b = objArr;
        this.f64077c = i10;
        this.f64078d = i11;
        this.f64081g = interfaceC7070D instanceof AbstractC7090p;
        this.f64082h = m10;
        this.f64080f = abstractC7085k != null && abstractC7085k.d(interfaceC7070D);
        this.f64083i = z10;
        this.f64084j = iArr2;
        this.f64085k = i12;
        this.f64086l = i13;
        this.f64087m = i14;
        this.f64088n = abstractC7094u;
        this.f64089o = y10;
        this.f64090p = abstractC7085k;
        this.f64079e = interfaceC7070D;
        this.f64091q = interfaceC7098y;
    }

    private void A(Object obj, Object obj2, int i10) {
        if (p(obj2, i10)) {
            long J10 = J(c0(i10));
            Unsafe unsafe = f64074s;
            Object object = unsafe.getObject(obj2, J10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + I(i10) + " is present but null: " + obj2);
            }
            S sN = n(i10);
            if (!p(obj, i10)) {
                if (u(object)) {
                    Object objB = sN.b();
                    sN.a(objB, object);
                    unsafe.putObject(obj, J10, objB);
                } else {
                    unsafe.putObject(obj, J10, object);
                }
                W(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, J10);
            if (!u(object2)) {
                Object objB2 = sN.b();
                sN.a(objB2, object2);
                unsafe.putObject(obj, J10, objB2);
                object2 = objB2;
            }
            sN.a(object2, object);
        }
    }

    private void B(Object obj, Object obj2, int i10) {
        int I10 = I(i10);
        if (w(obj2, I10, i10)) {
            long J10 = J(c0(i10));
            Unsafe unsafe = f64074s;
            Object object = unsafe.getObject(obj2, J10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + I(i10) + " is present but null: " + obj2);
            }
            S sN = n(i10);
            if (!w(obj, I10, i10)) {
                if (u(object)) {
                    Object objB = sN.b();
                    sN.a(objB, object);
                    unsafe.putObject(obj, J10, objB);
                } else {
                    unsafe.putObject(obj, J10, object);
                }
                X(obj, I10, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, J10);
            if (!u(object2)) {
                Object objB2 = sN.b();
                sN.a(objB2, object2);
                unsafe.putObject(obj, J10, objB2);
                object2 = objB2;
            }
            sN.a(object2, object);
        }
    }

    private void C(Object obj, Object obj2, int i10) {
        int iC0 = c0(i10);
        long J10 = J(iC0);
        int I10 = I(i10);
        switch (b0(iC0)) {
            case 0:
                if (p(obj2, i10)) {
                    c0.K(obj, J10, c0.v(obj2, J10));
                    W(obj, i10);
                }
                break;
            case 1:
                if (p(obj2, i10)) {
                    c0.L(obj, J10, c0.w(obj2, J10));
                    W(obj, i10);
                }
                break;
            case 2:
                if (p(obj2, i10)) {
                    c0.N(obj, J10, c0.y(obj2, J10));
                    W(obj, i10);
                }
                break;
            case 3:
                if (p(obj2, i10)) {
                    c0.N(obj, J10, c0.y(obj2, J10));
                    W(obj, i10);
                }
                break;
            case 4:
                if (p(obj2, i10)) {
                    c0.M(obj, J10, c0.x(obj2, J10));
                    W(obj, i10);
                }
                break;
            case 5:
                if (p(obj2, i10)) {
                    c0.N(obj, J10, c0.y(obj2, J10));
                    W(obj, i10);
                }
                break;
            case 6:
                if (p(obj2, i10)) {
                    c0.M(obj, J10, c0.x(obj2, J10));
                    W(obj, i10);
                }
                break;
            case 7:
                if (p(obj2, i10)) {
                    c0.F(obj, J10, c0.p(obj2, J10));
                    W(obj, i10);
                }
                break;
            case 8:
                if (p(obj2, i10)) {
                    c0.O(obj, J10, c0.A(obj2, J10));
                    W(obj, i10);
                }
                break;
            case 9:
                A(obj, obj2, i10);
                break;
            case 10:
                if (p(obj2, i10)) {
                    c0.O(obj, J10, c0.A(obj2, J10));
                    W(obj, i10);
                }
                break;
            case 11:
                if (p(obj2, i10)) {
                    c0.M(obj, J10, c0.x(obj2, J10));
                    W(obj, i10);
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                if (p(obj2, i10)) {
                    c0.M(obj, J10, c0.x(obj2, J10));
                    W(obj, i10);
                }
                break;
            case 13:
                if (p(obj2, i10)) {
                    c0.M(obj, J10, c0.x(obj2, J10));
                    W(obj, i10);
                }
                break;
            case 14:
                if (p(obj2, i10)) {
                    c0.N(obj, J10, c0.y(obj2, J10));
                    W(obj, i10);
                }
                break;
            case 15:
                if (p(obj2, i10)) {
                    c0.M(obj, J10, c0.x(obj2, J10));
                    W(obj, i10);
                }
                break;
            case 16:
                if (p(obj2, i10)) {
                    c0.N(obj, J10, c0.y(obj2, J10));
                    W(obj, i10);
                }
                break;
            case 17:
                A(obj, obj2, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                this.f64088n.d(obj, obj2, J10);
                break;
            case 50:
                U.f(this.f64091q, obj, obj2, J10);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (w(obj2, I10, i10)) {
                    c0.O(obj, J10, c0.A(obj2, J10));
                    X(obj, I10, i10);
                }
                break;
            case 60:
                B(obj, obj2, i10);
                break;
            case 61:
            case 62:
            case 63:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
            case 65:
            case 66:
            case 67:
                if (w(obj2, I10, i10)) {
                    c0.O(obj, J10, c0.A(obj2, J10));
                    X(obj, I10, i10);
                }
                break;
            case 68:
                B(obj, obj2, i10);
                break;
        }
    }

    private Object D(Object obj, int i10) {
        S sN = n(i10);
        long J10 = J(c0(i10));
        if (!p(obj, i10)) {
            return sN.b();
        }
        Object object = f64074s.getObject(obj, J10);
        if (u(object)) {
            return object;
        }
        Object objB = sN.b();
        if (object != null) {
            sN.a(objB, object);
        }
        return objB;
    }

    private Object E(Object obj, int i10, int i11) {
        S sN = n(i11);
        if (!w(obj, i10, i11)) {
            return sN.b();
        }
        Object object = f64074s.getObject(obj, J(c0(i11)));
        if (u(object)) {
            return object;
        }
        Object objB = sN.b();
        if (object != null) {
            sN.a(objB, object);
        }
        return objB;
    }

    static C7073G F(Class cls, InterfaceC7068B interfaceC7068B, I i10, AbstractC7094u abstractC7094u, Y y10, AbstractC7085k abstractC7085k, InterfaceC7098y interfaceC7098y) {
        if (interfaceC7068B instanceof P) {
            return H((P) interfaceC7068B, i10, abstractC7094u, y10, abstractC7085k, interfaceC7098y);
        }
        android.support.v4.media.session.b.a(interfaceC7068B);
        return G(null, i10, abstractC7094u, y10, abstractC7085k, interfaceC7098y);
    }

    static C7073G G(V v10, I i10, AbstractC7094u abstractC7094u, Y y10, AbstractC7085k abstractC7085k, InterfaceC7098y interfaceC7098y) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:340:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static xa.C7073G H(xa.P r33, xa.I r34, xa.AbstractC7094u r35, xa.Y r36, xa.AbstractC7085k r37, xa.InterfaceC7098y r38) {
        /*
            Method dump skipped, instruction units count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.C7073G.H(xa.P, xa.I, xa.u, xa.Y, xa.k, xa.y):xa.G");
    }

    private int I(int i10) {
        return this.f64075a[i10];
    }

    private static long J(int i10) {
        return i10 & 1048575;
    }

    private static boolean K(Object obj, long j10) {
        return ((Boolean) c0.A(obj, j10)).booleanValue();
    }

    private static double L(Object obj, long j10) {
        return ((Double) c0.A(obj, j10)).doubleValue();
    }

    private static float M(Object obj, long j10) {
        return ((Float) c0.A(obj, j10)).floatValue();
    }

    private static int N(Object obj, long j10) {
        return ((Integer) c0.A(obj, j10)).intValue();
    }

    private static long O(Object obj, long j10) {
        return ((Long) c0.A(obj, j10)).longValue();
    }

    private int P(int i10) {
        if (i10 < this.f64077c || i10 > this.f64078d) {
            return -1;
        }
        return Y(i10, 0);
    }

    private int Q(int i10) {
        return this.f64075a[i10 + 2];
    }

    private void R(Object obj, long j10, Q q10, S s10, C7084j c7084j) {
        q10.N(this.f64088n.e(obj, j10), s10, c7084j);
    }

    private void S(Object obj, int i10, Q q10, S s10, C7084j c7084j) {
        q10.J(this.f64088n.e(obj, J(i10)), s10, c7084j);
    }

    private void T(Object obj, int i10, Q q10) {
        if (o(i10)) {
            c0.O(obj, J(i10), q10.I());
        } else if (this.f64081g) {
            c0.O(obj, J(i10), q10.z());
        } else {
            c0.O(obj, J(i10), q10.n());
        }
    }

    private void U(Object obj, int i10, Q q10) {
        if (o(i10)) {
            q10.m(this.f64088n.e(obj, J(i10)));
        } else {
            q10.B(this.f64088n.e(obj, J(i10)));
        }
    }

    private static Field V(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void W(Object obj, int i10) {
        int iQ = Q(i10);
        long j10 = 1048575 & iQ;
        if (j10 == 1048575) {
            return;
        }
        c0.M(obj, j10, (1 << (iQ >>> 20)) | c0.x(obj, j10));
    }

    private void X(Object obj, int i10, int i11) {
        c0.M(obj, Q(i11) & 1048575, i10);
    }

    private int Y(int i10, int i11) {
        int length = (this.f64075a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int I10 = I(i13);
            if (i10 == I10) {
                return i13;
            }
            if (i10 < I10) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private void Z(Object obj, int i10, Object obj2) {
        f64074s.putObject(obj, J(c0(i10)), obj2);
        W(obj, i10);
    }

    private void a0(Object obj, int i10, int i11, Object obj2) {
        f64074s.putObject(obj, J(c0(i11)), obj2);
        X(obj, i10, i11);
    }

    private static int b0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private int c0(int i10) {
        return this.f64075a[i10 + 1];
    }

    private boolean h(Object obj, Object obj2, int i10) {
        return p(obj, i10) == p(obj2, i10);
    }

    private static void i(Object obj) {
        if (u(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private boolean j(Object obj, Object obj2, int i10) {
        int iC0 = c0(i10);
        long J10 = J(iC0);
        switch (b0(iC0)) {
            case 0:
                if (!h(obj, obj2, i10) || Double.doubleToLongBits(c0.v(obj, J10)) != Double.doubleToLongBits(c0.v(obj2, J10))) {
                }
                break;
            case 1:
                if (!h(obj, obj2, i10) || Float.floatToIntBits(c0.w(obj, J10)) != Float.floatToIntBits(c0.w(obj2, J10))) {
                }
                break;
            case 2:
                if (!h(obj, obj2, i10) || c0.y(obj, J10) != c0.y(obj2, J10)) {
                }
                break;
            case 3:
                if (!h(obj, obj2, i10) || c0.y(obj, J10) != c0.y(obj2, J10)) {
                }
                break;
            case 4:
                if (!h(obj, obj2, i10) || c0.x(obj, J10) != c0.x(obj2, J10)) {
                }
                break;
            case 5:
                if (!h(obj, obj2, i10) || c0.y(obj, J10) != c0.y(obj2, J10)) {
                }
                break;
            case 6:
                if (!h(obj, obj2, i10) || c0.x(obj, J10) != c0.x(obj2, J10)) {
                }
                break;
            case 7:
                if (!h(obj, obj2, i10) || c0.p(obj, J10) != c0.p(obj2, J10)) {
                }
                break;
            case 8:
                if (!h(obj, obj2, i10) || !U.i(c0.A(obj, J10), c0.A(obj2, J10))) {
                }
                break;
            case 9:
                if (!h(obj, obj2, i10) || !U.i(c0.A(obj, J10), c0.A(obj2, J10))) {
                }
                break;
            case 10:
                if (!h(obj, obj2, i10) || !U.i(c0.A(obj, J10), c0.A(obj2, J10))) {
                }
                break;
            case 11:
                if (!h(obj, obj2, i10) || c0.x(obj, J10) != c0.x(obj2, J10)) {
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                if (!h(obj, obj2, i10) || c0.x(obj, J10) != c0.x(obj2, J10)) {
                }
                break;
            case 13:
                if (!h(obj, obj2, i10) || c0.x(obj, J10) != c0.x(obj2, J10)) {
                }
                break;
            case 14:
                if (!h(obj, obj2, i10) || c0.y(obj, J10) != c0.y(obj2, J10)) {
                }
                break;
            case 15:
                if (!h(obj, obj2, i10) || c0.x(obj, J10) != c0.x(obj2, J10)) {
                }
                break;
            case 16:
                if (!h(obj, obj2, i10) || c0.y(obj, J10) != c0.y(obj2, J10)) {
                }
                break;
            case 17:
                if (!h(obj, obj2, i10) || !U.i(c0.A(obj, J10), c0.A(obj2, J10))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!v(obj, obj2, i10) || !U.i(c0.A(obj, J10), c0.A(obj2, J10))) {
                }
                break;
        }
        return true;
    }

    private Object k(Object obj, int i10, Object obj2, Y y10, Object obj3) {
        I(i10);
        if (c0.A(obj, J(c0(i10))) == null) {
            return obj2;
        }
        l(i10);
        return obj2;
    }

    private AbstractC7091q.a l(int i10) {
        android.support.v4.media.session.b.a(this.f64076b[((i10 / 3) * 2) + 1]);
        return null;
    }

    private Object m(int i10) {
        return this.f64076b[(i10 / 3) * 2];
    }

    private S n(int i10) {
        int i11 = (i10 / 3) * 2;
        S s10 = (S) this.f64076b[i11];
        if (s10 != null) {
            return s10;
        }
        S sC = N.a().c((Class) this.f64076b[i11 + 1]);
        this.f64076b[i11] = sC;
        return sC;
    }

    private static boolean o(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean p(Object obj, int i10) {
        boolean zEquals;
        int iQ = Q(i10);
        long j10 = 1048575 & iQ;
        if (j10 != 1048575) {
            return (c0.x(obj, j10) & (1 << (iQ >>> 20))) != 0;
        }
        int iC0 = c0(i10);
        long J10 = J(iC0);
        switch (b0(iC0)) {
            case 0:
                return Double.doubleToRawLongBits(c0.v(obj, J10)) != 0;
            case 1:
                return Float.floatToRawIntBits(c0.w(obj, J10)) != 0;
            case 2:
                return c0.y(obj, J10) != 0;
            case 3:
                return c0.y(obj, J10) != 0;
            case 4:
                return c0.x(obj, J10) != 0;
            case 5:
                return c0.y(obj, J10) != 0;
            case 6:
                return c0.x(obj, J10) != 0;
            case 7:
                return c0.p(obj, J10);
            case 8:
                Object objA = c0.A(obj, J10);
                if (objA instanceof String) {
                    zEquals = ((String) objA).isEmpty();
                } else {
                    if (!(objA instanceof AbstractC7079e)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = AbstractC7079e.f64161b.equals(objA);
                }
                break;
            case 9:
                return c0.A(obj, J10) != null;
            case 10:
                zEquals = AbstractC7079e.f64161b.equals(c0.A(obj, J10));
                break;
            case 11:
                return c0.x(obj, J10) != 0;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return c0.x(obj, J10) != 0;
            case 13:
                return c0.x(obj, J10) != 0;
            case 14:
                return c0.y(obj, J10) != 0;
            case 15:
                return c0.x(obj, J10) != 0;
            case 16:
                return c0.y(obj, J10) != 0;
            case 17:
                return c0.A(obj, J10) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private boolean q(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? p(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean r(Object obj, int i10, S s10) {
        return s10.d(c0.A(obj, J(i10)));
    }

    private boolean s(Object obj, int i10, int i11) {
        List list = (List) c0.A(obj, J(i10));
        if (list.isEmpty()) {
            return true;
        }
        S sN = n(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!sN.d(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean t(Object obj, int i10, int i11) {
        Map mapE = this.f64091q.e(c0.A(obj, J(i10)));
        if (mapE.isEmpty()) {
            return true;
        }
        if (this.f64091q.b(m(i11)).f64282c.a() != e0.c.MESSAGE) {
            return true;
        }
        S sC = null;
        for (Object obj2 : mapE.values()) {
            if (sC == null) {
                sC = N.a().c(obj2.getClass());
            }
            if (!sC.d(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC7090p) {
            return ((AbstractC7090p) obj).t();
        }
        return true;
    }

    private boolean v(Object obj, Object obj2, int i10) {
        long jQ = Q(i10) & 1048575;
        return c0.x(obj, jQ) == c0.x(obj2, jQ);
    }

    private boolean w(Object obj, int i10, int i11) {
        return c0.x(obj, (long) (Q(i11) & 1048575)) == i10;
    }

    private static boolean x(int i10) {
        return (i10 & 268435456) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:414:0x00a4, code lost:
    
        r0 = r9.f64085k;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x00a9, code lost:
    
        if (r0 >= r9.f64086l) goto L717;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x00ab, code lost:
    
        r1 = r9;
        r4 = r1.k(r2, r9.f64084j[r0], r4, r17, r19);
        r6 = r17;
        r0 = r0 + 1;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x00c0, code lost:
    
        if (r4 == null) goto L719;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x00c2, code lost:
    
        r6.m(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0703 A[Catch: all -> 0x0727, TRY_LEAVE, TryCatch #6 {all -> 0x0727, blocks: (B:606:0x06fd, B:608:0x0703), top: B:649:0x06fd }] */
    /* JADX WARN: Removed duplicated region for block: B:619:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0767 A[LOOP:4: B:637:0x0763->B:639:0x0767, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:641:0x077b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void y(xa.Y r17, xa.AbstractC7085k r18, java.lang.Object r19, xa.Q r20, xa.C7084j r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.C7073G.y(xa.Y, xa.k, java.lang.Object, xa.Q, xa.j):void");
    }

    private final void z(Object obj, int i10, Object obj2, C7084j c7084j, Q q10) {
        long J10 = J(c0(i10));
        Object objA = c0.A(obj, J10);
        if (objA == null) {
            objA = this.f64091q.d(obj2);
            c0.O(obj, J10, objA);
        } else if (this.f64091q.g(objA)) {
            Object objD = this.f64091q.d(obj2);
            this.f64091q.a(objD, objA);
            c0.O(obj, J10, objD);
            objA = objD;
        }
        q10.M(this.f64091q.c(objA), this.f64091q.b(obj2), c7084j);
    }

    @Override // xa.S
    public void a(Object obj, Object obj2) {
        i(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f64075a.length; i10 += 3) {
            C(obj, obj2, i10);
        }
        U.g(this.f64089o, obj, obj2);
        if (this.f64080f) {
            U.e(this.f64090p, obj, obj2);
        }
    }

    @Override // xa.S
    public Object b() {
        return this.f64087m.a(this.f64079e);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x006a  */
    @Override // xa.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.C7073G.c(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x007c  */
    @Override // xa.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r3 = r0
            r2 = r1
            r4 = r2
        L7:
            int r5 = r14.f64085k
            r6 = 1
            if (r2 >= r5) goto L9b
            int[] r5 = r14.f64084j
            r9 = r5[r2]
            int r5 = r14.I(r9)
            int r13 = r14.c0(r9)
            int[] r7 = r14.f64075a
            int r8 = r9 + 2
            r7 = r7[r8]
            r8 = r7 & r0
            int r7 = r7 >>> 20
            int r12 = r6 << r7
            if (r8 == r3) goto L32
            if (r8 == r0) goto L2f
            sun.misc.Unsafe r3 = xa.C7073G.f64074s
            long r6 = (long) r8
            int r4 = r3.getInt(r15, r6)
        L2f:
            r11 = r4
            r10 = r8
            goto L34
        L32:
            r10 = r3
            r11 = r4
        L34:
            boolean r3 = x(r13)
            r7 = r14
            r8 = r15
            if (r3 == 0) goto L43
            boolean r15 = r7.q(r8, r9, r10, r11, r12)
            if (r15 != 0) goto L43
            return r1
        L43:
            int r15 = b0(r13)
            r3 = 9
            if (r15 == r3) goto L83
            r3 = 17
            if (r15 == r3) goto L83
            r3 = 27
            if (r15 == r3) goto L7c
            r3 = 60
            if (r15 == r3) goto L6b
            r3 = 68
            if (r15 == r3) goto L6b
            r3 = 49
            if (r15 == r3) goto L7c
            r3 = 50
            if (r15 == r3) goto L64
            goto L94
        L64:
            boolean r15 = r14.t(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L6b:
            boolean r15 = r14.w(r8, r5, r9)
            if (r15 == 0) goto L94
            xa.S r15 = r14.n(r9)
            boolean r15 = r(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L7c:
            boolean r15 = r14.s(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L83:
            boolean r15 = r7.q(r8, r9, r10, r11, r12)
            if (r15 == 0) goto L94
            xa.S r15 = r14.n(r9)
            boolean r15 = r(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L94:
            int r2 = r2 + 1
            r15 = r8
            r3 = r10
            r4 = r11
            goto L7
        L9b:
            r7 = r14
            r8 = r15
            boolean r15 = r7.f64080f
            if (r15 == 0) goto Lae
            xa.k r15 = r7.f64090p
            xa.n r15 = r15.b(r8)
            boolean r15 = r15.b()
            if (r15 != 0) goto Lae
            return r1
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.C7073G.d(java.lang.Object):boolean");
    }

    @Override // xa.S
    public int e(Object obj) {
        int i10;
        int iF;
        int length = this.f64075a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iC0 = c0(i12);
            int I10 = I(i12);
            long J10 = J(iC0);
            int iHashCode = 37;
            switch (b0(iC0)) {
                case 0:
                    i10 = i11 * 53;
                    iF = AbstractC7091q.f(Double.doubleToLongBits(c0.v(obj, J10)));
                    i11 = i10 + iF;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iF = Float.floatToIntBits(c0.w(obj, J10));
                    i11 = i10 + iF;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iF = AbstractC7091q.f(c0.y(obj, J10));
                    i11 = i10 + iF;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iF = AbstractC7091q.f(c0.y(obj, J10));
                    i11 = i10 + iF;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iF = c0.x(obj, J10);
                    i11 = i10 + iF;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iF = AbstractC7091q.f(c0.y(obj, J10));
                    i11 = i10 + iF;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iF = c0.x(obj, J10);
                    i11 = i10 + iF;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iF = AbstractC7091q.c(c0.p(obj, J10));
                    i11 = i10 + iF;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iF = ((String) c0.A(obj, J10)).hashCode();
                    i11 = i10 + iF;
                    break;
                case 9:
                    Object objA = c0.A(obj, J10);
                    if (objA != null) {
                        iHashCode = objA.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iF = c0.A(obj, J10).hashCode();
                    i11 = i10 + iF;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iF = c0.x(obj, J10);
                    i11 = i10 + iF;
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    i10 = i11 * 53;
                    iF = c0.x(obj, J10);
                    i11 = i10 + iF;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iF = c0.x(obj, J10);
                    i11 = i10 + iF;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iF = AbstractC7091q.f(c0.y(obj, J10));
                    i11 = i10 + iF;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iF = c0.x(obj, J10);
                    i11 = i10 + iF;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iF = AbstractC7091q.f(c0.y(obj, J10));
                    i11 = i10 + iF;
                    break;
                case 17:
                    Object objA2 = c0.A(obj, J10);
                    if (objA2 != null) {
                        iHashCode = objA2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                    i10 = i11 * 53;
                    iF = c0.A(obj, J10).hashCode();
                    i11 = i10 + iF;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iF = c0.A(obj, J10).hashCode();
                    i11 = i10 + iF;
                    break;
                case 51:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC7091q.f(Double.doubleToLongBits(L(obj, J10)));
                        i11 = i10 + iF;
                    }
                    break;
                case 52:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = Float.floatToIntBits(M(obj, J10));
                        i11 = i10 + iF;
                    }
                    break;
                case 53:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC7091q.f(O(obj, J10));
                        i11 = i10 + iF;
                    }
                    break;
                case 54:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC7091q.f(O(obj, J10));
                        i11 = i10 + iF;
                    }
                    break;
                case 55:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = N(obj, J10);
                        i11 = i10 + iF;
                    }
                    break;
                case 56:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC7091q.f(O(obj, J10));
                        i11 = i10 + iF;
                    }
                    break;
                case 57:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = N(obj, J10);
                        i11 = i10 + iF;
                    }
                    break;
                case 58:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC7091q.c(K(obj, J10));
                        i11 = i10 + iF;
                    }
                    break;
                case 59:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = ((String) c0.A(obj, J10)).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 60:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = c0.A(obj, J10).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 61:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = c0.A(obj, J10).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 62:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = N(obj, J10);
                        i11 = i10 + iF;
                    }
                    break;
                case 63:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = N(obj, J10);
                        i11 = i10 + iF;
                    }
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = N(obj, J10);
                        i11 = i10 + iF;
                    }
                    break;
                case 65:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC7091q.f(O(obj, J10));
                        i11 = i10 + iF;
                    }
                    break;
                case 66:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = N(obj, J10);
                        i11 = i10 + iF;
                    }
                    break;
                case 67:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC7091q.f(O(obj, J10));
                        i11 = i10 + iF;
                    }
                    break;
                case 68:
                    if (w(obj, I10, i12)) {
                        i10 = i11 * 53;
                        iF = c0.A(obj, J10).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.f64089o.g(obj).hashCode();
        return this.f64080f ? (iHashCode2 * 53) + this.f64090p.b(obj).hashCode() : iHashCode2;
    }

    @Override // xa.S
    public boolean f(Object obj, Object obj2) {
        int length = this.f64075a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!j(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.f64089o.g(obj).equals(this.f64089o.g(obj2))) {
            return false;
        }
        if (this.f64080f) {
            return this.f64090p.b(obj).equals(this.f64090p.b(obj2));
        }
        return true;
    }

    @Override // xa.S
    public void g(Object obj, Q q10, C7084j c7084j) throws Throwable {
        c7084j.getClass();
        i(obj);
        y(this.f64089o, this.f64090p, obj, q10, c7084j);
    }
}
