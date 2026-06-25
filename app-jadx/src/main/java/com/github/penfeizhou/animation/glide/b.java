package com.github.penfeizhou.animation.glide;

import S4.h;
import U4.v;
import android.graphics.drawable.Drawable;
import b8.C3028a;
import c8.C3083a;
import d5.j;
import f8.C4780a;
import g5.InterfaceC4854e;
import g8.C4866g;
import i8.AbstractC5044a;
import k8.C5455a;
import l8.l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class b implements InterfaceC4854e {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y7.a f38786b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Drawable drawable, Y7.a aVar) {
            super(drawable);
            this.f38786b = aVar;
        }

        @Override // U4.v
        public Class a() {
            return Drawable.class;
        }

        @Override // U4.v
        public int getSize() {
            return this.f38786b.e();
        }

        @Override // d5.j, U4.r
        public void initialize() {
            super.initialize();
        }

        @Override // U4.v
        public void recycle() {
            this.f38786b.stop();
        }
    }

    /* JADX INFO: renamed from: com.github.penfeizhou.animation.glide.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0636b extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5455a f38788b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0636b(Drawable drawable, C5455a c5455a) {
            super(drawable);
            this.f38788b = c5455a;
        }

        @Override // U4.v
        public Class a() {
            return Drawable.class;
        }

        @Override // U4.v
        public int getSize() {
            return this.f38788b.e();
        }

        @Override // d5.j, U4.r
        public void initialize() {
            super.initialize();
        }

        @Override // U4.v
        public void recycle() {
            this.f38788b.stop();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4780a f38790b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Drawable drawable, C4780a c4780a) {
            super(drawable);
            this.f38790b = c4780a;
        }

        @Override // U4.v
        public Class a() {
            return Drawable.class;
        }

        @Override // U4.v
        public int getSize() {
            return this.f38790b.e();
        }

        @Override // d5.j, U4.r
        public void initialize() {
            super.initialize();
        }

        @Override // U4.v
        public void recycle() {
            this.f38790b.stop();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3028a f38792b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Drawable drawable, C3028a c3028a) {
            super(drawable);
            this.f38792b = c3028a;
        }

        @Override // U4.v
        public Class a() {
            return Drawable.class;
        }

        @Override // U4.v
        public int getSize() {
            return this.f38792b.e();
        }

        @Override // d5.j, U4.r
        public void initialize() {
            super.initialize();
        }

        @Override // U4.v
        public void recycle() {
            this.f38792b.stop();
        }
    }

    b() {
    }

    @Override // g5.InterfaceC4854e
    public v a(v vVar, h hVar) {
        com.github.penfeizhou.animation.decode.b bVar = (com.github.penfeizhou.animation.decode.b) vVar.get();
        boolean zBooleanValue = ((Boolean) hVar.c(AbstractC5044a.f48729d)).booleanValue();
        if (bVar instanceof Z7.b) {
            Y7.a aVar = new Y7.a((Z7.b) bVar);
            aVar.l(false);
            aVar.m(zBooleanValue);
            return new a(aVar, aVar);
        }
        if (bVar instanceof l) {
            C5455a c5455a = new C5455a((l) bVar);
            c5455a.l(false);
            c5455a.m(zBooleanValue);
            return new C0636b(c5455a, c5455a);
        }
        if (bVar instanceof C4866g) {
            C4780a c4780a = new C4780a((C4866g) bVar);
            c4780a.l(false);
            c4780a.m(zBooleanValue);
            return new c(c4780a, c4780a);
        }
        if (!(bVar instanceof C3083a)) {
            return null;
        }
        C3028a c3028a = new C3028a((C3083a) bVar);
        c3028a.l(false);
        c3028a.m(zBooleanValue);
        return new d(c3028a, c3028a);
    }
}
