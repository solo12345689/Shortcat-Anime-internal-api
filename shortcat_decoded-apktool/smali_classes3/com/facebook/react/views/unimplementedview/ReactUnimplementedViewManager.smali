.class public final Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK7/i1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/facebook/react/views/unimplementedview/a;",
        ">;",
        "LK7/i1;"
    }
.end annotation

.annotation runtime Lk7/a;
    name = "UnimplementedNativeView"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 \u00172\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0018B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0008\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0017\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;",
        "Lcom/facebook/react/uimanager/ViewGroupManager;",
        "Lcom/facebook/react/views/unimplementedview/a;",
        "LK7/i1;",
        "<init>",
        "()V",
        "Lcom/facebook/react/uimanager/q0;",
        "getDelegate",
        "()Lcom/facebook/react/uimanager/q0;",
        "Lcom/facebook/react/uimanager/b0;",
        "reactContext",
        "createViewInstance",
        "(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/unimplementedview/a;",
        "",
        "getName",
        "()Ljava/lang/String;",
        "view",
        "value",
        "LTd/L;",
        "setName",
        "(Lcom/facebook/react/views/unimplementedview/a;Ljava/lang/String;)V",
        "delegate",
        "Lcom/facebook/react/uimanager/q0;",
        "Companion",
        "a",
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
.field public static final Companion:Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager$a;

.field public static final REACT_CLASS:Ljava/lang/String; = "UnimplementedNativeView"


# instance fields
.field private final delegate:Lcom/facebook/react/uimanager/q0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/uimanager/q0;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;->Companion:Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-direct {p0, v0, v1, v0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LK7/h1;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LK7/h1;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;->delegate:Lcom/facebook/react/uimanager/q0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/b0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;->createViewInstance(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/unimplementedview/a;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/unimplementedview/a;
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/facebook/react/views/unimplementedview/a;

    invoke-direct {v0, p1}, Lcom/facebook/react/views/unimplementedview/a;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public getDelegate()Lcom/facebook/react/uimanager/q0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/q0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;->delegate:Lcom/facebook/react/uimanager/q0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "UnimplementedNativeView"

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/m;->removeAllViews(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setName(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/unimplementedview/a;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/unimplementedview/ReactUnimplementedViewManager;->setName(Lcom/facebook/react/views/unimplementedview/a;Ljava/lang/String;)V

    return-void
.end method

.method public setName(Lcom/facebook/react/views/unimplementedview/a;Ljava/lang/String;)V
    .locals 1
    .annotation runtime LB7/a;
        name = "name"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    .line 2
    const-string p2, "<null component name>"

    :cond_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/unimplementedview/a;->setName$ReactAndroid_release(Ljava/lang/String;)V

    return-void
.end method
