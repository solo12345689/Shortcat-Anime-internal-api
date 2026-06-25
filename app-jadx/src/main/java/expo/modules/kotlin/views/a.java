package expo.modules.kotlin.views;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import kotlin.jvm.internal.AbstractC5504s;
import pc.C5972b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a */
    private final String f46202a;

    /* JADX INFO: renamed from: b */
    private final C5972b f46203b;

    public a(String name, C5972b type) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(type, "type");
        this.f46202a = name;
        this.f46203b = type;
    }

    public final String a() {
        return this.f46202a;
    }

    public final C5972b b() {
        return this.f46203b;
    }

    public abstract void c(Dynamic dynamic, View view, Ub.d dVar);
}
