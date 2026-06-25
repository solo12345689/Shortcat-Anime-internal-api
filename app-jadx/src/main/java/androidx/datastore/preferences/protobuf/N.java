package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2816u;
import androidx.datastore.preferences.protobuf.m0;
import androidx.datastore.preferences.protobuf.n0;
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

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class N implements a0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f29221r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f29222s = k0.A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f29223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f29224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f29225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final K f29227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f29228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f29229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final V f29230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f29231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f29232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f29233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f29234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final P f29235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2821z f29236n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final h0 f29237o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AbstractC2810n f29238p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final F f29239q;

    private N(int[] iArr, Object[] objArr, int i10, int i11, K k10, V v10, boolean z10, int[] iArr2, int i12, int i13, P p10, InterfaceC2821z interfaceC2821z, h0 h0Var, AbstractC2810n abstractC2810n, F f10) {
        this.f29223a = iArr;
        this.f29224b = objArr;
        this.f29225c = i10;
        this.f29226d = i11;
        this.f29229g = k10 instanceof AbstractC2815t;
        this.f29230h = v10;
        this.f29228f = abstractC2810n != null && abstractC2810n.e(k10);
        this.f29231i = z10;
        this.f29232j = iArr2;
        this.f29233k = i12;
        this.f29234l = i13;
        this.f29235m = p10;
        this.f29236n = interfaceC2821z;
        this.f29237o = h0Var;
        this.f29238p = abstractC2810n;
        this.f29227e = k10;
        this.f29239q = f10;
    }

    private boolean A(Object obj, int i10, int i11) {
        Map mapE = this.f29239q.e(k0.z(obj, R(i10)));
        if (mapE.isEmpty()) {
            return true;
        }
        if (this.f29239q.b(r(i11)).f29214c.a() != m0.c.MESSAGE) {
            return true;
        }
        a0 a0VarC = null;
        for (Object obj2 : mapE.values()) {
            if (a0VarC == null) {
                a0VarC = W.a().c(obj2.getClass());
            }
            if (!a0VarC.d(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean B(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2815t) {
            return ((AbstractC2815t) obj).C();
        }
        return true;
    }

    private boolean C(Object obj, Object obj2, int i10) {
        long jY = Y(i10) & 1048575;
        return k0.w(obj, jY) == k0.w(obj2, jY);
    }

    private boolean D(Object obj, int i10, int i11) {
        return k0.w(obj, (long) (Y(i11) & 1048575)) == i10;
    }

    private static boolean E(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static long F(Object obj, long j10) {
        return k0.x(obj, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:328:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a8, code lost:
    
        r0 = r10.f29233k;
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        if (r0 >= r10.f29234l) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
    
        r4 = r10.o(r2, r10.f29232j[r0], r4, r5, r20);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        if (r4 == null) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c2, code lost:
    
        r5.o(r2, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06d2 A[Catch: all -> 0x06f3, TRY_LEAVE, TryCatch #10 {all -> 0x06f3, blocks: (B:227:0x06cc, B:229:0x06d2, B:240:0x06f7, B:241:0x06fc), top: B:272:0x06cc }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x072d A[LOOP:4: B:254:0x0729->B:256:0x072d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0740  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void G(androidx.datastore.preferences.protobuf.h0 r18, androidx.datastore.preferences.protobuf.AbstractC2810n r19, java.lang.Object r20, androidx.datastore.preferences.protobuf.Z r21, androidx.datastore.preferences.protobuf.C2809m r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.G(androidx.datastore.preferences.protobuf.h0, androidx.datastore.preferences.protobuf.n, java.lang.Object, androidx.datastore.preferences.protobuf.Z, androidx.datastore.preferences.protobuf.m):void");
    }

    private final void H(Object obj, int i10, Object obj2, C2809m c2809m, Z z10) {
        long jR = R(k0(i10));
        Object objZ = k0.z(obj, jR);
        if (objZ == null) {
            objZ = this.f29239q.d(obj2);
            k0.O(obj, jR, objZ);
        } else if (this.f29239q.g(objZ)) {
            Object objD = this.f29239q.d(obj2);
            this.f29239q.a(objD, objZ);
            k0.O(obj, jR, objD);
            objZ = objD;
        }
        z10.L(this.f29239q.c(objZ), this.f29239q.b(obj2), c2809m);
    }

    private void I(Object obj, Object obj2, int i10) {
        if (w(obj2, i10)) {
            long jR = R(k0(i10));
            Unsafe unsafe = f29222s;
            Object object = unsafe.getObject(obj2, jR);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + Q(i10) + " is present but null: " + obj2);
            }
            a0 a0VarS = s(i10);
            if (!w(obj, i10)) {
                if (B(object)) {
                    Object objB = a0VarS.b();
                    a0VarS.a(objB, object);
                    unsafe.putObject(obj, jR, objB);
                } else {
                    unsafe.putObject(obj, jR, object);
                }
                e0(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jR);
            if (!B(object2)) {
                Object objB2 = a0VarS.b();
                a0VarS.a(objB2, object2);
                unsafe.putObject(obj, jR, objB2);
                object2 = objB2;
            }
            a0VarS.a(object2, object);
        }
    }

    private void J(Object obj, Object obj2, int i10) {
        int iQ = Q(i10);
        if (D(obj2, iQ, i10)) {
            long jR = R(k0(i10));
            Unsafe unsafe = f29222s;
            Object object = unsafe.getObject(obj2, jR);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + Q(i10) + " is present but null: " + obj2);
            }
            a0 a0VarS = s(i10);
            if (!D(obj, iQ, i10)) {
                if (B(object)) {
                    Object objB = a0VarS.b();
                    a0VarS.a(objB, object);
                    unsafe.putObject(obj, jR, objB);
                } else {
                    unsafe.putObject(obj, jR, object);
                }
                f0(obj, iQ, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jR);
            if (!B(object2)) {
                Object objB2 = a0VarS.b();
                a0VarS.a(objB2, object2);
                unsafe.putObject(obj, jR, objB2);
                object2 = objB2;
            }
            a0VarS.a(object2, object);
        }
    }

    private void K(Object obj, Object obj2, int i10) {
        int iK0 = k0(i10);
        long jR = R(iK0);
        int iQ = Q(i10);
        switch (j0(iK0)) {
            case 0:
                if (w(obj2, i10)) {
                    k0.K(obj, jR, k0.u(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 1:
                if (w(obj2, i10)) {
                    k0.L(obj, jR, k0.v(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 2:
                if (w(obj2, i10)) {
                    k0.N(obj, jR, k0.x(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 3:
                if (w(obj2, i10)) {
                    k0.N(obj, jR, k0.x(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 4:
                if (w(obj2, i10)) {
                    k0.M(obj, jR, k0.w(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 5:
                if (w(obj2, i10)) {
                    k0.N(obj, jR, k0.x(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 6:
                if (w(obj2, i10)) {
                    k0.M(obj, jR, k0.w(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 7:
                if (w(obj2, i10)) {
                    k0.E(obj, jR, k0.p(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 8:
                if (w(obj2, i10)) {
                    k0.O(obj, jR, k0.z(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 9:
                I(obj, obj2, i10);
                break;
            case 10:
                if (w(obj2, i10)) {
                    k0.O(obj, jR, k0.z(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 11:
                if (w(obj2, i10)) {
                    k0.M(obj, jR, k0.w(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                if (w(obj2, i10)) {
                    k0.M(obj, jR, k0.w(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 13:
                if (w(obj2, i10)) {
                    k0.M(obj, jR, k0.w(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 14:
                if (w(obj2, i10)) {
                    k0.N(obj, jR, k0.x(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 15:
                if (w(obj2, i10)) {
                    k0.M(obj, jR, k0.w(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 16:
                if (w(obj2, i10)) {
                    k0.N(obj, jR, k0.x(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 17:
                I(obj, obj2, i10);
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
                this.f29236n.b(obj, obj2, jR);
                break;
            case 50:
                c0.E(this.f29239q, obj, obj2, jR);
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
                if (D(obj2, iQ, i10)) {
                    k0.O(obj, jR, k0.z(obj2, jR));
                    f0(obj, iQ, i10);
                }
                break;
            case 60:
                J(obj, obj2, i10);
                break;
            case 61:
            case 62:
            case 63:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
            case 65:
            case 66:
            case 67:
                if (D(obj2, iQ, i10)) {
                    k0.O(obj, jR, k0.z(obj2, jR));
                    f0(obj, iQ, i10);
                }
                break;
            case 68:
                J(obj, obj2, i10);
                break;
        }
    }

    private Object L(Object obj, int i10) {
        a0 a0VarS = s(i10);
        long jR = R(k0(i10));
        if (!w(obj, i10)) {
            return a0VarS.b();
        }
        Object object = f29222s.getObject(obj, jR);
        if (B(object)) {
            return object;
        }
        Object objB = a0VarS.b();
        if (object != null) {
            a0VarS.a(objB, object);
        }
        return objB;
    }

    private Object M(Object obj, int i10, int i11) {
        a0 a0VarS = s(i11);
        if (!D(obj, i10, i11)) {
            return a0VarS.b();
        }
        Object object = f29222s.getObject(obj, R(k0(i11)));
        if (B(object)) {
            return object;
        }
        Object objB = a0VarS.b();
        if (object != null) {
            a0VarS.a(objB, object);
        }
        return objB;
    }

    static N N(Class cls, I i10, P p10, InterfaceC2821z interfaceC2821z, h0 h0Var, AbstractC2810n abstractC2810n, F f10) {
        if (i10 instanceof Y) {
            return P((Y) i10, p10, interfaceC2821z, h0Var, abstractC2810n, f10);
        }
        android.support.v4.media.session.b.a(i10);
        return O(null, p10, interfaceC2821z, h0Var, abstractC2810n, f10);
    }

    static N O(e0 e0Var, P p10, InterfaceC2821z interfaceC2821z, h0 h0Var, AbstractC2810n abstractC2810n, F f10) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static androidx.datastore.preferences.protobuf.N P(androidx.datastore.preferences.protobuf.Y r33, androidx.datastore.preferences.protobuf.P r34, androidx.datastore.preferences.protobuf.InterfaceC2821z r35, androidx.datastore.preferences.protobuf.h0 r36, androidx.datastore.preferences.protobuf.AbstractC2810n r37, androidx.datastore.preferences.protobuf.F r38) {
        /*
            Method dump skipped, instruction units count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.P(androidx.datastore.preferences.protobuf.Y, androidx.datastore.preferences.protobuf.P, androidx.datastore.preferences.protobuf.z, androidx.datastore.preferences.protobuf.h0, androidx.datastore.preferences.protobuf.n, androidx.datastore.preferences.protobuf.F):androidx.datastore.preferences.protobuf.N");
    }

    private int Q(int i10) {
        return this.f29223a[i10];
    }

    private static long R(int i10) {
        return i10 & 1048575;
    }

    private static boolean S(Object obj, long j10) {
        return ((Boolean) k0.z(obj, j10)).booleanValue();
    }

    private static double T(Object obj, long j10) {
        return ((Double) k0.z(obj, j10)).doubleValue();
    }

    private static float U(Object obj, long j10) {
        return ((Float) k0.z(obj, j10)).floatValue();
    }

    private static int V(Object obj, long j10) {
        return ((Integer) k0.z(obj, j10)).intValue();
    }

    private static long W(Object obj, long j10) {
        return ((Long) k0.z(obj, j10)).longValue();
    }

    private int X(int i10) {
        if (i10 < this.f29225c || i10 > this.f29226d) {
            return -1;
        }
        return g0(i10, 0);
    }

    private int Y(int i10) {
        return this.f29223a[i10 + 2];
    }

    private void Z(Object obj, long j10, Z z10, a0 a0Var, C2809m c2809m) {
        z10.N(this.f29236n.c(obj, j10), a0Var, c2809m);
    }

    private void a0(Object obj, int i10, Z z10, a0 a0Var, C2809m c2809m) {
        z10.K(this.f29236n.c(obj, R(i10)), a0Var, c2809m);
    }

    private void b0(Object obj, int i10, Z z10) {
        if (v(i10)) {
            k0.O(obj, R(i10), z10.I());
        } else if (this.f29229g) {
            k0.O(obj, R(i10), z10.z());
        } else {
            k0.O(obj, R(i10), z10.n());
        }
    }

    private void c0(Object obj, int i10, Z z10) {
        if (v(i10)) {
            z10.m(this.f29236n.c(obj, R(i10)));
        } else {
            z10.B(this.f29236n.c(obj, R(i10)));
        }
    }

    private static Field d0(Class cls, String str) {
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

    private void e0(Object obj, int i10) {
        int iY = Y(i10);
        long j10 = 1048575 & iY;
        if (j10 == 1048575) {
            return;
        }
        k0.M(obj, j10, (1 << (iY >>> 20)) | k0.w(obj, j10));
    }

    private void f0(Object obj, int i10, int i11) {
        k0.M(obj, Y(i11) & 1048575, i10);
    }

    private int g0(int i10, int i11) {
        int length = (this.f29223a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iQ = Q(i13);
            if (i10 == iQ) {
                return i13;
            }
            if (i10 < iQ) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private void h0(Object obj, int i10, Object obj2) {
        f29222s.putObject(obj, R(k0(i10)), obj2);
        e0(obj, i10);
    }

    private void i0(Object obj, int i10, int i11, Object obj2) {
        f29222s.putObject(obj, R(k0(i11)), obj2);
        f0(obj, i10, i11);
    }

    private boolean j(Object obj, Object obj2, int i10) {
        return w(obj, i10) == w(obj2, i10);
    }

    private static int j0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private static boolean k(Object obj, long j10) {
        return k0.p(obj, j10);
    }

    private int k0(int i10) {
        return this.f29223a[i10 + 1];
    }

    private static void l(Object obj) {
        if (B(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void l0(java.lang.Object r19, androidx.datastore.preferences.protobuf.n0 r20) {
        /*
            Method dump skipped, instruction units count: 1424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.l0(java.lang.Object, androidx.datastore.preferences.protobuf.n0):void");
    }

    private static double m(Object obj, long j10) {
        return k0.u(obj, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m0(java.lang.Object r11, androidx.datastore.preferences.protobuf.n0 r12) {
        /*
            Method dump skipped, instruction units count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.m0(java.lang.Object, androidx.datastore.preferences.protobuf.n0):void");
    }

    private boolean n(Object obj, Object obj2, int i10) {
        int iK0 = k0(i10);
        long jR = R(iK0);
        switch (j0(iK0)) {
            case 0:
                if (!j(obj, obj2, i10) || Double.doubleToLongBits(k0.u(obj, jR)) != Double.doubleToLongBits(k0.u(obj2, jR))) {
                }
                break;
            case 1:
                if (!j(obj, obj2, i10) || Float.floatToIntBits(k0.v(obj, jR)) != Float.floatToIntBits(k0.v(obj2, jR))) {
                }
                break;
            case 2:
                if (!j(obj, obj2, i10) || k0.x(obj, jR) != k0.x(obj2, jR)) {
                }
                break;
            case 3:
                if (!j(obj, obj2, i10) || k0.x(obj, jR) != k0.x(obj2, jR)) {
                }
                break;
            case 4:
                if (!j(obj, obj2, i10) || k0.w(obj, jR) != k0.w(obj2, jR)) {
                }
                break;
            case 5:
                if (!j(obj, obj2, i10) || k0.x(obj, jR) != k0.x(obj2, jR)) {
                }
                break;
            case 6:
                if (!j(obj, obj2, i10) || k0.w(obj, jR) != k0.w(obj2, jR)) {
                }
                break;
            case 7:
                if (!j(obj, obj2, i10) || k0.p(obj, jR) != k0.p(obj2, jR)) {
                }
                break;
            case 8:
                if (!j(obj, obj2, i10) || !c0.H(k0.z(obj, jR), k0.z(obj2, jR))) {
                }
                break;
            case 9:
                if (!j(obj, obj2, i10) || !c0.H(k0.z(obj, jR), k0.z(obj2, jR))) {
                }
                break;
            case 10:
                if (!j(obj, obj2, i10) || !c0.H(k0.z(obj, jR), k0.z(obj2, jR))) {
                }
                break;
            case 11:
                if (!j(obj, obj2, i10) || k0.w(obj, jR) != k0.w(obj2, jR)) {
                }
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                if (!j(obj, obj2, i10) || k0.w(obj, jR) != k0.w(obj2, jR)) {
                }
                break;
            case 13:
                if (!j(obj, obj2, i10) || k0.w(obj, jR) != k0.w(obj2, jR)) {
                }
                break;
            case 14:
                if (!j(obj, obj2, i10) || k0.x(obj, jR) != k0.x(obj2, jR)) {
                }
                break;
            case 15:
                if (!j(obj, obj2, i10) || k0.w(obj, jR) != k0.w(obj2, jR)) {
                }
                break;
            case 16:
                if (!j(obj, obj2, i10) || k0.x(obj, jR) != k0.x(obj2, jR)) {
                }
                break;
            case 17:
                if (!j(obj, obj2, i10) || !c0.H(k0.z(obj, jR), k0.z(obj2, jR))) {
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
                if (!C(obj, obj2, i10) || !c0.H(k0.z(obj, jR), k0.z(obj2, jR))) {
                }
                break;
        }
        return true;
    }

    private void n0(n0 n0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            n0Var.r(i10, this.f29239q.b(r(i11)), this.f29239q.e(obj));
        }
    }

    private Object o(Object obj, int i10, Object obj2, h0 h0Var, Object obj3) {
        Q(i10);
        if (k0.z(obj, R(k0(i10))) == null) {
            return obj2;
        }
        q(i10);
        return obj2;
    }

    private void o0(int i10, Object obj, n0 n0Var) {
        if (obj instanceof String) {
            n0Var.f(i10, (String) obj);
        } else {
            n0Var.j(i10, (AbstractC2802f) obj);
        }
    }

    private static float p(Object obj, long j10) {
        return k0.v(obj, j10);
    }

    private void p0(h0 h0Var, Object obj, n0 n0Var) {
        h0Var.t(h0Var.g(obj), n0Var);
    }

    private AbstractC2816u.a q(int i10) {
        android.support.v4.media.session.b.a(this.f29224b[((i10 / 3) * 2) + 1]);
        return null;
    }

    private Object r(int i10) {
        return this.f29224b[(i10 / 3) * 2];
    }

    private a0 s(int i10) {
        int i11 = (i10 / 3) * 2;
        a0 a0Var = (a0) this.f29224b[i11];
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0VarC = W.a().c((Class) this.f29224b[i11 + 1]);
        this.f29224b[i11] = a0VarC;
        return a0VarC;
    }

    private int t(h0 h0Var, Object obj) {
        return h0Var.h(h0Var.g(obj));
    }

    private static int u(Object obj, long j10) {
        return k0.w(obj, j10);
    }

    private static boolean v(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean w(Object obj, int i10) {
        boolean zEquals;
        int iY = Y(i10);
        long j10 = 1048575 & iY;
        if (j10 != 1048575) {
            return (k0.w(obj, j10) & (1 << (iY >>> 20))) != 0;
        }
        int iK0 = k0(i10);
        long jR = R(iK0);
        switch (j0(iK0)) {
            case 0:
                return Double.doubleToRawLongBits(k0.u(obj, jR)) != 0;
            case 1:
                return Float.floatToRawIntBits(k0.v(obj, jR)) != 0;
            case 2:
                return k0.x(obj, jR) != 0;
            case 3:
                return k0.x(obj, jR) != 0;
            case 4:
                return k0.w(obj, jR) != 0;
            case 5:
                return k0.x(obj, jR) != 0;
            case 6:
                return k0.w(obj, jR) != 0;
            case 7:
                return k0.p(obj, jR);
            case 8:
                Object objZ = k0.z(obj, jR);
                if (objZ instanceof String) {
                    zEquals = ((String) objZ).isEmpty();
                } else {
                    if (!(objZ instanceof AbstractC2802f)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = AbstractC2802f.f29287b.equals(objZ);
                }
                break;
            case 9:
                return k0.z(obj, jR) != null;
            case 10:
                zEquals = AbstractC2802f.f29287b.equals(k0.z(obj, jR));
                break;
            case 11:
                return k0.w(obj, jR) != 0;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return k0.w(obj, jR) != 0;
            case 13:
                return k0.w(obj, jR) != 0;
            case 14:
                return k0.x(obj, jR) != 0;
            case 15:
                return k0.w(obj, jR) != 0;
            case 16:
                return k0.x(obj, jR) != 0;
            case 17:
                return k0.z(obj, jR) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private boolean x(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? w(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean y(Object obj, int i10, a0 a0Var) {
        return a0Var.d(k0.z(obj, R(i10)));
    }

    private boolean z(Object obj, int i10, int i11) {
        List list = (List) k0.z(obj, R(i10));
        if (list.isEmpty()) {
            return true;
        }
        a0 a0VarS = s(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!a0VarS.d(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public void a(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f29223a.length; i10 += 3) {
            K(obj, obj2, i10);
        }
        c0.F(this.f29237o, obj, obj2);
        if (this.f29228f) {
            c0.D(this.f29238p, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public Object b() {
        return this.f29235m.a(this.f29227e);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // androidx.datastore.preferences.protobuf.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.c(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    @Override // androidx.datastore.preferences.protobuf.a0
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
            int r5 = r14.f29233k
            r6 = 1
            if (r2 >= r5) goto L9b
            int[] r5 = r14.f29232j
            r9 = r5[r2]
            int r5 = r14.Q(r9)
            int r13 = r14.k0(r9)
            int[] r7 = r14.f29223a
            int r8 = r9 + 2
            r7 = r7[r8]
            r8 = r7 & r0
            int r7 = r7 >>> 20
            int r12 = r6 << r7
            if (r8 == r3) goto L32
            if (r8 == r0) goto L2f
            sun.misc.Unsafe r3 = androidx.datastore.preferences.protobuf.N.f29222s
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
            boolean r3 = E(r13)
            r7 = r14
            r8 = r15
            if (r3 == 0) goto L43
            boolean r15 = r7.x(r8, r9, r10, r11, r12)
            if (r15 != 0) goto L43
            return r1
        L43:
            int r15 = j0(r13)
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
            boolean r15 = r14.A(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L6b:
            boolean r15 = r14.D(r8, r5, r9)
            if (r15 == 0) goto L94
            androidx.datastore.preferences.protobuf.a0 r15 = r14.s(r9)
            boolean r15 = y(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L7c:
            boolean r15 = r14.z(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L83:
            boolean r15 = r7.x(r8, r9, r10, r11, r12)
            if (r15 == 0) goto L94
            androidx.datastore.preferences.protobuf.a0 r15 = r14.s(r9)
            boolean r15 = y(r8, r13, r15)
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
            boolean r15 = r7.f29228f
            if (r15 == 0) goto Lae
            androidx.datastore.preferences.protobuf.n r15 = r7.f29238p
            androidx.datastore.preferences.protobuf.q r15 = r15.c(r8)
            boolean r15 = r15.k()
            if (r15 != 0) goto Lae
            return r1
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.d(java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public int e(Object obj) {
        int i10;
        int iF;
        int length = this.f29223a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iK0 = k0(i12);
            int iQ = Q(i12);
            long jR = R(iK0);
            int iHashCode = 37;
            switch (j0(iK0)) {
                case 0:
                    i10 = i11 * 53;
                    iF = AbstractC2816u.f(Double.doubleToLongBits(k0.u(obj, jR)));
                    i11 = i10 + iF;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iF = Float.floatToIntBits(k0.v(obj, jR));
                    i11 = i10 + iF;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iF = AbstractC2816u.f(k0.x(obj, jR));
                    i11 = i10 + iF;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iF = AbstractC2816u.f(k0.x(obj, jR));
                    i11 = i10 + iF;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iF = k0.w(obj, jR);
                    i11 = i10 + iF;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iF = AbstractC2816u.f(k0.x(obj, jR));
                    i11 = i10 + iF;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iF = k0.w(obj, jR);
                    i11 = i10 + iF;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iF = AbstractC2816u.c(k0.p(obj, jR));
                    i11 = i10 + iF;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iF = ((String) k0.z(obj, jR)).hashCode();
                    i11 = i10 + iF;
                    break;
                case 9:
                    Object objZ = k0.z(obj, jR);
                    if (objZ != null) {
                        iHashCode = objZ.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iF = k0.z(obj, jR).hashCode();
                    i11 = i10 + iF;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iF = k0.w(obj, jR);
                    i11 = i10 + iF;
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    i10 = i11 * 53;
                    iF = k0.w(obj, jR);
                    i11 = i10 + iF;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iF = k0.w(obj, jR);
                    i11 = i10 + iF;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iF = AbstractC2816u.f(k0.x(obj, jR));
                    i11 = i10 + iF;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iF = k0.w(obj, jR);
                    i11 = i10 + iF;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iF = AbstractC2816u.f(k0.x(obj, jR));
                    i11 = i10 + iF;
                    break;
                case 17:
                    Object objZ2 = k0.z(obj, jR);
                    if (objZ2 != null) {
                        iHashCode = objZ2.hashCode();
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
                    iF = k0.z(obj, jR).hashCode();
                    i11 = i10 + iF;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iF = k0.z(obj, jR).hashCode();
                    i11 = i10 + iF;
                    break;
                case 51:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC2816u.f(Double.doubleToLongBits(T(obj, jR)));
                        i11 = i10 + iF;
                    }
                    break;
                case 52:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = Float.floatToIntBits(U(obj, jR));
                        i11 = i10 + iF;
                    }
                    break;
                case 53:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC2816u.f(W(obj, jR));
                        i11 = i10 + iF;
                    }
                    break;
                case 54:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC2816u.f(W(obj, jR));
                        i11 = i10 + iF;
                    }
                    break;
                case 55:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(obj, jR);
                        i11 = i10 + iF;
                    }
                    break;
                case 56:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC2816u.f(W(obj, jR));
                        i11 = i10 + iF;
                    }
                    break;
                case 57:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(obj, jR);
                        i11 = i10 + iF;
                    }
                    break;
                case 58:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC2816u.c(S(obj, jR));
                        i11 = i10 + iF;
                    }
                    break;
                case 59:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = ((String) k0.z(obj, jR)).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 60:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = k0.z(obj, jR).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 61:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = k0.z(obj, jR).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 62:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(obj, jR);
                        i11 = i10 + iF;
                    }
                    break;
                case 63:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(obj, jR);
                        i11 = i10 + iF;
                    }
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(obj, jR);
                        i11 = i10 + iF;
                    }
                    break;
                case 65:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC2816u.f(W(obj, jR));
                        i11 = i10 + iF;
                    }
                    break;
                case 66:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(obj, jR);
                        i11 = i10 + iF;
                    }
                    break;
                case 67:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC2816u.f(W(obj, jR));
                        i11 = i10 + iF;
                    }
                    break;
                case 68:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = k0.z(obj, jR).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.f29237o.g(obj).hashCode();
        return this.f29228f ? (iHashCode2 * 53) + this.f29238p.c(obj).hashCode() : iHashCode2;
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public boolean f(Object obj, Object obj2) {
        int length = this.f29223a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!n(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.f29237o.g(obj).equals(this.f29237o.g(obj2))) {
            return false;
        }
        if (this.f29228f) {
            return this.f29238p.c(obj).equals(this.f29238p.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public void g(Object obj, Z z10, C2809m c2809m) throws Throwable {
        c2809m.getClass();
        l(obj);
        G(this.f29237o, this.f29238p, obj, z10, c2809m);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.a0
    public int h(Object obj) {
        int i10;
        int iH;
        int iP;
        int iW;
        int i11;
        int iO;
        int iQ;
        N n10 = this;
        Object obj2 = obj;
        Unsafe unsafe = f29222s;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (i13 < n10.f29223a.length) {
            int iK0 = n10.k0(i13);
            int iJ0 = j0(iK0);
            int iQ2 = n10.Q(i13);
            int i17 = n10.f29223a[i13 + 2];
            int i18 = i17 & i12;
            if (iJ0 <= 17) {
                if (i18 != i16) {
                    i14 = i18 == i12 ? 0 : unsafe.getInt(obj2, i18);
                    i16 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = i15;
            long jR = R(iK0);
            if (iJ0 < r.f29452n0.a() || iJ0 > r.f29424A0.a()) {
                i18 = 0;
            }
            switch (iJ0) {
                case 0:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        iH = AbstractC2805i.h(iQ2, 0.0d);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 1:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC2805i.p(iQ2, 0.0f);
                        i15 = i19 + iP;
                        n10 = this;
                        obj2 = obj;
                    }
                    n10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 2:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC2805i.w(iQ2, unsafe.getLong(obj2, jR));
                        i15 = i19 + iW;
                        n10 = this;
                    }
                    n10 = this;
                    i15 = i19;
                    break;
                case 3:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC2805i.R(iQ2, unsafe.getLong(obj2, jR));
                        i15 = i19 + iW;
                        n10 = this;
                    }
                    n10 = this;
                    i15 = i19;
                    break;
                case 4:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC2805i.u(iQ2, unsafe.getInt(obj2, jR));
                        i15 = i19 + iW;
                        n10 = this;
                    }
                    n10 = this;
                    i15 = i19;
                    break;
                case 5:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC2805i.n(iQ2, 0L);
                        i15 = i19 + iP;
                        n10 = this;
                        obj2 = obj;
                    }
                    n10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 6:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC2805i.l(iQ2, 0);
                        i15 = i19 + iP;
                        n10 = this;
                        obj2 = obj;
                    }
                    n10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 7:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC2805i.c(iQ2, true);
                        i15 = i19 + iP;
                        n10 = this;
                        obj2 = obj;
                    }
                    n10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 8:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        Object object = unsafe.getObject(obj2, jR);
                        iW = object instanceof AbstractC2802f ? AbstractC2805i.f(iQ2, (AbstractC2802f) object) : AbstractC2805i.M(iQ2, (String) object);
                        i15 = i19 + iW;
                        n10 = this;
                    }
                    n10 = this;
                    i15 = i19;
                    break;
                case 9:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        iH = c0.o(iQ2, unsafe.getObject(obj2, jR), n10.s(i13));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 10:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC2805i.f(iQ2, (AbstractC2802f) unsafe.getObject(obj2, jR));
                        i15 = i19 + iW;
                        n10 = this;
                    }
                    n10 = this;
                    i15 = i19;
                    break;
                case 11:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC2805i.P(iQ2, unsafe.getInt(obj2, jR));
                        i15 = i19 + iW;
                        n10 = this;
                    }
                    n10 = this;
                    i15 = i19;
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC2805i.j(iQ2, unsafe.getInt(obj2, jR));
                        i15 = i19 + iW;
                        n10 = this;
                    }
                    n10 = this;
                    i15 = i19;
                    break;
                case 13:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC2805i.E(iQ2, 0);
                        i15 = i19 + iP;
                        n10 = this;
                        obj2 = obj;
                    }
                    n10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 14:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC2805i.G(iQ2, 0L);
                        i15 = i19 + iP;
                        n10 = this;
                        obj2 = obj;
                    }
                    n10 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 15:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC2805i.I(iQ2, unsafe.getInt(obj2, jR));
                        i15 = i19 + iW;
                        n10 = this;
                    }
                    n10 = this;
                    i15 = i19;
                    break;
                case 16:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC2805i.K(iQ2, unsafe.getLong(obj2, jR));
                        i15 = i19 + iW;
                        n10 = this;
                    }
                    n10 = this;
                    i15 = i19;
                    break;
                case 17:
                    if (n10.x(obj2, i13, i16, i14, i10)) {
                        iH = AbstractC2805i.r(iQ2, (K) unsafe.getObject(obj2, jR), n10.s(i13));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 18:
                    iH = c0.h(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 19:
                    iH = c0.f(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 20:
                    iH = c0.m(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 21:
                    iH = c0.x(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 22:
                    iH = c0.k(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 23:
                    iH = c0.h(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                    iH = c0.f(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 25:
                    iH = c0.a(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 26:
                    iH = c0.u(iQ2, (List) unsafe.getObject(obj2, jR));
                    i15 = i19 + iH;
                    break;
                case 27:
                    iH = c0.p(iQ2, (List) unsafe.getObject(obj2, jR), n10.s(i13));
                    i15 = i19 + iH;
                    break;
                case 28:
                    iH = c0.c(iQ2, (List) unsafe.getObject(obj2, jR));
                    i15 = i19 + iH;
                    break;
                case 29:
                    iH = c0.v(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 30:
                    iH = c0.d(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                    iH = c0.f(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 32:
                    iH = c0.h(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 33:
                    iH = c0.q(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 34:
                    iH = c0.s(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 35:
                    i11 = c0.i((List) unsafe.getObject(obj2, jR));
                    if (i11 > 0) {
                        if (n10.f29231i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC2805i.O(iQ2);
                        iQ = AbstractC2805i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 36:
                    i11 = c0.g((List) unsafe.getObject(obj2, jR));
                    if (i11 > 0) {
                        if (n10.f29231i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC2805i.O(iQ2);
                        iQ = AbstractC2805i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 37:
                    i11 = c0.n((List) unsafe.getObject(obj2, jR));
                    if (i11 > 0) {
                        if (n10.f29231i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC2805i.O(iQ2);
                        iQ = AbstractC2805i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 38:
                    i11 = c0.y((List) unsafe.getObject(obj2, jR));
                    if (i11 > 0) {
                        if (n10.f29231i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC2805i.O(iQ2);
                        iQ = AbstractC2805i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 39:
                    i11 = c0.l((List) unsafe.getObject(obj2, jR));
                    if (i11 > 0) {
                        if (n10.f29231i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC2805i.O(iQ2);
                        iQ = AbstractC2805i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 40:
                    i11 = c0.i((List) unsafe.getObject(obj2, jR));
                    if (i11 > 0) {
                        if (n10.f29231i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC2805i.O(iQ2);
                        iQ = AbstractC2805i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 41:
                    i11 = c0.g((List) unsafe.getObject(obj2, jR));
                    if (i11 > 0) {
                        if (n10.f29231i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC2805i.O(iQ2);
                        iQ = AbstractC2805i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 42:
                    i11 = c0.b((List) unsafe.getObject(obj2, jR));
                    if (i11 > 0) {
                        if (n10.f29231i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC2805i.O(iQ2);
                        iQ = AbstractC2805i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 43:
                    i11 = c0.w((List) unsafe.getObject(obj2, jR));
                    if (i11 > 0) {
                        if (n10.f29231i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC2805i.O(iQ2);
                        iQ = AbstractC2805i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 44:
                    i11 = c0.e((List) unsafe.getObject(obj2, jR));
                    if (i11 > 0) {
                        if (n10.f29231i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC2805i.O(iQ2);
                        iQ = AbstractC2805i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 45:
                    i11 = c0.g((List) unsafe.getObject(obj2, jR));
                    if (i11 > 0) {
                        if (n10.f29231i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC2805i.O(iQ2);
                        iQ = AbstractC2805i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 46:
                    i11 = c0.i((List) unsafe.getObject(obj2, jR));
                    if (i11 > 0) {
                        if (n10.f29231i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC2805i.O(iQ2);
                        iQ = AbstractC2805i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 47:
                    i11 = c0.r((List) unsafe.getObject(obj2, jR));
                    if (i11 > 0) {
                        if (n10.f29231i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC2805i.O(iQ2);
                        iQ = AbstractC2805i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case 48:
                    i11 = c0.t((List) unsafe.getObject(obj2, jR));
                    if (i11 > 0) {
                        if (n10.f29231i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC2805i.O(iQ2);
                        iQ = AbstractC2805i.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    i15 = i19;
                    break;
                case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                    iH = c0.j(iQ2, (List) unsafe.getObject(obj2, jR), n10.s(i13));
                    i15 = i19 + iH;
                    break;
                case 50:
                    iH = n10.f29239q.h(iQ2, unsafe.getObject(obj2, jR), n10.r(i13));
                    i15 = i19 + iH;
                    break;
                case 51:
                    if (n10.D(obj2, iQ2, i13)) {
                        iH = AbstractC2805i.h(iQ2, 0.0d);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 52:
                    if (n10.D(obj2, iQ2, i13)) {
                        iH = AbstractC2805i.p(iQ2, 0.0f);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 53:
                    if (n10.D(obj2, iQ2, i13)) {
                        iH = AbstractC2805i.w(iQ2, W(obj2, jR));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 54:
                    if (n10.D(obj2, iQ2, i13)) {
                        iH = AbstractC2805i.R(iQ2, W(obj2, jR));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 55:
                    if (n10.D(obj2, iQ2, i13)) {
                        iH = AbstractC2805i.u(iQ2, V(obj2, jR));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 56:
                    if (n10.D(obj2, iQ2, i13)) {
                        iH = AbstractC2805i.n(iQ2, 0L);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 57:
                    if (n10.D(obj2, iQ2, i13)) {
                        iH = AbstractC2805i.l(iQ2, 0);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 58:
                    if (n10.D(obj2, iQ2, i13)) {
                        iH = AbstractC2805i.c(iQ2, true);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 59:
                    if (n10.D(obj2, iQ2, i13)) {
                        Object object2 = unsafe.getObject(obj2, jR);
                        iH = object2 instanceof AbstractC2802f ? AbstractC2805i.f(iQ2, (AbstractC2802f) object2) : AbstractC2805i.M(iQ2, (String) object2);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 60:
                    if (n10.D(obj2, iQ2, i13)) {
                        iH = c0.o(iQ2, unsafe.getObject(obj2, jR), n10.s(i13));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 61:
                    if (n10.D(obj2, iQ2, i13)) {
                        iH = AbstractC2805i.f(iQ2, (AbstractC2802f) unsafe.getObject(obj2, jR));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 62:
                    if (n10.D(obj2, iQ2, i13)) {
                        iH = AbstractC2805i.P(iQ2, V(obj2, jR));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 63:
                    if (n10.D(obj2, iQ2, i13)) {
                        iH = AbstractC2805i.j(iQ2, V(obj2, jR));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                    if (n10.D(obj2, iQ2, i13)) {
                        iH = AbstractC2805i.E(iQ2, 0);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 65:
                    if (n10.D(obj2, iQ2, i13)) {
                        iH = AbstractC2805i.G(iQ2, 0L);
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 66:
                    if (n10.D(obj2, iQ2, i13)) {
                        iH = AbstractC2805i.I(iQ2, V(obj2, jR));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 67:
                    if (n10.D(obj2, iQ2, i13)) {
                        iH = AbstractC2805i.K(iQ2, W(obj2, jR));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                case 68:
                    if (n10.D(obj2, iQ2, i13)) {
                        iH = AbstractC2805i.r(iQ2, (K) unsafe.getObject(obj2, jR), n10.s(i13));
                        i15 = i19 + iH;
                    }
                    i15 = i19;
                    break;
                default:
                    i15 = i19;
                    break;
            }
            i13 += 3;
            i12 = 1048575;
        }
        int iT = i15 + n10.t(n10.f29237o, obj2);
        return n10.f29228f ? iT + n10.f29238p.c(obj2).h() : iT;
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public void i(Object obj, n0 n0Var) {
        if (n0Var.y() == n0.a.DESCENDING) {
            m0(obj, n0Var);
        } else {
            l0(obj, n0Var);
        }
    }
}
