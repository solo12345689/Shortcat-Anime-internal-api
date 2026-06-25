package com.facebook.hermes.intl;

import android.icu.text.RuleBasedCollator;
import com.facebook.hermes.intl.a;
import o6.InterfaceC5833b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class h implements com.facebook.hermes.intl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RuleBasedCollator f35947a = null;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f35949b;

        static {
            int[] iArr = new int[a.b.values().length];
            f35949b = iArr;
            try {
                iArr[a.b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35949b[a.b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35949b[a.b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[a.c.values().length];
            f35948a = iArr2;
            try {
                iArr2[a.c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35948a[a.c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35948a[a.c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35948a[a.c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    h() {
    }

    @Override // com.facebook.hermes.intl.a
    public int a(String str, String str2) {
        return this.f35947a.compare(str, str2);
    }

    @Override // com.facebook.hermes.intl.a
    public a.c b() {
        RuleBasedCollator ruleBasedCollator = this.f35947a;
        if (ruleBasedCollator == null) {
            return a.c.LOCALE;
        }
        int strength = ruleBasedCollator.getStrength();
        return strength == 0 ? this.f35947a.isCaseLevel() ? a.c.CASE : a.c.BASE : strength == 1 ? a.c.ACCENT : a.c.VARIANT;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a c(boolean z10) {
        if (z10) {
            this.f35947a.setAlternateHandlingShifted(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a d(a.b bVar) {
        int i10 = a.f35949b[bVar.ordinal()];
        if (i10 == 1) {
            this.f35947a.setUpperCaseFirst(true);
            return this;
        }
        if (i10 != 2) {
            this.f35947a.setCaseFirstDefault();
            return this;
        }
        this.f35947a.setLowerCaseFirst(true);
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a e(InterfaceC5833b interfaceC5833b) {
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) android.icu.text.Collator.getInstance(((o6.h) interfaceC5833b).getLocale());
        this.f35947a = ruleBasedCollator;
        ruleBasedCollator.setDecomposition(17);
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a f(boolean z10) {
        if (z10) {
            this.f35947a.setNumericCollation(o6.d.e(Boolean.TRUE));
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a g(a.c cVar) {
        int i10 = a.f35948a[cVar.ordinal()];
        if (i10 == 1) {
            this.f35947a.setStrength(0);
            return this;
        }
        if (i10 == 2) {
            this.f35947a.setStrength(1);
            return this;
        }
        if (i10 == 3) {
            this.f35947a.setStrength(0);
            this.f35947a.setCaseLevel(true);
            return this;
        }
        if (i10 != 4) {
            return this;
        }
        this.f35947a.setStrength(2);
        return this;
    }
}
