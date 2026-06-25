.class public final Lcom/facebook/react/modules/statusbar/StatusBarModule$c;
.super Lcom/facebook/react/bridge/GuardedRunnable;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/statusbar/StatusBarModule;->setTranslucent(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Z


# direct methods
.method constructor <init>(Landroid/app/Activity;ZLcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/statusbar/StatusBarModule$c;->a:Landroid/app/Activity;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/facebook/react/modules/statusbar/StatusBarModule$c;->b:Z

    .line 4
    .line 5
    invoke-static {p3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p3}, Lcom/facebook/react/bridge/GuardedRunnable;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public runGuarded()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/statusbar/StatusBarModule$c;->a:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-boolean v1, p0, Lcom/facebook/react/modules/statusbar/StatusBarModule$c;->b:Z

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/facebook/react/views/view/WindowUtilKt;->setStatusBarTranslucency(Landroid/view/Window;Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
