.class final Landroidx/compose/foundation/d$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/d;->c(Landroidx/compose/ui/e;ZLjava/lang/String;LR0/h;Lie/a;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:LR0/h;

.field final synthetic d:Lie/a;


# direct methods
.method constructor <init>(ZLjava/lang/String;LR0/h;Lie/a;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/d$a;->a:Z

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/d$a;->b:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/d$a;->c:LR0/h;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/foundation/d$a;->d:Lie/a;

    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LY/m;I)Landroidx/compose/ui/e;
    .locals 7

    .line 1
    const p1, -0x2d10e1f7

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, p1}, LY/m;->V(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, LY/w;->L()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    const-string v1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:112)"

    .line 15
    .line 16
    invoke-static {p1, p3, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {}, Landroidx/compose/foundation/j;->a()LY/b1;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p2, p1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    move-object v2, p1

    .line 28
    check-cast v2, Lx/G;

    .line 29
    .line 30
    instance-of p1, v2, Lx/I;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    const p1, 0x24c8cff8

    .line 35
    .line 36
    .line 37
    invoke-interface {p2, p1}, LY/m;->V(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p2}, LY/m;->O()V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    :goto_0
    move-object v1, p1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const p1, 0x24ca75bd

    .line 47
    .line 48
    .line 49
    invoke-interface {p2, p1}, LY/m;->V(I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    sget-object p3, LY/m;->a:LY/m$a;

    .line 57
    .line 58
    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    if-ne p1, p3, :cond_2

    .line 63
    .line 64
    invoke-static {}, LB/l;->a()LB/m;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-interface {p2, p1}, LY/m;->u(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    check-cast p1, LB/m;

    .line 72
    .line 73
    invoke-interface {p2}, LY/m;->O()V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :goto_1
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 78
    .line 79
    iget-boolean v3, p0, Landroidx/compose/foundation/d$a;->a:Z

    .line 80
    .line 81
    iget-object v4, p0, Landroidx/compose/foundation/d$a;->b:Ljava/lang/String;

    .line 82
    .line 83
    iget-object v5, p0, Landroidx/compose/foundation/d$a;->c:LR0/h;

    .line 84
    .line 85
    iget-object v6, p0, Landroidx/compose/foundation/d$a;->d:Lie/a;

    .line 86
    .line 87
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/d;->a(Landroidx/compose/ui/e;LB/m;Lx/G;ZLjava/lang/String;LR0/h;Lie/a;)Landroidx/compose/ui/e;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {}, LY/w;->L()Z

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    if-eqz p3, :cond_3

    .line 96
    .line 97
    invoke-static {}, LY/w;->T()V

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-interface {p2}, LY/m;->O()V

    .line 101
    .line 102
    .line 103
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/e;

    .line 2
    .line 3
    check-cast p2, LY/m;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/d$a;->a(Landroidx/compose/ui/e;LY/m;I)Landroidx/compose/ui/e;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
