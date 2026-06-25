package com.swmansion.rnscreens.gamma.stack.screen;

import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.InterfaceC2861o;
import androidx.lifecycle.r;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements InterfaceC2861o {

    /* JADX INFO: renamed from: a */
    private final Wa.c f44527a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44528a;

        static {
            int[] iArr = new int[AbstractC2857k.a.values().length];
            try {
                iArr[AbstractC2857k.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC2857k.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC2857k.a.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC2857k.a.ON_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC2857k.a.ON_DESTROY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC2857k.a.ON_CREATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC2857k.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f44528a = iArr;
        }
    }

    public b(AbstractC2857k screenLifecycle, Wa.c appearanceEventEmitter) {
        AbstractC5504s.h(screenLifecycle, "screenLifecycle");
        AbstractC5504s.h(appearanceEventEmitter, "appearanceEventEmitter");
        this.f44527a = appearanceEventEmitter;
        screenLifecycle.addObserver(this);
    }

    private final void a(r rVar) {
        rVar.getLifecycle().removeObserver(this);
    }

    @Override // androidx.lifecycle.InterfaceC2861o
    public void g(r source, AbstractC2857k.a event) {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(event, "event");
        switch (a.f44528a[event.ordinal()]) {
            case 1:
                this.f44527a.d();
                return;
            case 2:
                this.f44527a.c();
                return;
            case 3:
                this.f44527a.a();
                return;
            case 4:
                this.f44527a.b();
                return;
            case 5:
                a(source);
                return;
            case 6:
            case 7:
                return;
            default:
                throw new Td.r();
        }
    }
}
