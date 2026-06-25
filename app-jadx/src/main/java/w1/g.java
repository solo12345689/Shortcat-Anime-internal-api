package W1;

import androidx.datastore.preferences.protobuf.AbstractC2797a;
import androidx.datastore.preferences.protobuf.AbstractC2815t;
import androidx.datastore.preferences.protobuf.AbstractC2816u;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.T;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC2815t implements L {
    private static final g DEFAULT_INSTANCE;
    private static volatile T PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC2816u.b strings_ = AbstractC2815t.s();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC2815t.a implements L {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a s(Iterable iterable) {
            m();
            ((g) this.f29492b).Q(iterable);
            return this;
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC2815t.L(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(Iterable iterable) {
        R();
        AbstractC2797a.b(iterable, this.strings_);
    }

    private void R() {
        AbstractC2816u.b bVar = this.strings_;
        if (bVar.C()) {
            return;
        }
        this.strings_ = AbstractC2815t.F(bVar);
    }

    public static g S() {
        return DEFAULT_INSTANCE;
    }

    public static a U() {
        return (a) DEFAULT_INSTANCE.o();
    }

    public List T() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2815t
    protected final Object r(AbstractC2815t.d dVar, Object obj, Object obj2) {
        T bVar;
        e eVar = null;
        switch (e.f20623a[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC2815t.H(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t10 = PARSER;
                if (t10 != null) {
                    return t10;
                }
                synchronized (g.class) {
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
