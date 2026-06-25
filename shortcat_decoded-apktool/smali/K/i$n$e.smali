.class final LK/i$n$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/i$n;->invoke(LR0/C;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:La1/J;

.field final synthetic b:Z

.field final synthetic c:La1/U;

.field final synthetic d:LQ/F;

.field final synthetic e:LK/y;


# direct methods
.method constructor <init>(La1/J;ZLa1/U;LQ/F;LK/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$n$e;->a:La1/J;

    .line 2
    .line 3
    iput-boolean p2, p0, LK/i$n$e;->b:Z

    .line 4
    .line 5
    iput-object p3, p0, LK/i$n$e;->c:La1/U;

    .line 6
    .line 7
    iput-object p4, p0, LK/i$n$e;->d:LQ/F;

    .line 8
    .line 9
    iput-object p5, p0, LK/i$n$e;->e:LK/y;

    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(IIZ)Ljava/lang/Boolean;
    .locals 8

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, LK/i$n$e;->a:La1/J;

    .line 5
    .line 6
    invoke-interface {v0, p1}, La1/J;->a(I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    :goto_0
    if-eqz p3, :cond_1

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_1
    iget-object v0, p0, LK/i$n$e;->a:La1/J;

    .line 14
    .line 15
    invoke-interface {v0, p2}, La1/J;->a(I)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    :goto_1
    iget-boolean v0, p0, LK/i$n$e;->b:Z

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    goto :goto_4

    .line 25
    :cond_2
    iget-object v0, p0, LK/i$n$e;->c:La1/U;

    .line 26
    .line 27
    invoke-virtual {v0}, La1/U;->k()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    invoke-static {v2, v3}, LU0/W0;->n(J)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-ne p1, v0, :cond_3

    .line 36
    .line 37
    iget-object v0, p0, LK/i$n$e;->c:La1/U;

    .line 38
    .line 39
    invoke-virtual {v0}, La1/U;->k()J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    invoke-static {v2, v3}, LU0/W0;->i(J)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-ne p2, v0, :cond_3

    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_3
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-ltz v0, :cond_6

    .line 55
    .line 56
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v2, p0, LK/i$n$e;->c:La1/U;

    .line 61
    .line 62
    invoke-virtual {v2}, La1/U;->i()LU0/e;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, LU0/e;->length()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-gt v0, v2, :cond_6

    .line 71
    .line 72
    const/4 v0, 0x1

    .line 73
    if-nez p3, :cond_5

    .line 74
    .line 75
    if-ne p1, p2, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    iget-object p3, p0, LK/i$n$e;->d:LQ/F;

    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    invoke-static {p3, v1, v0, v2}, LQ/F;->w(LQ/F;ZILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_5
    :goto_2
    iget-object p3, p0, LK/i$n$e;->d:LQ/F;

    .line 86
    .line 87
    invoke-virtual {p3}, LQ/F;->x()V

    .line 88
    .line 89
    .line 90
    :goto_3
    iget-object p3, p0, LK/i$n$e;->e:LK/y;

    .line 91
    .line 92
    invoke-virtual {p3}, LK/y;->m()Lkotlin/jvm/functions/Function1;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    new-instance v1, La1/U;

    .line 97
    .line 98
    iget-object v2, p0, LK/i$n$e;->c:La1/U;

    .line 99
    .line 100
    invoke-virtual {v2}, La1/U;->i()LU0/e;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-static {p1, p2}, LU0/X0;->b(II)J

    .line 105
    .line 106
    .line 107
    move-result-wide v3

    .line 108
    const/4 v6, 0x4

    .line 109
    const/4 v7, 0x0

    .line 110
    const/4 v5, 0x0

    .line 111
    invoke-direct/range {v1 .. v7}, La1/U;-><init>(LU0/e;JLU0/W0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move v1, v0

    .line 118
    goto :goto_4

    .line 119
    :cond_6
    iget-object p1, p0, LK/i$n$e;->d:LQ/F;

    .line 120
    .line 121
    invoke-virtual {p1}, LQ/F;->x()V

    .line 122
    .line 123
    .line 124
    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    check-cast p3, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    invoke-virtual {p0, p1, p2, p3}, LK/i$n$e;->a(IIZ)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method
