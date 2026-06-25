package V1;

import T1.InterfaceC2143g;
import Td.AbstractC2163n;
import Td.L;
import Td.v;
import Ud.AbstractC2279u;
import Zd.e;
import ae.AbstractC2605b;
import android.content.Context;
import android.content.SharedPreferences;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC2143g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function2 f19694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5096o f19695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f19696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f19698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f19699f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: V1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0340a extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19700a;

        C0340a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, e eVar) {
            return ((C0340a) create(obj, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C0340a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f19700a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f19701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19702b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(0);
            this.f19701a = context;
            this.f19702b = str;
        }

        @Override // ie.InterfaceC5082a
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f19701a.getSharedPreferences(this.f19702b, 0);
            AbstractC5504s.g(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f19703a = new c();

        private c() {
        }

        public static final boolean a(Context context, String name) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f19704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19705b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f19707d;

        d(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19705b = obj;
            this.f19707d |= Integer.MIN_VALUE;
            return a.this.c(null, this);
        }
    }

    private a(InterfaceC5082a interfaceC5082a, Set set, Function2 function2, InterfaceC5096o interfaceC5096o, Context context, String str) {
        this.f19694a = function2;
        this.f19695b = interfaceC5096o;
        this.f19696c = context;
        this.f19697d = str;
        this.f19698e = AbstractC2163n.b(interfaceC5082a);
        this.f19699f = set == V1.b.a() ? null : AbstractC2279u.e1(set);
    }

    private final void d(Context context, String str) {
        c.a(context, str);
    }

    private final SharedPreferences e() {
        return (SharedPreferences) this.f19698e.getValue();
    }

    @Override // T1.InterfaceC2143g
    public Object a(Object obj, e eVar) {
        return this.f19695b.invoke(new V1.c(e(), this.f19699f), obj, eVar);
    }

    @Override // T1.InterfaceC2143g
    public Object b(e eVar) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = e().edit();
        Set set = this.f19699f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (e().getAll().isEmpty() && (context = this.f19696c) != null && (str = this.f19697d) != null) {
            d(context, str);
        }
        Set set2 = this.f19699f;
        if (set2 != null) {
            set2.clear();
        }
        return L.f17438a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // T1.InterfaceC2143g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.Object r5, Zd.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof V1.a.d
            if (r0 == 0) goto L13
            r0 = r6
            V1.a$d r0 = (V1.a.d) r0
            int r1 = r0.f19707d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19707d = r1
            goto L18
        L13:
            V1.a$d r0 = new V1.a$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19705b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f19707d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f19704a
            V1.a r5 = (V1.a) r5
            Td.v.b(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            Td.v.b(r6)
            kotlin.jvm.functions.Function2 r6 = r4.f19694a
            r0.f19704a = r4
            r0.f19707d = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 != 0) goto L54
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r0)
            return r5
        L54:
            java.util.Set r6 = r5.f19699f
            if (r6 != 0) goto L6e
            android.content.SharedPreferences r5 = r5.e()
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            kotlin.jvm.internal.AbstractC5504s.g(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L6c
            goto L98
        L6c:
            r3 = r0
            goto L98
        L6e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            android.content.SharedPreferences r5 = r5.e()
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L82
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L82
            goto L6c
        L82:
            java.util.Iterator r6 = r6.iterator()
        L86:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L86
        L98:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.a.c(java.lang.Object, Zd.e):java.lang.Object");
    }

    public /* synthetic */ a(Context context, String str, Set set, Function2 function2, InterfaceC5096o interfaceC5096o, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? V1.b.a() : set, (i10 & 8) != 0 ? new C0340a(null) : function2, interfaceC5096o);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String sharedPreferencesName, Set keysToMigrate, Function2 shouldRunMigration, InterfaceC5096o migrate) {
        this(new b(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(sharedPreferencesName, "sharedPreferencesName");
        AbstractC5504s.h(keysToMigrate, "keysToMigrate");
        AbstractC5504s.h(shouldRunMigration, "shouldRunMigration");
        AbstractC5504s.h(migrate, "migrate");
    }
}
