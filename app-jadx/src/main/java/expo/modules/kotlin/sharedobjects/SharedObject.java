package expo.modules.kotlin.sharedobjects;

import Ub.A;
import Ub.d;
import Ub.f;
import expo.modules.kotlin.jni.JNIUtils;
import expo.modules.kotlin.jni.JSIContext;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc.b;
import nc.C5776c;
import pc.C5969K;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0011\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u000bR\"\u0010#\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\"R(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedObject;", "", "Llc/b;", "runtime", "<init>", "(Llc/b;)V", "LUb/d;", "appContext", "(LUb/d;)V", "", "getSharedObjectId", "()I", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "m", "()Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "", "eventName", "", "args", "LTd/L;", "g", "(Ljava/lang/String;[Ljava/lang/Object;)V", "z", "(Ljava/lang/String;)V", "C", "H", "()V", "b", "k", "Lnc/c;", "a", "I", "w", "E", "(I)V", "sharedObjectId", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "q", "()Ljava/lang/ref/WeakReference;", "D", "(Ljava/lang/ref/WeakReference;)V", "runtimeContextHolder", "o", "()Llc/b;", "l", "()LUb/d;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class SharedObject {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int sharedObjectId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private WeakReference runtimeContextHolder;

    public SharedObject() {
        this(null, 1, null);
    }

    private final int getSharedObjectId() {
        return this.sharedObjectId;
    }

    private final JavaScriptWeakObject m() {
        int iB = C5776c.b(this.sharedObjectId);
        b bVarO = o();
        if (bVarO == null) {
            return null;
        }
        return C5776c.i(iB, bVarO);
    }

    private final b o() {
        return (b) this.runtimeContextHolder.get();
    }

    public void C(String eventName) {
        AbstractC5504s.h(eventName, "eventName");
    }

    public final void D(WeakReference weakReference) {
        AbstractC5504s.h(weakReference, "<set-?>");
        this.runtimeContextHolder = weakReference;
    }

    public final void E(int i10) {
        this.sharedObjectId = i10;
    }

    public void H() {
        b();
    }

    public final void g(String eventName, Object... args) {
        b bVarO;
        JSIContext jSIContextD;
        AbstractC5504s.h(eventName, "eventName");
        AbstractC5504s.h(args, "args");
        JavaScriptWeakObject javaScriptWeakObjectM = m();
        if (javaScriptWeakObjectM == null || (bVarO = o()) == null || (jSIContextD = bVarO.d()) == null) {
            return;
        }
        try {
            JNIUtils.Companion companion = JNIUtils.INSTANCE;
            ArrayList arrayList = new ArrayList(args.length);
            for (Object obj : args) {
                arrayList.add(C5969K.b(C5969K.f55891a, obj, null, false, 6, null));
            }
            companion.b(javaScriptWeakObjectM, jSIContextD, eventName, arrayList.toArray(new Object[0]));
        } catch (Throwable th2) {
            f.a().b("Unable to send event '" + eventName + "' by shared object of type " + getClass().getSimpleName(), th2);
        }
    }

    public int k() {
        return 0;
    }

    public final d l() {
        b bVarO = o();
        if (bVarO != null) {
            return bVarO.a();
        }
        return null;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final WeakReference getRuntimeContextHolder() {
        return this.runtimeContextHolder;
    }

    public final int w() {
        return this.sharedObjectId;
    }

    public void z(String eventName) {
        AbstractC5504s.h(eventName, "eventName");
    }

    public SharedObject(b bVar) {
        this.sharedObjectId = C5776c.b(0);
        this.runtimeContextHolder = A.a(bVar);
    }

    public /* synthetic */ SharedObject(b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedObject(d appContext) {
        this(appContext.D());
        AbstractC5504s.h(appContext, "appContext");
    }

    public void b() {
    }
}
