package expo.modules.adapters.react;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import expo.modules.core.BasePackage;
import java.util.Arrays;
import java.util.List;
import jb.C5362c;
import kb.C5460a;
import kb.C5461b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class ReactAdapterPackage extends BasePackage {
    @Override // expo.modules.core.BasePackage, sb.g
    public List f(Context context) {
        ReactContext reactContext = (ReactContext) context;
        return Arrays.asList(new C5461b(reactContext), new C5460a(reactContext), new C5362c(reactContext));
    }
}
