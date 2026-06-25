.class public final Lcom/facebook/react/views/modal/d$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/modal/d;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lie/a;

.field final synthetic b:Lcom/facebook/react/views/modal/d;


# direct methods
.method constructor <init>(Lie/a;Lcom/facebook/react/views/modal/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/modal/d$d;->a:Lie/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/views/modal/d$d;->b:Lcom/facebook/react/views/modal/d;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    const-string v0, "dialog"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "event"

    .line 7
    .line 8
    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, 0x1

    .line 16
    if-ne p1, v0, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x4

    .line 19
    if-eq p2, p1, :cond_0

    .line 20
    .line 21
    const/16 p1, 0x6f

    .line 22
    .line 23
    if-eq p2, p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lcom/facebook/react/views/modal/d$d;->b:Lcom/facebook/react/views/modal/d;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 32
    .line 33
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    check-cast p1, Lcom/facebook/react/bridge/ReactContext;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1, p2, p3}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1

    .line 49
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/views/modal/d$d;->a:Lie/a;

    .line 50
    .line 51
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    return v0

    .line 55
    :cond_1
    const/4 p1, 0x0

    .line 56
    return p1
.end method
