package jd;

import Td.L;
import Ub.u;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.f;
import cc.i;
import dc.g;
import dc.h;
import dc.j;
import dc.l;
import dc.m;
import dc.n;
import dc.s;
import ie.InterfaceC5082a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.U;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.InterfaceC6027q;

/* JADX INFO: renamed from: jd.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Ljd/b;", "Lgc/c;", "<init>", "()V", "", "color", "LTd/L;", "D", "(I)V", "Lgc/e;", "n", "()Lgc/e;", "Landroid/content/Context;", "A", "()Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "B", "()Landroid/content/SharedPreferences;", "prefs", "C", "()I", "systemBackgroundColor", "d", "a", "expo-system-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C5369b extends gc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: jd.b$a, reason: from kotlin metadata */
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

    /* JADX INFO: renamed from: jd.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0815b implements Function2 {
        public C0815b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            Integer num = (Integer) promise;
            C5369b.this.B().edit().putInt("expoRootBackgroundColor", num.intValue()).apply();
            C5369b.this.D(num.intValue());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: jd.b$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f51750a = new c();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.f(Integer.class);
        }
    }

    /* JADX INFO: renamed from: jd.b$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Function1 {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            Integer num = (Integer) objArr[0];
            if (num != null) {
                C5369b.this.B().edit().putInt("expoRootBackgroundColor", num.intValue()).apply();
            } else {
                C5369b.this.B().edit().remove("expoRootBackgroundColor").apply();
            }
            C5369b c5369b = C5369b.this;
            c5369b.D(num != null ? num.intValue() : c5369b.C());
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: jd.b$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements Function1 {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            Drawable background = C5369b.this.i().F().getWindow().getDecorView().getBackground();
            if (!(background instanceof ColorDrawable)) {
                return null;
            }
            Companion companion = C5369b.INSTANCE;
            Drawable drawableMutate = ((ColorDrawable) background).mutate();
            AbstractC5504s.f(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
            return companion.a(((ColorDrawable) drawableMutate).getColor());
        }
    }

    private final Context A() throws i {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences B() throws i {
        SharedPreferences sharedPreferences = A().getSharedPreferences("expo_ui_preferences", 0);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int C() {
        int iO = f.o();
        if (iO != -1) {
            return (iO == 1 || iO != 2) ? -1 : -16777216;
        }
        int i10 = A().getResources().getConfiguration().uiMode & 48;
        return (i10 == 16 || i10 != 32) ? -1 : -16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int color) {
        Window window = i().F().getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        int color2 = Color.parseColor(INSTANCE.a(color));
        if (decorView != null) {
            decorView.setBackgroundColor(color2);
        }
    }

    @Override // gc.c
    public gc.e n() {
        g lVar;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoSystemUI");
            if (AbstractC5504s.c(Integer.class, u.class)) {
                lVar = new dc.f("setBackgroundColorAsync", new C5972b[0], new C0815b());
            } else {
                X xM = dVar.m();
                C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(Integer.class), Boolean.TRUE));
                if (c5972b == null) {
                    c5972b = new C5972b(new M(O.b(Integer.class), true, c.f51750a), xM);
                }
                C5972b[] c5972bArr = {c5972b};
                d dVar2 = new d();
                lVar = AbstractC5504s.c(L.class, Integer.TYPE) ? new l("setBackgroundColorAsync", c5972bArr, dVar2) : AbstractC5504s.c(L.class, Boolean.TYPE) ? new h("setBackgroundColorAsync", c5972bArr, dVar2) : AbstractC5504s.c(L.class, Double.TYPE) ? new dc.i("setBackgroundColorAsync", c5972bArr, dVar2) : AbstractC5504s.c(L.class, Float.TYPE) ? new j("setBackgroundColorAsync", c5972bArr, dVar2) : AbstractC5504s.c(L.class, String.class) ? new n("setBackgroundColorAsync", c5972bArr, dVar2) : new s("setBackgroundColorAsync", c5972bArr, dVar2);
            }
            dVar.k().put("setBackgroundColorAsync", lVar);
            lVar.n(m.f45116a);
            dVar.k().put("getBackgroundColorAsync", new s("getBackgroundColorAsync", new C5972b[0], new e()));
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
