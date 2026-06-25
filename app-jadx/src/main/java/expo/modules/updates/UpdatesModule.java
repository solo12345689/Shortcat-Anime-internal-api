package expo.modules.updates;

import Gf.AbstractC1613i;
import Gf.C1608f0;
import Gf.O;
import Td.L;
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import bc.C3042a;
import bc.EnumC3046e;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import dc.C4581b;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.updates.c;
import expo.modules.updates.reloadscreen.ReloadScreenOptions;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.U;
import pc.V;
import pc.X;
import pe.C6029s;
import pe.InterfaceC6014d;
import pe.InterfaceC6018h;
import pe.InterfaceC6022l;
import pe.InterfaceC6025o;
import pe.InterfaceC6027q;
import qe.AbstractC6173c;
import ud.InterfaceC6766b;
import xd.C7132c;
import xd.C7134e;
import xd.C7136g;
import xd.EnumC7131b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lexpo/modules/updates/UpdatesModule;", "Lgc/c;", "Lud/b;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "LCd/b;", "context", "LTd/L;", "b", "(LCd/b;)V", "Lxd/g;", "A", "()Lxd/g;", "logger", "Landroid/content/Context;", "z", "()Landroid/content/Context;", "d", "a", "UpdatesConfigurationOverrideParam", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpdatesModule extends gc.c implements InterfaceC6766b {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f46262e = UpdatesModule.class.getSimpleName();

    /* JADX INFO: renamed from: expo.modules.updates.UpdatesModule$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {

        /* JADX INFO: renamed from: expo.modules.updates.UpdatesModule$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0734a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f46263a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f46264b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f46265c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0734a(File file, long j10, Zd.e eVar) {
                super(2, eVar);
                this.f46264b = file;
                this.f46265c = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new C0734a(this.f46264b, this.f46265c, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((C0734a) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f46263a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                List listC = new C7134e(this.f46264b).c(new Date(new Date().getTime() - this.f46265c));
                ArrayList<C7132c> arrayList = new ArrayList();
                Iterator it = listC.iterator();
                while (it.hasNext()) {
                    C7132c c7132cA = C7132c.f64354i.a((String) it.next());
                    if (c7132cA != null) {
                        arrayList.add(c7132cA);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(arrayList, 10));
                for (C7132c c7132c : arrayList) {
                    Bundle bundle = new Bundle();
                    bundle.putLong(DiagnosticsEntry.TIMESTAMP_KEY, c7132c.g());
                    bundle.putString("message", c7132c.e());
                    bundle.putString("code", c7132c.c());
                    bundle.putString("level", c7132c.d());
                    if (c7132c.h() != null) {
                        bundle.putString("updateId", c7132c.h());
                    }
                    if (c7132c.b() != null) {
                        bundle.putString("assetId", c7132c.b());
                    }
                    if (c7132c.f() != null) {
                        bundle.putStringArray("stacktrace", (String[]) c7132c.f().toArray(new String[0]));
                    }
                    arrayList2.add(bundle);
                }
                return arrayList2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(File file, Function1 function1, Zd.e eVar) {
            new C7134e(file).e(new Date(), function1);
            return L.f17438a;
        }

        public final Object b(File file, long j10, Zd.e eVar) {
            return AbstractC1613i.g(C1608f0.b(), new C0734a(file, j10, null), eVar);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46266a = new b();

        b() {
        }

        public final void a(Exception exc) throws CodedException {
            if (exc != null) {
                throw new CodedException("ERR_UPDATES_READ_LOGS", "There was an error when clearing the expo-updates log file", exc);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws CodedException {
            a((Exception) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c implements InterfaceC5082a {
        c() {
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            File filesDir = UpdatesModule.this.z().getFilesDir();
            AbstractC5504s.g(filesDir, "getFilesDir(...)");
            new C7136g(filesDir).i("UpdatesModule: getConstants called", EnumC7131b.f64340b);
            return expo.modules.updates.f.a().j().a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d implements InterfaceC5082a {
        d() {
        }

        public final void a() {
            expo.modules.updates.f.f46454a.f(new WeakReference(UpdatesModule.this));
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f46269a = new e();

        e() {
        }

        public final void a() {
            expo.modules.updates.f.f46454a.e();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements Function2 {
        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, Ub.u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (Ub.u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f46271a = new g();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(ReloadScreenOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements Function1 {
        public h() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f46274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UpdatesModule f46275c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Zd.e eVar, UpdatesModule updatesModule) {
            super(3, eVar);
            this.f46275c = updatesModule;
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(O o10, Object[] objArr, Zd.e eVar) {
            j jVar = new j(eVar, this.f46275c);
            jVar.f46274b = objArr;
            return jVar.invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f46273a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                return obj;
            }
            Td.v.b(obj);
            long jLongValue = ((Number) ((Object[]) this.f46274b)[0]).longValue();
            Companion companion = UpdatesModule.INSTANCE;
            File filesDir = this.f46275c.z().getFilesDir();
            AbstractC5504s.g(filesDir, "getFilesDir(...)");
            this.f46273a = 1;
            Object objB = companion.b(filesDir, jLongValue, this);
            return objB == objF ? objF : objB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UpdatesModule f46277b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Zd.e eVar, UpdatesModule updatesModule) {
            super(3, eVar);
            this.f46277b = updatesModule;
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(O o10, Object[] objArr, Zd.e eVar) {
            return new k(eVar, this.f46277b).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f46276a;
            if (i10 == 0) {
                Td.v.b(obj);
                Companion companion = UpdatesModule.INSTANCE;
                File filesDir = this.f46277b.z().getFilesDir();
                AbstractC5504s.g(filesDir, "getFilesDir(...)");
                b bVar = b.f46266a;
                this.f46276a = 1;
                if (companion.a(filesDir, bVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f46278a = new l();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(ReloadScreenOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f46280b;

        public m(Zd.e eVar) {
            super(3, eVar);
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(O o10, Object[] objArr, Zd.e eVar) {
            m mVar = new m(eVar);
            mVar.f46280b = objArr;
            return mVar.invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f46279a;
            if (i10 == 0) {
                Td.v.b(obj);
                ReloadScreenOptions reloadScreenOptions = (ReloadScreenOptions) ((Object[]) this.f46280b)[0];
                Ad.d dVarK = expo.modules.updates.f.a().k();
                if (dVarK != null) {
                    dVarK.h(reloadScreenOptions);
                }
                expo.modules.updates.c cVarA = expo.modules.updates.f.a();
                this.f46279a = 1;
                if (cVarA.e(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46281a;

        public n(Zd.e eVar) {
            super(3, eVar);
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(O o10, Object[] objArr, Zd.e eVar) {
            return new n(eVar).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws CodedException {
            Object objF = AbstractC2605b.f();
            int i10 = this.f46281a;
            if (i10 == 0) {
                Td.v.b(obj);
                expo.modules.updates.c cVarA = expo.modules.updates.f.a();
                this.f46281a = 1;
                obj = cVarA.i(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            c.a aVar = (c.a) obj;
            if (aVar instanceof c.a.C0738a) {
                throw new CodedException("ERR_UPDATES_CHECK", "Failed to check for update", ((c.a.C0738a) aVar).a());
            }
            if (aVar instanceof c.a.b) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("isRollBackToEmbedded", false);
                bundle.putBoolean("isAvailable", false);
                bundle.putString("reason", ((c.a.b) aVar).a().b());
                return bundle;
            }
            if (aVar instanceof c.a.C0739c) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("isRollBackToEmbedded", true);
                bundle2.putBoolean("isAvailable", false);
                return bundle2;
            }
            if (!(aVar instanceof c.a.e)) {
                throw new Td.r();
            }
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("isRollBackToEmbedded", false);
            bundle3.putBoolean("isAvailable", true);
            bundle3.putString("manifestString", ((c.a.e) aVar).a().d().toString());
            return bundle3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46282a;

        public o(Zd.e eVar) {
            super(3, eVar);
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(O o10, Object[] objArr, Zd.e eVar) {
            return new o(eVar).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws CodedException {
            Object objF = AbstractC2605b.f();
            int i10 = this.f46282a;
            if (i10 == 0) {
                Td.v.b(obj);
                expo.modules.updates.c cVarA = expo.modules.updates.f.a();
                this.f46282a = 1;
                obj = cVarA.q(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            c.b bVar = (c.b) obj;
            if (bVar instanceof c.b.a) {
                throw new CodedException("ERR_UPDATES_FETCH", "Failed to download new update", ((c.b.a) bVar).a());
            }
            if (bVar instanceof c.b.C0740b) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("isRollBackToEmbedded", false);
                bundle.putBoolean("isNew", false);
                return bundle;
            }
            if (bVar instanceof c.b.C0741c) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("isRollBackToEmbedded", true);
                bundle2.putBoolean("isNew", false);
                return bundle2;
            }
            if (!(bVar instanceof c.b.e)) {
                throw new Td.r();
            }
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("isRollBackToEmbedded", false);
            bundle3.putBoolean("isNew", true);
            bundle3.putString("manifestString", ((c.b.e) bVar).a().i().toString());
            return bundle3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UpdatesModule f46284b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Zd.e eVar, UpdatesModule updatesModule) {
            super(3, eVar);
            this.f46284b = updatesModule;
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(O o10, Object[] objArr, Zd.e eVar) {
            return new p(eVar, this.f46284b).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f46283a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                return obj;
            }
            Td.v.b(obj);
            C7136g.e(this.f46284b.A(), "Called getExtraParamsAsync", null, 2, null);
            expo.modules.updates.c cVarA = expo.modules.updates.f.a();
            this.f46283a = 1;
            Object objP = cVarA.p(this);
            return objP == objF ? objF : objP;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class q implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f46285a = new q();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class r implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f46286a = new r();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class s extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f46288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UpdatesModule f46289c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Zd.e eVar, UpdatesModule updatesModule) {
            super(3, eVar);
            this.f46289c = updatesModule;
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(O o10, Object[] objArr, Zd.e eVar) {
            s sVar = new s(eVar, this.f46289c);
            sVar.f46288b = objArr;
            return sVar.invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f46287a;
            if (i10 == 0) {
                Td.v.b(obj);
                Object[] objArr = (Object[]) this.f46288b;
                Object obj2 = objArr[0];
                String str = (String) objArr[1];
                String str2 = (String) obj2;
                C7136g.e(this.f46289c.A(), "Called setExtraParamAsync with key = " + str2 + ", value = " + str, null, 2, null);
                expo.modules.updates.c cVarA = expo.modules.updates.f.a();
                this.f46287a = 1;
                if (cVarA.h(str2, str, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class t implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f46290a = new t();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(Long.TYPE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f46291a = new u();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(UpdatesConfigurationOverrideParam.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class v implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            UpdatesConfigurationOverrideParam updatesConfigurationOverrideParam = (UpdatesConfigurationOverrideParam) objArr[0];
            expo.modules.updates.f.a().r(updatesConfigurationOverrideParam != null ? updatesConfigurationOverrideParam.toUpdatesConfigurationOverride() : null);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class w implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w f46292a = new w();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            C6029s.a aVar = C6029s.f56013c;
            return kotlin.jvm.internal.O.h(Map.class, aVar.d(kotlin.jvm.internal.O.o(String.class)), aVar.d(kotlin.jvm.internal.O.o(String.class)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class x implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            expo.modules.updates.f.a().g((Map) objArr[0]);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class y implements InterfaceC5082a {
        public final void a() {
            expo.modules.updates.f.f46454a.e();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7136g A() {
        File filesDir = z().getFilesDir();
        AbstractC5504s.g(filesDir, "getFilesDir(...)");
        return new C7136g(filesDir);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context z() throws cc.i {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new cc.i();
    }

    @Override // ud.InterfaceC6766b
    public void b(Cd.b context) {
        AbstractC5504s.h(context, "context");
        UpdatesJSEvent updatesJSEvent = UpdatesJSEvent.StateChange;
        Bundle bundle = new Bundle();
        bundle.putBundle("context", context.f());
        L l10 = L.f17438a;
        r(updatesJSEvent, bundle);
    }

    @Override // gc.c
    public gc.e n() {
        ArrayList arrayList;
        Class cls;
        Class cls2;
        Class cls3;
        C5974d c5974d;
        Object obj;
        dc.g lVar;
        List parameters;
        Object next;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoUpdates");
            InterfaceC6018h interfaceC6018hB = Ub.n.b(kotlin.jvm.internal.O.b(UpdatesJSEvent.class));
            if (interfaceC6018hB == null || (parameters = interfaceC6018hB.getParameters()) == null || parameters.size() != 1) {
                UpdatesJSEvent[] updatesJSEventArrValues = UpdatesJSEvent.values();
                arrayList = new ArrayList(updatesJSEventArrValues.length);
                for (UpdatesJSEvent updatesJSEvent : updatesJSEventArrValues) {
                    arrayList.add(updatesJSEvent.name());
                }
            } else {
                String name = ((InterfaceC6022l) AbstractC2279u.m0(interfaceC6018hB.getParameters())).getName();
                Iterator it = AbstractC6173c.a(kotlin.jvm.internal.O.b(UpdatesJSEvent.class)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (AbstractC5504s.c(((InterfaceC6025o) next).getName(), name)) {
                        break;
                    }
                }
                InterfaceC6025o interfaceC6025o = (InterfaceC6025o) next;
                if (interfaceC6025o == null) {
                    throw new IllegalArgumentException(("Cannot find a property for " + name + " parameter").toString());
                }
                if (!AbstractC5504s.c(interfaceC6025o.getReturnType().c(), kotlin.jvm.internal.O.b(String.class))) {
                    throw new IllegalArgumentException("The enum parameter has to be a string.");
                }
                UpdatesJSEvent[] updatesJSEventArrValues2 = UpdatesJSEvent.values();
                arrayList = new ArrayList(updatesJSEventArrValues2.length);
                for (UpdatesJSEvent updatesJSEvent2 : updatesJSEventArrValues2) {
                    Object obj2 = interfaceC6025o.get(updatesJSEvent2);
                    AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.String");
                    arrayList.add((String) obj2);
                }
            }
            dVar.r(new bc.f((String[]) arrayList.toArray(new String[0])));
            dVar.c(new c());
            UpdatesJSEvent updatesJSEvent3 = UpdatesJSEvent.StateChange;
            dVar.e(updatesJSEvent3, new d());
            dVar.g(updatesJSEvent3, e.f46269a);
            Map mapW = dVar.w();
            EnumC3046e enumC3046e = EnumC3046e.f33269b;
            mapW.put(enumC3046e, new C3042a(enumC3046e, new y()));
            C4581b c4581bB = dVar.b("reload");
            String strC = c4581bB.c();
            X xB = c4581bB.b();
            C5974d c5974d2 = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = kotlin.jvm.internal.O.b(ReloadScreenOptions.class);
            Boolean bool = Boolean.TRUE;
            C5972b c5972b = (C5972b) c5974d2.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b == null) {
                cls = Map.class;
                cls2 = UpdatesConfigurationOverrideParam.class;
                cls3 = Long.class;
                c5972b = new C5972b(new M(kotlin.jvm.internal.O.b(ReloadScreenOptions.class), true, l.f46278a), xB);
            } else {
                cls = Map.class;
                cls2 = UpdatesConfigurationOverrideParam.class;
                cls3 = Long.class;
            }
            c4581bB.d(new dc.p(strC, new C5972b[]{c5972b}, new m(null)));
            C4581b c4581bB2 = dVar.b("checkForUpdateAsync");
            c4581bB2.d(new dc.p(c4581bB2.c(), new C5972b[0], new n(null)));
            C4581b c4581bB3 = dVar.b("fetchUpdateAsync");
            c4581bB3.d(new dc.p(c4581bB3.c(), new C5972b[0], new o(null)));
            C4581b c4581bB4 = dVar.b("getExtraParamsAsync");
            c4581bB4.d(new dc.p(c4581bB4.c(), new C5972b[0], new p(null, this)));
            C4581b c4581bB5 = dVar.b("setExtraParamAsync");
            String strC2 = c4581bB5.c();
            X xB2 = c4581bB5.b();
            InterfaceC6014d interfaceC6014dB2 = kotlin.jvm.internal.O.b(String.class);
            Boolean bool2 = Boolean.FALSE;
            C5972b c5972b2 = (C5972b) c5974d2.a().get(new Pair(interfaceC6014dB2, bool2));
            if (c5972b2 == null) {
                c5974d = c5974d2;
                c5972b2 = new C5972b(new M(kotlin.jvm.internal.O.b(String.class), false, q.f46285a), xB2);
            } else {
                c5974d = c5974d2;
            }
            C5972b c5972b3 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(String.class), bool));
            if (c5972b3 == null) {
                obj = String.class;
                c5972b3 = new C5972b(new M(kotlin.jvm.internal.O.b(String.class), true, r.f46286a), xB2);
            } else {
                obj = String.class;
            }
            c4581bB5.d(new dc.p(strC2, new C5972b[]{c5972b2, c5972b3}, new s(null, this)));
            C4581b c4581bB6 = dVar.b("readLogEntriesAsync");
            String strC3 = c4581bB6.c();
            X xB3 = c4581bB6.b();
            C5972b c5972b4 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls3), bool2));
            if (c5972b4 == null) {
                c5972b4 = new C5972b(new M(kotlin.jvm.internal.O.b(cls3), false, t.f46290a), xB3);
            }
            c4581bB6.d(new dc.p(strC3, new C5972b[]{c5972b4}, new j(null, this)));
            C4581b c4581bB7 = dVar.b("clearLogEntriesAsync");
            c4581bB7.d(new dc.p(c4581bB7.c(), new C5972b[0], new k(null, this)));
            X xM = dVar.m();
            C5972b c5972b5 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool));
            if (c5972b5 == null) {
                c5972b5 = new C5972b(new M(kotlin.jvm.internal.O.b(cls2), true, u.f46291a), xM);
            }
            C5972b[] c5972bArr = {c5972b5};
            V v10 = V.f55908a;
            U u10 = (U) v10.a().get(kotlin.jvm.internal.O.b(L.class));
            if (u10 == null) {
                u10 = new U(kotlin.jvm.internal.O.b(L.class));
                v10.a().put(kotlin.jvm.internal.O.b(L.class), u10);
            }
            dVar.p().put("setUpdateURLAndRequestHeadersOverride", new dc.r("setUpdateURLAndRequestHeadersOverride", c5972bArr, u10, new v()));
            X xM2 = dVar.m();
            C5972b c5972b6 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls), bool));
            if (c5972b6 == null) {
                c5972b6 = new C5972b(new M(kotlin.jvm.internal.O.b(cls), true, w.f46292a), xM2);
            }
            C5972b[] c5972bArr2 = {c5972b6};
            U u11 = (U) v10.a().get(kotlin.jvm.internal.O.b(L.class));
            if (u11 == null) {
                u11 = new U(kotlin.jvm.internal.O.b(L.class));
                v10.a().put(kotlin.jvm.internal.O.b(L.class), u11);
            }
            dVar.p().put("setUpdateRequestHeadersOverride", new dc.r("setUpdateRequestHeadersOverride", c5972bArr2, u11, new x()));
            if (AbstractC5504s.c(ReloadScreenOptions.class, Ub.u.class)) {
                lVar = new dc.f("showReloadScreen", new C5972b[0], new f());
            } else {
                X xM3 = dVar.m();
                C5972b c5972b7 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(ReloadScreenOptions.class), bool));
                if (c5972b7 == null) {
                    c5972b7 = new C5972b(new M(kotlin.jvm.internal.O.b(ReloadScreenOptions.class), true, g.f46271a), xM3);
                }
                C5972b[] c5972bArr3 = {c5972b7};
                h hVar = new h();
                lVar = AbstractC5504s.c(L.class, Integer.TYPE) ? new dc.l("showReloadScreen", c5972bArr3, hVar) : AbstractC5504s.c(L.class, Boolean.TYPE) ? new dc.h("showReloadScreen", c5972bArr3, hVar) : AbstractC5504s.c(L.class, Double.TYPE) ? new dc.i("showReloadScreen", c5972bArr3, hVar) : AbstractC5504s.c(L.class, Float.TYPE) ? new dc.j("showReloadScreen", c5972bArr3, hVar) : AbstractC5504s.c(L.class, obj) ? new dc.n("showReloadScreen", c5972bArr3, hVar) : new dc.s("showReloadScreen", c5972bArr3, hVar);
            }
            dVar.k().put("showReloadScreen", lVar);
            dc.m mVar = dc.m.f45116a;
            lVar.n(mVar);
            dc.s sVar = new dc.s("hideReloadScreen", new C5972b[0], new i());
            dVar.k().put("hideReloadScreen", sVar);
            sVar.n(mVar);
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\rR,\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u000f¨\u0006#"}, d2 = {"Lexpo/modules/updates/UpdatesModule$UpdatesConfigurationOverrideParam;", "Ljc/b;", "Landroid/net/Uri;", "updateUrl", "", "", "requestHeaders", "<init>", "(Landroid/net/Uri;Ljava/util/Map;)V", "Lexpo/modules/updates/e;", "toUpdatesConfigurationOverride", "()Lexpo/modules/updates/e;", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/util/Map;", "copy", "(Landroid/net/Uri;Ljava/util/Map;)Lexpo/modules/updates/UpdatesModule$UpdatesConfigurationOverrideParam;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getUpdateUrl", "getUpdateUrl$annotations", "()V", "Ljava/util/Map;", "getRequestHeaders", "getRequestHeaders$annotations", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdatesConfigurationOverrideParam implements InterfaceC5364b {
        private final Map<String, String> requestHeaders;
        private final Uri updateUrl;

        public UpdatesConfigurationOverrideParam(Uri updateUrl, Map<String, String> requestHeaders) {
            AbstractC5504s.h(updateUrl, "updateUrl");
            AbstractC5504s.h(requestHeaders, "requestHeaders");
            this.updateUrl = updateUrl;
            this.requestHeaders = requestHeaders;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UpdatesConfigurationOverrideParam copy$default(UpdatesConfigurationOverrideParam updatesConfigurationOverrideParam, Uri uri, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uri = updatesConfigurationOverrideParam.updateUrl;
            }
            if ((i10 & 2) != 0) {
                map = updatesConfigurationOverrideParam.requestHeaders;
            }
            return updatesConfigurationOverrideParam.copy(uri, map);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Uri getUpdateUrl() {
            return this.updateUrl;
        }

        public final Map<String, String> component2() {
            return this.requestHeaders;
        }

        public final UpdatesConfigurationOverrideParam copy(Uri updateUrl, Map<String, String> requestHeaders) {
            AbstractC5504s.h(updateUrl, "updateUrl");
            AbstractC5504s.h(requestHeaders, "requestHeaders");
            return new UpdatesConfigurationOverrideParam(updateUrl, requestHeaders);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdatesConfigurationOverrideParam)) {
                return false;
            }
            UpdatesConfigurationOverrideParam updatesConfigurationOverrideParam = (UpdatesConfigurationOverrideParam) other;
            return AbstractC5504s.c(this.updateUrl, updatesConfigurationOverrideParam.updateUrl) && AbstractC5504s.c(this.requestHeaders, updatesConfigurationOverrideParam.requestHeaders);
        }

        public final Map<String, String> getRequestHeaders() {
            return this.requestHeaders;
        }

        public final Uri getUpdateUrl() {
            return this.updateUrl;
        }

        public int hashCode() {
            return (this.updateUrl.hashCode() * 31) + this.requestHeaders.hashCode();
        }

        public String toString() {
            return "UpdatesConfigurationOverrideParam(updateUrl=" + this.updateUrl + ", requestHeaders=" + this.requestHeaders + ")";
        }

        public final expo.modules.updates.e toUpdatesConfigurationOverride() {
            return new expo.modules.updates.e(this.updateUrl, this.requestHeaders);
        }

        @InterfaceC5363a
        public static /* synthetic */ void getRequestHeaders$annotations() {
        }

        @InterfaceC5363a
        public static /* synthetic */ void getUpdateUrl$annotations() {
        }
    }
}
