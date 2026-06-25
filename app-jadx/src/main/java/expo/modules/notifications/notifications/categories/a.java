package expo.modules.notifications.notifications.categories;

import Td.L;
import Ub.u;
import Ud.AbstractC2279u;
import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.facebook.react.bridge.BaseJavaModule;
import dc.l;
import dc.n;
import dc.s;
import expo.modules.notifications.notifications.categories.NotificationActionRecord;
import expo.modules.notifications.service.NotificationsService;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.C6029s;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;
import rb.C6303d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00122\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0014¢\u0006\u0004\b!\u0010\"R\u001a\u0010(\u001a\u00020#8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lexpo/modules/notifications/notifications/categories/a;", "Lgc/c;", "<init>", "()V", "Lkotlin/Function2;", "", "Landroid/os/Bundle;", "LTd/L;", "Lexpo/modules/notifications/ResultReceiverBody;", "body", "Landroid/os/ResultReceiver;", "B", "(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;", "Lgc/e;", "n", "()Lgc/e;", "", "identifier", "", "Lexpo/modules/notifications/notifications/categories/NotificationActionRecord;", "actionArguments", "", "", "categoryOptions", "LUb/u;", BaseJavaModule.METHOD_TYPE_PROMISE, "G", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;LUb/u;)V", "C", "(Ljava/lang/String;LUb/u;)V", "", "LPc/c;", "categories", "F", "(Ljava/util/Collection;)Ljava/util/List;", "LGc/a;", "d", "LGc/a;", "getSerializer", "()LGc/a;", "serializer", "Landroid/content/Context;", "E", "()Landroid/content/Context;", "context", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a extends gc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Gc.a serializer = new Gc.a();

    /* JADX INFO: renamed from: expo.modules.notifications.notifications.categories.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0733a implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f46246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f46247b;

        C0733a(u uVar, a aVar) {
            this.f46246a = uVar;
            this.f46247b = aVar;
        }

        public final void a(int i10, Bundle bundle) {
            ArrayList parcelableArrayList = bundle != null ? bundle.getParcelableArrayList("notificationCategories") : null;
            if (i10 != 0 || parcelableArrayList == null) {
                this.f46246a.reject("ERR_CATEGORIES_FETCH_FAILED", "A list of notification categories could not be fetched.", null);
            } else {
                this.f46246a.g(this.f46247b.F(parcelableArrayList));
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), (Bundle) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Function2 {
        public b() {
        }

        public final void a(Object[] objArr, u promise) throws cc.i {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            NotificationsService.Companion companion = NotificationsService.INSTANCE;
            Context contextE = a.this.E();
            a aVar = a.this;
            companion.k(contextE, aVar.B(new C0733a(promise, aVar)));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws cc.i {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f46249a = new c();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(u.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Function1 {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws cc.i {
            AbstractC5504s.h(objArr, "<destruct>");
            u uVar = (u) objArr[0];
            NotificationsService.Companion companion = NotificationsService.INSTANCE;
            Context contextE = a.this.E();
            a aVar = a.this;
            companion.k(contextE, aVar.B(new C0733a(uVar, aVar)));
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f46251a = new e();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f46252a = new f();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.p(List.class, C6029s.f56013c.d(O.o(NotificationActionRecord.class)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f46253a = new g();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            C6029s.a aVar = C6029s.f56013c;
            return O.h(Map.class, aVar.d(O.o(String.class)), aVar.d(O.f(Object.class)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements Function2 {
        public h() {
        }

        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<destruct>");
            AbstractC5504s.h(promise, "promise");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Map map = (Map) objArr[2];
            a aVar = a.this;
            aVar.G((String) obj, (List) obj2, map, promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f46255a = new i();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements Function2 {
        public j() {
        }

        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<destruct>");
            AbstractC5504s.h(promise, "promise");
            a.this.C((String) objArr[0], promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResultReceiver B(Function2 body) {
        return Bc.e.b(null, body);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L D(u uVar, int i10, Bundle bundle) {
        if (i10 == 0) {
            uVar.resolve(bundle != null ? Boolean.valueOf(bundle.getBoolean("succeeded")) : null);
        } else {
            uVar.reject("ERR_CATEGORY_DELETE_FAILED", "The category could not be deleted.", null);
        }
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context E() throws cc.i {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new cc.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L H(u uVar, a aVar, int i10, Bundle bundle) {
        Pc.c cVar = bundle != null ? (Pc.c) bundle.getParcelable("notificationCategory") : null;
        if (i10 != 0 || cVar == null) {
            uVar.reject("ERR_CATEGORY_SET_FAILED", "The provided category could not be set.", null);
        } else {
            uVar.resolve(aVar.serializer.c(cVar));
        }
        return L.f17438a;
    }

    public void C(String identifier, final u promise) {
        AbstractC5504s.h(identifier, "identifier");
        AbstractC5504s.h(promise, "promise");
        NotificationsService.INSTANCE.d(E(), identifier, B(new Function2() { // from class: Fc.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return expo.modules.notifications.notifications.categories.a.D(promise, ((Integer) obj).intValue(), (Bundle) obj2);
            }
        }));
    }

    protected List F(Collection categories) {
        AbstractC5504s.h(categories, "categories");
        Collection collection = categories;
        Gc.a aVar = this.serializer;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.c((Pc.c) it.next()));
        }
        return arrayList;
    }

    public void G(String identifier, List actionArguments, Map categoryOptions, final u promise) {
        AbstractC5504s.h(identifier, "identifier");
        AbstractC5504s.h(actionArguments, "actionArguments");
        AbstractC5504s.h(promise, "promise");
        ArrayList arrayList = new ArrayList();
        Iterator it = actionArguments.iterator();
        while (it.hasNext()) {
            NotificationActionRecord notificationActionRecord = (NotificationActionRecord) it.next();
            NotificationActionRecord.TextInput textInput = notificationActionRecord.getTextInput();
            if (textInput != null) {
                arrayList.add(new Pc.j(notificationActionRecord.getIdentifier(), notificationActionRecord.getButtonTitle(), notificationActionRecord.getOptions().getOpensAppToForeground(), textInput.getPlaceholder()));
            } else {
                arrayList.add(new Pc.b(notificationActionRecord.getIdentifier(), notificationActionRecord.getButtonTitle(), notificationActionRecord.getOptions().getOpensAppToForeground()));
            }
        }
        if (arrayList.isEmpty()) {
            throw new C6303d("Invalid arguments provided for notification category. Must provide at least one action.");
        }
        NotificationsService.INSTANCE.A(E(), new Pc.c(identifier, arrayList), B(new Function2() { // from class: Fc.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return expo.modules.notifications.notifications.categories.a.H(promise, this, ((Integer) obj).intValue(), (Bundle) obj2);
            }
        }));
    }

    @Override // gc.c
    public gc.e n() {
        dc.g lVar;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoNotificationCategoriesModule");
            if (AbstractC5504s.c(u.class, u.class)) {
                lVar = new dc.f("getNotificationCategoriesAsync", new C5972b[0], new b());
            } else {
                X xM = dVar.m();
                C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(u.class), Boolean.FALSE));
                if (c5972b == null) {
                    c5972b = new C5972b(new M(O.b(u.class), false, c.f46249a), xM);
                }
                C5972b[] c5972bArr = {c5972b};
                d dVar2 = new d();
                lVar = AbstractC5504s.c(L.class, Integer.TYPE) ? new l("getNotificationCategoriesAsync", c5972bArr, dVar2) : AbstractC5504s.c(L.class, Boolean.TYPE) ? new dc.h("getNotificationCategoriesAsync", c5972bArr, dVar2) : AbstractC5504s.c(L.class, Double.TYPE) ? new dc.i("getNotificationCategoriesAsync", c5972bArr, dVar2) : AbstractC5504s.c(L.class, Float.TYPE) ? new dc.j("getNotificationCategoriesAsync", c5972bArr, dVar2) : AbstractC5504s.c(L.class, String.class) ? new n("getNotificationCategoriesAsync", c5972bArr, dVar2) : new s("getNotificationCategoriesAsync", c5972bArr, dVar2);
            }
            dVar.k().put("getNotificationCategoriesAsync", lVar);
            X xM2 = dVar.m();
            C5974d c5974d = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = O.b(String.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b2 = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b2 == null) {
                c5972b2 = new C5972b(new M(O.b(String.class), false, e.f46251a), xM2);
            }
            C5972b c5972b3 = (C5972b) c5974d.a().get(new Pair(O.b(List.class), bool));
            if (c5972b3 == null) {
                c5972b3 = new C5972b(new M(O.b(List.class), false, f.f46252a), xM2);
            }
            C5972b c5972b4 = (C5972b) c5974d.a().get(new Pair(O.b(Map.class), Boolean.TRUE));
            if (c5972b4 == null) {
                c5972b4 = new C5972b(new M(O.b(Map.class), true, g.f46253a), xM2);
            }
            dVar.k().put("setNotificationCategoryAsync", new dc.f("setNotificationCategoryAsync", new C5972b[]{c5972b2, c5972b3, c5972b4}, new h()));
            X xM3 = dVar.m();
            C5972b c5972b5 = (C5972b) c5974d.a().get(new Pair(O.b(String.class), bool));
            if (c5972b5 == null) {
                c5972b5 = new C5972b(new M(O.b(String.class), false, i.f46255a), xM3);
            }
            dVar.k().put("deleteNotificationCategoryAsync", new dc.f("deleteNotificationCategoryAsync", new C5972b[]{c5972b5}, new j()));
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
