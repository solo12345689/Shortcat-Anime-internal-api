package p9;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import t.i0;

/* JADX INFO: renamed from: p9.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5948c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f55831a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f55832b = new i0();

    private static void a(C5948c c5948c, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c5948c.e(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c5948c.f(objectAnimator.getPropertyName(), C5949d.a(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public static C5948c b(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static C5948c c(Context context, int i10) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return d(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    private static C5948c d(List list) {
        C5948c c5948c = new C5948c();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(c5948c, (Animator) list.get(i10));
        }
        return c5948c;
    }

    public void e(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f55832b.put(str, propertyValuesHolderArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5948c) {
            return this.f55831a.equals(((C5948c) obj).f55831a);
        }
        return false;
    }

    public void f(String str, C5949d c5949d) {
        this.f55831a.put(str, c5949d);
    }

    public int hashCode() {
        return this.f55831a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f55831a + "}\n";
    }
}
