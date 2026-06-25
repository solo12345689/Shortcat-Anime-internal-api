.class Lio/sentry/react/s$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/uimanager/events/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/sentry/react/s;->m(Landroidx/fragment/app/K;Landroidx/fragment/app/q;Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Ljava/lang/Runnable;

.field final synthetic d:Lio/sentry/react/s;


# direct methods
.method constructor <init>(Lio/sentry/react/s;Lcom/facebook/react/uimanager/events/EventDispatcher;Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/react/s$a;->d:Lio/sentry/react/s;

    .line 2
    .line 3
    iput-object p2, p0, Lio/sentry/react/s$a;->a:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 4
    .line 5
    iput-object p3, p0, Lio/sentry/react/s$a;->b:Landroid/view/View;

    .line 6
    .line 7
    iput-object p4, p0, Lio/sentry/react/s$a;->c:Ljava/lang/Runnable;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public onEventDispatch(Lcom/facebook/react/uimanager/events/d;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "Ta.f"

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lio/sentry/react/s$a;->a:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 18
    .line 19
    invoke-interface {p1, p0}, Lcom/facebook/react/uimanager/events/EventDispatcher;->b(Lcom/facebook/react/uimanager/events/i;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lio/sentry/react/s$a;->b:Landroid/view/View;

    .line 23
    .line 24
    iget-object v0, p0, Lio/sentry/react/s$a;->c:Ljava/lang/Runnable;

    .line 25
    .line 26
    iget-object v1, p0, Lio/sentry/react/s$a;->d:Lio/sentry/react/s;

    .line 27
    .line 28
    invoke-static {v1}, Lio/sentry/react/s;->o(Lio/sentry/react/s;)Lio/sentry/android/core/g0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {p1, v0, v1}, Lio/sentry/android/core/internal/util/t;->e(Landroid/view/View;Ljava/lang/Runnable;Lio/sentry/android/core/g0;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method
