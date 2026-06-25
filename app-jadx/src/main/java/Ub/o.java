package Ub;

import Ub.u;
import com.facebook.react.bridge.Promise;
import expo.modules.kotlin.exception.CodedException;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import pc.C5969K;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Promise f19434a;

    public o(Promise bridgePromise) {
        AbstractC5504s.h(bridgePromise, "bridgePromise");
        this.f19434a = bridgePromise;
    }

    @Override // Ub.u
    public void a(boolean z10) {
        u.a.i(this, z10);
    }

    @Override // Ub.u
    public void b() {
        u.a.b(this);
    }

    @Override // Ub.u
    public void c(int i10) {
        u.a.e(this, i10);
    }

    @Override // Ub.u
    public void d(double d10) {
        u.a.c(this, d10);
    }

    @Override // Ub.u
    public void e(float f10) {
        u.a.d(this, f10);
    }

    @Override // Ub.u
    public void f(Map map) {
        u.a.h(this, map);
    }

    @Override // Ub.u
    public void g(Collection collection) {
        u.a.g(this, collection);
    }

    @Override // Ub.u
    public void h(CodedException codedException) {
        u.a.a(this, codedException);
    }

    @Override // Ub.u
    public void reject(String code, String str, Throwable th2) {
        AbstractC5504s.h(code, "code");
        this.f19434a.reject(code, str, th2);
    }

    @Override // Ub.u
    public void resolve(String str) {
        u.a.f(this, str);
    }

    @Override // Ub.u
    public void resolve(Object obj) {
        this.f19434a.resolve(C5969K.b(C5969K.f55891a, obj, null, false, 6, null));
    }
}
