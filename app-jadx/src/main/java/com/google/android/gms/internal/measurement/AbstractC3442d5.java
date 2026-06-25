package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d5 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3442d5 extends AbstractC3593u4 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected C3425b6 zzc = C3425b6.a();

    private static final boolean A(AbstractC3442d5 abstractC3442d5, boolean z10) {
        byte bByteValue = ((Byte) abstractC3442d5.B(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = M5.a().b(abstractC3442d5.getClass()).c(abstractC3442d5);
        if (z10) {
            abstractC3442d5.B(2, true != zC ? null : abstractC3442d5, null);
        }
        return zC;
    }

    private final int h(P5 p52) {
        return M5.a().b(getClass()).a(this);
    }

    static AbstractC3442d5 r(Class cls) {
        Map map = zzd;
        AbstractC3442d5 abstractC3442d5 = (AbstractC3442d5) map.get(cls);
        if (abstractC3442d5 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC3442d5 = (AbstractC3442d5) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC3442d5 != null) {
            return abstractC3442d5;
        }
        AbstractC3442d5 abstractC3442d52 = (AbstractC3442d5) ((AbstractC3442d5) AbstractC3479h6.h(cls)).B(6, null, null);
        if (abstractC3442d52 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC3442d52);
        return abstractC3442d52;
    }

    protected static void s(Class cls, AbstractC3442d5 abstractC3442d5) {
        abstractC3442d5.k();
        zzd.put(cls, abstractC3442d5);
    }

    protected static Object t(E5 e52, String str, Object[] objArr) {
        return new O5(e52, str, objArr);
    }

    static Object u(Method method, Object obj, Object... objArr) {
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

    protected static InterfaceC3478h5 v() {
        return C3451e5.c();
    }

    protected static InterfaceC3487i5 w() {
        return C3576s5.c();
    }

    protected static InterfaceC3487i5 x(InterfaceC3487i5 interfaceC3487i5) {
        int size = interfaceC3487i5.size();
        return interfaceC3487i5.M0(size + size);
    }

    protected static InterfaceC3496j5 y() {
        return N5.c();
    }

    protected static InterfaceC3496j5 z(InterfaceC3496j5 interfaceC3496j5) {
        int size = interfaceC3496j5.size();
        return interfaceC3496j5.M0(size + size);
    }

    protected abstract Object B(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.E5
    public final int a() {
        if (j()) {
            int iH = h(null);
            if (iH >= 0) {
                return iH;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iH).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iH);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iH2 = h(null);
        if (iH2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iH2;
            return iH2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iH2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iH2);
        throw new IllegalStateException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final void c(N4 n42) {
        M5.a().b(getClass()).h(this, O4.L(n42));
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final /* synthetic */ D5 d() {
        return (AbstractC3424b5) B(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final /* synthetic */ E5 e() {
        return (AbstractC3442d5) B(6, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return M5.a().b(getClass()).i(this, (AbstractC3442d5) obj);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3593u4
    final int f(P5 p52) {
        if (j()) {
            int iA = p52.a(this);
            if (iA >= 0) {
                return iA;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iA).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iA);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iA2 = p52.a(this);
        if (iA2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iA2;
            return iA2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iA2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iA2);
        throw new IllegalStateException(sb3.toString());
    }

    public final int hashCode() {
        if (j()) {
            return m();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iM = m();
        this.zza = iM;
        return iM;
    }

    public final boolean i() {
        return A(this, true);
    }

    final boolean j() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    final void k() {
        this.zzb &= Integer.MAX_VALUE;
    }

    final AbstractC3442d5 l() {
        return (AbstractC3442d5) B(4, null, null);
    }

    final int m() {
        return M5.a().b(getClass()).d(this);
    }

    protected final void n() {
        M5.a().b(getClass()).f(this);
        k();
    }

    protected final AbstractC3424b5 o() {
        return (AbstractC3424b5) B(5, null, null);
    }

    public final AbstractC3424b5 p() {
        AbstractC3424b5 abstractC3424b5 = (AbstractC3424b5) B(5, null, null);
        abstractC3424b5.r(this);
        return abstractC3424b5;
    }

    final void q(int i10) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        return G5.a(this, super.toString());
    }
}
