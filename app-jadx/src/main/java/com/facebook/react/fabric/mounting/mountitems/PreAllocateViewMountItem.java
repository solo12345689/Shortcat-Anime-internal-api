package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.uimanager.InterfaceC3282a0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/PreAllocateViewMountItem;", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "", "surfaceId", "reactTag", "", "component", "Lcom/facebook/react/bridge/ReadableMap;", "props", "Lcom/facebook/react/uimanager/a0;", "stateWrapper", "", "isLayoutable", "<init>", "(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/uimanager/a0;Z)V", "getSurfaceId", "()I", "Lcom/facebook/react/fabric/mounting/MountingManager;", "mountingManager", "LTd/L;", "execute", "(Lcom/facebook/react/fabric/mounting/MountingManager;)V", "toString", "()Ljava/lang/String;", "I", "Lcom/facebook/react/bridge/ReadableMap;", "Lcom/facebook/react/uimanager/a0;", "Z", "fabricComponentName", "Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreAllocateViewMountItem implements MountItem {
    private final String fabricComponentName;
    private final boolean isLayoutable;
    private final ReadableMap props;
    private final int reactTag;
    private final InterfaceC3282a0 stateWrapper;
    private final int surfaceId;

    public PreAllocateViewMountItem(int i10, int i11, String component, ReadableMap readableMap, InterfaceC3282a0 interfaceC3282a0, boolean z10) {
        AbstractC5504s.h(component, "component");
        this.surfaceId = i10;
        this.reactTag = i11;
        this.props = readableMap;
        this.stateWrapper = interfaceC3282a0;
        this.isLayoutable = z10;
        this.fabricComponentName = FabricNameComponentMapping.getFabricComponentName(component);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        AbstractC5504s.h(mountingManager, "mountingManager");
        SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(this.surfaceId);
        if (surfaceManager != null) {
            surfaceManager.preallocateView(this.fabricComponentName, this.reactTag, this.props, this.stateWrapper, this.isLayoutable);
            return;
        }
        AbstractC7283a.m(FabricUIManager.TAG, "Skipping View PreAllocation; no SurfaceMountingManager found for [" + this.surfaceId + "]");
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.surfaceId;
    }

    public String toString() {
        String string;
        String string2;
        StringBuilder sb2 = new StringBuilder("PreAllocateViewMountItem [");
        sb2.append(this.reactTag);
        sb2.append("] - component: ");
        sb2.append(this.fabricComponentName);
        sb2.append(" surfaceId: ");
        sb2.append(this.surfaceId);
        sb2.append(" isLayoutable: ");
        sb2.append(this.isLayoutable);
        if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT) {
            sb2.append(" props: ");
            ReadableMap readableMap = this.props;
            String str = "<null>";
            if (readableMap == null || (string = readableMap.toString()) == null) {
                string = "<null>";
            }
            sb2.append(string);
            sb2.append(" state: ");
            InterfaceC3282a0 interfaceC3282a0 = this.stateWrapper;
            if (interfaceC3282a0 != null && (string2 = interfaceC3282a0.toString()) != null) {
                str = string2;
            }
            sb2.append(str);
        }
        String string3 = sb2.toString();
        AbstractC5504s.g(string3, "toString(...)");
        return string3;
    }
}
