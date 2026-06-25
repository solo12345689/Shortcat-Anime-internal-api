.class final Landroidx/compose/animation/f$i;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/f;->e(Lw/o0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;LY/m;I)Lv/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/animation/f$i$a;
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/graphics/j;

.field final synthetic b:Landroidx/compose/animation/h;

.field final synthetic c:Landroidx/compose/animation/j;


# direct methods
.method constructor <init>(Landroidx/compose/ui/graphics/j;Landroidx/compose/animation/h;Landroidx/compose/animation/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/f$i;->a:Landroidx/compose/ui/graphics/j;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/f$i;->b:Landroidx/compose/animation/h;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/animation/f$i;->c:Landroidx/compose/animation/j;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lv/l;)J
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/animation/f$i$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p1, v0, :cond_4

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eq p1, v0, :cond_2

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Landroidx/compose/animation/f$i;->c:Landroidx/compose/animation/j;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lv/B;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lv/B;->e()Lv/u;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    :goto_0
    invoke-virtual {p1}, Lv/u;->c()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/j;->b(J)Landroidx/compose/ui/graphics/j;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    goto :goto_2

    .line 40
    :cond_0
    iget-object p1, p0, Landroidx/compose/animation/f$i;->b:Landroidx/compose/animation/h;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/compose/animation/h;->b()Lv/B;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lv/B;->e()Lv/u;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz p1, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    new-instance p1, LTd/r;

    .line 54
    .line 55
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    iget-object p1, p0, Landroidx/compose/animation/f$i;->b:Landroidx/compose/animation/h;

    .line 60
    .line 61
    invoke-virtual {p1}, Landroidx/compose/animation/h;->b()Lv/B;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lv/B;->e()Lv/u;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    :goto_1
    invoke-virtual {p1}, Lv/u;->c()J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/j;->b(J)Landroidx/compose/ui/graphics/j;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    iget-object p1, p0, Landroidx/compose/animation/f$i;->c:Landroidx/compose/animation/j;

    .line 81
    .line 82
    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lv/B;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1}, Lv/B;->e()Lv/u;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    iget-object v1, p0, Landroidx/compose/animation/f$i;->a:Landroidx/compose/ui/graphics/j;

    .line 94
    .line 95
    :cond_5
    :goto_2
    if-eqz v1, :cond_6

    .line 96
    .line 97
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/j;->j()J

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    return-wide v0

    .line 102
    :cond_6
    sget-object p1, Landroidx/compose/ui/graphics/j;->b:Landroidx/compose/ui/graphics/j$a;

    .line 103
    .line 104
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/j$a;->a()J

    .line 105
    .line 106
    .line 107
    move-result-wide v0

    .line 108
    return-wide v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lv/l;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/animation/f$i;->a(Lv/l;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/j;->b(J)Landroidx/compose/ui/graphics/j;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
