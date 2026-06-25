.class final Landroidx/compose/animation/g$j;
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
    iput-object p1, p0, Landroidx/compose/animation/g$j;->a:Landroidx/compose/animation/g;

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
    .locals 2

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
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-object p1, p0, Landroidx/compose/animation/g$j;->a:Landroidx/compose/animation/g;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/compose/animation/g;->F1()Landroidx/compose/animation/h;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroidx/compose/animation/h;->b()Lv/B;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lv/B;->f()Lv/x;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1}, Lv/x;->a()Lw/G;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-object p1

    .line 35
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/animation/f;->c()Lw/h0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_2
    sget-object v0, Lv/l;->c:Lv/l;

    .line 41
    .line 42
    invoke-interface {p1, v1, v0}, Lw/o0$b;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_5

    .line 47
    .line 48
    iget-object p1, p0, Landroidx/compose/animation/g$j;->a:Landroidx/compose/animation/g;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroidx/compose/animation/g;->G1()Landroidx/compose/animation/j;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lv/B;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Lv/B;->f()Lv/x;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    invoke-virtual {p1}, Lv/x;->a()Lw/G;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-nez p1, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    return-object p1

    .line 72
    :cond_4
    :goto_1
    invoke-static {}, Landroidx/compose/animation/f;->c()Lw/h0;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    :cond_5
    invoke-static {}, Landroidx/compose/animation/f;->c()Lw/h0;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lw/o0$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/animation/g$j;->a(Lw/o0$b;)Lw/G;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
