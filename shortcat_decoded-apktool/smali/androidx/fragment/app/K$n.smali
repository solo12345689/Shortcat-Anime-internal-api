.class Landroidx/fragment/app/K$n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/fragment/app/P;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "n"
.end annotation


# instance fields
.field private final a:Landroidx/lifecycle/k;

.field private final b:Landroidx/fragment/app/P;

.field private final c:Landroidx/lifecycle/o;


# direct methods
.method constructor <init>(Landroidx/lifecycle/k;Landroidx/fragment/app/P;Landroidx/lifecycle/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/K$n;->a:Landroidx/lifecycle/k;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/fragment/app/K$n;->b:Landroidx/fragment/app/P;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/fragment/app/K$n;->c:Landroidx/lifecycle/o;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/K$n;->b:Landroidx/fragment/app/P;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroidx/fragment/app/P;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Landroidx/lifecycle/k$b;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/K$n;->a:Landroidx/lifecycle/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/k;->getCurrentState()Landroidx/lifecycle/k$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Landroidx/lifecycle/k$b;->b(Landroidx/lifecycle/k$b;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/K$n;->a:Landroidx/lifecycle/k;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/K$n;->c:Landroidx/lifecycle/o;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->removeObserver(Landroidx/lifecycle/q;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
