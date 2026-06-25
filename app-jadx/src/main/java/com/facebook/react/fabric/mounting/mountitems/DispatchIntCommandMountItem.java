package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.fabric.mounting.MountingManager;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/DispatchIntCommandMountItem;", "Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;", "", "surfaceId", "reactTag", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "commandArgs", "<init>", "(IIILcom/facebook/react/bridge/ReadableArray;)V", "getSurfaceId", "()I", "Lcom/facebook/react/fabric/mounting/MountingManager;", "mountingManager", "LTd/L;", "execute", "(Lcom/facebook/react/fabric/mounting/MountingManager;)V", "", "toString", "()Ljava/lang/String;", "I", "Lcom/facebook/react/bridge/ReadableArray;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DispatchIntCommandMountItem extends DispatchCommandMountItem {
    private final ReadableArray commandArgs;
    private final int commandId;
    private final int reactTag;
    private final int surfaceId;

    public DispatchIntCommandMountItem(int i10, int i11, int i12, ReadableArray commandArgs) {
        AbstractC5504s.h(commandArgs, "commandArgs");
        this.surfaceId = i10;
        this.reactTag = i11;
        this.commandId = i12;
        this.commandArgs = commandArgs;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        AbstractC5504s.h(mountingManager, "mountingManager");
        mountingManager.receiveCommand(this.surfaceId, this.reactTag, this.commandId, this.commandArgs);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.surfaceId;
    }

    public String toString() {
        return "DispatchIntCommandMountItem [" + this.reactTag + "] " + this.commandId;
    }
}
