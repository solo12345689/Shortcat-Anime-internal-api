package qf;

import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I0 f57969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f57970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC6183d0 f57971c;

    public G(I0 howThisTypeIsUsed, Set set, AbstractC6183d0 abstractC6183d0) {
        AbstractC5504s.h(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f57969a = howThisTypeIsUsed;
        this.f57970b = set;
        this.f57971c = abstractC6183d0;
    }

    public abstract AbstractC6183d0 a();

    public abstract I0 b();

    public abstract Set c();

    public abstract G d(ye.m0 m0Var);

    public abstract int hashCode();
}
