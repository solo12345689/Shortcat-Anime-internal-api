package pc;

import android.net.Uri;
import android.os.Bundle;
import he.AbstractC4945a;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import jc.InterfaceC5364b;
import kc.AbstractC5462a;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import pc.InterfaceC5967I;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6014d f55906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5967I f55907b;

    public U(InterfaceC6014d klass) {
        AbstractC5504s.h(klass, "klass");
        this.f55906a = klass;
        InterfaceC5967I rVar = AbstractC5504s.c(klass, kotlin.jvm.internal.O.b(Td.L.class)) ? new InterfaceC5967I.r() : AbstractC5504s.c(klass, kotlin.jvm.internal.O.b(Bundle.class)) ? new InterfaceC5967I.e() : AbstractC5504s.c(klass, kotlin.jvm.internal.O.b(int[].class)) ? new InterfaceC5967I.n() : AbstractC5504s.c(klass, kotlin.jvm.internal.O.b(float[].class)) ? new InterfaceC5967I.l() : AbstractC5504s.c(klass, kotlin.jvm.internal.O.b(double[].class)) ? new InterfaceC5967I.h() : AbstractC5504s.c(klass, kotlin.jvm.internal.O.b(boolean[].class)) ? new InterfaceC5967I.d() : AbstractC5504s.c(klass, kotlin.jvm.internal.O.b(byte[].class)) ? new InterfaceC5967I.f() : AbstractC5504s.c(klass, kotlin.jvm.internal.O.b(URI.class)) ? new InterfaceC5967I.u() : AbstractC5504s.c(klass, kotlin.jvm.internal.O.b(URL.class)) ? new InterfaceC5967I.v() : AbstractC5504s.c(klass, kotlin.jvm.internal.O.b(Uri.class)) ? new InterfaceC5967I.a() : AbstractC5504s.c(klass, kotlin.jvm.internal.O.b(File.class)) ? new InterfaceC5967I.k() : AbstractC5504s.c(klass, kotlin.jvm.internal.O.b(Pair.class)) ? new InterfaceC5967I.q() : AbstractC5504s.c(klass, kotlin.jvm.internal.O.b(Long.TYPE)) ? new InterfaceC5967I.o() : AbstractC5504s.c(klass, kotlin.jvm.internal.O.b(Ef.a.class)) ? new InterfaceC5967I.i() : AbstractC5504s.c(klass, kotlin.jvm.internal.O.b(Object.class)) ? new InterfaceC5967I.b() : null;
        this.f55907b = rVar == null ? Map.class.isAssignableFrom(AbstractC4945a.b(this.f55906a)) ? new InterfaceC5967I.p() : Enum.class.isAssignableFrom(AbstractC4945a.b(this.f55906a)) ? new InterfaceC5967I.j() : InterfaceC5364b.class.isAssignableFrom(AbstractC4945a.b(this.f55906a)) ? new InterfaceC5967I.t() : AbstractC5462a.class.isAssignableFrom(AbstractC4945a.b(this.f55906a)) ? new InterfaceC5967I.m() : oc.i.class.isAssignableFrom(AbstractC4945a.b(this.f55906a)) ? new InterfaceC5967I.s() : Object[].class.isAssignableFrom(AbstractC4945a.b(this.f55906a)) ? new InterfaceC5967I.c() : Collection.class.isAssignableFrom(AbstractC4945a.b(this.f55906a)) ? new InterfaceC5967I.g() : new InterfaceC5967I.r() : rVar;
    }

    public final Object b(Object obj) {
        return this.f55907b.a(obj);
    }

    public final ec.i c() {
        return this.f55907b.getReturnType();
    }
}
