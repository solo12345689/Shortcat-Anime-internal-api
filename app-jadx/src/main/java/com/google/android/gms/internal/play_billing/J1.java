package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class J1 extends AbstractC3640a1 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C3749w2 zzc = C3749w2.c();

    private static final boolean h(J1 j12, boolean z10) {
        byte bByteValue = ((Byte) j12.i(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = C3701m2.a().b(j12.getClass()).c(j12);
        if (z10) {
            j12.i(2, true != zC ? null : j12, null);
        }
        return zC;
    }

    private final int j(InterfaceC3716p2 interfaceC3716p2) {
        return C3701m2.a().b(getClass()).b(this);
    }

    private static J1 k(J1 j12, byte[] bArr, int i10, int i11, C3760z1 c3760z1) throws R1 {
        if (i11 == 0) {
            return j12;
        }
        J1 j1R = j12.r();
        try {
            InterfaceC3716p2 interfaceC3716p2B = C3701m2.a().b(j1R.getClass());
            interfaceC3716p2B.h(j1R, bArr, 0, i11, new C3655d1(c3760z1));
            interfaceC3716p2B.e(j1R);
            return j1R;
        } catch (R1 e10) {
            throw e10;
        } catch (C3740u2 e11) {
            throw e11.a();
        } catch (IOException e12) {
            if (e12.getCause() instanceof R1) {
                throw ((R1) e12.getCause());
            }
            throw new R1(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new R1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    static J1 q(Class cls) {
        Map map = zzb;
        J1 j12 = (J1) map.get(cls);
        if (j12 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                j12 = (J1) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (j12 != null) {
            return j12;
        }
        J1 j13 = (J1) ((J1) C2.j(cls)).i(6, null, null);
        if (j13 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, j13);
        return j13;
    }

    protected static J1 s(J1 j12, byte[] bArr, C3760z1 c3760z1) throws R1 {
        J1 j1K = k(j12, bArr, 0, bArr.length, c3760z1);
        if (j1K == null || h(j1K, true)) {
            return j1K;
        }
        throw new C3740u2(j1K).a();
    }

    protected static N1 t() {
        return K1.d();
    }

    protected static O1 u() {
        return C3706n2.c();
    }

    static Object v(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object w(InterfaceC3666f2 interfaceC3666f2, String str, Object[] objArr) {
        return new C3711o2(interfaceC3666f2, str, objArr);
    }

    protected static void z(Class cls, J1 j12) {
        j12.y();
        zzb.put(cls, j12);
    }

    final void A(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    final boolean B() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3671g2
    public final /* synthetic */ InterfaceC3666f2 a() {
        return (J1) i(6, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3666f2
    public final int c() {
        if (B()) {
            int iJ = j(null);
            if (iJ >= 0) {
                return iJ;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iJ);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iJ2 = j(null);
        if (iJ2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iJ2;
            return iJ2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iJ2);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3666f2
    public final void d(AbstractC3744v1 abstractC3744v1) {
        C3701m2.a().b(getClass()).d(this, C3748w1.K(abstractC3744v1));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3640a1
    final int e(InterfaceC3716p2 interfaceC3716p2) {
        if (B()) {
            int iB = interfaceC3716p2.b(this);
            if (iB >= 0) {
                return iB;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iB);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iB2 = interfaceC3716p2.b(this);
        if (iB2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iB2;
            return iB2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iB2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C3701m2.a().b(getClass()).g(this, (J1) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3666f2
    public final /* synthetic */ InterfaceC3661e2 f() {
        return (H1) i(5, null, null);
    }

    public final int hashCode() {
        if (B()) {
            return l();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iL = l();
        this.zza = iL;
        return iL;
    }

    protected abstract Object i(int i10, Object obj, Object obj2);

    final int l() {
        return C3701m2.a().b(getClass()).a(this);
    }

    public final boolean m() {
        return h(this, true);
    }

    protected final H1 n() {
        return (H1) i(5, null, null);
    }

    public final H1 p() {
        H1 h12 = (H1) i(5, null, null);
        h12.h(this);
        return h12;
    }

    final J1 r() {
        return (J1) i(4, null, null);
    }

    public final String toString() {
        return AbstractC3676h2.a(this, super.toString());
    }

    protected final void x() {
        C3701m2.a().b(getClass()).e(this);
        y();
    }

    final void y() {
        this.zzd &= Integer.MAX_VALUE;
    }
}
