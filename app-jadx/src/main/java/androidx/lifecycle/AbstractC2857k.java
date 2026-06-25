package androidx.lifecycle;

import Jf.AbstractC1744g;
import androidx.lifecycle.AbstractC2857k;
import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: androidx.lifecycle.k */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2857k {
    private C2848b internalScopeRef = new C2848b(null);

    /* JADX INFO: renamed from: androidx.lifecycle.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends Enum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final C0517a Companion;
        public static final a ON_CREATE = new a("ON_CREATE", 0);
        public static final a ON_START = new a("ON_START", 1);
        public static final a ON_RESUME = new a("ON_RESUME", 2);
        public static final a ON_PAUSE = new a("ON_PAUSE", 3);
        public static final a ON_STOP = new a("ON_STOP", 4);
        public static final a ON_DESTROY = new a("ON_DESTROY", 5);
        public static final a ON_ANY = new a("ON_ANY", 6);

        /* JADX INFO: renamed from: androidx.lifecycle.k$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0517a {

            /* JADX INFO: renamed from: androidx.lifecycle.k$a$a$a */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public /* synthetic */ class C0518a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f30233a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.f30237c.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.f30238d.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.f30239e.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.f30235a.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.f30236b.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f30233a = iArr;
                }
            }

            public /* synthetic */ C0517a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(b state) {
                AbstractC5504s.h(state, "state");
                int i10 = C0518a.f30233a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_DESTROY;
                }
                if (i10 == 2) {
                    return a.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b state) {
                AbstractC5504s.h(state, "state");
                int i10 = C0518a.f30233a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_START;
                }
                if (i10 == 2) {
                    return a.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public final a c(b state) {
                AbstractC5504s.h(state, "state");
                int i10 = C0518a.f30233a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_CREATE;
                }
                if (i10 == 2) {
                    return a.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            private C0517a() {
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.k$a$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f30234a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f30234a = iArr;
            }
        }

        static {
            a[] aVarArrA = a();
            $VALUES = aVarArrA;
            $ENTRIES = AbstractC3048a.a(aVarArrA);
            Companion = new C0517a(null);
        }

        private a(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
        }

        public static final a b(b bVar) {
            return Companion.a(bVar);
        }

        public static final a h(b bVar) {
            return Companion.c(bVar);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final b c() {
            switch (b.f30234a[ordinal()]) {
                case 1:
                case 2:
                    return b.f30237c;
                case 3:
                case 4:
                    return b.f30238d;
                case 5:
                    return b.f30239e;
                case 6:
                    return b.f30235a;
                case 7:
                    throw new IllegalArgumentException(this + " has no target state");
                default:
                    throw new Td.r();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.k$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends Enum {

        /* JADX INFO: renamed from: a */
        public static final b f30235a = new b("DESTROYED", 0);

        /* JADX INFO: renamed from: b */
        public static final b f30236b = new b("INITIALIZED", 1);

        /* JADX INFO: renamed from: c */
        public static final b f30237c = new b("CREATED", 2);

        /* JADX INFO: renamed from: d */
        public static final b f30238d = new b("STARTED", 3);

        /* JADX INFO: renamed from: e */
        public static final b f30239e = new b("RESUMED", 4);

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ b[] f30240f;

        /* JADX INFO: renamed from: g */
        private static final /* synthetic */ EnumEntries f30241g;

        static {
            b[] bVarArrA = a();
            f30240f = bVarArrA;
            f30241g = AbstractC3048a.a(bVarArrA);
        }

        private b(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f30235a, f30236b, f30237c, f30238d, f30239e};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f30240f.clone();
        }

        public final boolean b(b state) {
            AbstractC5504s.h(state, "state");
            return compareTo(state) >= 0;
        }
    }

    public static final void b(Jf.u uVar, r rVar, a event) {
        AbstractC5504s.h(rVar, "<unused var>");
        AbstractC5504s.h(event, "event");
        uVar.setValue(event.c());
    }

    public abstract void addObserver(InterfaceC2863q interfaceC2863q);

    public abstract b getCurrentState();

    public Jf.I getCurrentStateFlow() {
        final Jf.u uVarA = Jf.K.a(getCurrentState());
        addObserver(new InterfaceC2861o() { // from class: androidx.lifecycle.j
            @Override // androidx.lifecycle.InterfaceC2861o
            public final void g(r rVar, AbstractC2857k.a aVar) {
                AbstractC2857k.b(uVarA, rVar, aVar);
            }
        });
        return AbstractC1744g.b(uVarA);
    }

    public final C2848b getInternalScopeRef() {
        return this.internalScopeRef;
    }

    public abstract void removeObserver(InterfaceC2863q interfaceC2863q);

    public final void setInternalScopeRef(C2848b c2848b) {
        AbstractC5504s.h(c2848b, "<set-?>");
        this.internalScopeRef = c2848b;
    }
}
