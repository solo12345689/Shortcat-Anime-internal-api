package vd;

import Bd.h;
import Gf.O;
import Td.L;
import Td.v;
import Ud.AbstractC2279u;
import Zd.e;
import ae.AbstractC2605b;
import android.content.Context;
import android.net.Uri;
import com.amazon.a.a.o.b.f;
import expo.modules.updates.db.UpdatesDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import rd.C6306a;
import sd.EnumC6452b;
import wd.g;
import wd.j;
import xd.C7136g;
import xd.EnumC7131b;
import yd.C7221a;
import yd.k;

/* JADX INFO: renamed from: vd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6860a implements InterfaceC6861b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0934a f62044p = new C0934a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f62045q = C6860a.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final expo.modules.updates.d f62047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f62048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f62049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f62050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C7136g f62051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final O f62052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f62053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final j f62054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private rd.d f62055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f62056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f62057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map f62058m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Exception f62059n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f62060o;

    /* JADX INFO: renamed from: vd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0934a {
        public /* synthetic */ C0934a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0934a() {
        }
    }

    /* JADX INFO: renamed from: vd.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f62061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f62062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f62063c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62065e;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f62063c = obj;
            this.f62065e |= Integer.MIN_VALUE;
            return C6860a.this.g(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: vd.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f62066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f62067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f62068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62069d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f62070e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f62072g;

        c(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f62070e = obj;
            this.f62072g |= Integer.MIN_VALUE;
            return C6860a.this.i(null, this);
        }
    }

    /* JADX INFO: renamed from: vd.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f62073a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C6306a f62075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ UpdatesDatabase f62076d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ yd.d f62077e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ JSONObject f62078f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C6306a c6306a, UpdatesDatabase updatesDatabase, yd.d dVar, JSONObject jSONObject, e eVar) {
            super(2, eVar);
            this.f62075c = c6306a;
            this.f62076d = updatesDatabase;
            this.f62077e = dVar;
            this.f62078f = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return C6860a.this.new d(this.f62075c, this.f62076d, this.f62077e, this.f62078f, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((d) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            d dVar;
            Object objF = AbstractC2605b.f();
            int i10 = this.f62073a;
            if (i10 == 0) {
                v.b(obj);
                C6860a c6860a = C6860a.this;
                C6306a c6306a = this.f62075c;
                UpdatesDatabase updatesDatabase = this.f62076d;
                yd.d dVar2 = this.f62077e;
                JSONObject jSONObject = this.f62078f;
                this.f62073a = 1;
                dVar = this;
                obj = c6860a.g(c6306a, updatesDatabase, dVar2, jSONObject, dVar);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                dVar = this;
            }
            return new Pair(dVar.f62075c, (File) obj);
        }
    }

    public C6860a(Context context, expo.modules.updates.d configuration, File updatesDirectory, g fileDownloader, h selectionPolicy, C7136g logger, O scope, boolean z10) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(configuration, "configuration");
        AbstractC5504s.h(updatesDirectory, "updatesDirectory");
        AbstractC5504s.h(fileDownloader, "fileDownloader");
        AbstractC5504s.h(selectionPolicy, "selectionPolicy");
        AbstractC5504s.h(logger, "logger");
        AbstractC5504s.h(scope, "scope");
        this.f62046a = context;
        this.f62047b = configuration;
        this.f62048c = updatesDirectory;
        this.f62049d = fileDownloader;
        this.f62050e = selectionPolicy;
        this.f62051f = logger;
        this.f62052g = scope;
        this.f62053h = z10;
        this.f62054i = new j();
    }

    private final Map f() {
        List<C6306a> listM;
        yd.d dVarB = C7221a.f64999a.b(this.f62046a, this.f62047b);
        if (dVarB == null || (listM = dVarB.a()) == null) {
            listM = AbstractC2279u.m();
        }
        C7136g.k(this.f62051f, "embeddedAssetFileMap: embeddedAssets count = " + listM.size(), null, 2, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C6306a c6306a : listM) {
            if (!c6306a.t()) {
                if (this.f62053h) {
                    String strC = expo.modules.updates.g.f46458a.c(c6306a);
                    c6306a.F(strC);
                    File file = new File(this.f62048c, strC);
                    if (!file.exists()) {
                        this.f62054i.a(c6306a, file, this.f62046a);
                    }
                    if (file.exists()) {
                        linkedHashMap.put(c6306a, Uri.fromFile(file).toString());
                        C7136g.k(this.f62051f, "embeddedAssetFileMap: " + c6306a.j() + f.f34694a + c6306a.r() + " => " + linkedHashMap.get(c6306a), null, 2, null);
                    } else {
                        Exception exc = new Exception("Missing embedded asset");
                        this.f62051f.f("embeddedAssetFileMap: no file for " + c6306a.j() + f.f34694a + c6306a.r(), exc, EnumC7131b.f64347i);
                    }
                } else {
                    String strA = Dd.a.f3689a.a(c6306a);
                    if (strA != null) {
                        c6306a.F(strA);
                        linkedHashMap.put(c6306a, strA);
                        C7136g.k(this.f62051f, "embeddedAssetFileMap: " + c6306a.j() + f.f34694a + c6306a.r() + " => " + linkedHashMap.get(c6306a), null, 2, null);
                    } else {
                        Exception exc2 = new Exception("Missing embedded asset");
                        this.f62051f.f("embeddedAssetFileMap: no file for " + c6306a.j() + f.f34694a + c6306a.r(), exc2, EnumC7131b.f64347i);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @Override // vd.InterfaceC6861b
    public Map a() {
        return this.f62058m;
    }

    @Override // vd.InterfaceC6861b
    public String b() {
        return this.f62056k;
    }

    @Override // vd.InterfaceC6861b
    public String c() {
        return this.f62057l;
    }

    @Override // vd.InterfaceC6861b
    public rd.d d() {
        return this.f62055j;
    }

    @Override // vd.InterfaceC6861b
    public boolean e() {
        return a() == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(rd.C6306a r15, expo.modules.updates.db.UpdatesDatabase r16, yd.d r17, org.json.JSONObject r18, Zd.e r19) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.C6860a.g(rd.a, expo.modules.updates.db.UpdatesDatabase, yd.d, org.json.JSONObject, Zd.e):java.lang.Object");
    }

    public final Object h(UpdatesDatabase updatesDatabase, e eVar) {
        rd.d dVarC;
        rd.d dVarC2;
        List<rd.d> listM = updatesDatabase.Q().m(this.f62047b.s());
        yd.d dVarC3 = C7221a.f64999a.c(this.f62046a, this.f62047b);
        ArrayList arrayList = new ArrayList();
        for (rd.d dVar : listM) {
            UUID uuidD = null;
            if (dVar.m() == EnumC6452b.f59350c) {
                if (!AbstractC5504s.c((dVarC3 == null || (dVarC2 = dVarC3.c()) == null) ? null : dVarC2.d(), dVar.d())) {
                }
            }
            if (!this.f62047b.j()) {
                if (dVarC3 != null && (dVarC = dVarC3.c()) != null) {
                    uuidD = dVarC.d();
                }
                if (AbstractC5504s.c(uuidD, dVar.d())) {
                }
            }
            arrayList.add(dVar);
        }
        return this.f62050e.a(arrayList, k.f65039a.f(updatesDatabase, this.f62047b));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(expo.modules.updates.db.UpdatesDatabase r23, Zd.e r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.C6860a.i(expo.modules.updates.db.UpdatesDatabase, Zd.e):java.lang.Object");
    }

    public /* synthetic */ C6860a(Context context, expo.modules.updates.d dVar, File file, g gVar, h hVar, C7136g c7136g, O o10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dVar, file, gVar, hVar, c7136g, o10, (i10 & 128) != 0 ? false : z10);
    }
}
