package xa;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import xa.AbstractC7075a;
import xa.AbstractC7091q;

/* JADX INFO: renamed from: xa.p */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7090p extends AbstractC7075a {

    /* JADX INFO: renamed from: d */
    private static Map f64245d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    private int f64246b = -1;

    /* JADX INFO: renamed from: c */
    protected Z f64247c = Z.c();

    /* JADX INFO: renamed from: xa.p$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a extends AbstractC7075a.AbstractC0965a {

        /* JADX INFO: renamed from: a */
        private final AbstractC7090p f64248a;

        /* JADX INFO: renamed from: b */
        protected AbstractC7090p f64249b;

        protected a(AbstractC7090p abstractC7090p) {
            this.f64248a = abstractC7090p;
            if (abstractC7090p.t()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f64249b = g();
        }

        private AbstractC7090p g() {
            return this.f64248a.z();
        }

        @Override // xa.InterfaceC7070D.a
        /* JADX INFO: renamed from: d */
        public AbstractC7090p w() {
            if (!this.f64249b.t()) {
                return this.f64249b;
            }
            this.f64249b.u();
            return this.f64249b;
        }

        /* JADX INFO: renamed from: e */
        public a clone() {
            a aVarA = c().a();
            aVarA.f64249b = w();
            return aVarA;
        }

        @Override // xa.InterfaceC7071E
        /* JADX INFO: renamed from: f */
        public AbstractC7090p c() {
            return this.f64248a;
        }
    }

    /* JADX INFO: renamed from: xa.p$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static class b extends AbstractC7076b {

        /* JADX INFO: renamed from: b */
        private final AbstractC7090p f64250b;

        public b(AbstractC7090p abstractC7090p) {
            this.f64250b = abstractC7090p;
        }
    }

    /* JADX INFO: renamed from: xa.p$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c extends AbstractC7082h {
    }

    /* JADX INFO: renamed from: xa.p$d */
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

    protected static AbstractC7090p A(AbstractC7090p abstractC7090p, InputStream inputStream) {
        return e(B(abstractC7090p, AbstractC7080f.g(inputStream), C7084j.b()));
    }

    static AbstractC7090p B(AbstractC7090p abstractC7090p, AbstractC7080f abstractC7080f, C7084j c7084j) throws r {
        AbstractC7090p abstractC7090pZ = abstractC7090p.z();
        try {
            S sD = N.a().d(abstractC7090pZ);
            sD.g(abstractC7090pZ, C7081g.O(abstractC7080f), c7084j);
            sD.c(abstractC7090pZ);
            return abstractC7090pZ;
        } catch (r e10) {
            e = e10;
            if (e.a()) {
                e = new r(e);
            }
            throw e.k(abstractC7090pZ);
        } catch (IOException e11) {
            if (e11.getCause() instanceof r) {
                throw ((r) e11.getCause());
            }
            throw new r(e11).k(abstractC7090pZ);
        } catch (X e12) {
            throw e12.a().k(abstractC7090pZ);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof r) {
                throw ((r) e13.getCause());
            }
            throw e13;
        }
    }

    protected static void C(Class cls, AbstractC7090p abstractC7090p) {
        abstractC7090p.v();
        f64245d.put(cls, abstractC7090p);
    }

    private static AbstractC7090p e(AbstractC7090p abstractC7090p) throws r {
        if (abstractC7090p == null || abstractC7090p.r()) {
            return abstractC7090p;
        }
        throw abstractC7090p.b().a().k(abstractC7090p);
    }

    protected static AbstractC7091q.b l() {
        return O.d();
    }

    static AbstractC7090p m(Class cls) {
        AbstractC7090p abstractC7090p = (AbstractC7090p) f64245d.get(cls);
        if (abstractC7090p == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC7090p = (AbstractC7090p) f64245d.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC7090p != null) {
            return abstractC7090p;
        }
        AbstractC7090p abstractC7090pC = ((AbstractC7090p) c0.i(cls)).c();
        if (abstractC7090pC == null) {
            throw new IllegalStateException();
        }
        f64245d.put(cls, abstractC7090pC);
        return abstractC7090pC;
    }

    static Object q(Method method, Object obj, Object... objArr) {
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

    protected static final boolean s(AbstractC7090p abstractC7090p, boolean z10) {
        byte bByteValue = ((Byte) abstractC7090p.i(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = N.a().d(abstractC7090p).d(abstractC7090p);
        if (z10) {
            abstractC7090p.j(d.SET_MEMOIZED_IS_INITIALIZED, zD ? abstractC7090p : null);
        }
        return zD;
    }

    protected static Object y(InterfaceC7070D interfaceC7070D, String str, Object[] objArr) {
        return new P(interfaceC7070D, str, objArr);
    }

    void D(int i10) {
        this.f64124a = i10;
    }

    void E(int i10) {
        if (i10 >= 0) {
            this.f64246b = (i10 & Integer.MAX_VALUE) | (this.f64246b & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    Object d() {
        return i(d.BUILD_MESSAGE_INFO);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return N.a().d(this).f(this, (AbstractC7090p) obj);
        }
        return false;
    }

    void f() {
        this.f64124a = 0;
    }

    void g() {
        E(Integer.MAX_VALUE);
    }

    int h() {
        return N.a().d(this).e(this);
    }

    public int hashCode() {
        if (t()) {
            return h();
        }
        if (p()) {
            D(h());
        }
        return o();
    }

    protected Object i(d dVar) {
        return k(dVar, null, null);
    }

    protected Object j(d dVar, Object obj) {
        return k(dVar, obj, null);
    }

    protected abstract Object k(d dVar, Object obj, Object obj2);

    @Override // xa.InterfaceC7071E
    /* JADX INFO: renamed from: n */
    public final AbstractC7090p c() {
        return (AbstractC7090p) i(d.GET_DEFAULT_INSTANCE);
    }

    int o() {
        return this.f64124a;
    }

    boolean p() {
        return o() == 0;
    }

    public final boolean r() {
        return s(this, true);
    }

    boolean t() {
        return (this.f64246b & Integer.MIN_VALUE) != 0;
    }

    public String toString() {
        return AbstractC7072F.f(this, super.toString());
    }

    protected void u() {
        N.a().d(this).c(this);
        v();
    }

    void v() {
        this.f64246b &= Integer.MAX_VALUE;
    }

    @Override // xa.InterfaceC7070D
    /* JADX INFO: renamed from: x */
    public final a a() {
        return (a) i(d.NEW_BUILDER);
    }

    AbstractC7090p z() {
        return (AbstractC7090p) i(d.NEW_MUTABLE_INSTANCE);
    }
}
