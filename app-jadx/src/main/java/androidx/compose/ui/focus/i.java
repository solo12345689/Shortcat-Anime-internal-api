package androidx.compose.ui.focus;

import Td.L;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import q0.InterfaceC6057c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface i {
    default k a() {
        return k.f26678b.b();
    }

    default k b() {
        return k.f26678b.b();
    }

    default k c() {
        return k.f26678b.b();
    }

    default k d() {
        return k.f26678b.b();
    }

    default k e() {
        return k.f26678b.b();
    }

    default k f() {
        return k.f26678b.b();
    }

    void g(boolean z10);

    boolean i();

    default k j() {
        return k.f26678b.b();
    }

    default Function1 k() {
        return a.f26663a;
    }

    default k l() {
        return k.f26678b.b();
    }

    default Function1 m() {
        return b.f26664a;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26663a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6057c) obj);
            return L.f17438a;
        }

        public final void a(InterfaceC6057c interfaceC6057c) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26664a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6057c) obj);
            return L.f17438a;
        }

        public final void a(InterfaceC6057c interfaceC6057c) {
        }
    }

    default void h(Function1 function1) {
    }

    default void n(Function1 function1) {
    }
}
