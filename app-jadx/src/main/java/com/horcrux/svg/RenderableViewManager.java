package com.horcrux.svg;

import K7.A0;
import K7.B0;
import K7.C0;
import K7.C1814a0;
import K7.C1818c0;
import K7.C1822e0;
import K7.C1826g0;
import K7.C1830i0;
import K7.C1834k0;
import K7.C1838m0;
import K7.C1842o0;
import K7.C1846q0;
import K7.C1849s0;
import K7.C1853u0;
import K7.C1857w0;
import K7.C1861y0;
import K7.D0;
import K7.E0;
import K7.F0;
import K7.G0;
import K7.H0;
import K7.I0;
import K7.InterfaceC1816b0;
import K7.InterfaceC1820d0;
import K7.InterfaceC1824f0;
import K7.InterfaceC1828h0;
import K7.InterfaceC1832j0;
import K7.InterfaceC1836l0;
import K7.InterfaceC1840n0;
import K7.InterfaceC1844p0;
import K7.InterfaceC1847r0;
import K7.InterfaceC1851t0;
import K7.InterfaceC1855v0;
import K7.InterfaceC1859x0;
import K7.InterfaceC1863z0;
import K7.J0;
import K7.K0;
import K7.L0;
import K7.M0;
import K7.N0;
import K7.O0;
import K7.P0;
import K7.S0;
import K7.T0;
import K7.U0;
import K7.V0;
import K7.W0;
import K7.X0;
import K7.Y0;
import K7.Z0;
import K7.a1;
import K7.b1;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.VirtualViewManager;
import com.horcrux.svg.events.SvgLoadEvent;
import com.horcrux.svg.events.SvgOnLayoutEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class RenderableViewManager<T extends RenderableView> extends VirtualViewManager<T> {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class CircleViewManager extends RenderableViewManager<C3993b> implements K7.X {
        public static final String REACT_CLASS = "RNSVGCircle";

        CircleViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGCircle);
            ((VirtualViewManager) this).mDelegate = new K7.W(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.X
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.X
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X
        @B7.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // K7.X
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X
        @B7.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X
        @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X
        @B7.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X
        @B7.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // K7.X
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.X
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.X
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.X
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.X
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.X
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.X
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X
        @B7.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // K7.X
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X
        @B7.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X
        @B7.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X
        @B7.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X
        @B7.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X
        @B7.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X
        @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X
        @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X
        @B7.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X
        @B7.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RenderableView) view, i10);
        }

        @Override // K7.X
        @B7.a(name = "cx")
        public void setCx(C3993b c3993b, Dynamic dynamic) {
            c3993b.B(dynamic);
        }

        @Override // K7.X
        @B7.a(name = "cy")
        public void setCy(C3993b c3993b, Dynamic dynamic) {
            c3993b.C(dynamic);
        }

        @Override // K7.X
        @B7.a(name = "r")
        public void setR(C3993b c3993b, Dynamic dynamic) {
            c3993b.D(dynamic);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class ClipPathViewManager extends GroupViewManagerAbstract<C3994c> implements K7.Z {
        public static final String REACT_CLASS = "RNSVGClipPath";

        ClipPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGClipPath);
            ((VirtualViewManager) this).mDelegate = new K7.Y(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.Z
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.Z
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z
        @B7.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // K7.Z
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z
        @B7.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z
        @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z
        @B7.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z
        @B7.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // K7.Z
        @B7.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((B) view, dynamic);
        }

        @Override // K7.Z
        @B7.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((B) view, dynamic);
        }

        @Override // K7.Z
        @B7.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((B) view, dynamic);
        }

        @Override // K7.Z
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.Z
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.Z
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.Z
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.Z
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.Z
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.Z
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z
        @B7.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // K7.Z
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z
        @B7.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z
        @B7.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z
        @B7.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z
        @B7.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z
        @B7.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z
        @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z
        @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z
        @B7.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z
        @B7.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RenderableView) view, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class DefsViewManager extends VirtualViewManager<C3997f> implements InterfaceC1816b0 {
        public static final String REACT_CLASS = "RNSVGDefs";

        DefsViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGDefs);
            ((VirtualViewManager) this).mDelegate = new C1814a0(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.InterfaceC1816b0
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1816b0
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @Override // K7.InterfaceC1816b0
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1816b0
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1816b0
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1816b0
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1816b0
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1816b0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.InterfaceC1816b0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.InterfaceC1816b0
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1816b0
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class EllipseViewManager extends RenderableViewManager<C3999h> implements InterfaceC1820d0 {
        public static final String REACT_CLASS = "RNSVGEllipse";

        EllipseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGEllipse);
            ((VirtualViewManager) this).mDelegate = new C1818c0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.InterfaceC1820d0
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1820d0
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1820d0
        @B7.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // K7.InterfaceC1820d0
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1820d0
        @B7.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1820d0
        @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1820d0
        @B7.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1820d0
        @B7.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // K7.InterfaceC1820d0
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1820d0
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1820d0
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1820d0
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1820d0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.InterfaceC1820d0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.InterfaceC1820d0
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1820d0
        @B7.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // K7.InterfaceC1820d0
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1820d0
        @B7.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1820d0
        @B7.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1820d0
        @B7.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1820d0
        @B7.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1820d0
        @B7.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1820d0
        @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1820d0
        @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1820d0
        @B7.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1820d0
        @B7.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RenderableView) view, i10);
        }

        @Override // K7.InterfaceC1820d0
        @B7.a(name = "cx")
        public void setCx(C3999h c3999h, Dynamic dynamic) {
            c3999h.B(dynamic);
        }

        @Override // K7.InterfaceC1820d0
        @B7.a(name = "cy")
        public void setCy(C3999h c3999h, Dynamic dynamic) {
            c3999h.C(dynamic);
        }

        @Override // K7.InterfaceC1820d0
        @B7.a(name = "rx")
        public void setRx(C3999h c3999h, Dynamic dynamic) {
            c3999h.D(dynamic);
        }

        @Override // K7.InterfaceC1820d0
        @B7.a(name = "ry")
        public void setRy(C3999h c3999h, Dynamic dynamic) {
            c3999h.E(dynamic);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class FeBlendManager extends FilterPrimitiveManager<C4001j> implements InterfaceC1824f0 {
        public static final String REACT_CLASS = "RNSVGFeBlend";

        FeBlendManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeBlend);
            ((VirtualViewManager) this).mDelegate = new C1822e0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.InterfaceC1824f0
        @B7.a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1824f0
        @B7.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((AbstractC4008q) view, str);
        }

        @Override // K7.InterfaceC1824f0
        @B7.a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1824f0
        @B7.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1824f0
        @B7.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1824f0
        @B7.a(name = "in1")
        public void setIn1(C4001j c4001j, String str) {
            c4001j.K(str);
        }

        @Override // K7.InterfaceC1824f0
        @B7.a(name = "in2")
        public void setIn2(C4001j c4001j, String str) {
            c4001j.L(str);
        }

        @Override // K7.InterfaceC1824f0
        @B7.a(name = "mode")
        public void setMode(C4001j c4001j, String str) {
            c4001j.M(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class FeColorMatrixManager extends FilterPrimitiveManager<C4002k> implements InterfaceC1828h0 {
        public static final String REACT_CLASS = "RNSVGFeColorMatrix";

        FeColorMatrixManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeColorMatrix);
            ((VirtualViewManager) this).mDelegate = new C1826g0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.InterfaceC1828h0
        @B7.a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1828h0
        @B7.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((AbstractC4008q) view, str);
        }

        @Override // K7.InterfaceC1828h0
        @B7.a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1828h0
        @B7.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1828h0
        @B7.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1828h0
        @B7.a(name = "in1")
        public void setIn1(C4002k c4002k, String str) {
            c4002k.J(str);
        }

        @Override // K7.InterfaceC1828h0
        @B7.a(name = "type")
        public void setType(C4002k c4002k, String str) {
            c4002k.K(str);
        }

        @Override // K7.InterfaceC1828h0
        @B7.a(name = "values")
        public void setValues(C4002k c4002k, ReadableArray readableArray) {
            c4002k.L(readableArray);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class FeCompositeManager extends FilterPrimitiveManager<C4003l> implements InterfaceC1832j0 {
        public static final String REACT_CLASS = "RNSVGFeComposite";

        FeCompositeManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeComposite);
            ((VirtualViewManager) this).mDelegate = new C1830i0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.InterfaceC1832j0
        @B7.a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1832j0
        @B7.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((AbstractC4008q) view, str);
        }

        @Override // K7.InterfaceC1832j0
        @B7.a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1832j0
        @B7.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1832j0
        @B7.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1832j0
        @B7.a(name = "in1")
        public void setIn1(C4003l c4003l, String str) {
            c4003l.J(str);
        }

        @Override // K7.InterfaceC1832j0
        @B7.a(name = "in2")
        public void setIn2(C4003l c4003l, String str) {
            c4003l.K(str);
        }

        @Override // K7.InterfaceC1832j0
        @B7.a(name = "k1")
        public void setK1(C4003l c4003l, float f10) {
            c4003l.L(Float.valueOf(f10));
        }

        @Override // K7.InterfaceC1832j0
        @B7.a(name = "k2")
        public void setK2(C4003l c4003l, float f10) {
            c4003l.M(Float.valueOf(f10));
        }

        @Override // K7.InterfaceC1832j0
        @B7.a(name = "k3")
        public void setK3(C4003l c4003l, float f10) {
            c4003l.N(Float.valueOf(f10));
        }

        @Override // K7.InterfaceC1832j0
        @B7.a(name = "k4")
        public void setK4(C4003l c4003l, float f10) {
            c4003l.O(Float.valueOf(f10));
        }

        @Override // K7.InterfaceC1832j0
        @B7.a(name = "operator1")
        public void setOperator1(C4003l c4003l, String str) {
            c4003l.P(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class FeFloodManager extends FilterPrimitiveManager<C4004m> implements InterfaceC1836l0 {
        public static final String REACT_CLASS = "RNSVGFeFlood";

        FeFloodManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeFlood);
            ((VirtualViewManager) this).mDelegate = new C1834k0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.InterfaceC1836l0
        @B7.a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1836l0
        @B7.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((AbstractC4008q) view, str);
        }

        @Override // K7.InterfaceC1836l0
        @B7.a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1836l0
        @B7.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1836l0
        @B7.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1836l0
        @B7.a(name = "floodColor")
        public void setFloodColor(C4004m c4004m, Dynamic dynamic) {
            c4004m.J(dynamic);
        }

        @Override // K7.InterfaceC1836l0
        @B7.a(defaultFloat = 1.0f, name = "floodOpacity")
        public void setFloodOpacity(C4004m c4004m, float f10) {
            c4004m.L(f10);
        }

        public void setFloodColor(C4004m c4004m, ReadableMap readableMap) {
            c4004m.K(readableMap);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class FeGaussianBlurManager extends FilterPrimitiveManager<C4005n> implements InterfaceC1840n0 {
        public static final String REACT_CLASS = "RNSVGFeGaussianBlur";

        FeGaussianBlurManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeGaussianBlur);
            ((VirtualViewManager) this).mDelegate = new C1838m0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.InterfaceC1840n0
        @B7.a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1840n0
        @B7.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((AbstractC4008q) view, str);
        }

        @Override // K7.InterfaceC1840n0
        @B7.a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1840n0
        @B7.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1840n0
        @B7.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1840n0
        @B7.a(name = "values")
        public void setEdgeMode(C4005n c4005n, String str) {
            c4005n.K(str);
        }

        @Override // K7.InterfaceC1840n0
        @B7.a(name = "in1")
        public void setIn1(C4005n c4005n, String str) {
            c4005n.L(str);
        }

        @Override // K7.InterfaceC1840n0
        @B7.a(name = "stdDeviationX")
        public void setStdDeviationX(C4005n c4005n, float f10) {
            c4005n.M(f10);
        }

        @Override // K7.InterfaceC1840n0
        @B7.a(name = "stdDeviationY")
        public void setStdDeviationY(C4005n c4005n, float f10) {
            c4005n.N(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class FeMergeManager extends FilterPrimitiveManager<C4006o> implements InterfaceC1844p0 {
        public static final String REACT_CLASS = "RNSVGFeMerge";

        FeMergeManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeMerge);
            ((VirtualViewManager) this).mDelegate = new C1842o0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.InterfaceC1844p0
        @B7.a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1844p0
        @B7.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((AbstractC4008q) view, str);
        }

        @Override // K7.InterfaceC1844p0
        @B7.a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1844p0
        @B7.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1844p0
        @B7.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1844p0
        @B7.a(name = "nodes")
        public void setNodes(C4006o c4006o, ReadableArray readableArray) {
            c4006o.J(readableArray);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class FeOffsetManager extends FilterPrimitiveManager<C4007p> implements InterfaceC1847r0 {
        public static final String REACT_CLASS = "RNSVGFeOffset";

        FeOffsetManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeOffset);
            ((VirtualViewManager) this).mDelegate = new C1846q0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.InterfaceC1847r0
        @B7.a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1847r0
        @B7.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((AbstractC4008q) view, str);
        }

        @Override // K7.InterfaceC1847r0
        @B7.a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1847r0
        @B7.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1847r0
        @B7.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((AbstractC4008q) view, dynamic);
        }

        @Override // K7.InterfaceC1847r0
        @B7.a(name = "dx")
        public void setDx(C4007p c4007p, Dynamic dynamic) {
            c4007p.J(dynamic);
        }

        @Override // K7.InterfaceC1847r0
        @B7.a(name = "dy")
        public void setDy(C4007p c4007p, Dynamic dynamic) {
            c4007p.K(dynamic);
        }

        @Override // K7.InterfaceC1847r0
        @B7.a(name = "in1")
        public void setIn1(C4007p c4007p, String str) {
            c4007p.L(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class FilterManager extends VirtualViewManager<C4014w> implements InterfaceC1851t0 {
        public static final String REACT_CLASS = "RNSVGFilter";

        FilterManager() {
            super(VirtualViewManager.SVGClass.RNSVGFilter);
            ((VirtualViewManager) this).mDelegate = new C1849s0(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.InterfaceC1851t0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1851t0
        @B7.a(name = "filterUnits")
        public void setFilterUnits(C4014w c4014w, String str) {
            c4014w.C(str);
        }

        @Override // K7.InterfaceC1851t0
        @B7.a(name = "height")
        public void setHeight(C4014w c4014w, Dynamic dynamic) {
            c4014w.D(dynamic);
        }

        @Override // K7.InterfaceC1851t0
        @B7.a(name = "primitiveUnits")
        public void setPrimitiveUnits(C4014w c4014w, String str) {
            c4014w.E(str);
        }

        @Override // K7.InterfaceC1851t0
        @B7.a(name = "width")
        public void setWidth(C4014w c4014w, Dynamic dynamic) {
            c4014w.F(dynamic);
        }

        @Override // K7.InterfaceC1851t0
        @B7.a(name = "x")
        public void setX(C4014w c4014w, Dynamic dynamic) {
            c4014w.G(dynamic);
        }

        @Override // K7.InterfaceC1851t0
        @B7.a(name = "y")
        public void setY(C4014w c4014w, Dynamic dynamic) {
            c4014w.H(dynamic);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class FilterPrimitiveManager<T extends AbstractC4008q> extends VirtualViewManager<T> {
        protected FilterPrimitiveManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @B7.a(name = "height")
        public void setHeight(T t10, Dynamic dynamic) {
            t10.E(dynamic);
        }

        @B7.a(name = "result")
        public void setResult(T t10, String str) {
            t10.F(str);
        }

        @B7.a(name = "width")
        public void setWidth(T t10, Dynamic dynamic) {
            t10.G(dynamic);
        }

        @B7.a(name = "x")
        public void setX(T t10, Dynamic dynamic) {
            t10.H(dynamic);
        }

        @B7.a(name = "y")
        public void setY(T t10, Dynamic dynamic) {
            t10.I(dynamic);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class ForeignObjectManager extends GroupViewManagerAbstract<C4016y> implements InterfaceC1855v0 {
        public static final String REACT_CLASS = "RNSVGForeignObject";

        ForeignObjectManager() {
            super(VirtualViewManager.SVGClass.RNSVGForeignObject);
            ((VirtualViewManager) this).mDelegate = new C1853u0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.InterfaceC1855v0
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1855v0
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1855v0
        @B7.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // K7.InterfaceC1855v0
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1855v0
        @B7.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1855v0
        @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1855v0
        @B7.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1855v0
        @B7.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // K7.InterfaceC1855v0
        @B7.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((B) view, dynamic);
        }

        @Override // K7.InterfaceC1855v0
        @B7.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((B) view, dynamic);
        }

        @Override // K7.InterfaceC1855v0
        @B7.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((B) view, dynamic);
        }

        @Override // K7.InterfaceC1855v0
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1855v0
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1855v0
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1855v0
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1855v0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.InterfaceC1855v0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.InterfaceC1855v0
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1855v0
        @B7.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // K7.InterfaceC1855v0
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1855v0
        @B7.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1855v0
        @B7.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1855v0
        @B7.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1855v0
        @B7.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1855v0
        @B7.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1855v0
        @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1855v0
        @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1855v0
        @B7.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1855v0
        @B7.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RenderableView) view, i10);
        }

        @Override // K7.InterfaceC1855v0
        @B7.a(name = "height")
        public void setHeight(C4016y c4016y, Dynamic dynamic) {
            c4016y.M(dynamic);
        }

        @Override // K7.InterfaceC1855v0
        @B7.a(name = "width")
        public void setWidth(C4016y c4016y, Dynamic dynamic) {
            c4016y.N(dynamic);
        }

        @Override // K7.InterfaceC1855v0
        @B7.a(name = "x")
        public void setX(C4016y c4016y, Dynamic dynamic) {
            c4016y.O(dynamic);
        }

        @Override // K7.InterfaceC1855v0
        @B7.a(name = "y")
        public void setY(C4016y c4016y, Dynamic dynamic) {
            c4016y.P(dynamic);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class GroupViewManager extends GroupViewManagerAbstract<B> implements InterfaceC1859x0 {
        public static final String REACT_CLASS = "RNSVGGroup";

        GroupViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGGroup);
            ((VirtualViewManager) this).mDelegate = new C1857w0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.InterfaceC1859x0
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1859x0
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1859x0
        @B7.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // K7.InterfaceC1859x0
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1859x0
        @B7.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1859x0
        @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1859x0
        @B7.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1859x0
        @B7.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // K7.InterfaceC1859x0
        @B7.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((B) view, dynamic);
        }

        @Override // K7.InterfaceC1859x0
        @B7.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((B) view, dynamic);
        }

        @Override // K7.InterfaceC1859x0
        @B7.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((B) view, dynamic);
        }

        @Override // K7.InterfaceC1859x0
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1859x0
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1859x0
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1859x0
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1859x0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.InterfaceC1859x0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.InterfaceC1859x0
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1859x0
        @B7.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // K7.InterfaceC1859x0
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1859x0
        @B7.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1859x0
        @B7.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1859x0
        @B7.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1859x0
        @B7.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1859x0
        @B7.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1859x0
        @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1859x0
        @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1859x0
        @B7.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1859x0
        @B7.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RenderableView) view, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class GroupViewManagerAbstract<U extends B> extends RenderableViewManager<U> {
        GroupViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @B7.a(name = "font")
        public void setFont(U u10, Dynamic dynamic) {
            u10.J(dynamic);
        }

        @B7.a(name = "fontSize")
        public void setFontSize(U u10, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i10 = a.f43652a[dynamic.getType().ordinal()];
            if (i10 == 1) {
                javaOnlyMap.putDouble("fontSize", dynamic.asDouble());
            } else if (i10 != 2) {
                return;
            } else {
                javaOnlyMap.putString("fontSize", dynamic.asString());
            }
            u10.K(javaOnlyMap);
        }

        @B7.a(name = "fontWeight")
        public void setFontWeight(U u10, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i10 = a.f43652a[dynamic.getType().ordinal()];
            if (i10 == 1) {
                javaOnlyMap.putDouble("fontWeight", dynamic.asDouble());
            } else if (i10 != 2) {
                return;
            } else {
                javaOnlyMap.putString("fontWeight", dynamic.asString());
            }
            u10.K(javaOnlyMap);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class ImageViewManager extends RenderableViewManager<C> implements InterfaceC1863z0 {
        public static final String REACT_CLASS = "RNSVGImage";

        ImageViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGImage);
            ((VirtualViewManager) this).mDelegate = new C1861y0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
            HashMap map = new HashMap();
            map.put(SvgLoadEvent.EVENT_NAME, U6.c.c("registrationName", "onLoad"));
            return map;
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.InterfaceC1863z0
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1863z0
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1863z0
        @B7.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // K7.InterfaceC1863z0
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1863z0
        @B7.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1863z0
        @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1863z0
        @B7.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1863z0
        @B7.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // K7.InterfaceC1863z0
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1863z0
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1863z0
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1863z0
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.InterfaceC1863z0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.InterfaceC1863z0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.InterfaceC1863z0
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1863z0
        @B7.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // K7.InterfaceC1863z0
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1863z0
        @B7.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1863z0
        @B7.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1863z0
        @B7.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1863z0
        @B7.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1863z0
        @B7.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1863z0
        @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1863z0
        @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1863z0
        @B7.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.InterfaceC1863z0
        @B7.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RenderableView) view, i10);
        }

        @Override // K7.InterfaceC1863z0
        @B7.a(name = "align")
        public void setAlign(C c10, String str) {
            c10.setAlign(str);
        }

        @Override // K7.InterfaceC1863z0
        @B7.a(name = "height")
        public void setHeight(C c10, Dynamic dynamic) {
            c10.G(dynamic);
        }

        @Override // K7.InterfaceC1863z0
        @B7.a(name = "meetOrSlice")
        public void setMeetOrSlice(C c10, int i10) {
            c10.setMeetOrSlice(i10);
        }

        @Override // K7.InterfaceC1863z0
        @B7.a(customType = "ImageSource", name = "src")
        public void setSrc(C c10, ReadableMap readableMap) {
            c10.H(readableMap);
        }

        @Override // K7.InterfaceC1863z0
        @B7.a(name = "width")
        public void setWidth(C c10, Dynamic dynamic) {
            c10.I(dynamic);
        }

        @Override // K7.InterfaceC1863z0
        @B7.a(name = "x")
        public void setX(C c10, Dynamic dynamic) {
            c10.J(dynamic);
        }

        @Override // K7.InterfaceC1863z0
        @B7.a(name = "y")
        public void setY(C c10, Dynamic dynamic) {
            c10.K(dynamic);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class LineViewManager extends RenderableViewManager<D> implements B0 {
        public static final String REACT_CLASS = "RNSVGLine";

        LineViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGLine);
            ((VirtualViewManager) this).mDelegate = new A0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.B0
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.B0
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.B0
        @B7.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // K7.B0
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.B0
        @B7.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.B0
        @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.B0
        @B7.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.B0
        @B7.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // K7.B0
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.B0
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.B0
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.B0
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.B0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.B0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.B0
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.B0
        @B7.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // K7.B0
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.B0
        @B7.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.B0
        @B7.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.B0
        @B7.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.B0
        @B7.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.B0
        @B7.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.B0
        @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.B0
        @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.B0
        @B7.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.B0
        @B7.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RenderableView) view, i10);
        }

        @Override // K7.B0
        @B7.a(name = "x1")
        public void setX1(D d10, Dynamic dynamic) {
            d10.B(dynamic);
        }

        @Override // K7.B0
        @B7.a(name = "x2")
        public void setX2(D d10, Dynamic dynamic) {
            d10.C(dynamic);
        }

        @Override // K7.B0
        @B7.a(name = "y1")
        public void setY1(D d10, Dynamic dynamic) {
            d10.D(dynamic);
        }

        @Override // K7.B0
        @B7.a(name = "y2")
        public void setY2(D d10, Dynamic dynamic) {
            d10.E(dynamic);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class LinearGradientManager extends VirtualViewManager<E> implements D0 {
        public static final String REACT_CLASS = "RNSVGLinearGradient";

        LinearGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGLinearGradient);
            ((VirtualViewManager) this).mDelegate = new C0(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.D0
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.D0
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @Override // K7.D0
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // K7.D0
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.D0
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.D0
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.D0
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.D0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.D0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.D0
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // K7.D0
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @Override // K7.D0
        @B7.a(name = "gradient")
        public void setGradient(E e10, ReadableArray readableArray) {
            e10.B(readableArray);
        }

        @Override // K7.D0
        @B7.a(name = "gradientTransform")
        public void setGradientTransform(E e10, ReadableArray readableArray) {
            e10.C(readableArray);
        }

        @Override // K7.D0
        @B7.a(name = "gradientUnits")
        public void setGradientUnits(E e10, int i10) {
            e10.D(i10);
        }

        @Override // K7.D0
        @B7.a(name = "x1")
        public void setX1(E e10, Dynamic dynamic) {
            e10.E(dynamic);
        }

        @Override // K7.D0
        @B7.a(name = "x2")
        public void setX2(E e10, Dynamic dynamic) {
            e10.F(dynamic);
        }

        @Override // K7.D0
        @B7.a(name = "y1")
        public void setY1(E e10, Dynamic dynamic) {
            e10.G(dynamic);
        }

        @Override // K7.D0
        @B7.a(name = "y2")
        public void setY2(E e10, Dynamic dynamic) {
            e10.H(dynamic);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class MarkerManager extends GroupViewManagerAbstract<F> implements F0 {
        public static final String REACT_CLASS = "RNSVGMarker";

        MarkerManager() {
            super(VirtualViewManager.SVGClass.RNSVGMarker);
            ((VirtualViewManager) this).mDelegate = new E0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.F0
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.F0
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.F0
        @B7.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // K7.F0
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.F0
        @B7.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.F0
        @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.F0
        @B7.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.F0
        @B7.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // K7.F0
        @B7.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((B) view, dynamic);
        }

        @Override // K7.F0
        @B7.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((B) view, dynamic);
        }

        @Override // K7.F0
        @B7.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((B) view, dynamic);
        }

        @Override // K7.F0
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.F0
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.F0
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.F0
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.F0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.F0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.F0
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.F0
        @B7.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // K7.F0
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.F0
        @B7.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.F0
        @B7.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.F0
        @B7.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.F0
        @B7.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.F0
        @B7.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.F0
        @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.F0
        @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.F0
        @B7.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.F0
        @B7.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RenderableView) view, i10);
        }

        @Override // K7.F0
        @B7.a(name = "align")
        public void setAlign(F f10, String str) {
            f10.setAlign(str);
        }

        @Override // K7.F0
        @B7.a(name = "markerHeight")
        public void setMarkerHeight(F f10, Dynamic dynamic) {
            f10.N(dynamic);
        }

        @Override // K7.F0
        @B7.a(name = "markerUnits")
        public void setMarkerUnits(F f10, String str) {
            f10.O(str);
        }

        @Override // K7.F0
        @B7.a(name = "markerWidth")
        public void setMarkerWidth(F f10, Dynamic dynamic) {
            f10.P(dynamic);
        }

        @Override // K7.F0
        @B7.a(name = "meetOrSlice")
        public void setMeetOrSlice(F f10, int i10) {
            f10.setMeetOrSlice(i10);
        }

        @Override // K7.F0
        @B7.a(name = "minX")
        public void setMinX(F f10, float f11) {
            f10.setMinX(f11);
        }

        @Override // K7.F0
        @B7.a(name = "minY")
        public void setMinY(F f10, float f11) {
            f10.setMinY(f11);
        }

        @Override // K7.F0
        @B7.a(name = "orient")
        public void setOrient(F f10, String str) {
            f10.Q(str);
        }

        @Override // K7.F0
        @B7.a(name = "refX")
        public void setRefX(F f10, Dynamic dynamic) {
            f10.R(dynamic);
        }

        @Override // K7.F0
        @B7.a(name = "refY")
        public void setRefY(F f10, Dynamic dynamic) {
            f10.S(dynamic);
        }

        @Override // K7.F0
        @B7.a(name = "vbHeight")
        public void setVbHeight(F f10, float f11) {
            f10.setVbHeight(f11);
        }

        @Override // K7.F0
        @B7.a(name = "vbWidth")
        public void setVbWidth(F f10, float f11) {
            f10.setVbWidth(f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class MaskManager extends GroupViewManagerAbstract<G> implements H0 {
        public static final String REACT_CLASS = "RNSVGMask";

        MaskManager() {
            super(VirtualViewManager.SVGClass.RNSVGMask);
            ((VirtualViewManager) this).mDelegate = new G0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.H0
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.H0
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.H0
        @B7.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // K7.H0
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.H0
        @B7.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.H0
        @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.H0
        @B7.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.H0
        @B7.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // K7.H0
        @B7.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((B) view, dynamic);
        }

        @Override // K7.H0
        @B7.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((B) view, dynamic);
        }

        @Override // K7.H0
        @B7.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((B) view, dynamic);
        }

        @Override // K7.H0
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.H0
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.H0
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.H0
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.H0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.H0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.H0
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.H0
        @B7.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // K7.H0
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.H0
        @B7.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.H0
        @B7.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.H0
        @B7.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.H0
        @B7.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.H0
        @B7.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.H0
        @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.H0
        @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.H0
        @B7.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.H0
        @B7.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RenderableView) view, i10);
        }

        @Override // K7.H0
        @B7.a(name = "height")
        public void setHeight(G g10, Dynamic dynamic) {
            g10.O(dynamic);
        }

        @Override // K7.H0
        @B7.a(name = "maskContentUnits")
        public void setMaskContentUnits(G g10, int i10) {
            g10.P(i10);
        }

        @Override // K7.H0
        @B7.a(name = "maskType")
        public void setMaskType(G g10, int i10) {
            g10.Q(i10);
        }

        @Override // K7.H0
        @B7.a(name = "maskUnits")
        public void setMaskUnits(G g10, int i10) {
            g10.R(i10);
        }

        @Override // K7.H0
        @B7.a(name = "width")
        public void setWidth(G g10, Dynamic dynamic) {
            g10.S(dynamic);
        }

        @Override // K7.H0
        @B7.a(name = "x")
        public void setX(G g10, Dynamic dynamic) {
            g10.T(dynamic);
        }

        @Override // K7.H0
        @B7.a(name = "y")
        public void setY(G g10, Dynamic dynamic) {
            g10.U(dynamic);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class PathViewManager extends RenderableViewManager<J> implements J0 {
        public static final String REACT_CLASS = "RNSVGPath";

        PathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGPath);
            ((VirtualViewManager) this).mDelegate = new I0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.J0
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.J0
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.J0
        @B7.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // K7.J0
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.J0
        @B7.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.J0
        @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.J0
        @B7.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.J0
        @B7.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // K7.J0
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.J0
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.J0
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.J0
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.J0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.J0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.J0
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.J0
        @B7.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // K7.J0
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.J0
        @B7.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.J0
        @B7.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.J0
        @B7.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.J0
        @B7.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.J0
        @B7.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.J0
        @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.J0
        @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.J0
        @B7.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.J0
        @B7.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RenderableView) view, i10);
        }

        @Override // K7.J0
        @B7.a(name = "d")
        public void setD(J j10, String str) {
            j10.B(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class PatternManager extends GroupViewManagerAbstract<K> implements L0 {
        public static final String REACT_CLASS = "RNSVGPattern";

        PatternManager() {
            super(VirtualViewManager.SVGClass.RNSVGPattern);
            ((VirtualViewManager) this).mDelegate = new K0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.L0
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.L0
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.L0
        @B7.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // K7.L0
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.L0
        @B7.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.L0
        @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.L0
        @B7.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.L0
        @B7.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // K7.L0
        @B7.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((B) view, dynamic);
        }

        @Override // K7.L0
        @B7.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((B) view, dynamic);
        }

        @Override // K7.L0
        @B7.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((B) view, dynamic);
        }

        @Override // K7.L0
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.L0
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.L0
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.L0
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.L0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.L0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.L0
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.L0
        @B7.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // K7.L0
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.L0
        @B7.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.L0
        @B7.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.L0
        @B7.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.L0
        @B7.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.L0
        @B7.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.L0
        @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.L0
        @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.L0
        @B7.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.L0
        @B7.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RenderableView) view, i10);
        }

        @Override // K7.L0
        @B7.a(name = "align")
        public void setAlign(K k10, String str) {
            k10.setAlign(str);
        }

        @Override // K7.L0
        @B7.a(name = "height")
        public void setHeight(K k10, Dynamic dynamic) {
            k10.M(dynamic);
        }

        @Override // K7.L0
        @B7.a(name = "meetOrSlice")
        public void setMeetOrSlice(K k10, int i10) {
            k10.setMeetOrSlice(i10);
        }

        @Override // K7.L0
        @B7.a(name = "minX")
        public void setMinX(K k10, float f10) {
            k10.setMinX(f10);
        }

        @Override // K7.L0
        @B7.a(name = "minY")
        public void setMinY(K k10, float f10) {
            k10.setMinY(f10);
        }

        @Override // K7.L0
        @B7.a(name = "patternContentUnits")
        public void setPatternContentUnits(K k10, int i10) {
            k10.N(i10);
        }

        @Override // K7.L0
        @B7.a(name = "patternTransform")
        public void setPatternTransform(K k10, ReadableArray readableArray) {
            k10.O(readableArray);
        }

        @Override // K7.L0
        @B7.a(name = "patternUnits")
        public void setPatternUnits(K k10, int i10) {
            k10.P(i10);
        }

        @Override // K7.L0
        @B7.a(name = "vbHeight")
        public void setVbHeight(K k10, float f10) {
            k10.setVbHeight(f10);
        }

        @Override // K7.L0
        @B7.a(name = "vbWidth")
        public void setVbWidth(K k10, float f10) {
            k10.setVbWidth(f10);
        }

        @Override // K7.L0
        @B7.a(name = "width")
        public void setWidth(K k10, Dynamic dynamic) {
            k10.Q(dynamic);
        }

        @Override // K7.L0
        @B7.a(name = "x")
        public void setX(K k10, Dynamic dynamic) {
            k10.R(dynamic);
        }

        @Override // K7.L0
        @B7.a(name = "y")
        public void setY(K k10, Dynamic dynamic) {
            k10.S(dynamic);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class RadialGradientManager extends VirtualViewManager<P> implements N0 {
        public static final String REACT_CLASS = "RNSVGRadialGradient";

        RadialGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGRadialGradient);
            ((VirtualViewManager) this).mDelegate = new M0(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.N0
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.N0
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        @Override // K7.N0
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // K7.N0
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.N0
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.N0
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.N0
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.N0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.N0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.N0
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // K7.N0
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @Override // K7.N0
        @B7.a(name = "cx")
        public void setCx(P p10, Dynamic dynamic) {
            p10.B(dynamic);
        }

        @Override // K7.N0
        @B7.a(name = "cy")
        public void setCy(P p10, Dynamic dynamic) {
            p10.C(dynamic);
        }

        @Override // K7.N0
        @B7.a(name = "fx")
        public void setFx(P p10, Dynamic dynamic) {
            p10.D(dynamic);
        }

        @Override // K7.N0
        @B7.a(name = "fy")
        public void setFy(P p10, Dynamic dynamic) {
            p10.E(dynamic);
        }

        @Override // K7.N0
        @B7.a(name = "gradient")
        public void setGradient(P p10, ReadableArray readableArray) {
            p10.F(readableArray);
        }

        @Override // K7.N0
        @B7.a(name = "gradientTransform")
        public void setGradientTransform(P p10, ReadableArray readableArray) {
            p10.G(readableArray);
        }

        @Override // K7.N0
        @B7.a(name = "gradientUnits")
        public void setGradientUnits(P p10, int i10) {
            p10.H(i10);
        }

        @Override // K7.N0
        @B7.a(name = "rx")
        public void setRx(P p10, Dynamic dynamic) {
            p10.I(dynamic);
        }

        @Override // K7.N0
        @B7.a(name = "ry")
        public void setRy(P p10, Dynamic dynamic) {
            p10.J(dynamic);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class RectViewManager extends RenderableViewManager<Q> implements P0 {
        public static final String REACT_CLASS = "RNSVGRect";

        RectViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGRect);
            ((VirtualViewManager) this).mDelegate = new O0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.P0
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.P0
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.P0
        @B7.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // K7.P0
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.P0
        @B7.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.P0
        @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.P0
        @B7.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.P0
        @B7.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // K7.P0
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.P0
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.P0
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.P0
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.P0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.P0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.P0
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.P0
        @B7.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // K7.P0
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.P0
        @B7.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.P0
        @B7.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.P0
        @B7.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.P0
        @B7.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.P0
        @B7.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.P0
        @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.P0
        @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.P0
        @B7.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.P0
        @B7.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RenderableView) view, i10);
        }

        @Override // K7.P0
        @B7.a(name = "height")
        public void setHeight(Q q10, Dynamic dynamic) {
            q10.B(dynamic);
        }

        @Override // K7.P0
        @B7.a(name = "rx")
        public void setRx(Q q10, Dynamic dynamic) {
            q10.C(dynamic);
        }

        @Override // K7.P0
        @B7.a(name = "ry")
        public void setRy(Q q10, Dynamic dynamic) {
            q10.D(dynamic);
        }

        @Override // K7.P0
        @B7.a(name = "width")
        public void setWidth(Q q10, Dynamic dynamic) {
            q10.E(dynamic);
        }

        @Override // K7.P0
        @B7.a(name = "x")
        public void setX(Q q10, Dynamic dynamic) {
            q10.F(dynamic);
        }

        @Override // K7.P0
        @B7.a(name = "y")
        public void setY(Q q10, Dynamic dynamic) {
            q10.G(dynamic);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class SymbolManager extends GroupViewManagerAbstract<T> implements T0 {
        public static final String REACT_CLASS = "RNSVGSymbol";

        SymbolManager() {
            super(VirtualViewManager.SVGClass.RNSVGSymbol);
            ((VirtualViewManager) this).mDelegate = new S0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.T0
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.T0
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.T0
        @B7.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // K7.T0
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.T0
        @B7.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.T0
        @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.T0
        @B7.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.T0
        @B7.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // K7.T0
        @B7.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((B) view, dynamic);
        }

        @Override // K7.T0
        @B7.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((B) view, dynamic);
        }

        @Override // K7.T0
        @B7.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((B) view, dynamic);
        }

        @Override // K7.T0
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.T0
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.T0
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.T0
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.T0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.T0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.T0
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.T0
        @B7.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // K7.T0
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.T0
        @B7.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.T0
        @B7.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.T0
        @B7.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.T0
        @B7.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.T0
        @B7.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.T0
        @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.T0
        @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.T0
        @B7.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.T0
        @B7.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RenderableView) view, i10);
        }

        @Override // K7.T0
        @B7.a(name = "align")
        public void setAlign(T t10, String str) {
            t10.setAlign(str);
        }

        @Override // K7.T0
        @B7.a(name = "meetOrSlice")
        public void setMeetOrSlice(T t10, int i10) {
            t10.setMeetOrSlice(i10);
        }

        @Override // K7.T0
        @B7.a(name = "minX")
        public void setMinX(T t10, float f10) {
            t10.setMinX(f10);
        }

        @Override // K7.T0
        @B7.a(name = "minY")
        public void setMinY(T t10, float f10) {
            t10.setMinY(f10);
        }

        @Override // K7.T0
        @B7.a(name = "vbHeight")
        public void setVbHeight(T t10, float f10) {
            t10.setVbHeight(f10);
        }

        @Override // K7.T0
        @B7.a(name = "vbWidth")
        public void setVbWidth(T t10, float f10) {
            t10.setVbWidth(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class TSpanViewManager extends TextViewManagerAbstract<Y> implements V0 {
        public static final String REACT_CLASS = "RNSVGTSpan";

        TSpanViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTSpan);
            ((VirtualViewManager) this).mDelegate = new U0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.V0
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((l0) view, str);
        }

        @Override // K7.V0
        @B7.a(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((l0) view, dynamic);
        }

        @Override // K7.V0
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.V0
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.V0
        @B7.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // K7.V0
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // K7.V0
        @B7.a(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((l0) view, dynamic);
        }

        @Override // K7.V0
        @B7.a(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((l0) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.V0
        @B7.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.V0
        @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.V0
        @B7.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.V0
        @B7.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // K7.V0
        @B7.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((l0) view, dynamic);
        }

        @Override // K7.V0
        @B7.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((B) view, dynamic);
        }

        @Override // K7.V0
        @B7.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((B) view, dynamic);
        }

        @Override // K7.V0
        @B7.a(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((l0) view, dynamic);
        }

        @Override // K7.V0
        @B7.a(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((l0) view, str);
        }

        @Override // K7.V0
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.V0
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.V0
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.V0
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.V0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.V0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.V0
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.V0
        @B7.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // K7.V0
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @Override // K7.V0
        @B7.a(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((l0) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.V0
        @B7.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.V0
        @B7.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.V0
        @B7.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.V0
        @B7.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.V0
        @B7.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.V0
        @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.V0
        @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.V0
        @B7.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // K7.V0
        @B7.a(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((l0) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.V0
        @B7.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RenderableView) view, i10);
        }

        @Override // K7.V0
        @B7.a(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((l0) view, dynamic);
        }

        @Override // K7.V0
        @B7.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((l0) view, dynamic);
        }

        @Override // K7.V0
        @B7.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((l0) view, dynamic);
        }

        @Override // K7.V0
        @B7.a(name = "content")
        public void setContent(Y y10, String str) {
            y10.k0(str);
        }

        TSpanViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            ((VirtualViewManager) this).mDelegate = new U0(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class TextPathViewManager extends TextViewManagerAbstract<Z> implements Z0 {
        public static final String REACT_CLASS = "RNSVGTextPath";

        TextPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTextPath);
            ((VirtualViewManager) this).mDelegate = new Y0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.Z0
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((l0) view, str);
        }

        @Override // K7.Z0
        @B7.a(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((l0) view, dynamic);
        }

        @Override // K7.Z0
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.Z0
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z0
        @B7.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // K7.Z0
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // K7.Z0
        @B7.a(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((l0) view, dynamic);
        }

        @Override // K7.Z0
        @B7.a(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((l0) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z0
        @B7.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z0
        @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z0
        @B7.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z0
        @B7.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // K7.Z0
        @B7.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((l0) view, dynamic);
        }

        @Override // K7.Z0
        @B7.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((B) view, dynamic);
        }

        @Override // K7.Z0
        @B7.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((B) view, dynamic);
        }

        @Override // K7.Z0
        @B7.a(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((l0) view, dynamic);
        }

        @Override // K7.Z0
        @B7.a(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((l0) view, str);
        }

        @Override // K7.Z0
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.Z0
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.Z0
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.Z0
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.Z0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.Z0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.Z0
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z0
        @B7.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // K7.Z0
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @Override // K7.Z0
        @B7.a(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((l0) view, dynamic);
        }

        @B7.a(name = "midLine")
        public void setSharp(Z z10, String str) {
            z10.i0(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z0
        @B7.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z0
        @B7.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z0
        @B7.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z0
        @B7.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z0
        @B7.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z0
        @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z0
        @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z0
        @B7.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // K7.Z0
        @B7.a(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((l0) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.Z0
        @B7.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RenderableView) view, i10);
        }

        @Override // K7.Z0
        @B7.a(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((l0) view, dynamic);
        }

        @Override // K7.Z0
        @B7.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((l0) view, dynamic);
        }

        @Override // K7.Z0
        @B7.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((l0) view, dynamic);
        }

        @Override // K7.Z0
        @B7.a(name = "href")
        public void setHref(Z z10, String str) {
            z10.h0(str);
        }

        @Override // K7.Z0
        public void setMidLine(Z z10, String str) {
            z10.i0(str);
        }

        @Override // K7.Z0
        @B7.a(name = "side")
        public void setSide(Z z10, String str) {
            z10.j0(str);
        }

        @Override // K7.Z0
        @B7.a(name = "spacing")
        public void setSpacing(Z z10, String str) {
            z10.k0(str);
        }

        @Override // K7.Z0
        @B7.a(name = "startOffset")
        public void setStartOffset(Z z10, Dynamic dynamic) {
            z10.l0(dynamic);
        }

        TextPathViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            ((VirtualViewManager) this).mDelegate = new Y0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract
        @B7.a(name = "method")
        public void setMethod(Z z10, String str) {
            z10.X(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class TextViewManagerAbstract<K extends l0> extends GroupViewManagerAbstract<K> {
        TextViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        public void setAlignmentBaseline(K k10, String str) {
            k10.X(str);
        }

        @B7.a(name = "baselineShift")
        public void setBaselineShift(K k10, Dynamic dynamic) {
            k10.S(dynamic);
        }

        @B7.a(name = "dx")
        public void setDx(K k10, Dynamic dynamic) {
            k10.T(dynamic);
        }

        @B7.a(name = "dy")
        public void setDy(K k10, Dynamic dynamic) {
            k10.U(dynamic);
        }

        @B7.a(name = "inlineSize")
        public void setInlineSize(K k10, Dynamic dynamic) {
            k10.V(dynamic);
        }

        @B7.a(name = "lengthAdjust")
        public void setLengthAdjust(K k10, String str) {
            k10.W(str);
        }

        @B7.a(name = "alignmentBaseline")
        public void setMethod(K k10, String str) {
            k10.X(str);
        }

        @B7.a(name = "rotate")
        public void setRotate(K k10, Dynamic dynamic) {
            k10.a0(dynamic);
        }

        @B7.a(name = "textLength")
        public void setTextLength(K k10, Dynamic dynamic) {
            k10.b0(dynamic);
        }

        @B7.a(name = "verticalAlign")
        public void setVerticalAlign(K k10, Dynamic dynamic) {
            k10.c0(dynamic);
        }

        @B7.a(name = "x")
        public void setX(K k10, Dynamic dynamic) {
            k10.Y(dynamic);
        }

        @B7.a(name = "y")
        public void setY(K k10, Dynamic dynamic) {
            k10.Z(dynamic);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract
        @B7.a(name = "font")
        public void setFont(K k10, Dynamic dynamic) {
            k10.J(dynamic);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class UseViewManager extends RenderableViewManager<m0> implements b1 {
        public static final String REACT_CLASS = "RNSVGUse";

        UseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGUse);
            ((VirtualViewManager) this).mDelegate = new a1(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.b1
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.b1
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.b1
        @B7.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // K7.b1
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.b1
        @B7.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.b1
        @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.b1
        @B7.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.b1
        @B7.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // K7.b1
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.b1
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.b1
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.b1
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.b1
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.b1
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.b1
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.b1
        @B7.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // K7.b1
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.b1
        @B7.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.b1
        @B7.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.b1
        @B7.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.b1
        @B7.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.b1
        @B7.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.b1
        @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.b1
        @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.b1
        @B7.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.b1
        @B7.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RenderableView) view, i10);
        }

        @Override // K7.b1
        @B7.a(name = "height")
        public void setHeight(m0 m0Var, Dynamic dynamic) {
            m0Var.B(dynamic);
        }

        @Override // K7.b1
        @B7.a(name = "href")
        public void setHref(m0 m0Var, String str) {
            m0Var.C(str);
        }

        @Override // K7.b1
        @B7.a(name = "width")
        public void setWidth(m0 m0Var, Dynamic dynamic) {
            m0Var.D(dynamic);
        }

        @Override // K7.b1
        @B7.a(name = "x")
        public void setX(m0 m0Var, Dynamic dynamic) {
            m0Var.E(dynamic);
        }

        @Override // K7.b1
        @B7.a(name = "y")
        public void setY(m0 m0Var, Dynamic dynamic) {
            m0Var.F(dynamic);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43652a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f43652a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43652a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    RenderableViewManager(VirtualViewManager.SVGClass sVGClass) {
        super(sVGClass);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        HashMap map = new HashMap();
        map.put(SvgOnLayoutEvent.EVENT_NAME, U6.c.c("registrationName", "onSvgLayout"));
        return map;
    }

    @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @B7.a(customType = "Color", name = "color")
    public void setColor(T t10, Integer num) {
        t10.setCurrentColor(num);
    }

    @B7.a(name = "fill")
    public void setFill(T t10, Dynamic dynamic) {
        t10.setFill(dynamic);
    }

    @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(T t10, float f10) {
        t10.setFillOpacity(f10);
    }

    @B7.a(defaultInt = 1, name = "fillRule")
    public void setFillRule(T t10, int i10) {
        t10.setFillRule(i10);
    }

    @B7.a(name = "filter")
    public void setFilter(T t10, String str) {
        t10.setFilter(str);
    }

    @B7.a(name = "propList")
    public void setPropList(T t10, ReadableArray readableArray) {
        t10.setPropList(readableArray);
    }

    @B7.a(name = "stroke")
    public void setStroke(T t10, Dynamic dynamic) {
        t10.setStroke(dynamic);
    }

    @B7.a(name = "strokeDasharray")
    public void setStrokeDasharray(T t10, Dynamic dynamic) {
        t10.setStrokeDasharray(dynamic);
    }

    @B7.a(name = "strokeDashoffset")
    public void setStrokeDashoffset(T t10, float f10) {
        t10.setStrokeDashoffset(f10);
    }

    @B7.a(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(T t10, int i10) {
        t10.setStrokeLinecap(i10);
    }

    @B7.a(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(T t10, int i10) {
        t10.setStrokeLinejoin(i10);
    }

    @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(T t10, float f10) {
        t10.setStrokeMiterlimit(f10);
    }

    @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(T t10, float f10) {
        t10.setStrokeOpacity(f10);
    }

    @B7.a(name = "strokeWidth")
    public void setStrokeWidth(T t10, Dynamic dynamic) {
        t10.setStrokeWidth(dynamic);
    }

    @B7.a(name = "vectorEffect")
    public void setVectorEffect(T t10, int i10) {
        t10.setVectorEffect(i10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class TextViewManager extends TextViewManagerAbstract<l0> implements X0 {
        public static final String REACT_CLASS = "RNSVGText";

        TextViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGText);
            ((VirtualViewManager) this).mDelegate = new W0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // K7.X0
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((l0) view, str);
        }

        @Override // K7.X0
        @B7.a(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((l0) view, dynamic);
        }

        @Override // K7.X0
        @B7.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // K7.X0
        @B7.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((VirtualView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X0
        @B7.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // K7.X0
        @B7.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // K7.X0
        @B7.a(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((l0) view, dynamic);
        }

        @Override // K7.X0
        @B7.a(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((l0) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X0
        @B7.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X0
        @B7.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X0
        @B7.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X0
        @B7.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // K7.X0
        @B7.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((l0) view, dynamic);
        }

        @Override // K7.X0
        @B7.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((B) view, dynamic);
        }

        @Override // K7.X0
        @B7.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((B) view, dynamic);
        }

        @Override // K7.X0
        @B7.a(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((l0) view, dynamic);
        }

        @Override // K7.X0
        @B7.a(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((l0) view, str);
        }

        @Override // K7.X0
        @B7.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // K7.X0
        @B7.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // K7.X0
        @B7.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // K7.X0
        @B7.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // K7.X0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // K7.X0
        @B7.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @B7.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((VirtualView) view, f10);
        }

        @Override // K7.X0
        @B7.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X0
        @B7.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // K7.X0
        @B7.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((VirtualView) view, z10);
        }

        @Override // K7.X0
        @B7.a(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((l0) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X0
        @B7.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X0
        @B7.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X0
        @B7.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X0
        @B7.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X0
        @B7.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RenderableView) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X0
        @B7.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X0
        @B7.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RenderableView) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X0
        @B7.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // K7.X0
        @B7.a(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((l0) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // K7.X0
        @B7.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RenderableView) view, i10);
        }

        @Override // K7.X0
        @B7.a(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((l0) view, dynamic);
        }

        @Override // K7.X0
        @B7.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((l0) view, dynamic);
        }

        @Override // K7.X0
        @B7.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((l0) view, dynamic);
        }

        TextViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            ((VirtualViewManager) this).mDelegate = new W0(this);
        }
    }

    public void setFill(T t10, ReadableMap readableMap) {
        t10.setFill(readableMap);
    }

    public void setStroke(T t10, ReadableMap readableMap) {
        t10.setStroke(readableMap);
    }
}
