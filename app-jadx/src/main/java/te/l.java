package te;

import Ud.AbstractC2279u;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import te.h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class l implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f60945a = new l();

    private l() {
    }

    @Override // te.h
    public List a() {
        return AbstractC2279u.m();
    }

    @Override // te.h
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) d();
    }

    @Override // te.h
    public boolean c() {
        return h.a.b(this);
    }

    @Override // te.h
    public Object call(Object[] args) {
        AbstractC5504s.h(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    public Void d() {
        return null;
    }

    @Override // te.h
    public Type getReturnType() {
        Class TYPE = Void.TYPE;
        AbstractC5504s.g(TYPE, "TYPE");
        return TYPE;
    }
}
