package aa;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f23868a = new i() { // from class: aa.h
        @Override // aa.i
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
