package wc;

import H7.k;
import H7.l;
import H7.t;
import Td.L;
import Td.z;
import Ud.AbstractC2279u;
import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3281a;
import com.facebook.react.uimanager.C3303t;
import com.facebook.react.uimanager.EnumC3304u;
import expo.modules.kotlin.views.p;
import ie.InterfaceC5096o;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.C5974d;
import pc.M;

/* JADX INFO: renamed from: wc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6959b {

    /* JADX INFO: renamed from: wc.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Function2 {
        public final void a(View view, Integer num) {
            AbstractC5504s.h(view, "view");
            C3281a.m(view, num);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (Integer) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: wc.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0946b implements InterfaceC5096o {
        public final void a(View view, int i10, Integer num) {
            AbstractC5504s.h(view, "view");
            C3281a.r(view, t.f8114a.a(i10), num);
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((View) obj, ((Number) obj2).intValue(), (Integer) obj3);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: wc.b$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5096o f62942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f62943b;

        public c(InterfaceC5096o interfaceC5096o, Object obj) {
            this.f62942a = interfaceC5096o;
            this.f62943b = obj;
        }

        public final void a(View view, Object obj) {
            AbstractC5504s.h(view, "view");
            this.f62942a.invoke(view, this.f62943b, obj);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: wc.b$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC5096o {
        public final void a(View view, int i10, Float f10) {
            AbstractC5504s.h(view, "view");
            C3281a.s(view, (H7.i) H7.i.b().get(i10), f10 != null ? new C3303t(f10.floatValue(), EnumC3304u.f37832a) : null);
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((View) obj, ((Number) obj2).intValue(), (Float) obj3);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: wc.b$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5096o f62944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f62945b;

        public e(InterfaceC5096o interfaceC5096o, int i10) {
            this.f62944a = interfaceC5096o;
            this.f62945b = i10;
        }

        public final void a(View view, Object obj) {
            AbstractC5504s.h(view, "view");
            this.f62944a.invoke(view, Integer.valueOf(this.f62945b), obj);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: wc.b$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements Function2 {
        public final void a(View view, String str) {
            AbstractC5504s.h(view, "view");
            C3281a.t(view, str != null ? k.f8072a.a(str) : null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (String) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: wc.b$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC5096o {
        public final void a(View view, int i10, Float f10) {
            AbstractC5504s.h(view, "view");
            C3281a.u(view, (t) t.b().get(i10), Float.valueOf(f10 != null ? f10.floatValue() : Float.NaN));
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((View) obj, ((Number) obj2).intValue(), (Float) obj3);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: wc.b$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5096o f62946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f62947b;

        public h(InterfaceC5096o interfaceC5096o, int i10) {
            this.f62946a = interfaceC5096o;
            this.f62947b = i10;
        }

        public final void a(View view, Object obj) {
            AbstractC5504s.h(view, "view");
            this.f62946a.invoke(view, Integer.valueOf(this.f62947b), obj);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: wc.b$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements Function2 {
        public final void a(View view, ReadableArray readableArray) {
            AbstractC5504s.h(view, "view");
            if (readableArray == null) {
                C3281a.w(view, AbstractC2279u.m());
                return;
            }
            ArrayList arrayList = new ArrayList();
            int size = readableArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                l.a aVar = l.f8078g;
                ReadableMap map = readableArray.getMap(i10);
                Context context = view.getContext();
                AbstractC5504s.g(context, "getContext(...)");
                l lVarA = aVar.a(map, context);
                if (lVarA != null) {
                    arrayList.add(lVarA);
                }
            }
            C3281a.w(view, arrayList);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (ReadableArray) obj2);
            return L.f17438a;
        }
    }

    private static final void a(p pVar) {
        a aVar = new a();
        Map mapH = pVar.h();
        C5974d c5974d = C5974d.f55938a;
        C5972b c5972b = (C5972b) c5974d.a().get(new Pair(O.b(Integer.class), Boolean.TRUE));
        if (c5972b == null) {
            c5972b = new C5972b(new M(O.b(Integer.class), true, C6958a.f62941a), null);
        }
        mapH.put("backgroundColor", new expo.modules.kotlin.views.c("backgroundColor", c5972b, aVar));
    }

    private static final void b(p pVar) {
        Pair[] pairArr = {z.a("borderColor", 8), z.a("borderLeftColor", 0), z.a("borderRightColor", 2), z.a("borderTopColor", 1), z.a("borderBottomColor", 3), z.a("borderStartColor", 4), z.a("borderEndColor", 5), z.a("borderBlockColor", 9), z.a("borderBlockEndColor", 10), z.a("borderBlockStartColor", 11)};
        C0946b c0946b = new C0946b();
        for (int i10 = 0; i10 < 10; i10++) {
            Pair pair = pairArr[i10];
            String str = (String) pair.getFirst();
            c cVar = new c(c0946b, pair.getSecond());
            Map mapH = pVar.h();
            C5974d c5974d = C5974d.f55938a;
            C5972b c5972b = (C5972b) c5974d.a().get(new Pair(O.b(Integer.class), Boolean.TRUE));
            if (c5972b == null) {
                c5972b = new C5972b(new M(O.b(Integer.class), true, C6960c.f62948a), null);
            }
            mapH.put(str, new expo.modules.kotlin.views.c(str, c5972b, cVar));
        }
    }

    private static final void c(p pVar) {
        String[] strArr = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius", "borderEndEndRadius", "borderEndStartRadius", "borderStartEndRadius", "borderStartStartRadius"};
        d dVar = new d();
        int i10 = 0;
        int i11 = 0;
        while (i10 < 13) {
            String str = strArr[i10];
            int i12 = i11 + 1;
            e eVar = new e(dVar, i11);
            Map mapH = pVar.h();
            C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(Float.class), Boolean.TRUE));
            if (c5972b == null) {
                c5972b = new C5972b(new M(O.b(Float.class), true, C6961d.f62949a), null);
            }
            mapH.put(str, new expo.modules.kotlin.views.c(str, c5972b, eVar));
            i10++;
            i11 = i12;
        }
    }

    private static final void d(p pVar) {
        f fVar = new f();
        Map mapH = pVar.h();
        C5974d c5974d = C5974d.f55938a;
        C5972b c5972b = (C5972b) c5974d.a().get(new Pair(O.b(String.class), Boolean.TRUE));
        if (c5972b == null) {
            c5972b = new C5972b(new M(O.b(String.class), true, C6962e.f62950a), null);
        }
        mapH.put("borderStyle", new expo.modules.kotlin.views.c("borderStyle", c5972b, fVar));
    }

    private static final void e(p pVar) {
        String[] strArr = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"};
        g gVar = new g();
        int i10 = 0;
        int i11 = 0;
        while (i10 < 7) {
            String str = strArr[i10];
            int i12 = i11 + 1;
            h hVar = new h(gVar, i11);
            Map mapH = pVar.h();
            C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(Float.class), Boolean.TRUE));
            if (c5972b == null) {
                c5972b = new C5972b(new M(O.b(Float.class), true, wc.f.f62951a), null);
            }
            mapH.put(str, new expo.modules.kotlin.views.c(str, c5972b, hVar));
            i10++;
            i11 = i12;
        }
    }

    private static final void f(p pVar) {
        i iVar = new i();
        Map mapH = pVar.h();
        C5974d c5974d = C5974d.f55938a;
        C5972b c5972b = (C5972b) c5974d.a().get(new Pair(O.b(ReadableArray.class), Boolean.TRUE));
        if (c5972b == null) {
            c5972b = new C5972b(new M(O.b(ReadableArray.class), true, wc.g.f62952a), null);
        }
        mapH.put("boxShadow", new expo.modules.kotlin.views.c("boxShadow", c5972b, iVar));
    }

    public static final void g(p pVar) {
        AbstractC5504s.h(pVar, "<this>");
        b(pVar);
        e(pVar);
        c(pVar);
        d(pVar);
        a(pVar);
        f(pVar);
    }
}
