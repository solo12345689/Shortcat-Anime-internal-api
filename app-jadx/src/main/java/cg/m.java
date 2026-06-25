package cg;

import android.os.Bundle;
import app.notifee.core.interfaces.MethodCallResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class m implements com.google.common.util.concurrent.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f33632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MethodCallResult f33633b;

    public m(List list, MethodCallResult methodCallResult) {
        this.f33632a = list;
        this.f33633b = methodCallResult;
    }

    @Override // com.google.common.util.concurrent.i
    public void a(Throwable th2) {
        this.f33633b.onComplete(new Exception(th2), this.f33632a);
    }

    @Override // com.google.common.util.concurrent.i
    public void onSuccess(Object obj) {
        for (v vVar : (List) obj) {
            Bundle bundle = new Bundle();
            bundle.putBundle("notification", q.b(vVar.f33645b));
            bundle.putBundle("trigger", q.b(vVar.f33646c));
            this.f33632a.add(bundle);
        }
        this.f33633b.onComplete(null, this.f33632a);
    }
}
