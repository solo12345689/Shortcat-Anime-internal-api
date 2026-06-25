package kotlin.jvm.internal;

import he.C4946b;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import pe.EnumC6031u;
import pe.InterfaceC6013c;
import pe.InterfaceC6017g;
import pe.InterfaceC6022l;
import pe.InterfaceC6027q;
import pe.InterfaceC6028r;

/* JADX INFO: renamed from: kotlin.jvm.internal.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5492f implements InterfaceC6013c, Serializable {
    public static final Object NO_RECEIVER = a.f52278a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC6013c reflected;
    private final String signature;

    /* JADX INFO: renamed from: kotlin.jvm.internal.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a implements Serializable {

        /* JADX INFO: renamed from: a */
        private static final a f52278a = new a();

        private a() {
        }
    }

    protected AbstractC5492f(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // pe.InterfaceC6013c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // pe.InterfaceC6013c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC6013c compute() {
        InterfaceC6013c interfaceC6013c = this.reflected;
        if (interfaceC6013c != null) {
            return interfaceC6013c;
        }
        InterfaceC6013c interfaceC6013cComputeReflected = computeReflected();
        this.reflected = interfaceC6013cComputeReflected;
        return interfaceC6013cComputeReflected;
    }

    protected abstract InterfaceC6013c computeReflected();

    @Override // pe.InterfaceC6012b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // pe.InterfaceC6013c
    public String getName() {
        return this.name;
    }

    public InterfaceC6017g getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? O.c(cls) : O.b(cls);
    }

    @Override // pe.InterfaceC6013c
    public List<InterfaceC6022l> getParameters() {
        return getReflected().getParameters();
    }

    protected InterfaceC6013c getReflected() {
        InterfaceC6013c interfaceC6013cCompute = compute();
        if (interfaceC6013cCompute != this) {
            return interfaceC6013cCompute;
        }
        throw new C4946b();
    }

    @Override // pe.InterfaceC6013c
    public InterfaceC6027q getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // pe.InterfaceC6013c
    public List<InterfaceC6028r> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // pe.InterfaceC6013c
    public EnumC6031u getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // pe.InterfaceC6013c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // pe.InterfaceC6013c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // pe.InterfaceC6013c
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
