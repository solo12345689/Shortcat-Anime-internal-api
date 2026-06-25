package se;

import Ee.AbstractC1527f;
import Ve.a;
import We.d;
import Ze.i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.C5890m;
import of.InterfaceC5895s;
import se.AbstractC6503n;
import ye.AbstractC7241t;
import ye.InterfaceC7235m;

/* JADX INFO: renamed from: se.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6507p {

    /* JADX INFO: renamed from: se.p$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC6507p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Field f59542a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super(null);
            AbstractC5504s.h(field, "field");
            this.f59542a = field;
        }

        @Override // se.AbstractC6507p
        public String a() {
            StringBuilder sb2 = new StringBuilder();
            String name = this.f59542a.getName();
            AbstractC5504s.g(name, "getName(...)");
            sb2.append(He.H.b(name));
            sb2.append("()");
            Class<?> type = this.f59542a.getType();
            AbstractC5504s.g(type, "getType(...)");
            sb2.append(AbstractC1527f.f(type));
            return sb2.toString();
        }

        public final Field b() {
            return this.f59542a;
        }
    }

    /* JADX INFO: renamed from: se.p$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC6507p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f59543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f59544b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method getterMethod, Method method) {
            super(null);
            AbstractC5504s.h(getterMethod, "getterMethod");
            this.f59543a = getterMethod;
            this.f59544b = method;
        }

        @Override // se.AbstractC6507p
        public String a() {
            return h1.d(this.f59543a);
        }

        public final Method b() {
            return this.f59543a;
        }

        public final Method c() {
            return this.f59544b;
        }
    }

    /* JADX INFO: renamed from: se.p$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC6507p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ye.Z f59545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Se.o f59546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a.d f59547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Ue.d f59548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Ue.h f59549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f59550f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ye.Z descriptor, Se.o proto, a.d signature, Ue.d nameResolver, Ue.h typeTable) {
            String str;
            super(null);
            AbstractC5504s.h(descriptor, "descriptor");
            AbstractC5504s.h(proto, "proto");
            AbstractC5504s.h(signature, "signature");
            AbstractC5504s.h(nameResolver, "nameResolver");
            AbstractC5504s.h(typeTable, "typeTable");
            this.f59545a = descriptor;
            this.f59546b = proto;
            this.f59547c = signature;
            this.f59548d = nameResolver;
            this.f59549e = typeTable;
            if (signature.H()) {
                str = nameResolver.getString(signature.C().y()) + nameResolver.getString(signature.C().x());
            } else {
                d.a aVarD = We.h.d(We.h.f20878a, proto, nameResolver, typeTable, false, 8, null);
                if (aVarD == null) {
                    throw new Y0("No field signature for property: " + descriptor);
                }
                String strB = aVarD.b();
                str = He.H.b(strB) + c() + "()" + aVarD.c();
            }
            this.f59550f = str;
        }

        private final String c() {
            String string;
            InterfaceC7235m interfaceC7235mB = this.f59545a.b();
            AbstractC5504s.g(interfaceC7235mB, "getContainingDeclaration(...)");
            if (AbstractC5504s.c(this.f59545a.getVisibility(), AbstractC7241t.f65123d) && (interfaceC7235mB instanceof C5890m)) {
                Se.c cVarE1 = ((C5890m) interfaceC7235mB).e1();
                i.f classModuleName = Ve.a.f20036i;
                AbstractC5504s.g(classModuleName, "classModuleName");
                Integer num = (Integer) Ue.f.a(cVarE1, classModuleName);
                if (num == null || (string = this.f59548d.getString(num.intValue())) == null) {
                    string = "main";
                }
                return '$' + Xe.g.b(string);
            }
            if (!AbstractC5504s.c(this.f59545a.getVisibility(), AbstractC7241t.f65120a) || !(interfaceC7235mB instanceof ye.N)) {
                return "";
            }
            ye.Z z10 = this.f59545a;
            AbstractC5504s.f(z10, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            InterfaceC5895s interfaceC5895sJ = ((of.N) z10).J();
            if (!(interfaceC5895sJ instanceof Qe.r)) {
                return "";
            }
            Qe.r rVar = (Qe.r) interfaceC5895sJ;
            if (rVar.f() == null) {
                return "";
            }
            return '$' + rVar.h().b();
        }

        @Override // se.AbstractC6507p
        public String a() {
            return this.f59550f;
        }

        public final ye.Z b() {
            return this.f59545a;
        }

        public final Ue.d d() {
            return this.f59548d;
        }

        public final Se.o e() {
            return this.f59546b;
        }

        public final a.d f() {
            return this.f59547c;
        }

        public final Ue.h g() {
            return this.f59549e;
        }
    }

    /* JADX INFO: renamed from: se.p$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends AbstractC6507p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC6503n.e f59551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC6503n.e f59552b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC6503n.e getterSignature, AbstractC6503n.e eVar) {
            super(null);
            AbstractC5504s.h(getterSignature, "getterSignature");
            this.f59551a = getterSignature;
            this.f59552b = eVar;
        }

        @Override // se.AbstractC6507p
        public String a() {
            return this.f59551a.a();
        }

        public final AbstractC6503n.e b() {
            return this.f59551a;
        }

        public final AbstractC6503n.e c() {
            return this.f59552b;
        }
    }

    public /* synthetic */ AbstractC6507p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private AbstractC6507p() {
    }
}
