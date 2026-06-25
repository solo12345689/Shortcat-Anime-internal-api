.class public final Landroidx/compose/ui/layout/j$d;
.super LK0/J$f;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/j;->t(Lkotlin/jvm/functions/Function2;)LI0/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/compose/ui/layout/j;

.field final synthetic c:Lkotlin/jvm/functions/Function2;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/j;Lkotlin/jvm/functions/Function2;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/layout/j$d;->b:Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/layout/j$d;->c:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    invoke-direct {p0, p3}, LK0/J$f;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
    .locals 1

    .line 1
    iget-object p2, p0, Landroidx/compose/ui/layout/j$d;->b:Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    invoke-static {p2}, Landroidx/compose/ui/layout/j;->l(Landroidx/compose/ui/layout/j;)Landroidx/compose/ui/layout/j$c;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {p1}, LI0/m;->getLayoutDirection()Li1/t;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p2, v0}, Landroidx/compose/ui/layout/j$c;->p(Li1/t;)V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Landroidx/compose/ui/layout/j$d;->b:Landroidx/compose/ui/layout/j;

    .line 15
    .line 16
    invoke-static {p2}, Landroidx/compose/ui/layout/j;->l(Landroidx/compose/ui/layout/j;)Landroidx/compose/ui/layout/j$c;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-interface {p1}, Li1/d;->getDensity()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p2, v0}, Landroidx/compose/ui/layout/j$c;->b(F)V

    .line 25
    .line 26
    .line 27
    iget-object p2, p0, Landroidx/compose/ui/layout/j$d;->b:Landroidx/compose/ui/layout/j;

    .line 28
    .line 29
    invoke-static {p2}, Landroidx/compose/ui/layout/j;->l(Landroidx/compose/ui/layout/j;)Landroidx/compose/ui/layout/j$c;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-interface {p1}, Li1/l;->j1()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p2, v0}, Landroidx/compose/ui/layout/j$c;->j(F)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, LI0/m;->k0()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    const/4 p2, 0x0

    .line 45
    if-nez p1, :cond_0

    .line 46
    .line 47
    iget-object p1, p0, Landroidx/compose/ui/layout/j$d;->b:Landroidx/compose/ui/layout/j;

    .line 48
    .line 49
    invoke-static {p1}, Landroidx/compose/ui/layout/j;->k(Landroidx/compose/ui/layout/j;)LK0/J;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, LK0/J;->j0()LK0/J;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    iget-object p1, p0, Landroidx/compose/ui/layout/j$d;->b:Landroidx/compose/ui/layout/j;

    .line 60
    .line 61
    invoke-static {p1, p2}, Landroidx/compose/ui/layout/j;->n(Landroidx/compose/ui/layout/j;I)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Landroidx/compose/ui/layout/j$d;->c:Lkotlin/jvm/functions/Function2;

    .line 65
    .line 66
    iget-object p2, p0, Landroidx/compose/ui/layout/j$d;->b:Landroidx/compose/ui/layout/j;

    .line 67
    .line 68
    invoke-static {p2}, Landroidx/compose/ui/layout/j;->f(Landroidx/compose/ui/layout/j;)Landroidx/compose/ui/layout/j$a;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-static {p3, p4}, Li1/b;->a(J)Li1/b;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    invoke-interface {p1, p2, p3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, LI0/C;

    .line 81
    .line 82
    iget-object p2, p0, Landroidx/compose/ui/layout/j$d;->b:Landroidx/compose/ui/layout/j;

    .line 83
    .line 84
    invoke-static {p2}, Landroidx/compose/ui/layout/j;->g(Landroidx/compose/ui/layout/j;)I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    iget-object p3, p0, Landroidx/compose/ui/layout/j$d;->b:Landroidx/compose/ui/layout/j;

    .line 89
    .line 90
    new-instance p4, Landroidx/compose/ui/layout/j$d$a;

    .line 91
    .line 92
    invoke-direct {p4, p1, p3, p2, p1}, Landroidx/compose/ui/layout/j$d$a;-><init>(LI0/C;Landroidx/compose/ui/layout/j;ILI0/C;)V

    .line 93
    .line 94
    .line 95
    return-object p4

    .line 96
    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/layout/j$d;->b:Landroidx/compose/ui/layout/j;

    .line 97
    .line 98
    invoke-static {p1, p2}, Landroidx/compose/ui/layout/j;->o(Landroidx/compose/ui/layout/j;I)V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Landroidx/compose/ui/layout/j$d;->c:Lkotlin/jvm/functions/Function2;

    .line 102
    .line 103
    iget-object p2, p0, Landroidx/compose/ui/layout/j$d;->b:Landroidx/compose/ui/layout/j;

    .line 104
    .line 105
    invoke-static {p2}, Landroidx/compose/ui/layout/j;->l(Landroidx/compose/ui/layout/j;)Landroidx/compose/ui/layout/j$c;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-static {p3, p4}, Li1/b;->a(J)Li1/b;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    invoke-interface {p1, p2, p3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, LI0/C;

    .line 118
    .line 119
    iget-object p2, p0, Landroidx/compose/ui/layout/j$d;->b:Landroidx/compose/ui/layout/j;

    .line 120
    .line 121
    invoke-static {p2}, Landroidx/compose/ui/layout/j;->i(Landroidx/compose/ui/layout/j;)I

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    iget-object p3, p0, Landroidx/compose/ui/layout/j$d;->b:Landroidx/compose/ui/layout/j;

    .line 126
    .line 127
    new-instance p4, Landroidx/compose/ui/layout/j$d$b;

    .line 128
    .line 129
    invoke-direct {p4, p1, p3, p2, p1}, Landroidx/compose/ui/layout/j$d$b;-><init>(LI0/C;Landroidx/compose/ui/layout/j;ILI0/C;)V

    .line 130
    .line 131
    .line 132
    return-object p4
.end method
