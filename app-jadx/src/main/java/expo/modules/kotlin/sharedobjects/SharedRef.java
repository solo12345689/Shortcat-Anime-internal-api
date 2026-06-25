package expo.modules.kotlin.sharedobjects;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc.b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedRef;", "RefType", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "ref", "Llc/b;", "runtime", "<init>", "(Ljava/lang/Object;Llc/b;)V", "c", "Ljava/lang/Object;", "O", "()Ljava/lang/Object;", "", "d", "Ljava/lang/String;", "J", "()Ljava/lang/String;", "nativeRefType", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class SharedRef<RefType> extends SharedObject {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object ref;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String nativeRefType;

    public /* synthetic */ SharedRef(Object obj, b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : bVar);
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public String getNativeRefType() {
        return this.nativeRefType;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Object getRef() {
        return this.ref;
    }

    public SharedRef(Object obj, b bVar) {
        super(bVar);
        this.ref = obj;
        this.nativeRefType = "unknown";
    }
}
