.class public final Lcom/facebook/react/views/text/ReactTextViewManager;
.super Lcom/facebook/react/views/text/ReactTextAnchorViewManager;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/uimanager/n;
.implements Lcom/facebook/react/views/text/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/text/ReactTextViewManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/views/text/ReactTextAnchorViewManager<",
        "Lcom/facebook/react/views/text/h;",
        ">;",
        "Lcom/facebook/react/uimanager/n;",
        "Lcom/facebook/react/views/text/o;"
    }
.end annotation

.annotation runtime Lk7/a;
    name = "RCTText"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0010\u0008\u0007\u0018\u0000 D2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001EB\u0015\u0008\u0007\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0013\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00082\u0006\u0010\u001b\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u001e\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010!\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008!\u0010#J\u0015\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00020$H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010\'\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\'\u0010\u001aJ\u000f\u0010)\u001a\u00020(H\u0016\u00a2\u0006\u0004\u0008)\u0010*J)\u0010-\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010,\u001a\u00020+H\u0016\u00a2\u0006\u0004\u0008-\u0010.J\u001d\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e\u0018\u00010/H\u0016\u00a2\u0006\u0004\u00080\u00101J\u0017\u00104\u001a\u00020\u00182\u0006\u00103\u001a\u000202H\u0016\u00a2\u0006\u0004\u00084\u00105J7\u0010;\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00082\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u0002062\u0006\u00109\u001a\u0002062\u0006\u0010:\u001a\u000206H\u0016\u00a2\u0006\u0004\u0008;\u0010<J!\u0010>\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010=\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0004\u0008>\u0010?R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010@\u001a\u0004\u0008A\u0010B\"\u0004\u0008C\u0010\u0007\u00a8\u0006F"
    }
    d2 = {
        "Lcom/facebook/react/views/text/ReactTextViewManager;",
        "Lcom/facebook/react/views/text/ReactTextAnchorViewManager;",
        "Lcom/facebook/react/views/text/h;",
        "Lcom/facebook/react/uimanager/n;",
        "Lcom/facebook/react/views/text/o;",
        "reactTextViewManagerCallback",
        "<init>",
        "(Lcom/facebook/react/views/text/o;)V",
        "Lcom/facebook/react/views/text/m;",
        "view",
        "Lcom/facebook/react/uimanager/Q;",
        "props",
        "Lcom/facebook/react/common/mapbuffer/a;",
        "state",
        "",
        "getReactTextUpdate",
        "(Lcom/facebook/react/views/text/m;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/common/mapbuffer/a;)Ljava/lang/Object;",
        "Lcom/facebook/react/uimanager/b0;",
        "reactContext",
        "prepareToRecycleView",
        "(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/text/m;)Lcom/facebook/react/views/text/m;",
        "",
        "getName",
        "()Ljava/lang/String;",
        "LTd/L;",
        "updateViewAccessibility",
        "(Lcom/facebook/react/views/text/m;)V",
        "context",
        "createViewInstance",
        "(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/text/m;",
        "extraData",
        "updateExtraData",
        "(Lcom/facebook/react/views/text/m;Ljava/lang/Object;)V",
        "createShadowNodeInstance",
        "()Lcom/facebook/react/views/text/h;",
        "(Lcom/facebook/react/views/text/o;)Lcom/facebook/react/views/text/h;",
        "Ljava/lang/Class;",
        "getShadowNodeClass",
        "()Ljava/lang/Class;",
        "onAfterUpdateTransaction",
        "",
        "needsCustomLayoutForChildren",
        "()Z",
        "Lcom/facebook/react/uimanager/a0;",
        "stateWrapper",
        "updateState",
        "(Lcom/facebook/react/views/text/m;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;",
        "",
        "getExportedCustomDirectEventTypeConstants",
        "()Ljava/util/Map;",
        "Landroid/text/Spannable;",
        "text",
        "onPostProcessSpannable",
        "(Landroid/text/Spannable;)V",
        "",
        "left",
        "top",
        "right",
        "bottom",
        "setPadding",
        "(Lcom/facebook/react/views/text/m;IIII)V",
        "overflow",
        "setOverflow",
        "(Lcom/facebook/react/views/text/m;Ljava/lang/String;)V",
        "Lcom/facebook/react/views/text/o;",
        "getReactTextViewManagerCallback",
        "()Lcom/facebook/react/views/text/o;",
        "setReactTextViewManagerCallback",
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
.field public static final Companion:Lcom/facebook/react/views/text/ReactTextViewManager$a;

.field public static final REACT_CLASS:Ljava/lang/String; = "RCTText"

.field private static final TX_STATE_KEY_ATTRIBUTED_STRING:S = 0x0s

.field private static final TX_STATE_KEY_PARAGRAPH_ATTRIBUTES:S = 0x1s


# instance fields
.field private reactTextViewManagerCallback:Lcom/facebook/react/views/text/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/text/ReactTextViewManager$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/ReactTextViewManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/text/ReactTextViewManager;->Companion:Lcom/facebook/react/views/text/ReactTextViewManager$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/facebook/react/views/text/ReactTextViewManager;-><init>(Lcom/facebook/react/views/text/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/views/text/o;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/facebook/react/views/text/ReactTextAnchorViewManager;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/facebook/react/views/text/ReactTextViewManager;->reactTextViewManagerCallback:Lcom/facebook/react/views/text/o;

    .line 5
    invoke-static {}, Lh7/b;->x()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/ViewManager;->setupViewRecycling()V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/views/text/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/ReactTextViewManager;-><init>(Lcom/facebook/react/views/text/o;)V

    return-void
.end method

.method private final getReactTextUpdate(Lcom/facebook/react/views/text/m;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/common/mapbuffer/a;)Ljava/lang/Object;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p3, v0}, Lcom/facebook/react/common/mapbuffer/a;->F0(I)Lcom/facebook/react/common/mapbuffer/a;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-interface {p3, v2}, Lcom/facebook/react/common/mapbuffer/a;->F0(I)Lcom/facebook/react/common/mapbuffer/a;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    sget-object v2, Lcom/facebook/react/views/text/s;->a:Lcom/facebook/react/views/text/s;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const-string v4, "getContext(...)"

    .line 18
    .line 19
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v4, p0, Lcom/facebook/react/views/text/ReactTextViewManager;->reactTextViewManagerCallback:Lcom/facebook/react/views/text/o;

    .line 23
    .line 24
    invoke-virtual {v2, v3, v1, v4}, Lcom/facebook/react/views/text/s;->m(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/a;Lcom/facebook/react/views/text/o;)Landroid/text/Spannable;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-virtual {p1, v6}, Lcom/facebook/react/views/text/m;->setSpanned(Landroid/text/Spannable;)V

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x6

    .line 32
    invoke-interface {p3, v2}, Lcom/facebook/react/common/mapbuffer/a;->getDouble(I)D

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    double-to-float v2, v2

    .line 37
    invoke-virtual {p1, v2}, Lcom/facebook/react/views/text/m;->setMinimumFontSize(F)V

    .line 38
    .line 39
    .line 40
    sget-object v2, Lcom/facebook/react/views/text/q;->C:Lcom/facebook/react/views/text/q$a;

    .line 41
    .line 42
    const/4 v3, 0x2

    .line 43
    invoke-interface {p3, v3}, Lcom/facebook/react/common/mapbuffer/a;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    invoke-virtual {v2, p3}, Lcom/facebook/react/views/text/q$a;->g(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 52
    .line 53
    const/16 v3, 0x1a

    .line 54
    .line 55
    if-ge p3, v3, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-static {p1}, Lcom/facebook/react/views/text/l;->a(Lcom/facebook/react/views/text/m;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    :goto_0
    new-instance v5, Lcom/facebook/react/views/text/i;

    .line 63
    .line 64
    invoke-static {v1, v6}, Lcom/facebook/react/views/text/s;->p(Lcom/facebook/react/common/mapbuffer/a;Landroid/text/Spannable;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    invoke-virtual {v2, p2, v0}, Lcom/facebook/react/views/text/q$a;->d(Lcom/facebook/react/uimanager/Q;I)I

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    const/4 v7, -0x1

    .line 73
    const/4 v8, 0x0

    .line 74
    invoke-direct/range {v5 .. v11}, Lcom/facebook/react/views/text/i;-><init>(Landroid/text/Spannable;IZIII)V

    .line 75
    .line 76
    .line 77
    return-object v5
.end method


# virtual methods
.method public bridge synthetic createShadowNodeInstance()Lcom/facebook/react/uimanager/O;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/text/ReactTextViewManager;->createShadowNodeInstance()Lcom/facebook/react/views/text/h;

    move-result-object v0

    return-object v0
.end method

.method public createShadowNodeInstance()Lcom/facebook/react/views/text/h;
    .locals 2

    .line 2
    new-instance v0, Lcom/facebook/react/views/text/h;

    iget-object v1, p0, Lcom/facebook/react/views/text/ReactTextViewManager;->reactTextViewManagerCallback:Lcom/facebook/react/views/text/o;

    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/h;-><init>(Lcom/facebook/react/views/text/o;)V

    return-object v0
.end method

.method public final createShadowNodeInstance(Lcom/facebook/react/views/text/o;)Lcom/facebook/react/views/text/h;
    .locals 1

    .line 3
    new-instance v0, Lcom/facebook/react/views/text/h;

    invoke-direct {v0, p1}, Lcom/facebook/react/views/text/h;-><init>(Lcom/facebook/react/views/text/o;)V

    return-object v0
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/b0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/text/ReactTextViewManager;->createViewInstance(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/text/m;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/text/m;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/facebook/react/views/text/m;

    invoke-direct {v0, p1}, Lcom/facebook/react/views/text/m;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-super {p0}, Lcom/facebook/react/uimanager/BaseViewManager;->getExportedCustomDirectEventTypeConstants()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    :cond_0
    const-string v1, "registrationName"

    .line 13
    .line 14
    const-string v2, "onTextLayout"

    .line 15
    .line 16
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "topTextLayout"

    .line 25
    .line 26
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "RCTText"

    .line 2
    .line 3
    return-object v0
.end method

.method protected final getReactTextViewManagerCallback()Lcom/facebook/react/views/text/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/ReactTextViewManager;->reactTextViewManagerCallback:Lcom/facebook/react/views/text/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public getShadowNodeClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/facebook/react/views/text/h;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lcom/facebook/react/views/text/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public needsCustomLayoutForChildren()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public bridge synthetic onAfterUpdateTransaction(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/text/m;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/text/ReactTextViewManager;->onAfterUpdateTransaction(Lcom/facebook/react/views/text/m;)V

    return-void
.end method

.method protected onAfterUpdateTransaction(Lcom/facebook/react/views/text/m;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManager;->onAfterUpdateTransaction(Landroid/view/View;)V

    .line 3
    invoke-virtual {p1}, Lcom/facebook/react/views/text/m;->w()V

    return-void
.end method

.method public onPostProcessSpannable(Landroid/text/Spannable;)V
    .locals 1

    .line 1
    const-string v0, "text"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/text/ReactTextViewManager;->reactTextViewManagerCallback:Lcom/facebook/react/views/text/o;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lcom/facebook/react/views/text/o;->onPostProcessSpannable(Landroid/text/Spannable;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public bridge synthetic prepareToRecycleView(Lcom/facebook/react/uimanager/b0;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 1
    check-cast p2, Lcom/facebook/react/views/text/m;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/text/ReactTextViewManager;->prepareToRecycleView(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/text/m;)Lcom/facebook/react/views/text/m;

    move-result-object p1

    return-object p1
.end method

.method protected prepareToRecycleView(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/text/m;)Lcom/facebook/react/views/text/m;
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/BaseViewManager;->prepareToRecycleView(Lcom/facebook/react/uimanager/b0;Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/views/text/m;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/facebook/react/views/text/m;->u()V

    const/4 p2, 0x0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/text/ReactTextAnchorViewManager;->setSelectionColor$ReactAndroid_release(Lcom/facebook/react/views/text/m;Ljava/lang/Integer;)V

    :cond_0
    return-object p1
.end method

.method public final setOverflow(Lcom/facebook/react/views/text/m;Ljava/lang/String;)V
    .locals 1
    .annotation runtime LB7/a;
        name = "overflow"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/m;->setOverflow(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public bridge synthetic setPadding(Landroid/view/View;IIII)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/text/m;

    invoke-virtual/range {p0 .. p5}, Lcom/facebook/react/views/text/ReactTextViewManager;->setPadding(Lcom/facebook/react/views/text/m;IIII)V

    return-void
.end method

.method public setPadding(Lcom/facebook/react/views/text/m;IIII)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method protected final setReactTextViewManagerCallback(Lcom/facebook/react/views/text/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/text/ReactTextViewManager;->reactTextViewManagerCallback:Lcom/facebook/react/views/text/o;

    .line 2
    .line 3
    return-void
.end method

.method public bridge synthetic updateExtraData(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/text/m;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/text/ReactTextViewManager;->updateExtraData(Lcom/facebook/react/views/text/m;Ljava/lang/Object;)V

    return-void
.end method

.method public updateExtraData(Lcom/facebook/react/views/text/m;Ljava/lang/Object;)V
    .locals 4

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lg7/c;

    const-string v1, "ReactTextViewManager.updateExtraData"

    invoke-direct {v0, v1}, Lg7/c;-><init>(Ljava/lang/String;)V

    .line 3
    :try_start_0
    check-cast p2, Lcom/facebook/react/views/text/i;

    .line 4
    invoke-virtual {p2}, Lcom/facebook/react/views/text/i;->h()Landroid/text/Spannable;

    move-result-object v1

    .line 5
    invoke-virtual {p2}, Lcom/facebook/react/views/text/i;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 6
    sget-object v2, LP7/r;->a:LP7/r$a;

    invoke-virtual {v2, v1, p1}, LP7/r$a;->a(Landroid/text/Spannable;Landroid/widget/TextView;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 7
    :cond_0
    :goto_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/m;->setText(Lcom/facebook/react/views/text/i;)V

    .line 8
    new-instance p2, Lcom/facebook/react/views/text/n$a;

    invoke-direct {p2, v1}, Lcom/facebook/react/views/text/n$a;-><init>(Landroid/text/Spanned;)V

    .line 9
    sget v1, Lcom/facebook/react/l;->f:I

    .line 10
    invoke-virtual {p2}, Lcom/facebook/react/views/text/n$a;->c()I

    move-result v2

    const/4 v3, 0x0

    if-lez v2, :cond_1

    goto :goto_1

    :cond_1
    move-object p2, v3

    .line 11
    :goto_1
    invoke-virtual {p1, v1, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 12
    sget-object p2, Lcom/facebook/react/views/text/n;->z:Lcom/facebook/react/views/text/n$b;

    .line 13
    invoke-virtual {p1}, Landroid/view/View;->isFocusable()Z

    move-result v1

    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v2

    .line 15
    invoke-virtual {p2, p1, v1, v2}, Lcom/facebook/react/views/text/n$b;->a(Landroid/view/View;ZI)V

    .line 16
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    invoke-static {v0, v3}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :goto_2
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v0, p1}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public bridge synthetic updateState(Landroid/view/View;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/text/m;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/text/ReactTextViewManager;->updateState(Lcom/facebook/react/views/text/m;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public updateState(Lcom/facebook/react/views/text/m;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;
    .locals 2

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "props"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateWrapper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg7/c;

    const-string v1, "ReactTextViewManager.updateState"

    invoke-direct {v0, v1}, Lg7/c;-><init>(Ljava/lang/String;)V

    .line 3
    :try_start_0
    invoke-interface {p3}, Lcom/facebook/react/uimanager/a0;->getStateDataMapBuffer()Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    move-result-object p3

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/views/text/ReactTextViewManager;->getReactTextUpdate(Lcom/facebook/react/views/text/m;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/common/mapbuffer/a;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    move-object p1, v1

    .line 5
    :goto_0
    invoke-static {v0, v1}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-object p1

    :goto_1
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v0, p1}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public bridge synthetic updateViewAccessibility(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/text/m;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/text/ReactTextViewManager;->updateViewAccessibility(Lcom/facebook/react/views/text/m;)V

    return-void
.end method

.method protected updateViewAccessibility(Lcom/facebook/react/views/text/m;)V
    .locals 3

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/facebook/react/views/text/n;->z:Lcom/facebook/react/views/text/n$b;

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->isFocusable()Z

    move-result v1

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v2

    .line 5
    invoke-virtual {v0, p1, v1, v2}, Lcom/facebook/react/views/text/n$b;->b(Landroid/view/View;ZI)V

    return-void
.end method
