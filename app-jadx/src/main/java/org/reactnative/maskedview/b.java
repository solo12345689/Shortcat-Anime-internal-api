package org.reactnative.maskedview;

import com.facebook.react.O;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class b implements O {
    @Override // com.facebook.react.O
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.react.O
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNCMaskedViewManager());
    }
}
