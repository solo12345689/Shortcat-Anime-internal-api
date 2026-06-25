.class public Lcom/reactnativegooglesignin/RNGoogleSigninButtonViewManager;
.super Lcom/facebook/react/uimanager/SimpleViewManager;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK7/y;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/SimpleViewManager<",
        "LO8/l;",
        ">;",
        "LK7/y;"
    }
.end annotation


# static fields
.field public static final MODULE_NAME:Ljava/lang/String; = "RNGoogleSigninButton"

.field private static final mOnClickListener:Landroid/view/View$OnClickListener;


# instance fields
.field private final mDelegate:Lcom/facebook/react/uimanager/q0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/uimanager/q0;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/reactnativegooglesignin/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/reactnativegooglesignin/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/reactnativegooglesignin/RNGoogleSigninButtonViewManager;->mOnClickListener:Landroid/view/View$OnClickListener;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/SimpleViewManager;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/reactnativegooglesignin/d;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/reactnativegooglesignin/d;-><init>(Lcom/reactnativegooglesignin/RNGoogleSigninButtonViewManager;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninButtonViewManager;->mDelegate:Lcom/facebook/react/uimanager/q0;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {v0, p0}, Lcom/facebook/react/uimanager/f0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Lcom/reactnativegooglesignin/n;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/facebook/react/uimanager/f0;->e(Landroid/content/Context;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-direct {v2, v0, p0}, Lcom/reactnativegooglesignin/n;-><init>(II)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method protected addEventEmitters(Lcom/facebook/react/uimanager/b0;LO8/l;)V
    .locals 0

    .line 2
    sget-object p1, Lcom/reactnativegooglesignin/RNGoogleSigninButtonViewManager;->mOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p2, p1}, LO8/l;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected bridge synthetic addEventEmitters(Lcom/facebook/react/uimanager/b0;Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p2, LO8/l;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativegooglesignin/RNGoogleSigninButtonViewManager;->addEventEmitters(Lcom/facebook/react/uimanager/b0;LO8/l;)V

    return-void
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/b0;)LO8/l;
    .locals 1

    .line 2
    new-instance v0, LO8/l;

    invoke-direct {v0, p1}, LO8/l;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method protected bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/b0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/reactnativegooglesignin/RNGoogleSigninButtonViewManager;->createViewInstance(Lcom/facebook/react/uimanager/b0;)LO8/l;

    move-result-object p1

    return-object p1
.end method

.method protected getDelegate()Lcom/facebook/react/uimanager/q0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/q0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/RNGoogleSigninButtonViewManager;->mDelegate:Lcom/facebook/react/uimanager/q0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getExportedCustomBubblingEventTypeConstants()Ljava/util/Map;
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
    invoke-super {p0}, Lcom/facebook/react/uimanager/BaseViewManager;->getExportedCustomBubblingEventTypeConstants()Ljava/util/Map;

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
    const-string v1, "bubbled"

    .line 13
    .line 14
    const-string v2, "onPress"

    .line 15
    .line 16
    invoke-static {v1, v2}, LU6/c;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "phasedRegistrationNames"

    .line 21
    .line 22
    invoke-static {v2, v1}, LU6/c;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "topPress"

    .line 27
    .line 28
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "RNGoogleSigninButton"

    .line 2
    .line 3
    return-object v0
.end method

.method public setColor(LO8/l;Ljava/lang/String;)V
    .locals 1
    .annotation runtime LB7/a;
        name = "color"
    .end annotation

    if-nez p2, :cond_0

    const/4 p2, 0x2

    .line 2
    invoke-virtual {p1, p2}, LO8/l;->setColorScheme(I)V

    return-void

    .line 3
    :cond_0
    const-string v0, "dark"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    .line 4
    invoke-virtual {p1, p2}, LO8/l;->setColorScheme(I)V

    return-void
.end method

.method public bridge synthetic setColor(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "color"
    .end annotation

    .line 1
    check-cast p1, LO8/l;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativegooglesignin/RNGoogleSigninButtonViewManager;->setColor(LO8/l;Ljava/lang/String;)V

    return-void
.end method

.method public setDisabled(LO8/l;Z)V
    .locals 0
    .annotation runtime LB7/a;
        name = "disabled"
    .end annotation

    xor-int/lit8 p2, p2, 0x1

    .line 2
    invoke-virtual {p1, p2}, LO8/l;->setEnabled(Z)V

    return-void
.end method

.method public bridge synthetic setDisabled(Landroid/view/View;Z)V
    .locals 0
    .annotation runtime LB7/a;
        name = "disabled"
    .end annotation

    .line 1
    check-cast p1, LO8/l;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativegooglesignin/RNGoogleSigninButtonViewManager;->setDisabled(LO8/l;Z)V

    return-void
.end method

.method public setSize(LO8/l;I)V
    .locals 0
    .annotation runtime LB7/a;
        name = "size"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, LO8/l;->setSize(I)V

    return-void
.end method

.method public bridge synthetic setSize(Landroid/view/View;I)V
    .locals 0
    .annotation runtime LB7/a;
        name = "size"
    .end annotation

    .line 1
    check-cast p1, LO8/l;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativegooglesignin/RNGoogleSigninButtonViewManager;->setSize(LO8/l;I)V

    return-void
.end method
