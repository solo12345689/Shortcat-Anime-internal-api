package kotlin.jvm.internal;

import Ud.AbstractC2279u;
import he.AbstractC4945a;
import java.util.List;
import kotlin.jvm.functions.Function1;
import pe.C6029s;
import pe.EnumC6030t;
import pe.InterfaceC6014d;
import pe.InterfaceC6016f;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class Y implements InterfaceC6027q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f52268e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6016f f52269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f52270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6027q f52271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f52272d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52273a;

        static {
            int[] iArr = new int[EnumC6030t.values().length];
            try {
                iArr[EnumC6030t.f56018a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6030t.f56019b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6030t.f56020c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f52273a = iArr;
        }
    }

    public Y(InterfaceC6016f classifier, List arguments, InterfaceC6027q interfaceC6027q, int i10) {
        AbstractC5504s.h(classifier, "classifier");
        AbstractC5504s.h(arguments, "arguments");
        this.f52269a = classifier;
        this.f52270b = arguments;
        this.f52271c = interfaceC6027q;
        this.f52272d = i10;
    }

    private final String l(C6029s c6029s) {
        String strValueOf;
        if (c6029s.d() == null) {
            return "*";
        }
        InterfaceC6027q interfaceC6027qC = c6029s.c();
        Y y10 = interfaceC6027qC instanceof Y ? (Y) interfaceC6027qC : null;
        if (y10 == null || (strValueOf = y10.m(true)) == null) {
            strValueOf = String.valueOf(c6029s.c());
        }
        EnumC6030t enumC6030tD = c6029s.d();
        int i10 = enumC6030tD == null ? -1 : b.f52273a[enumC6030tD.ordinal()];
        if (i10 == 1) {
            return strValueOf;
        }
        if (i10 == 2) {
            return "in " + strValueOf;
        }
        if (i10 != 3) {
            throw new Td.r();
        }
        return "out " + strValueOf;
    }

    private final String m(boolean z10) {
        String name;
        InterfaceC6016f interfaceC6016fC = c();
        InterfaceC6014d interfaceC6014d = interfaceC6016fC instanceof InterfaceC6014d ? (InterfaceC6014d) interfaceC6016fC : null;
        Class clsB = interfaceC6014d != null ? AbstractC4945a.b(interfaceC6014d) : null;
        if (clsB == null) {
            name = c().toString();
        } else if ((this.f52272d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsB.isArray()) {
            name = o(clsB);
        } else if (z10 && clsB.isPrimitive()) {
            InterfaceC6016f interfaceC6016fC2 = c();
            AbstractC5504s.f(interfaceC6016fC2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = AbstractC4945a.c((InterfaceC6014d) interfaceC6016fC2).getName();
        } else {
            name = clsB.getName();
        }
        String str = name + (e().isEmpty() ? "" : AbstractC2279u.w0(e(), ", ", "<", ">", 0, null, new Function1() { // from class: kotlin.jvm.internal.X
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Y.n(this.f52267a, (C6029s) obj);
            }
        }, 24, null)) + (b() ? "?" : "");
        InterfaceC6027q interfaceC6027q = this.f52271c;
        if (!(interfaceC6027q instanceof Y)) {
            return str;
        }
        String strM = ((Y) interfaceC6027q).m(true);
        if (AbstractC5504s.c(strM, str)) {
            return str;
        }
        if (AbstractC5504s.c(strM, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + strM + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence n(Y y10, C6029s it) {
        AbstractC5504s.h(it, "it");
        return y10.l(it);
    }

    private final String o(Class cls) {
        return AbstractC5504s.c(cls, boolean[].class) ? "kotlin.BooleanArray" : AbstractC5504s.c(cls, char[].class) ? "kotlin.CharArray" : AbstractC5504s.c(cls, byte[].class) ? "kotlin.ByteArray" : AbstractC5504s.c(cls, short[].class) ? "kotlin.ShortArray" : AbstractC5504s.c(cls, int[].class) ? "kotlin.IntArray" : AbstractC5504s.c(cls, float[].class) ? "kotlin.FloatArray" : AbstractC5504s.c(cls, long[].class) ? "kotlin.LongArray" : AbstractC5504s.c(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    @Override // pe.InterfaceC6027q
    public boolean b() {
        return (this.f52272d & 1) != 0;
    }

    @Override // pe.InterfaceC6027q
    public InterfaceC6016f c() {
        return this.f52269a;
    }

    @Override // pe.InterfaceC6027q
    public List e() {
        return this.f52270b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y10 = (Y) obj;
        return AbstractC5504s.c(c(), y10.c()) && AbstractC5504s.c(e(), y10.e()) && AbstractC5504s.c(this.f52271c, y10.f52271c) && this.f52272d == y10.f52272d;
    }

    @Override // pe.InterfaceC6012b
    public List getAnnotations() {
        return AbstractC2279u.m();
    }

    public int hashCode() {
        return (((c().hashCode() * 31) + e().hashCode()) * 31) + Integer.hashCode(this.f52272d);
    }

    public String toString() {
        return m(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Y(InterfaceC6016f classifier, List arguments, boolean z10) {
        this(classifier, arguments, null, z10 ? 1 : 0);
        AbstractC5504s.h(classifier, "classifier");
        AbstractC5504s.h(arguments, "arguments");
    }
}
