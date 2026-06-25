.class final Landroidx/activity/H$h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/lifecycle/o;
.implements Landroidx/activity/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "h"
.end annotation


# instance fields
.field private final a:Landroidx/lifecycle/k;

.field private final b:Landroidx/activity/G;

.field private c:Landroidx/activity/c;

.field final synthetic d:Landroidx/activity/H;


# direct methods
.method public constructor <init>(Landroidx/activity/H;Landroidx/lifecycle/k;Landroidx/activity/G;)V
    .locals 1

    .line 1
    const-string v0, "lifecycle"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onBackPressedCallback"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/activity/H$h;->d:Landroidx/activity/H;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Landroidx/activity/H$h;->a:Landroidx/lifecycle/k;

    .line 17
    .line 18
    iput-object p3, p0, Landroidx/activity/H$h;->b:Landroidx/activity/G;

    .line 19
    .line 20
    invoke-virtual {p2, p0}, Landroidx/lifecycle/k;->addObserver(Landroidx/lifecycle/q;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/H$h;->a:Landroidx/lifecycle/k;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/lifecycle/k;->removeObserver(Landroidx/lifecycle/q;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/H$h;->b:Landroidx/activity/G;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroidx/activity/G;->i(Landroidx/activity/c;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/activity/H$h;->c:Landroidx/activity/c;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Landroidx/activity/c;->cancel()V

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Landroidx/activity/H$h;->c:Landroidx/activity/c;

    .line 20
    .line 21
    return-void
.end method

.method public g(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "event"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Landroidx/lifecycle/k$a;->ON_START:Landroidx/lifecycle/k$a;

    .line 12
    .line 13
    if-ne p2, p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Landroidx/activity/H$h;->d:Landroidx/activity/H;

    .line 16
    .line 17
    iget-object p2, p0, Landroidx/activity/H$h;->b:Landroidx/activity/G;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroidx/activity/H;->j(Landroidx/activity/G;)Landroidx/activity/c;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Landroidx/activity/H$h;->c:Landroidx/activity/c;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    sget-object p1, Landroidx/lifecycle/k$a;->ON_STOP:Landroidx/lifecycle/k$a;

    .line 27
    .line 28
    if-ne p2, p1, :cond_1

    .line 29
    .line 30
    iget-object p1, p0, Landroidx/activity/H$h;->c:Landroidx/activity/c;

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    invoke-interface {p1}, Landroidx/activity/c;->cancel()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    sget-object p1, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    .line 39
    .line 40
    if-ne p2, p1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/activity/H$h;->cancel()V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-void
.end method
