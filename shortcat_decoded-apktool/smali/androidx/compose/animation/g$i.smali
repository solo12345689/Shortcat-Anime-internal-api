.class final Landroidx/compose/animation/g$i;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/g;-><init>(Lw/o0;Lw/o0$a;Lw/o0$a;Lw/o0$a;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lie/a;Lv/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/animation/g;


# direct methods
.method constructor <init>(Landroidx/compose/animation/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/g$i;->a:Landroidx/compose/animation/g;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Lw/o0$b;)Lw/G;
    .locals 3

    .line 1
    sget-object v0, Lv/l;->a:Lv/l;

    .line 2
    .line 3
    sget-object v1, Lv/l;->b:Lv/l;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Lw/o0$b;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Landroidx/compose/animation/g$i;->a:Landroidx/compose/animation/g;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/compose/animation/g;->F1()Landroidx/compose/animation/h;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Landroidx/compose/animation/h;->b()Lv/B;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Lv/B;->a()Lv/h;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p1}, Lv/h;->b()Lw/G;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object v0, Lv/l;->c:Lv/l;

    .line 34
    .line 35
    invoke-interface {p1, v1, v0}, Lw/o0$b;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    iget-object p1, p0, Landroidx/compose/animation/g$i;->a:Landroidx/compose/animation/g;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroidx/compose/animation/g;->G1()Landroidx/compose/animation/j;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lv/B;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lv/B;->a()Lv/h;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1}, Lv/h;->b()Lw/G;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-static {}, Landroidx/compose/animation/f;->d()Lw/h0;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    :cond_2
    :goto_0
    if-nez v2, :cond_3

    .line 67
    .line 68
    invoke-static {}, Landroidx/compose/animation/f;->d()Lw/h0;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :cond_3
    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lw/o0$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/animation/g$i;->a(Lw/o0$b;)Lw/G;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
