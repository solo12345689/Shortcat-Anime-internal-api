.class public final Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;
.super Lcom/facebook/react/uimanager/BaseViewManager;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/uimanager/m;
.implements Lcom/facebook/react/views/text/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/text/PreparedLayoutTextViewManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/BaseViewManager<",
        "Lcom/facebook/react/views/text/PreparedLayoutTextView;",
        "Lcom/facebook/react/uimanager/r;",
        ">;",
        "Lcom/facebook/react/uimanager/m;",
        "Lcom/facebook/react/views/text/o;"
    }
.end annotation

.annotation runtime Lk7/a;
    name = "RCTText"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 Y2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u00020\u0005:\u0001ZB\u0015\u0008\u0017\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\u000c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ)\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00170!H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J!\u0010%\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0008\u0010$\u001a\u0004\u0018\u00010\u000eH\u0007\u00a2\u0006\u0004\u0008%\u0010&J\u001f\u0010)\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\'H\u0007\u00a2\u0006\u0004\u0008)\u0010*J\u001f\u0010,\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\'H\u0007\u00a2\u0006\u0004\u0008,\u0010*J!\u0010/\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0008\u0010.\u001a\u0004\u0018\u00010-H\u0007\u00a2\u0006\u0004\u0008/\u00100J\'\u00104\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u00101\u001a\u00020-2\u0006\u00103\u001a\u000202H\u0007\u00a2\u0006\u0004\u00084\u00105J!\u00107\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0008\u00106\u001a\u0004\u0018\u00010\u000eH\u0007\u00a2\u0006\u0004\u00087\u0010&J\'\u00109\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u00101\u001a\u00020-2\u0006\u00108\u001a\u000202H\u0007\u00a2\u0006\u0004\u00089\u00105J)\u0010:\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u00101\u001a\u00020-2\u0008\u0010.\u001a\u0004\u0018\u00010-H\u0007\u00a2\u0006\u0004\u0008:\u0010;J\u001f\u0010=\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\'H\u0007\u00a2\u0006\u0004\u0008=\u0010*J7\u0010B\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010>\u001a\u00020-2\u0006\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020-2\u0006\u0010A\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008B\u0010CJ\u0017\u0010E\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030DH\u0016\u00a2\u0006\u0004\u0008E\u0010FJ\'\u0010J\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\u00022\u0006\u0010I\u001a\u00020H2\u0006\u00101\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008J\u0010KJ!\u0010L\u001a\u0004\u0018\u00010H2\u0006\u0010G\u001a\u00020\u00022\u0006\u00101\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008L\u0010MJ\u001f\u0010N\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\u00022\u0006\u00101\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008N\u0010OJ\u0017\u0010P\u001a\u00020-2\u0006\u0010G\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008P\u0010QJ\u000f\u0010R\u001a\u00020\'H\u0016\u00a2\u0006\u0004\u0008R\u0010SJ\u0017\u0010V\u001a\u00020\u00112\u0006\u0010U\u001a\u00020TH\u0016\u00a2\u0006\u0004\u0008V\u0010WR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010X\u00a8\u0006["
    }
    d2 = {
        "Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;",
        "Lcom/facebook/react/uimanager/BaseViewManager;",
        "Lcom/facebook/react/views/text/PreparedLayoutTextView;",
        "Lcom/facebook/react/uimanager/r;",
        "Lcom/facebook/react/uimanager/m;",
        "Lcom/facebook/react/views/text/o;",
        "reactTextViewManagerCallback",
        "<init>",
        "(Lcom/facebook/react/views/text/o;)V",
        "Lcom/facebook/react/uimanager/b0;",
        "reactContext",
        "view",
        "prepareToRecycleView",
        "(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/text/PreparedLayoutTextView;)Lcom/facebook/react/views/text/PreparedLayoutTextView;",
        "",
        "getName",
        "()Ljava/lang/String;",
        "LTd/L;",
        "updateViewAccessibility",
        "(Lcom/facebook/react/views/text/PreparedLayoutTextView;)V",
        "context",
        "createViewInstance",
        "(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/text/PreparedLayoutTextView;",
        "",
        "extraData",
        "updateExtraData",
        "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/Object;)V",
        "Lcom/facebook/react/uimanager/Q;",
        "props",
        "Lcom/facebook/react/uimanager/a0;",
        "stateWrapper",
        "updateState",
        "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;",
        "",
        "getExportedCustomDirectEventTypeConstants",
        "()Ljava/util/Map;",
        "overflow",
        "setOverflow",
        "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/String;)V",
        "",
        "accessible",
        "setAccessible",
        "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Z)V",
        "isSelectable",
        "setSelectable",
        "",
        "color",
        "setSelectionColor",
        "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/Integer;)V",
        "index",
        "",
        "borderRadius",
        "setBorderRadius",
        "(Lcom/facebook/react/views/text/PreparedLayoutTextView;IF)V",
        "borderStyle",
        "setBorderStyle",
        "width",
        "setBorderWidth",
        "setBorderColor",
        "(Lcom/facebook/react/views/text/PreparedLayoutTextView;ILjava/lang/Integer;)V",
        "disabled",
        "setDisabled",
        "left",
        "top",
        "right",
        "bottom",
        "setPadding",
        "(Lcom/facebook/react/views/text/PreparedLayoutTextView;IIII)V",
        "Ljava/lang/Class;",
        "getShadowNodeClass",
        "()Ljava/lang/Class;",
        "parent",
        "Landroid/view/View;",
        "child",
        "addView",
        "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Landroid/view/View;I)V",
        "getChildAt",
        "(Lcom/facebook/react/views/text/PreparedLayoutTextView;I)Landroid/view/View;",
        "removeViewAt",
        "(Lcom/facebook/react/views/text/PreparedLayoutTextView;I)V",
        "getChildCount",
        "(Lcom/facebook/react/views/text/PreparedLayoutTextView;)I",
        "needsCustomLayoutForChildren",
        "()Z",
        "Landroid/text/Spannable;",
        "text",
        "onPostProcessSpannable",
        "(Landroid/text/Spannable;)V",
        "Lcom/facebook/react/views/text/o;",
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
.field public static final Companion:Lcom/facebook/react/views/text/PreparedLayoutTextViewManager$a;

.field public static final REACT_CLASS:Ljava/lang/String; = "RCTText"


# instance fields
.field private final reactTextViewManagerCallback:Lcom/facebook/react/views/text/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;->Companion:Lcom/facebook/react/views/text/PreparedLayoutTextViewManager$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;-><init>(Lcom/facebook/react/views/text/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/views/text/o;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/facebook/react/uimanager/BaseViewManager;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;->reactTextViewManagerCallback:Lcom/facebook/react/views/text/o;

    .line 5
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/ViewManager;->setupViewRecycling()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/views/text/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;-><init>(Lcom/facebook/react/views/text/o;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic addView(Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;->addView(Lcom/facebook/react/views/text/PreparedLayoutTextView;Landroid/view/View;I)V

    return-void
.end method

.method public addView(Lcom/facebook/react/views/text/PreparedLayoutTextView;Landroid/view/View;I)V
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "child"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/b0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;->createViewInstance(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/text/PreparedLayoutTextView;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/text/PreparedLayoutTextView;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    invoke-direct {v0, p1}, Lcom/facebook/react/views/text/PreparedLayoutTextView;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public bridge synthetic getChildAt(Landroid/view/View;I)Landroid/view/View;
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;->getChildAt(Lcom/facebook/react/views/text/PreparedLayoutTextView;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getChildAt(Lcom/facebook/react/views/text/PreparedLayoutTextView;I)Landroid/view/View;
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getChildCount(Landroid/view/View;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;->getChildCount(Lcom/facebook/react/views/text/PreparedLayoutTextView;)I

    move-result p1

    return p1
.end method

.method public getChildCount(Lcom/facebook/react/views/text/PreparedLayoutTextView;)I
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    return p1
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
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
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

.method public getShadowNodeClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/facebook/react/uimanager/r;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lcom/facebook/react/uimanager/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public needsCustomLayoutForChildren()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
    iget-object v0, p0, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;->reactTextViewManagerCallback:Lcom/facebook/react/views/text/o;

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
    check-cast p2, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;->prepareToRecycleView(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/text/PreparedLayoutTextView;)Lcom/facebook/react/views/text/PreparedLayoutTextView;

    move-result-object p1

    return-object p1
.end method

.method protected prepareToRecycleView(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/text/PreparedLayoutTextView;)Lcom/facebook/react/views/text/PreparedLayoutTextView;
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/BaseViewManager;->prepareToRecycleView(Lcom/facebook/react/uimanager/b0;Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->e()V

    :cond_0
    return-object p1
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

.method public bridge synthetic removeViewAt(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;->removeViewAt(Lcom/facebook/react/views/text/PreparedLayoutTextView;I)V

    return-void
.end method

.method public removeViewAt(Lcom/facebook/react/views/text/PreparedLayoutTextView;I)V
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    return-void
.end method

.method public final setAccessible(Lcom/facebook/react/views/text/PreparedLayoutTextView;Z)V
    .locals 1
    .annotation runtime LB7/a;
        name = "accessible"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setBorderColor(Lcom/facebook/react/views/text/PreparedLayoutTextView;ILjava/lang/Integer;)V
    .locals 1
    .annotation runtime LB7/b;
        customType = "Color"
        names = {
            "borderColor",
            "borderLeftColor",
            "borderRightColor",
            "borderTopColor",
            "borderBottomColor",
            "borderStartColor",
            "borderEndColor",
            "borderBlockColor",
            "borderBlockEndColor",
            "borderBlockStartColor"
        }
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LH7/t;->values()[LH7/t;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    aget-object p2, v0, p2

    .line 11
    .line 12
    invoke-static {p1, p2, p3}, Lcom/facebook/react/uimanager/a;->r(Landroid/view/View;LH7/t;Ljava/lang/Integer;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setBorderRadius(Lcom/facebook/react/views/text/PreparedLayoutTextView;IF)V
    .locals 2
    .annotation runtime LB7/b;
        defaultFloat = NaNf
        names = {
            "borderRadius",
            "borderTopLeftRadius",
            "borderTopRightRadius",
            "borderBottomRightRadius",
            "borderBottomLeftRadius"
        }
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 p3, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Lcom/facebook/react/uimanager/t;

    .line 15
    .line 16
    sget-object v1, Lcom/facebook/react/uimanager/u;->a:Lcom/facebook/react/uimanager/u;

    .line 17
    .line 18
    invoke-direct {v0, p3, v1}, Lcom/facebook/react/uimanager/t;-><init>(FLcom/facebook/react/uimanager/u;)V

    .line 19
    .line 20
    .line 21
    move-object p3, v0

    .line 22
    :goto_0
    invoke-static {}, LH7/i;->values()[LH7/i;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    aget-object p2, v0, p2

    .line 27
    .line 28
    invoke-static {p1, p2, p3}, Lcom/facebook/react/uimanager/a;->s(Landroid/view/View;LH7/i;Lcom/facebook/react/uimanager/t;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final setBorderStyle(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/String;)V
    .locals 1
    .annotation runtime LB7/a;
        name = "borderStyle"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, LH7/k;->a:LH7/k$a;

    .line 11
    .line 12
    invoke-virtual {v0, p2}, LH7/k$a;->a(Ljava/lang/String;)LH7/k;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    :goto_0
    invoke-static {p1, p2}, Lcom/facebook/react/uimanager/a;->t(Landroid/view/View;LH7/k;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setBorderWidth(Lcom/facebook/react/views/text/PreparedLayoutTextView;IF)V
    .locals 1
    .annotation runtime LB7/b;
        defaultFloat = NaNf
        names = {
            "borderWidth",
            "borderLeftWidth",
            "borderRightWidth",
            "borderTopWidth",
            "borderBottomWidth",
            "borderStartWidth",
            "borderEndWidth"
        }
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LH7/t;->values()[LH7/t;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    aget-object p2, v0, p2

    .line 11
    .line 12
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-static {p1, p2, p3}, Lcom/facebook/react/uimanager/a;->u(Landroid/view/View;LH7/t;Ljava/lang/Float;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setDisabled(Lcom/facebook/react/views/text/PreparedLayoutTextView;Z)V
    .locals 1
    .annotation runtime LB7/a;
        defaultBoolean = false
        name = "disabled"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    xor-int/lit8 p2, p2, 0x1

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setOverflow(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/String;)V
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
    if-eqz p2, :cond_0

    .line 7
    .line 8
    sget-object v0, LH7/v;->a:LH7/v$a;

    .line 9
    .line 10
    invoke-virtual {v0, p2}, LH7/v$a;->a(Ljava/lang/String;)LH7/v;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    :cond_0
    sget-object p2, LH7/v;->c:LH7/v;

    .line 17
    .line 18
    :cond_1
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->setOverflow(LH7/v;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public bridge synthetic setPadding(Landroid/view/View;IIII)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    invoke-virtual/range {p0 .. p5}, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;->setPadding(Lcom/facebook/react/views/text/PreparedLayoutTextView;IIII)V

    return-void
.end method

.method public setPadding(Lcom/facebook/react/views/text/PreparedLayoutTextView;IIII)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public final setSelectable(Lcom/facebook/react/views/text/PreparedLayoutTextView;Z)V
    .locals 0
    .annotation runtime LB7/a;
        defaultBoolean = false
        name = "selectable"
    .end annotation

    .line 1
    const-string p2, "view"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setSelectionColor(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime LB7/a;
        customType = "Color"
        name = "selectionColor"
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    const-string v0, "getContext(...)"

    .line 13
    .line 14
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p2}, Lcom/facebook/react/views/text/a;->c(Landroid/content/Context;)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->setSelectionColor(Ljava/lang/Integer;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->setSelectionColor(Ljava/lang/Integer;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public bridge synthetic updateExtraData(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;->updateExtraData(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/Object;)V

    return-void
.end method

.method public updateExtraData(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/Object;)V
    .locals 4

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lg7/c;

    const-string v1, "PreparedLayoutTextViewManager.updateExtraData"

    invoke-direct {v0, v1}, Lg7/c;-><init>(Ljava/lang/String;)V

    .line 3
    :try_start_0
    check-cast p2, Lcom/facebook/react/views/text/PreparedLayout;

    .line 4
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/PreparedLayoutTextView;->setPreparedLayout(Lcom/facebook/react/views/text/PreparedLayout;)V

    .line 5
    invoke-virtual {p2}, Lcom/facebook/react/views/text/PreparedLayout;->a()Landroid/text/Layout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    instance-of v1, v1, Landroid/text/Spanned;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {p2}, Lcom/facebook/react/views/text/PreparedLayout;->a()Landroid/text/Layout;

    move-result-object p2

    invoke-virtual {p2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    const-string v1, "null cannot be cast to non-null type android.text.Spanned"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/text/Spanned;

    .line 7
    new-instance v1, Lcom/facebook/react/views/text/n$a;

    invoke-direct {v1, p2}, Lcom/facebook/react/views/text/n$a;-><init>(Landroid/text/Spanned;)V

    .line 8
    sget p2, Lcom/facebook/react/l;->f:I

    .line 9
    invoke-virtual {v1}, Lcom/facebook/react/views/text/n$a;->c()I

    move-result v3

    if-lez v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v2

    .line 10
    :goto_0
    invoke-virtual {p1, p2, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 11
    sget-object p2, Lcom/facebook/react/views/text/n;->z:Lcom/facebook/react/views/text/n$b;

    .line 12
    invoke-virtual {p1}, Landroid/view/View;->isFocusable()Z

    move-result v1

    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v3

    .line 14
    invoke-virtual {p2, p1, v1, v3}, Lcom/facebook/react/views/text/n$b;->a(Landroid/view/View;ZI)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 15
    :cond_1
    :goto_1
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    invoke-static {v0, v2}, Lge/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

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
    check-cast p1, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;->updateState(Lcom/facebook/react/views/text/PreparedLayoutTextView;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public updateState(Lcom/facebook/react/views/text/PreparedLayoutTextView;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "props"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "stateWrapper"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of p1, p3, Lcom/facebook/react/uimanager/V;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    check-cast p3, Lcom/facebook/react/uimanager/V;

    goto :goto_0

    :cond_0
    move-object p3, p2

    :goto_0
    if-eqz p3, :cond_1

    invoke-interface {p3}, Lcom/facebook/react/uimanager/V;->getStateDataReference()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    return-object p2
.end method

.method public bridge synthetic updateViewAccessibility(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/text/PreparedLayoutTextView;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;->updateViewAccessibility(Lcom/facebook/react/views/text/PreparedLayoutTextView;)V

    return-void
.end method

.method protected updateViewAccessibility(Lcom/facebook/react/views/text/PreparedLayoutTextView;)V
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
