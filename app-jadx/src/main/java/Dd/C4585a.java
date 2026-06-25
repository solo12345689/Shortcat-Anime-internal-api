package dd;

import Td.z;
import Ud.S;
import android.R;
import android.content.Context;
import android.graphics.Color;
import app.notifee.core.event.LogEvent;
import cc.i;
import com.facebook.react.modules.appstate.AppStateModule;
import dc.r;
import i.AbstractC4956a;
import ie.InterfaceC5082a;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.U;
import o9.AbstractC5838a;
import o9.AbstractC5847j;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.V;
import pc.X;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;
import x9.AbstractC7066a;

/* JADX INFO: renamed from: dd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ!\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Ldd/a;", "Lgc/c;", "<init>", "()V", "", "name", "scheme", "D", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "z", "", "themeResId", "A", "(Ljava/lang/String;I)Ljava/lang/String;", "C", "()Ljava/lang/String;", "Lgc/e;", "n", "()Lgc/e;", "Landroid/content/Context;", "B", "()Landroid/content/Context;", "context", "d", "a", "expo-router_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C4585a extends gc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f45142e = S.l(z.a("primary", Integer.valueOf(AbstractC4956a.f47976w)), z.a("onprimary", Integer.valueOf(AbstractC5838a.f54641j)), z.a("primarycontainer", Integer.valueOf(AbstractC5838a.f54586A)), z.a("onprimarycontainer", Integer.valueOf(AbstractC5838a.f54643k)), z.a("primaryinverse", Integer.valueOf(AbstractC5838a.f54592D)), z.a("primaryfixed", Integer.valueOf(AbstractC5838a.f54588B)), z.a("primaryfixeddim", Integer.valueOf(AbstractC5838a.f54590C)), z.a("onprimaryfixed", Integer.valueOf(AbstractC5838a.f54645l)), z.a("onprimaryfixedvariant", Integer.valueOf(AbstractC5838a.f54647m)), z.a("secondary", Integer.valueOf(AbstractC5838a.f54596F)), z.a("onsecondary", Integer.valueOf(AbstractC5838a.f54649n)), z.a("secondarycontainer", Integer.valueOf(AbstractC5838a.f54598G)), z.a("onsecondarycontainer", Integer.valueOf(AbstractC5838a.f54651o)), z.a("secondaryfixed", Integer.valueOf(AbstractC5838a.f54600H)), z.a("secondaryfixeddim", Integer.valueOf(AbstractC5838a.f54602I)), z.a("onsecondaryfixed", Integer.valueOf(AbstractC5838a.f54653p)), z.a("onsecondaryfixedvariant", Integer.valueOf(AbstractC5838a.f54655q)), z.a("tertiary", Integer.valueOf(AbstractC5838a.f54616T)), z.a("ontertiary", Integer.valueOf(AbstractC5838a.f54663u)), z.a("tertiarycontainer", Integer.valueOf(AbstractC5838a.f54617U)), z.a("ontertiarycontainer", Integer.valueOf(AbstractC5838a.f54665v)), z.a("tertiaryfixed", Integer.valueOf(AbstractC5838a.f54618V)), z.a("tertiaryfixeddim", Integer.valueOf(AbstractC5838a.f54619W)), z.a("ontertiaryfixed", Integer.valueOf(AbstractC5838a.f54667w)), z.a("ontertiaryfixedvariant", Integer.valueOf(AbstractC5838a.f54669x)), z.a(LogEvent.LEVEL_ERROR, Integer.valueOf(AbstractC4956a.f47975v)), z.a("onerror", Integer.valueOf(AbstractC5838a.f54637h)), z.a("errorcontainer", Integer.valueOf(AbstractC5838a.f54633f)), z.a("onerrorcontainer", Integer.valueOf(AbstractC5838a.f54639i)), z.a("outline", Integer.valueOf(AbstractC5838a.f54671y)), z.a("outlinevariant", Integer.valueOf(AbstractC5838a.f54673z)), z.a(AppStateModule.APP_STATE_BACKGROUND, Integer.valueOf(R.attr.colorBackground)), z.a("onbackground", Integer.valueOf(AbstractC5838a.f54635g)), z.a("surface", Integer.valueOf(AbstractC5838a.f54604J)), z.a("onsurface", Integer.valueOf(AbstractC5838a.f54657r)), z.a("surfacevariant", Integer.valueOf(AbstractC5838a.f54615S)), z.a("onsurfacevariant", Integer.valueOf(AbstractC5838a.f54661t)), z.a("surfaceinverse", Integer.valueOf(AbstractC5838a.f54614R)), z.a("onsurfaceinverse", Integer.valueOf(AbstractC5838a.f54659s)), z.a("surfacebright", Integer.valueOf(AbstractC5838a.f54606K)), z.a("surfacedim", Integer.valueOf(AbstractC5838a.f54613Q)), z.a("surfacecontainer", Integer.valueOf(AbstractC5838a.f54608L)), z.a("surfacecontainerlow", Integer.valueOf(AbstractC5838a.f54611O)), z.a("surfacecontainerlowest", Integer.valueOf(AbstractC5838a.f54612P)), z.a("surfacecontainerhigh", Integer.valueOf(AbstractC5838a.f54609M)), z.a("surfacecontainerhighest", Integer.valueOf(AbstractC5838a.f54610N)));

    /* JADX INFO: renamed from: dd.a$a, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i10) {
            U u10 = U.f52264a;
            String str = String.format("#%02x%02x%02x", Arrays.copyOf(new Object[]{Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10))}, 3));
            AbstractC5504s.g(str, "format(...)");
            return str;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: dd.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f45143a = new b();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: renamed from: dd.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f45144a = new c();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: renamed from: dd.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Function1 {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            String str = (String) objArr[1];
            return C4585a.this.D((String) obj, str);
        }
    }

    /* JADX INFO: renamed from: dd.a$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f45146a = new e();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: renamed from: dd.a$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f45147a = new f();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: renamed from: dd.a$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements Function1 {
        public g() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            String str = (String) objArr[1];
            return C4585a.this.z((String) obj, str);
        }
    }

    private final String A(String name, int themeResId) {
        Integer numF;
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(B(), themeResId);
        Map map = f45142e;
        String lowerCase = name.toLowerCase(Locale.ROOT);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        Integer num = (Integer) map.get(lowerCase);
        if (num == null || (numF = AbstractC7066a.f(dVar, num.intValue())) == null) {
            return null;
        }
        return INSTANCE.a(numF.intValue());
    }

    private final Context B() throws i {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new i();
    }

    private final String C() {
        int i10 = B().getResources().getConfiguration().uiMode & 48;
        return (i10 == 16 || i10 != 32) ? "light" : "dark";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String D(String name, String scheme) {
        if (!AbstractC5504s.c(scheme, "dark") && !AbstractC5504s.c(scheme, "light")) {
            scheme = C();
        }
        return A(name, AbstractC5504s.c(scheme, "dark") ? AbstractC5847j.f54875d : AbstractC5847j.f54880i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String z(String name, String scheme) {
        if (!AbstractC5504s.c(scheme, "dark") && !AbstractC5504s.c(scheme, "light")) {
            scheme = C();
        }
        return A(name, AbstractC5504s.c(scheme, "dark") ? AbstractC5847j.f54878g : AbstractC5847j.f54879h);
    }

    @Override // gc.c
    public gc.e n() {
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoRouter");
            X xM = dVar.m();
            C5974d c5974d = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = O.b(String.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b == null) {
                c5972b = new C5972b(new M(O.b(String.class), false, b.f45143a), xM);
            }
            C5972b c5972b2 = (C5972b) c5974d.a().get(new Pair(O.b(String.class), bool));
            if (c5972b2 == null) {
                c5972b2 = new C5972b(new M(O.b(String.class), false, c.f45144a), xM);
            }
            C5972b[] c5972bArr = {c5972b, c5972b2};
            V v10 = V.f55908a;
            pc.U u10 = (pc.U) v10.a().get(O.b(String.class));
            if (u10 == null) {
                u10 = new pc.U(O.b(String.class));
                v10.a().put(O.b(String.class), u10);
            }
            dVar.p().put("Material3Color", new r("Material3Color", c5972bArr, u10, new d()));
            X xM2 = dVar.m();
            C5972b c5972b3 = (C5972b) c5974d.a().get(new Pair(O.b(String.class), bool));
            if (c5972b3 == null) {
                c5972b3 = new C5972b(new M(O.b(String.class), false, e.f45146a), xM2);
            }
            C5972b c5972b4 = (C5972b) c5974d.a().get(new Pair(O.b(String.class), bool));
            if (c5972b4 == null) {
                c5972b4 = new C5972b(new M(O.b(String.class), false, f.f45147a), xM2);
            }
            C5972b[] c5972bArr2 = {c5972b3, c5972b4};
            pc.U u11 = (pc.U) v10.a().get(O.b(String.class));
            if (u11 == null) {
                u11 = new pc.U(O.b(String.class));
                v10.a().put(O.b(String.class), u11);
            }
            dVar.p().put("Material3DynamicColor", new r("Material3DynamicColor", c5972bArr2, u11, new g()));
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
