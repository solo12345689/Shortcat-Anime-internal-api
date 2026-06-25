package W1;

import androidx.datastore.preferences.protobuf.AbstractC2815t;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.E;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.m0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC2815t implements L {
    private static final f DEFAULT_INSTANCE;
    private static volatile T PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private E preferences_ = E.f();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC2815t.a implements L {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a s(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            m();
            ((f) this.f29492b).Q().put(str, hVar);
            return this;
        }

        private a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final D f20624a = D.d(m0.b.f29388k, "", m0.b.f29390m, h.Z());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC2815t.L(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map Q() {
        return S();
    }

    private E S() {
        if (!this.preferences_.j()) {
            this.preferences_ = this.preferences_.p();
        }
        return this.preferences_;
    }

    private E T() {
        return this.preferences_;
    }

    public static a U() {
        return (a) DEFAULT_INSTANCE.o();
    }

    public static f V(InputStream inputStream) {
        return (f) AbstractC2815t.J(DEFAULT_INSTANCE, inputStream);
    }

    public Map R() {
        return Collections.unmodifiableMap(T());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2815t
    protected final Object r(AbstractC2815t.d dVar, Object obj, Object obj2) {
        T bVar;
        e eVar = null;
        switch (e.f20623a[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC2815t.H(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f20624a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t10 = PARSER;
                if (t10 != null) {
                    return t10;
                }
                synchronized (f.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC2815t.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
