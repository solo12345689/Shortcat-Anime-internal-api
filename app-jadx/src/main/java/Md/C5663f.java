package md;

import Df.r;
import Gf.AbstractC1615j;
import Td.L;
import Td.v;
import Td.z;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.S;
import ae.AbstractC2605b;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import bc.C3042a;
import bc.EnumC3046e;
import dc.n;
import dc.s;
import ie.InterfaceC5082a;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.C6029s;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;

/* JADX INFO: renamed from: md.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003JW\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lmd/f;", "Lgc/c;", "<init>", "()V", "LTd/L;", "G", "B", "", "urlString", "", "seconds", "", "targetWidth", "targetHeight", "", "headers", "", "F", "(Ljava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)Ljava/util/Map;", "Landroid/graphics/Bitmap;", "bitmap", "Ljava/io/File;", "cacheDir", "H", "(Landroid/graphics/Bitmap;Ljava/io/File;)Ljava/util/Map;", "E", "(Ljava/io/File;)Ljava/io/File;", "C", "(Ljava/io/File;)V", "Lgc/e;", "n", "()Lgc/e;", "Lmd/d;", "d", "Lmd/d;", "frameExtractor", "e", "a", "react-native-trickplay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C5663f extends gc.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f53308e = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private C5661d frameExtractor;

    /* JADX INFO: renamed from: md.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: md.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Xd.a.d(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
        }
    }

    /* JADX INFO: renamed from: md.f$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f53310a = new c();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: renamed from: md.f$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f53311a = new d();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(Double.TYPE);
        }
    }

    /* JADX INFO: renamed from: md.f$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f53312a = new e();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.f(Integer.class);
        }
    }

    /* JADX INFO: renamed from: md.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0831f implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0831f f53313a = new C0831f();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.f(Integer.class);
        }
    }

    /* JADX INFO: renamed from: md.f$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f53314a = new g();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            C6029s.a aVar = C6029s.f56013c;
            return O.h(Map.class, aVar.d(O.o(String.class)), aVar.d(O.o(String.class)));
        }
    }

    /* JADX INFO: renamed from: md.f$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements Function1 {
        public h() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            Object obj4 = objArr[3];
            Map map = (Map) objArr[4];
            Integer num = (Integer) obj3;
            double dDoubleValue = ((Number) obj2).doubleValue();
            String str = (String) obj;
            return C5663f.this.F(str, dDoubleValue, num, (Integer) obj4, map);
        }
    }

    /* JADX INFO: renamed from: md.f$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements InterfaceC5082a {
        public i() {
        }

        public final void a() {
            C5663f.this.G();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: md.f$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements InterfaceC5082a {
        public j() {
        }

        public final void a() {
            C5663f.this.B();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: md.f$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class k extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f53318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5661d f53319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f53320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f53321d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Integer f53322e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Integer f53323f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map f53324g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C5661d c5661d, String str, double d10, Integer num, Integer num2, Map map, Zd.e eVar) {
            super(2, eVar);
            this.f53319b = c5661d;
            this.f53320c = str;
            this.f53321d = d10;
            this.f53322e = num;
            this.f53323f = num2;
            this.f53324g = map;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new k(this.f53319b, this.f53320c, this.f53321d, this.f53322e, this.f53323f, this.f53324g, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((k) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = AbstractC2605b.f();
            int i10 = this.f53318a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                return obj;
            }
            v.b(obj);
            C5661d c5661d = this.f53319b;
            String str = this.f53320c;
            double d10 = this.f53321d;
            Integer num = this.f53322e;
            Integer num2 = this.f53323f;
            Map map = this.f53324g;
            this.f53318a = 1;
            Object objT = c5661d.t(str, d10, num, num2, map, this);
            return objT == objF ? objF : objT;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        C5661d c5661d = this.frameExtractor;
        if (c5661d != null) {
            c5661d.z();
        }
        this.frameExtractor = null;
    }

    private final void C(File cacheDir) {
        try {
            File[] fileArrListFiles = cacheDir.listFiles(new FileFilter() { // from class: md.e
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    return C5663f.D(file);
                }
            });
            if (fileArrListFiles != null && fileArrListFiles.length > 10) {
                Iterator it = AbstractC2279u.h0(AbstractC2273n.K0(fileArrListFiles, new b()), 10).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception e10) {
            Log.w("ReactNativeTrickplay", "Failed to cleanup old frames: " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(File file) {
        String name = file.getName();
        AbstractC5504s.g(name, "getName(...)");
        if (r.Q(name, "trickplay_frame_", false, 2, null)) {
            String name2 = file.getName();
            AbstractC5504s.g(name2, "getName(...)");
            if (r.A(name2, ".jpg", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    private final File E(File cacheDir) {
        File file = new File(cacheDir, "trickplay_frame_" + System.currentTimeMillis() + ".jpg");
        C(cacheDir);
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map F(String urlString, double seconds, Integer targetWidth, Integer targetHeight, Map headers) throws C5658a {
        Context contextB = i().B();
        if (contextB == null) {
            throw new C5658a("React context is not available");
        }
        C5661d c5661d = this.frameExtractor;
        if (c5661d == null) {
            c5661d = new C5661d(contextB);
            this.frameExtractor = c5661d;
        }
        Bitmap bitmap = (Bitmap) AbstractC1615j.b(null, new k(c5661d, urlString, seconds, targetWidth, targetHeight, headers, null), 1, null);
        File cacheDir = contextB.getCacheDir();
        AbstractC5504s.g(cacheDir, "getCacheDir(...)");
        return H(bitmap, cacheDir);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        Context contextB = i().B();
        if (contextB == null) {
            return;
        }
        this.frameExtractor = new C5661d(contextB);
    }

    private final Map H(Bitmap bitmap, File cacheDir) throws IOException {
        File fileE = E(cacheDir);
        FileOutputStream fileOutputStream = new FileOutputStream(fileE);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            fe.c.a(fileOutputStream, null);
            return S.l(z.a("uri", "file://" + fileE.getAbsolutePath()), z.a("width", Integer.valueOf(bitmap.getWidth())), z.a("height", Integer.valueOf(bitmap.getHeight())));
        } finally {
        }
    }

    @Override // gc.c
    public gc.e n() {
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ReactNativeTrickplay");
            Map mapW = dVar.w();
            EnumC3046e enumC3046e = EnumC3046e.f33268a;
            mapW.put(enumC3046e, new C3042a(enumC3046e, new i()));
            Map mapW2 = dVar.w();
            EnumC3046e enumC3046e2 = EnumC3046e.f33269b;
            mapW2.put(enumC3046e2, new C3042a(enumC3046e2, new j()));
            X xM = dVar.m();
            C5974d c5974d = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = O.b(String.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b == null) {
                c5972b = new C5972b(new M(O.b(String.class), false, c.f53310a), xM);
            }
            C5972b c5972b2 = (C5972b) c5974d.a().get(new Pair(O.b(Double.class), bool));
            if (c5972b2 == null) {
                c5972b2 = new C5972b(new M(O.b(Double.class), false, d.f53311a), xM);
            }
            InterfaceC6014d interfaceC6014dB2 = O.b(Integer.class);
            Boolean bool2 = Boolean.TRUE;
            C5972b c5972b3 = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB2, bool2));
            if (c5972b3 == null) {
                c5972b3 = new C5972b(new M(O.b(Integer.class), true, e.f53312a), xM);
            }
            C5972b c5972b4 = (C5972b) c5974d.a().get(new Pair(O.b(Integer.class), bool2));
            if (c5972b4 == null) {
                c5972b4 = new C5972b(new M(O.b(Integer.class), true, C0831f.f53313a), xM);
            }
            C5972b c5972b5 = (C5972b) c5974d.a().get(new Pair(O.b(Map.class), bool2));
            if (c5972b5 == null) {
                c5972b5 = new C5972b(new M(O.b(Map.class), true, g.f53314a), xM);
            }
            C5972b[] c5972bArr = {c5972b, c5972b2, c5972b3, c5972b4, c5972b5};
            h hVar = new h();
            dVar.k().put("extractFrameAsync", AbstractC5504s.c(Map.class, Integer.TYPE) ? new dc.l("extractFrameAsync", c5972bArr, hVar) : AbstractC5504s.c(Map.class, Boolean.TYPE) ? new dc.h("extractFrameAsync", c5972bArr, hVar) : AbstractC5504s.c(Map.class, Double.TYPE) ? new dc.i("extractFrameAsync", c5972bArr, hVar) : AbstractC5504s.c(Map.class, Float.TYPE) ? new dc.j("extractFrameAsync", c5972bArr, hVar) : AbstractC5504s.c(Map.class, String.class) ? new n("extractFrameAsync", c5972bArr, hVar) : new s("extractFrameAsync", c5972bArr, hVar));
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
