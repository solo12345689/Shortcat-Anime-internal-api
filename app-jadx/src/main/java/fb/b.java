package Fb;

import Df.InterfaceC1279l;
import Df.p;
import Df.r;
import Td.L;
import Ud.AbstractC2279u;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import cc.i;
import dc.h;
import dc.j;
import dc.l;
import dc.n;
import dc.s;
import expo.modules.kotlin.exception.CodedException;
import gc.e;
import ie.InterfaceC5082a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.U;
import pc.V;
import pc.X;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LFb/b;", "Lgc/c;", "<init>", "()V", "", "", "z", "()Ljava/util/List;", "Lgc/e;", "n", "()Lgc/e;", "Landroid/content/Context;", "y", "()Landroid/content/Context;", "context", "expo-font_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class b extends gc.c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6599a = new a();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: renamed from: Fb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0087b implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0087b f6600a = new C0087b();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f6602b;

        public c(N n10) {
            this.f6602b = n10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws CodedException {
            Typeface typefaceCreateFromFile;
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            String str = (String) objArr[1];
            String str2 = (String) obj;
            Context contextB = b.this.i().B();
            if (contextB == null) {
                throw new i();
            }
            if (r.Q(str, "asset://", false, 2, null)) {
                AssetManager assets = contextB.getAssets();
                String strSubstring = str.substring(9);
                AbstractC5504s.g(strSubstring, "substring(...)");
                typefaceCreateFromFile = Typeface.createFromAsset(assets, strSubstring);
                AbstractC5504s.e(typefaceCreateFromFile);
            } else {
                String path = Uri.parse(str).getPath();
                if (path == null) {
                    throw new Fb.a(str);
                }
                File file = new File(path);
                if (file.length() == 0) {
                    throw new CodedException("Font file for " + str2 + " is empty. Make sure the local file path is correctly populated.", null, 2, null);
                }
                typefaceCreateFromFile = Typeface.createFromFile(file);
                AbstractC5504s.e(typefaceCreateFromFile);
            }
            X6.a.f21660c.c().g(str2, 0, typefaceCreateFromFile);
            N n10 = this.f6602b;
            Set setE1 = AbstractC2279u.e1((Iterable) n10.f52259a);
            setE1.add(str2);
            n10.f52259a = AbstractC2279u.b1(setE1);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f6603a;

        public d(N n10) {
            this.f6603a = n10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return this.f6603a.f52259a;
        }
    }

    private final Context y() throws i {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List z() throws IOException {
        List listB;
        AssetManager assets = y().getAssets();
        p pVar = new p("^(.+?)(_bold|_italic|_bold_italic)?\\.(ttf|otf)$");
        String[] list = assets.list("fonts/");
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : list) {
                AbstractC5504s.e(str);
                InterfaceC1279l interfaceC1279lC = p.c(pVar, str, 0, 2, null);
                String str2 = (interfaceC1279lC == null || (listB = interfaceC1279lC.b()) == null) ? null : (String) listB.get(1);
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (!r.l0((String) obj)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList == null ? AbstractC2279u.m() : arrayList;
    }

    @Override // gc.c
    public e n() {
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            N n10 = new N();
            n10.f52259a = z();
            dVar.s("ExpoFontLoader");
            C5972b[] c5972bArr = new C5972b[0];
            V v10 = V.f55908a;
            U u10 = (U) v10.a().get(O.b(Object.class));
            if (u10 == null) {
                u10 = new U(O.b(Object.class));
                v10.a().put(O.b(Object.class), u10);
            }
            dVar.p().put("getLoadedFonts", new dc.r("getLoadedFonts", c5972bArr, u10, new d(n10)));
            X xM = dVar.m();
            C5974d c5974d = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = O.b(String.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b == null) {
                c5972b = new C5972b(new M(O.b(String.class), false, a.f6599a), xM);
            }
            C5972b c5972b2 = (C5972b) c5974d.a().get(new Pair(O.b(String.class), bool));
            if (c5972b2 == null) {
                c5972b2 = new C5972b(new M(O.b(String.class), false, C0087b.f6600a), xM);
            }
            C5972b[] c5972bArr2 = {c5972b, c5972b2};
            c cVar = new c(n10);
            dVar.k().put("loadAsync", AbstractC5504s.c(L.class, Integer.TYPE) ? new l("loadAsync", c5972bArr2, cVar) : AbstractC5504s.c(L.class, Boolean.TYPE) ? new h("loadAsync", c5972bArr2, cVar) : AbstractC5504s.c(L.class, Double.TYPE) ? new dc.i("loadAsync", c5972bArr2, cVar) : AbstractC5504s.c(L.class, Float.TYPE) ? new j("loadAsync", c5972bArr2, cVar) : AbstractC5504s.c(L.class, String.class) ? new n("loadAsync", c5972bArr2, cVar) : new s("loadAsync", c5972bArr2, cVar));
            e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
