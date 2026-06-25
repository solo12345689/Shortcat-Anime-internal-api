.class public final Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/uimanager/A0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/th3rdwave/safeareacontext/f;",
        ">;",
        "Lcom/facebook/react/uimanager/A0;"
    }
.end annotation

.annotation runtime Lk7/a;
    name = "RNCSafeAreaProvider"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u001b2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001cB\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J+\u0010\u0008\u001a\u001e\u0012\u000c\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\'\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00110\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R0\u0010\u0019\u001a\u001e\u0012\u000c\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;",
        "Lcom/facebook/react/uimanager/ViewGroupManager;",
        "Lcom/th3rdwave/safeareacontext/f;",
        "",
        "<init>",
        "()V",
        "LK7/s;",
        "kotlin.jvm.PlatformType",
        "getDelegate",
        "()LK7/s;",
        "",
        "getName",
        "()Ljava/lang/String;",
        "Lcom/facebook/react/uimanager/b0;",
        "context",
        "createViewInstance",
        "(Lcom/facebook/react/uimanager/b0;)Lcom/th3rdwave/safeareacontext/f;",
        "",
        "getExportedCustomDirectEventTypeConstants",
        "()Ljava/util/Map;",
        "reactContext",
        "view",
        "LTd/L;",
        "addEventEmitters",
        "(Lcom/facebook/react/uimanager/b0;Lcom/th3rdwave/safeareacontext/f;)V",
        "mDelegate",
        "LK7/s;",
        "Companion",
        "a",
        "react-native-safe-area-context_release"
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
.field public static final Companion:Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$a;

.field public static final REACT_CLASS:Ljava/lang/String; = "RNCSafeAreaProvider"


# instance fields
.field private final mDelegate:LK7/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LK7/s;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;->Companion:Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$a;

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
    new-instance v0, LK7/s;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LK7/s;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;->mDelegate:LK7/s;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic addEventEmitters(Lcom/facebook/react/uimanager/b0;Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/th3rdwave/safeareacontext/f;

    invoke-virtual {p0, p1, p2}, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;->addEventEmitters(Lcom/facebook/react/uimanager/b0;Lcom/th3rdwave/safeareacontext/f;)V

    return-void
.end method

.method protected addEventEmitters(Lcom/facebook/react/uimanager/b0;Lcom/th3rdwave/safeareacontext/f;)V
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/BaseViewManager;->addEventEmitters(Lcom/facebook/react/uimanager/b0;Landroid/view/View;)V

    .line 3
    sget-object p1, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$b;->a:Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$b;

    invoke-virtual {p2, p1}, Lcom/th3rdwave/safeareacontext/f;->setOnInsetsChangeHandler(Lie/o;)V

    return-void
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/b0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;->createViewInstance(Lcom/facebook/react/uimanager/b0;)Lcom/th3rdwave/safeareacontext/f;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/b0;)Lcom/th3rdwave/safeareacontext/f;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/th3rdwave/safeareacontext/f;

    invoke-direct {v0, p1}, Lcom/th3rdwave/safeareacontext/f;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method protected getDelegate()LK7/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LK7/s;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;->mDelegate:LK7/s;

    return-object v0
.end method

.method public bridge synthetic getDelegate()Lcom/facebook/react/uimanager/q0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;->getDelegate()LK7/s;

    move-result-object v0

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    const-string v0, "registrationName"

    .line 2
    .line 3
    const-string v1, "onInsetsChange"

    .line 4
    .line 5
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, LUd/S;->n([Lkotlin/Pair;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "topInsetsChange"

    .line 18
    .line 19
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, LUd/S;->n([Lkotlin/Pair;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "RNCSafeAreaProvider"

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
