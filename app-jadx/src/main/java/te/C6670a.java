package te;

import Ee.AbstractC1527f;
import Td.C2160k;
import Ud.AbstractC2279u;
import Ud.S;
import be.AbstractC3048a;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import te.h;

/* JADX INFO: renamed from: te.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6670a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f60902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f60903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC0910a f60904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f60905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f60906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f60907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f60908g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: te.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class EnumC0910a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnumC0910a f60909a = new EnumC0910a("CALL_BY_NAME", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EnumC0910a f60910b = new EnumC0910a("POSITIONAL_CALL", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumC0910a[] f60911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f60912d;

        static {
            EnumC0910a[] enumC0910aArrA = a();
            f60911c = enumC0910aArrA;
            f60912d = AbstractC3048a.a(enumC0910aArrA);
        }

        private EnumC0910a(String str, int i10) {
        }

        private static final /* synthetic */ EnumC0910a[] a() {
            return new EnumC0910a[]{f60909a, f60910b};
        }

        public static EnumC0910a valueOf(String str) {
            return (EnumC0910a) Enum.valueOf(EnumC0910a.class, str);
        }

        public static EnumC0910a[] values() {
            return (EnumC0910a[]) f60911c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: te.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f60913a = new b("JAVA", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f60914b = new b("KOTLIN", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f60915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f60916d;

        static {
            b[] bVarArrA = a();
            f60915c = bVarArrA;
            f60916d = AbstractC3048a.a(bVarArrA);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f60913a, f60914b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f60915c.clone();
        }
    }

    public C6670a(Class jClass, List parameterNames, EnumC0910a callMode, b origin, List methods) {
        AbstractC5504s.h(jClass, "jClass");
        AbstractC5504s.h(parameterNames, "parameterNames");
        AbstractC5504s.h(callMode, "callMode");
        AbstractC5504s.h(origin, "origin");
        AbstractC5504s.h(methods, "methods");
        this.f60902a = jClass;
        this.f60903b = parameterNames;
        this.f60904c = callMode;
        this.f60905d = methods;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(methods, 10));
        Iterator it = methods.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f60906e = arrayList;
        List list = this.f60905d;
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            AbstractC5504s.e(returnType);
            Class<?> clsK = AbstractC1527f.k(returnType);
            if (clsK != null) {
                returnType = clsK;
            }
            arrayList2.add(returnType);
        }
        this.f60907f = arrayList2;
        List list2 = this.f60905d;
        ArrayList arrayList3 = new ArrayList(AbstractC2279u.x(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.f60908g = arrayList3;
        if (this.f60904c == EnumC0910a.f60910b && origin == b.f60913a && !AbstractC2279u.F0(this.f60903b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // te.h
    public List a() {
        return this.f60906e;
    }

    @Override // te.h
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) e();
    }

    @Override // te.h
    public boolean c() {
        return h.a.b(this);
    }

    @Override // te.h
    public Object call(Object[] args) {
        AbstractC5504s.h(args, "args");
        d(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Object obj = args[i10];
            int i12 = i11 + 1;
            Object objQ = (obj == null && this.f60904c == EnumC0910a.f60909a) ? this.f60908g.get(i11) : f.q(obj, (Class) this.f60907f.get(i11));
            if (objQ == null) {
                f.p(i11, (String) this.f60903b.get(i11), (Class) this.f60907f.get(i11));
                throw new C2160k();
            }
            arrayList.add(objQ);
            i10++;
            i11 = i12;
        }
        return f.g(this.f60902a, S.w(AbstractC2279u.j1(this.f60903b, arrayList)), this.f60905d);
    }

    public void d(Object[] objArr) {
        h.a.a(this, objArr);
    }

    public Void e() {
        return null;
    }

    @Override // te.h
    public Type getReturnType() {
        return this.f60902a;
    }

    public /* synthetic */ C6670a(Class cls, List list, EnumC0910a enumC0910a, b bVar, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 16) != 0) {
            list2 = new ArrayList(AbstractC2279u.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(cls.getDeclaredMethod((String) it.next(), null));
            }
        }
        this(cls, list, enumC0910a, bVar, list2);
    }
}
