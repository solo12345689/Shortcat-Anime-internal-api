package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.m;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f28869a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f28870b = new Object();

    static Bundle a(m.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.f() : 0);
        bundle.putCharSequence(com.amazon.a.a.o.b.f34626S, aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(w wVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", wVar.n());
        bundle.putCharSequence("label", wVar.m());
        bundle.putCharSequenceArray("choices", wVar.g());
        bundle.putBoolean("allowFreeFormInput", wVar.e());
        bundle.putBundle("extras", wVar.l());
        Set setF = wVar.f();
        if (setF != null && !setF.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setF.size());
            Iterator it = setF.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(w[] wVarArr) {
        if (wVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[wVarArr.length];
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            bundleArr[i10] = b(wVarArr[i10]);
        }
        return bundleArr;
    }
}
