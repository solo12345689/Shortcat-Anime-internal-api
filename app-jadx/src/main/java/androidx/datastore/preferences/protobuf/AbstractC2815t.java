package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2797a;
import androidx.datastore.preferences.protobuf.AbstractC2816u;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2815t extends AbstractC2797a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC2815t> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected i0 unknownFields = i0.c();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a extends AbstractC2797a.AbstractC0501a {

        /* JADX INFO: renamed from: a */
        private final AbstractC2815t f29491a;

        /* JADX INFO: renamed from: b */
        protected AbstractC2815t f29492b;

        protected a(AbstractC2815t abstractC2815t) {
            this.f29491a = abstractC2815t;
            if (abstractC2815t.C()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f29492b = r();
        }

        private static void q(Object obj, Object obj2) {
            W.a().d(obj).a(obj, obj2);
        }

        private AbstractC2815t r() {
            return this.f29491a.I();
        }

        public final AbstractC2815t i() {
            AbstractC2815t abstractC2815tW = w();
            if (abstractC2815tW.A()) {
                return abstractC2815tW;
            }
            throw AbstractC2797a.AbstractC0501a.h(abstractC2815tW);
        }

        @Override // androidx.datastore.preferences.protobuf.K.a
        /* JADX INFO: renamed from: j */
        public AbstractC2815t w() {
            if (!this.f29492b.C()) {
                return this.f29492b;
            }
            this.f29492b.D();
            return this.f29492b;
        }

        /* JADX INFO: renamed from: k */
        public a clone() {
            a aVarA = c().a();
            aVarA.f29492b = w();
            return aVarA;
        }

        protected final void m() {
            if (this.f29492b.C()) {
                return;
            }
            n();
        }

        protected void n() {
            AbstractC2815t abstractC2815tR = r();
            q(abstractC2815tR, this.f29492b);
            this.f29492b = abstractC2815tR;
        }

        @Override // androidx.datastore.preferences.protobuf.L
        /* JADX INFO: renamed from: p */
        public AbstractC2815t c() {
            return this.f29491a;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static class b extends AbstractC2798b {

        /* JADX INFO: renamed from: b */
        private final AbstractC2815t f29493b;

        public b(AbstractC2815t abstractC2815t) {
            this.f29493b = abstractC2815t;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c extends AbstractC2807k {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static final boolean B(AbstractC2815t abstractC2815t, boolean z10) {
        byte bByteValue = ((Byte) abstractC2815t.p(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = W.a().d(abstractC2815t).d(abstractC2815t);
        if (z10) {
            abstractC2815t.q(d.SET_MEMOIZED_IS_INITIALIZED, zD ? abstractC2815t : null);
        }
        return zD;
    }

    protected static AbstractC2816u.b F(AbstractC2816u.b bVar) {
        int size = bVar.size();
        return bVar.E(size == 0 ? 10 : size * 2);
    }

    protected static Object H(K k10, String str, Object[] objArr) {
        return new Y(k10, str, objArr);
    }

    protected static AbstractC2815t J(AbstractC2815t abstractC2815t, InputStream inputStream) {
        return j(K(abstractC2815t, AbstractC2803g.g(inputStream), C2809m.b()));
    }

    static AbstractC2815t K(AbstractC2815t abstractC2815t, AbstractC2803g abstractC2803g, C2809m c2809m) throws C2817v {
        AbstractC2815t abstractC2815tI = abstractC2815t.I();
        try {
            a0 a0VarD = W.a().d(abstractC2815tI);
            a0VarD.g(abstractC2815tI, C2804h.O(abstractC2803g), c2809m);
            a0VarD.c(abstractC2815tI);
            return abstractC2815tI;
        } catch (g0 e10) {
            throw e10.a().k(abstractC2815tI);
        } catch (C2817v e11) {
            e = e11;
            if (e.a()) {
                e = new C2817v(e);
            }
            throw e.k(abstractC2815tI);
        } catch (IOException e12) {
            if (e12.getCause() instanceof C2817v) {
                throw ((C2817v) e12.getCause());
            }
            throw new C2817v(e12).k(abstractC2815tI);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C2817v) {
                throw ((C2817v) e13.getCause());
            }
            throw e13;
        }
    }

    protected static void L(Class cls, AbstractC2815t abstractC2815t) {
        abstractC2815t.E();
        defaultInstanceMap.put(cls, abstractC2815t);
    }

    private static AbstractC2815t j(AbstractC2815t abstractC2815t) throws C2817v {
        if (abstractC2815t == null || abstractC2815t.A()) {
            return abstractC2815t;
        }
        throw abstractC2815t.g().a().k(abstractC2815t);
    }

    private int n(a0 a0Var) {
        return a0Var == null ? W.a().d(this).h(this) : a0Var.h(this);
    }

    protected static AbstractC2816u.b s() {
        return X.d();
    }

    static AbstractC2815t t(Class cls) {
        AbstractC2815t abstractC2815t = defaultInstanceMap.get(cls);
        if (abstractC2815t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2815t = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2815t != null) {
            return abstractC2815t;
        }
        AbstractC2815t abstractC2815tC = ((AbstractC2815t) k0.i(cls)).c();
        if (abstractC2815tC == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC2815tC);
        return abstractC2815tC;
    }

    static Object z(Method method, Object obj, Object... objArr) {
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

    public final boolean A() {
        return B(this, true);
    }

    boolean C() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    protected void D() {
        W.a().d(this).c(this);
        E();
    }

    void E() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    /* JADX INFO: renamed from: G */
    public final a a() {
        return (a) p(d.NEW_BUILDER);
    }

    AbstractC2815t I() {
        return (AbstractC2815t) p(d.NEW_MUTABLE_INSTANCE);
    }

    void M(int i10) {
        this.memoizedHashCode = i10;
    }

    void N(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public int d() {
        return f(null);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public void e(AbstractC2805i abstractC2805i) {
        W.a().d(this).i(this, C2806j.P(abstractC2805i));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return W.a().d(this).f(this, (AbstractC2815t) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2797a
    int f(a0 a0Var) {
        if (!C()) {
            if (x() != Integer.MAX_VALUE) {
                return x();
            }
            int iN = n(a0Var);
            N(iN);
            return iN;
        }
        int iN2 = n(a0Var);
        if (iN2 >= 0) {
            return iN2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iN2);
    }

    public int hashCode() {
        if (C()) {
            return m();
        }
        if (y()) {
            M(m());
        }
        return v();
    }

    Object i() {
        return p(d.BUILD_MESSAGE_INFO);
    }

    void k() {
        this.memoizedHashCode = 0;
    }

    void l() {
        N(Integer.MAX_VALUE);
    }

    int m() {
        return W.a().d(this).e(this);
    }

    protected final a o() {
        return (a) p(d.NEW_BUILDER);
    }

    protected Object p(d dVar) {
        return r(dVar, null, null);
    }

    protected Object q(d dVar, Object obj) {
        return r(dVar, obj, null);
    }

    protected abstract Object r(d dVar, Object obj, Object obj2);

    public String toString() {
        return M.f(this, super.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.L
    /* JADX INFO: renamed from: u */
    public final AbstractC2815t c() {
        return (AbstractC2815t) p(d.GET_DEFAULT_INSTANCE);
    }

    int v() {
        return this.memoizedHashCode;
    }

    int x() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    boolean y() {
        return v() == 0;
    }
}
