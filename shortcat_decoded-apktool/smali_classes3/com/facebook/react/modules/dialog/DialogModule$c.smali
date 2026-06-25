.class final Lcom/facebook/react/modules/dialog/DialogModule$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/dialog/DialogModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final a:Landroidx/fragment/app/K;

.field private b:Lcom/facebook/react/modules/dialog/a;

.field final synthetic c:Lcom/facebook/react/modules/dialog/DialogModule;


# direct methods
.method public constructor <init>(Lcom/facebook/react/modules/dialog/DialogModule;Landroidx/fragment/app/K;)V
    .locals 1

    .line 1
    const-string v0, "fragmentManager"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/facebook/react/modules/dialog/DialogModule$c;->c:Lcom/facebook/react/modules/dialog/DialogModule;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lcom/facebook/react/modules/dialog/DialogModule$c;->a:Landroidx/fragment/app/K;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/dialog/DialogModule$c;->c:Lcom/facebook/react/modules/dialog/DialogModule;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/modules/dialog/DialogModule;->access$isInForeground$p(Lcom/facebook/react/modules/dialog/DialogModule;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/dialog/DialogModule$c;->a:Landroidx/fragment/app/K;

    .line 11
    .line 12
    const-string v1, "com.facebook.catalyst.react.dialog.DialogModule"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/fragment/app/K;->q0(Ljava/lang/String;)Landroidx/fragment/app/q;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/facebook/react/modules/dialog/a;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/fragment/app/q;->isResumed()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x1

    .line 27
    if-ne v1, v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/fragment/app/o;->z()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final b(Landroid/os/Bundle;Lcom/facebook/react/bridge/Callback;)V
    .locals 2

    .line 1
    const-string v0, "arguments"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/facebook/react/modules/dialog/DialogModule$c;->a()V

    .line 10
    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    new-instance v0, Lcom/facebook/react/modules/dialog/DialogModule$a;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/facebook/react/modules/dialog/DialogModule$c;->c:Lcom/facebook/react/modules/dialog/DialogModule;

    .line 17
    .line 18
    invoke-direct {v0, v1, p2}, Lcom/facebook/react/modules/dialog/DialogModule$a;-><init>(Lcom/facebook/react/modules/dialog/DialogModule;Lcom/facebook/react/bridge/Callback;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    new-instance p2, Lcom/facebook/react/modules/dialog/a;

    .line 24
    .line 25
    invoke-direct {p2, v0, p1}, Lcom/facebook/react/modules/dialog/a;-><init>(Lcom/facebook/react/modules/dialog/DialogModule$a;Landroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/facebook/react/modules/dialog/DialogModule$c;->c:Lcom/facebook/react/modules/dialog/DialogModule;

    .line 29
    .line 30
    invoke-static {v0}, Lcom/facebook/react/modules/dialog/DialogModule;->access$isInForeground$p(Lcom/facebook/react/modules/dialog/DialogModule;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Lcom/facebook/react/modules/dialog/DialogModule$c;->a:Landroidx/fragment/app/K;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/fragment/app/K;->X0()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    const-string v0, "cancelable"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-virtual {p2, p1}, Landroidx/fragment/app/o;->J(Z)V

    .line 57
    .line 58
    .line 59
    :cond_1
    iget-object p1, p0, Lcom/facebook/react/modules/dialog/DialogModule$c;->a:Landroidx/fragment/app/K;

    .line 60
    .line 61
    const-string v0, "com.facebook.catalyst.react.dialog.DialogModule"

    .line 62
    .line 63
    invoke-virtual {p2, p1, v0}, Landroidx/fragment/app/o;->M(Landroidx/fragment/app/K;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    iput-object p2, p0, Lcom/facebook/react/modules/dialog/DialogModule$c;->b:Lcom/facebook/react/modules/dialog/a;

    .line 68
    .line 69
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/modules/dialog/DialogModule$c;->c:Lcom/facebook/react/modules/dialog/DialogModule;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/facebook/react/modules/dialog/DialogModule;->access$isInForeground$p(Lcom/facebook/react/modules/dialog/DialogModule;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-string v1, "showPendingAlert() called in background"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/facebook/react/bridge/SoftAssertions;->assertCondition(ZLjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/facebook/react/modules/dialog/DialogModule$c;->b:Lcom/facebook/react/modules/dialog/a;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/modules/dialog/DialogModule$c;->a()V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/facebook/react/modules/dialog/DialogModule$c;->a:Landroidx/fragment/app/K;

    .line 24
    .line 25
    const-string v2, "com.facebook.catalyst.react.dialog.DialogModule"

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/o;->M(Landroidx/fragment/app/K;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lcom/facebook/react/modules/dialog/DialogModule$c;->b:Lcom/facebook/react/modules/dialog/a;

    .line 32
    .line 33
    return-void
.end method
