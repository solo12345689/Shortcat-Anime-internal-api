package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: renamed from: androidx.transition.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC2941f {

    /* JADX INFO: renamed from: androidx.transition.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static <T, V> ObjectAnimator a(T t10, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t10, property, (TypeConverter) null, path);
        }
    }

    static ObjectAnimator a(Object obj, Property property, Path path) {
        return a.a(obj, property, path);
    }
}
