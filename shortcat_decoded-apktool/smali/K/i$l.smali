.class final LK/i$l;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/i;->a(La1/U;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LU0/Y0;La1/f0;Lkotlin/jvm/functions/Function1;LB/m;Ls0/h0;ZIILa1/t;LK/w;ZZLie/o;LY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK/y;

.field final synthetic b:Landroidx/compose/ui/focus/k;

.field final synthetic c:Z

.field final synthetic d:Z

.field final synthetic e:LQ/F;

.field final synthetic f:La1/J;


# direct methods
.method constructor <init>(LK/y;Landroidx/compose/ui/focus/k;ZZLQ/F;La1/J;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$l;->a:LK/y;

    .line 2
    .line 3
    iput-object p2, p0, LK/i$l;->b:Landroidx/compose/ui/focus/k;

    .line 4
    .line 5
    iput-boolean p3, p0, LK/i$l;->c:Z

    .line 6
    .line 7
    iput-boolean p4, p0, LK/i$l;->d:Z

    .line 8
    .line 9
    iput-object p5, p0, LK/i$l;->e:LQ/F;

    .line 10
    .line 11
    iput-object p6, p0, LK/i$l;->f:La1/J;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 8

    .line 1
    iget-object v0, p0, LK/i$l;->a:LK/y;

    .line 2
    .line 3
    iget-object v1, p0, LK/i$l;->b:Landroidx/compose/ui/focus/k;

    .line 4
    .line 5
    iget-boolean v2, p0, LK/i$l;->c:Z

    .line 6
    .line 7
    xor-int/lit8 v2, v2, 0x1

    .line 8
    .line 9
    invoke-static {v0, v1, v2}, LK/i;->l(LK/y;Landroidx/compose/ui/focus/k;Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LK/i$l;->a:LK/y;

    .line 13
    .line 14
    invoke-virtual {v0}, LK/y;->e()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-boolean v0, p0, LK/i$l;->d:Z

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, LK/i$l;->a:LK/y;

    .line 25
    .line 26
    invoke-virtual {v0}, LK/y;->d()LK/m;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v1, LK/m;->b:LK/m;

    .line 31
    .line 32
    if-eq v0, v1, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, LK/i$l;->a:LK/y;

    .line 35
    .line 36
    invoke-virtual {v0}, LK/y;->j()LK/Z;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, LK/i$l;->a:LK/y;

    .line 43
    .line 44
    iget-object v6, p0, LK/i$l;->f:La1/J;

    .line 45
    .line 46
    sget-object v1, LK/L;->a:LK/L$a;

    .line 47
    .line 48
    invoke-virtual {v0}, LK/y;->n()La1/l;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v0}, LK/y;->m()Lkotlin/jvm/functions/Function1;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    move-wide v2, p1

    .line 57
    invoke-virtual/range {v1 .. v7}, LK/L$a;->j(JLK/Z;La1/l;La1/J;Lkotlin/jvm/functions/Function1;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, LK/y;->v()LK/H;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, LK/H;->k()LU0/e;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-lez p1, :cond_0

    .line 73
    .line 74
    sget-object p1, LK/m;->c:LK/m;

    .line 75
    .line 76
    invoke-virtual {v0, p1}, LK/y;->B(LK/m;)V

    .line 77
    .line 78
    .line 79
    :cond_0
    return-void

    .line 80
    :cond_1
    move-wide v2, p1

    .line 81
    iget-object p1, p0, LK/i$l;->e:LQ/F;

    .line 82
    .line 83
    invoke-static {v2, v3}, Lr0/f;->d(J)Lr0/f;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p1, p2}, LQ/F;->t(Lr0/f;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lr0/f;

    .line 2
    .line 3
    invoke-virtual {p1}, Lr0/f;->u()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p0, v0, v1}, LK/i$l;->a(J)V

    .line 8
    .line 9
    .line 10
    sget-object p1, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    return-object p1
.end method
