.class public final Lcom/facebook/react/fabric/mounting/mountitems/MountItemFactory;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000eJ\'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012JC\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\r2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ7\u0010#\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010 2\u0006\u0010\"\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lcom/facebook/react/fabric/mounting/mountitems/MountItemFactory;",
        "",
        "<init>",
        "()V",
        "",
        "surfaceId",
        "reactTag",
        "commandId",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "commandArgs",
        "Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;",
        "createDispatchCommandMountItem",
        "(IIILcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;",
        "",
        "(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;",
        "eventType",
        "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;",
        "createSendAccessibilityEventMountItem",
        "(III)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;",
        "component",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "props",
        "Lcom/facebook/react/uimanager/a0;",
        "stateWrapper",
        "",
        "isLayoutable",
        "createPreAllocateViewMountItem",
        "(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/uimanager/a0;Z)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;",
        "createDestroyViewMountItem",
        "(II)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;",
        "",
        "intBuf",
        "",
        "objBuf",
        "commitNumber",
        "createIntBufferBatchMountItem",
        "(I[I[Ljava/lang/Object;I)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/facebook/react/fabric/mounting/mountitems/MountItemFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/fabric/mounting/mountitems/MountItemFactory;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/fabric/mounting/mountitems/MountItemFactory;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/fabric/mounting/mountitems/MountItemFactory;->INSTANCE:Lcom/facebook/react/fabric/mounting/mountitems/MountItemFactory;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final createDestroyViewMountItem(II)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/fabric/mounting/mountitems/DestroyUnmountedViewMountItem;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/facebook/react/fabric/mounting/mountitems/DestroyUnmountedViewMountItem;-><init>(II)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final createDispatchCommandMountItem(IIILcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;
    .locals 1

    const-string v0, "commandArgs"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/facebook/react/fabric/mounting/mountitems/DispatchIntCommandMountItem;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/facebook/react/fabric/mounting/mountitems/DispatchIntCommandMountItem;-><init>(IIILcom/facebook/react/bridge/ReadableArray;)V

    return-object v0
.end method

.method public static final createDispatchCommandMountItem(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;
    .locals 1

    const-string v0, "commandId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandArgs"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/facebook/react/fabric/mounting/mountitems/DispatchStringCommandMountItem;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/facebook/react/fabric/mounting/mountitems/DispatchStringCommandMountItem;-><init>(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-object v0
.end method

.method public static final createIntBufferBatchMountItem(I[I[Ljava/lang/Object;I)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;
    .locals 1

    .line 1
    const-string v0, "intBuf"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "objBuf"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;-><init>(I[I[Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static final createPreAllocateViewMountItem(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/uimanager/a0;Z)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;
    .locals 8

    .line 1
    const-string v0, "component"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/facebook/react/fabric/mounting/mountitems/PreAllocateViewMountItem;

    .line 7
    .line 8
    move v2, p0

    .line 9
    move v3, p1

    .line 10
    move-object v4, p2

    .line 11
    move-object v5, p3

    .line 12
    move-object v6, p4

    .line 13
    move v7, p5

    .line 14
    invoke-direct/range {v1 .. v7}, Lcom/facebook/react/fabric/mounting/mountitems/PreAllocateViewMountItem;-><init>(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/uimanager/a0;Z)V

    .line 15
    .line 16
    .line 17
    return-object v1
.end method

.method public static final createSendAccessibilityEventMountItem(III)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/fabric/mounting/mountitems/SendAccessibilityEventMountItem;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/react/fabric/mounting/mountitems/SendAccessibilityEventMountItem;-><init>(III)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
