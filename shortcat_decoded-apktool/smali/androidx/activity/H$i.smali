.class final Landroidx/activity/H$i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/activity/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "i"
.end annotation


# instance fields
.field private final a:Landroidx/activity/G;

.field final synthetic b:Landroidx/activity/H;


# direct methods
.method public constructor <init>(Landroidx/activity/H;Landroidx/activity/G;)V
    .locals 1

    .line 1
    const-string v0, "onBackPressedCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/activity/H$i;->b:Landroidx/activity/H;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Landroidx/activity/H$i;->a:Landroidx/activity/G;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/activity/H$i;->b:Landroidx/activity/H;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/activity/H;->b(Landroidx/activity/H;)LUd/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/activity/H$i;->a:Landroidx/activity/G;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, LUd/m;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Landroidx/activity/H$i;->b:Landroidx/activity/H;

    .line 13
    .line 14
    invoke-static {v0}, Landroidx/activity/H;->a(Landroidx/activity/H;)Landroidx/activity/G;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Landroidx/activity/H$i;->a:Landroidx/activity/G;

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/activity/H$i;->a:Landroidx/activity/G;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/activity/G;->c()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Landroidx/activity/H$i;->b:Landroidx/activity/H;

    .line 33
    .line 34
    invoke-static {v0, v1}, Landroidx/activity/H;->f(Landroidx/activity/H;Landroidx/activity/G;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Landroidx/activity/H$i;->a:Landroidx/activity/G;

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Landroidx/activity/G;->i(Landroidx/activity/c;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Landroidx/activity/H$i;->a:Landroidx/activity/G;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroidx/activity/G;->b()Lie/a;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object v0, p0, Landroidx/activity/H$i;->a:Landroidx/activity/G;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroidx/activity/G;->k(Lie/a;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method
