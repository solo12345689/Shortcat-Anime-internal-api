package com.facebook.react.modules.debug;

import Td.z;
import Ud.S;
import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = "SourceCode")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/facebook/react/modules/debug/SourceCodeModule;", "Lcom/facebook/fbreact/specs/NativeSourceCodeSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SourceCodeModule extends NativeSourceCodeSpec {
    public static final String NAME = "SourceCode";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceCodeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
    }

    @Override // com.facebook.fbreact.specs.NativeSourceCodeSpec
    protected Map<String, Object> getTypedExportedConstants() {
        return S.f(z.a("scriptURL", Q6.a.d(getReactApplicationContext().getSourceURL(), "No source URL loaded, have you initialised the instance?")));
    }
}
