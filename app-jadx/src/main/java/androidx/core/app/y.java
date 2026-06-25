package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f28922a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f28923b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        Intent b();
    }

    private y(Context context) {
        this.f28923b = context;
    }

    public static y e(Context context) {
        return new y(context);
    }

    public y b(Intent intent) {
        this.f28922a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y c(Activity activity) {
        Intent intentB = activity instanceof a ? ((a) activity).b() : null;
        if (intentB == null) {
            intentB = k.a(activity);
        }
        if (intentB != null) {
            ComponentName component = intentB.getComponent();
            if (component == null) {
                component = intentB.resolveActivity(this.f28923b.getPackageManager());
            }
            d(component);
            b(intentB);
        }
        return this;
    }

    public y d(ComponentName componentName) {
        int size = this.f28922a.size();
        try {
            Intent intentB = k.b(this.f28923b, componentName);
            while (intentB != null) {
                this.f28922a.add(size, intentB);
                intentB = k.b(this.f28923b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void f() {
        i(null);
    }

    public void i(Bundle bundle) {
        if (this.f28922a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f28922a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (AbstractC7194b.n(this.f28923b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f28923b.startActivity(intent);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f28922a.iterator();
    }
}
