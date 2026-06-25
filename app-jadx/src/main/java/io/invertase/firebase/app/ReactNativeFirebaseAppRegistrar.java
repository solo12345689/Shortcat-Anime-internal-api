package io.invertase.firebase.app;

import aa.C2595c;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import ua.h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class ReactNativeFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2595c> getComponents() {
        return Collections.singletonList(h.b("react-native-firebase", c.f48946a));
    }
}
