package rc;

import Ub.d;
import cc.f;
import com.facebook.react.bridge.Dynamic;
import ec.EnumC4666a;
import expo.modules.kotlin.jni.ExpectedType;
import java.io.File;
import kotlin.jvm.internal.AbstractC5504s;
import pc.AbstractC5990u;

/* JADX INFO: renamed from: rc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6304a extends AbstractC5990u {
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
    public File e(Object value, d dVar, boolean z10) {
        AbstractC5504s.h(value, "value");
        return new File((String) value);
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public File f(Dynamic value, d dVar, boolean z10) throws f {
        AbstractC5504s.h(value, "value");
        String strAsString = value.asString();
        if (strAsString != null) {
            return new File(strAsString);
        }
        throw new f("Cannot convert " + value.getType() + " to File", null, 2, null);
    }
}
