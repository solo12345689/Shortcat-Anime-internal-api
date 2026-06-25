package eb;

import android.animation.FloatEvaluator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: eb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4665a extends FloatEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f45822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f45823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Number f45824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Number f45825d;

    public C4665a(Function1 startValueProvider, Function1 endValueProvider) {
        AbstractC5504s.h(startValueProvider, "startValueProvider");
        AbstractC5504s.h(endValueProvider, "endValueProvider");
        this.f45822a = startValueProvider;
        this.f45823b = endValueProvider;
    }

    private final Number a(Number number) {
        if (this.f45825d == null) {
            this.f45825d = (Number) this.f45823b.invoke(number);
        }
        return this.f45825d;
    }

    private final Number b(Number number) {
        if (this.f45824c == null) {
            this.f45824c = (Number) this.f45822a.invoke(number);
        }
        return this.f45824c;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.animation.TypeEvaluator
    public Float evaluate(float f10, Number number, Number number2) {
        Number numberB = b(number);
        Number numberA = a(number2);
        if (numberB == null || numberA == null) {
            return null;
        }
        return super.evaluate(f10, numberB, numberA);
    }
}
