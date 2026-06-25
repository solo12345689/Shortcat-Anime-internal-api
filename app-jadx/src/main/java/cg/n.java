package cg;

import app.notifee.core.interfaces.MethodCallResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class n implements com.google.common.util.concurrent.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MethodCallResult f33634a;

    public n(MethodCallResult methodCallResult) {
        this.f33634a = methodCallResult;
    }

    @Override // com.google.common.util.concurrent.i
    public void a(Throwable th2) {
        this.f33634a.onComplete(new Exception(th2), null);
    }

    @Override // com.google.common.util.concurrent.i
    public void onSuccess(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(((v) it.next()).f33644a);
        }
        this.f33634a.onComplete(null, arrayList);
    }
}
