package xf;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xf.AbstractC7155g;
import ye.InterfaceC7247z;

/* JADX INFO: renamed from: xf.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C7156h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xe.f f64481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Df.p f64482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection f64483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f64484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC7154f[] f64485e;

    /* JADX INFO: renamed from: xf.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f64486a = new a();

        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC7247z interfaceC7247z) {
            AbstractC5504s.h(interfaceC7247z, "<this>");
            return null;
        }
    }

    /* JADX INFO: renamed from: xf.h$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f64487a = new b();

        b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC7247z interfaceC7247z) {
            AbstractC5504s.h(interfaceC7247z, "<this>");
            return null;
        }
    }

    /* JADX INFO: renamed from: xf.h$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f64488a = new c();

        c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC7247z interfaceC7247z) {
            AbstractC5504s.h(interfaceC7247z, "<this>");
            return null;
        }
    }

    private C7156h(Xe.f fVar, Df.p pVar, Collection collection, Function1 function1, InterfaceC7154f... interfaceC7154fArr) {
        this.f64481a = fVar;
        this.f64482b = pVar;
        this.f64483c = collection;
        this.f64484d = function1;
        this.f64485e = interfaceC7154fArr;
    }

    public final AbstractC7155g a(InterfaceC7247z functionDescriptor) {
        AbstractC5504s.h(functionDescriptor, "functionDescriptor");
        for (InterfaceC7154f interfaceC7154f : this.f64485e) {
            String strA = interfaceC7154f.a(functionDescriptor);
            if (strA != null) {
                return new AbstractC7155g.b(strA);
            }
        }
        String str = (String) this.f64484d.invoke(functionDescriptor);
        return str != null ? new AbstractC7155g.b(str) : AbstractC7155g.c.f64480b;
    }

    public final boolean b(InterfaceC7247z functionDescriptor) {
        AbstractC5504s.h(functionDescriptor, "functionDescriptor");
        if (this.f64481a != null && !AbstractC5504s.c(functionDescriptor.getName(), this.f64481a)) {
            return false;
        }
        if (this.f64482b != null) {
            String strB = functionDescriptor.getName().b();
            AbstractC5504s.g(strB, "asString(...)");
            if (!this.f64482b.h(strB)) {
                return false;
            }
        }
        Collection collection = this.f64483c;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ C7156h(Xe.f fVar, InterfaceC7154f[] interfaceC7154fArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, interfaceC7154fArr, (i10 & 4) != 0 ? a.f64486a : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7156h(Xe.f name, InterfaceC7154f[] checks, Function1 additionalChecks) {
        this(name, (Df.p) null, (Collection) null, additionalChecks, (InterfaceC7154f[]) Arrays.copyOf(checks, checks.length));
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(checks, "checks");
        AbstractC5504s.h(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ C7156h(Df.p pVar, InterfaceC7154f[] interfaceC7154fArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, interfaceC7154fArr, (i10 & 4) != 0 ? b.f64487a : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7156h(Df.p regex, InterfaceC7154f[] checks, Function1 additionalChecks) {
        this((Xe.f) null, regex, (Collection) null, additionalChecks, (InterfaceC7154f[]) Arrays.copyOf(checks, checks.length));
        AbstractC5504s.h(regex, "regex");
        AbstractC5504s.h(checks, "checks");
        AbstractC5504s.h(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ C7156h(Collection collection, InterfaceC7154f[] interfaceC7154fArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, interfaceC7154fArr, (i10 & 4) != 0 ? c.f64488a : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7156h(Collection nameList, InterfaceC7154f[] checks, Function1 additionalChecks) {
        this((Xe.f) null, (Df.p) null, nameList, additionalChecks, (InterfaceC7154f[]) Arrays.copyOf(checks, checks.length));
        AbstractC5504s.h(nameList, "nameList");
        AbstractC5504s.h(checks, "checks");
        AbstractC5504s.h(additionalChecks, "additionalChecks");
    }
}
