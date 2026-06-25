package cd;

import Td.L;
import Ub.u;
import com.google.firebase.messaging.FirebaseMessaging;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import n9.InterfaceC5760d;
import n9.i;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;

/* JADX INFO: renamed from: cd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcd/a;", "Lgc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C3095a extends gc.c {

    /* JADX INFO: renamed from: cd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0572a implements InterfaceC5760d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f33601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f33602b;

        C0572a(u uVar, String str) {
            this.f33601a = uVar;
            this.f33602b = str;
        }

        @Override // n9.InterfaceC5760d
        public final void a(i task) {
            String message;
            AbstractC5504s.h(task, "task");
            if (task.o()) {
                this.f33601a.resolve((Object) null);
                return;
            }
            Exception excJ = task.j();
            u uVar = this.f33601a;
            String str = this.f33602b;
            if (excJ == null || (message = excJ.getMessage()) == null) {
                message = "unknown";
            }
            uVar.reject("E_TOPIC_SUBSCRIBE_FAILED", "Subscribing to the topic '" + str + "' failed: " + message, excJ);
        }
    }

    /* JADX INFO: renamed from: cd.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements InterfaceC5760d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f33603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f33604b;

        b(u uVar, String str) {
            this.f33603a = uVar;
            this.f33604b = str;
        }

        @Override // n9.InterfaceC5760d
        public final void a(i task) {
            String message;
            AbstractC5504s.h(task, "task");
            if (task.o()) {
                this.f33603a.resolve((Object) null);
                return;
            }
            Exception excJ = task.j();
            u uVar = this.f33603a;
            String str = this.f33604b;
            if (excJ == null || (message = excJ.getMessage()) == null) {
                message = "unknown";
            }
            uVar.reject("E_TOPIC_UNSUBSCRIBE_FAILED", "Unsubscribing from the topic '" + str + "' failed: " + message, excJ);
        }
    }

    /* JADX INFO: renamed from: cd.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f33605a = new c();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: renamed from: cd.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Function2 {
        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<destruct>");
            AbstractC5504s.h(promise, "promise");
            String str = (String) objArr[0];
            FirebaseMessaging.t().N(str).c(new C0572a(promise, str));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: cd.a$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f33606a = new e();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: renamed from: cd.a$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements Function2 {
        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<destruct>");
            AbstractC5504s.h(promise, "promise");
            String str = (String) objArr[0];
            FirebaseMessaging.t().Q(str).c(new b(promise, str));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    @Override // gc.c
    public gc.e n() {
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoTopicSubscriptionModule");
            X xM = dVar.m();
            C5974d c5974d = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = O.b(String.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b == null) {
                c5972b = new C5972b(new M(O.b(String.class), false, c.f33605a), xM);
            }
            dVar.k().put("subscribeToTopicAsync", new dc.f("subscribeToTopicAsync", new C5972b[]{c5972b}, new d()));
            X xM2 = dVar.m();
            C5972b c5972b2 = (C5972b) c5974d.a().get(new Pair(O.b(String.class), bool));
            if (c5972b2 == null) {
                c5972b2 = new C5972b(new M(O.b(String.class), false, e.f33606a), xM2);
            }
            dVar.k().put("unsubscribeFromTopicAsync", new dc.f("unsubscribeFromTopicAsync", new C5972b[]{c5972b2}, new f()));
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
