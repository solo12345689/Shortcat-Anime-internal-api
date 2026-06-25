package expo.modules.kotlin.jni;

import expo.modules.kotlin.jni.JavaScriptObject;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(List list) {
        Iterator it = list.iterator();
        int iB = 0;
        while (it.hasNext()) {
            iB |= ((JavaScriptObject.a) it.next()).b();
        }
        return iB;
    }
}
