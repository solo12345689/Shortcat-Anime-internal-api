.class Landroidx/fragment/app/K$g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/lifecycle/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/K;->z1(Ljava/lang/String;Landroidx/lifecycle/r;Landroidx/fragment/app/P;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Landroidx/fragment/app/P;

.field final synthetic c:Landroidx/lifecycle/k;

.field final synthetic d:Landroidx/fragment/app/K;


# direct methods
.method constructor <init>(Landroidx/fragment/app/K;Ljava/lang/String;Landroidx/fragment/app/P;Landroidx/lifecycle/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/K$g;->d:Landroidx/fragment/app/K;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/fragment/app/K$g;->a:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/fragment/app/K$g;->b:Landroidx/fragment/app/P;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/fragment/app/K$g;->c:Landroidx/lifecycle/k;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public g(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 2

    .line 1
    sget-object p1, Landroidx/lifecycle/k$a;->ON_START:Landroidx/lifecycle/k$a;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/fragment/app/K$g;->d:Landroidx/fragment/app/K;

    .line 6
    .line 7
    invoke-static {p1}, Landroidx/fragment/app/K;->h(Landroidx/fragment/app/K;)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p0, Landroidx/fragment/app/K$g;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Landroid/os/Bundle;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/fragment/app/K$g;->b:Landroidx/fragment/app/P;

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/fragment/app/K$g;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-interface {v0, v1, p1}, Landroidx/fragment/app/P;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Landroidx/fragment/app/K$g;->d:Landroidx/fragment/app/K;

    .line 29
    .line 30
    iget-object v0, p0, Landroidx/fragment/app/K$g;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroidx/fragment/app/K;->y(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    sget-object p1, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    .line 36
    .line 37
    if-ne p2, p1, :cond_1

    .line 38
    .line 39
    iget-object p1, p0, Landroidx/fragment/app/K$g;->c:Landroidx/lifecycle/k;

    .line 40
    .line 41
    invoke-virtual {p1, p0}, Landroidx/lifecycle/k;->removeObserver(Landroidx/lifecycle/q;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Landroidx/fragment/app/K$g;->d:Landroidx/fragment/app/K;

    .line 45
    .line 46
    invoke-static {p1}, Landroidx/fragment/app/K;->i(Landroidx/fragment/app/K;)Ljava/util/Map;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object p2, p0, Landroidx/fragment/app/K$g;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void
.end method
