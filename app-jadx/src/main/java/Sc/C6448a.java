package sc;

import Ub.d;
import com.facebook.react.bridge.Dynamic;
import ec.EnumC4666a;
import expo.modules.kotlin.jni.ExpectedType;
import java.net.URI;
import kotlin.jvm.internal.AbstractC5504s;
import pc.AbstractC5990u;

/* JADX INFO: renamed from: sc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6448a extends AbstractC5990u {
    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return new ExpectedType(EnumC4666a.f45836i);
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public URI e(Object value, d dVar, boolean z10) {
        AbstractC5504s.h(value, "value");
        URI uriCreate = URI.create((String) value);
        AbstractC5504s.g(uriCreate, "create(...)");
        return uriCreate;
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public URI f(Dynamic value, d dVar, boolean z10) {
        AbstractC5504s.h(value, "value");
        URI uriCreate = URI.create(value.asString());
        AbstractC5504s.g(uriCreate, "create(...)");
        return uriCreate;
    }
}
