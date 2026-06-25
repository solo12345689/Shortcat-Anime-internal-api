.class public final Landroidx/compose/ui/layout/j$f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/compose/ui/layout/C$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/j;->v(Ljava/lang/Object;)Landroidx/compose/ui/layout/C$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Lt/G;

.field final synthetic b:Landroidx/compose/ui/layout/j;

.field final synthetic c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/j;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/layout/j$f;->b:Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/layout/j$f;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lt/r;->b()Lt/G;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Landroidx/compose/ui/layout/j$f;->a:Lt/G;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/j$f;->b:Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/layout/j;->j(Landroidx/compose/ui/layout/j;)Lt/P;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/compose/ui/layout/j$f;->c:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, LK0/J;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, LK0/J;->t0()LK0/c0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-static {v0, p1, p2}, LK0/J0;->e(LK0/j;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public b(IJ)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/j$f;->b:Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/layout/j;->j(Landroidx/compose/ui/layout/j;)Lt/P;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/compose/ui/layout/j$f;->c:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, LK0/J;

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    invoke-virtual {v0}, LK0/J;->b()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    invoke-virtual {v0}, LK0/J;->P()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-ltz p1, :cond_0

    .line 32
    .line 33
    if-lt p1, v1, :cond_1

    .line 34
    .line 35
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v3, "Index ("

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v3, ") is out of bound of [0, "

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const/16 v1, 0x29

    .line 57
    .line 58
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v1}, LH0/a;->d(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-virtual {v0}, LK0/J;->p()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    const-string v1, "Pre-measure called on node that is not placed"

    .line 75
    .line 76
    invoke-static {v1}, LH0/a;->a(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    iget-object v1, p0, Landroidx/compose/ui/layout/j$f;->b:Landroidx/compose/ui/layout/j;

    .line 80
    .line 81
    invoke-static {v1}, Landroidx/compose/ui/layout/j;->k(Landroidx/compose/ui/layout/j;)LK0/J;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const/4 v2, 0x1

    .line 86
    invoke-static {v1, v2}, LK0/J;->v(LK0/J;Z)V

    .line 87
    .line 88
    .line 89
    invoke-static {v0}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v0}, LK0/J;->P()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, LK0/J;

    .line 102
    .line 103
    invoke-interface {v2, v0, p2, p3}, LK0/p0;->s(LK0/J;J)V

    .line 104
    .line 105
    .line 106
    sget-object p2, LTd/L;->a:LTd/L;

    .line 107
    .line 108
    const/4 p2, 0x0

    .line 109
    invoke-static {v1, p2}, LK0/J;->v(LK0/J;Z)V

    .line 110
    .line 111
    .line 112
    iget-object p2, p0, Landroidx/compose/ui/layout/j$f;->a:Lt/G;

    .line 113
    .line 114
    invoke-virtual {p2, p1}, Lt/G;->g(I)Z

    .line 115
    .line 116
    .line 117
    :cond_3
    return-void
.end method

.method public dispose()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/j$f;->b:Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/ui/layout/j$f;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/compose/ui/layout/j;->d(Landroidx/compose/ui/layout/j;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public g()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/j$f;->b:Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/layout/j;->j(Landroidx/compose/ui/layout/j;)Lt/P;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/compose/ui/layout/j$f;->c:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, LK0/J;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, LK0/J;->P()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    return v0
.end method
