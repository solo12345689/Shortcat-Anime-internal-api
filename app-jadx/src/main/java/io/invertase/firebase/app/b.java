package io.invertase.firebase.app;

import com.facebook.react.O;
import com.facebook.react.bridge.ReactApplicationContext;
import io.invertase.firebase.utils.ReactNativeFirebaseUtilsModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class b implements O {
    @Override // com.facebook.react.O
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        if (a.a() == null) {
            a.b(reactApplicationContext.getApplicationContext());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReactNativeFirebaseAppModule(reactApplicationContext));
        arrayList.add(new ReactNativeFirebaseUtilsModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.O
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }
}
