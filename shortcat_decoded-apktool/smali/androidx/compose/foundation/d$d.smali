.class public final Landroidx/compose/foundation/d$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/d;->e(Landroidx/compose/ui/e;LB/m;Lx/G;ZLjava/lang/String;LR0/h;Ljava/lang/String;Lie/a;Lie/a;Lie/a;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx/G;

.field final synthetic b:Z

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:LR0/h;

.field final synthetic e:Lie/a;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Lie/a;

.field final synthetic h:Lie/a;


# direct methods
.method public constructor <init>(Lx/G;ZLjava/lang/String;LR0/h;Lie/a;Ljava/lang/String;Lie/a;Lie/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/d$d;->a:Lx/G;

    .line 2
    .line 3
    iput-boolean p2, p0, Landroidx/compose/foundation/d$d;->b:Z

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/d$d;->c:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/foundation/d$d;->d:LR0/h;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/foundation/d$d;->e:Lie/a;

    .line 10
    .line 11
    iput-object p6, p0, Landroidx/compose/foundation/d$d;->f:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p7, p0, Landroidx/compose/foundation/d$d;->g:Lie/a;

    .line 14
    .line 15
    iput-object p8, p0, Landroidx/compose/foundation/d$d;->h:Lie/a;

    .line 16
    .line 17
    const/4 p1, 0x3

    .line 18
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LY/m;I)Landroidx/compose/ui/e;
    .locals 11

    .line 1
    const p1, -0x5af0b3b9

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
    const-string v1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)"

    .line 15
    .line 16
    invoke-static {p1, p3, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    sget-object p3, LY/m;->a:LY/m$a;

    .line 24
    .line 25
    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    if-ne p1, p3, :cond_1

    .line 30
    .line 31
    invoke-static {}, LB/l;->a()LB/m;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p2, p1}, LY/m;->u(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    move-object v1, p1

    .line 39
    check-cast v1, LB/m;

    .line 40
    .line 41
    sget-object p1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 42
    .line 43
    iget-object p3, p0, Landroidx/compose/foundation/d$d;->a:Lx/G;

    .line 44
    .line 45
    invoke-static {p1, v1, p3}, Landroidx/compose/foundation/j;->b(Landroidx/compose/ui/e;LB/k;Lx/G;)Landroidx/compose/ui/e;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    new-instance v0, Landroidx/compose/foundation/CombinedClickableElement;

    .line 50
    .line 51
    iget-boolean v3, p0, Landroidx/compose/foundation/d$d;->b:Z

    .line 52
    .line 53
    iget-object v4, p0, Landroidx/compose/foundation/d$d;->c:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v5, p0, Landroidx/compose/foundation/d$d;->d:LR0/h;

    .line 56
    .line 57
    iget-object v6, p0, Landroidx/compose/foundation/d$d;->e:Lie/a;

    .line 58
    .line 59
    iget-object v7, p0, Landroidx/compose/foundation/d$d;->f:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v8, p0, Landroidx/compose/foundation/d$d;->g:Lie/a;

    .line 62
    .line 63
    iget-object v9, p0, Landroidx/compose/foundation/d$d;->h:Lie/a;

    .line 64
    .line 65
    const/4 v10, 0x0

    .line 66
    const/4 v2, 0x0

    .line 67
    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/CombinedClickableElement;-><init>(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;Ljava/lang/String;Lie/a;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {}, LY/w;->L()Z

    .line 75
    .line 76
    .line 77
    move-result p3

    .line 78
    if-eqz p3, :cond_2

    .line 79
    .line 80
    invoke-static {}, LY/w;->T()V

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-interface {p2}, LY/m;->O()V

    .line 84
    .line 85
    .line 86
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
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/d$d;->a(Landroidx/compose/ui/e;LY/m;I)Landroidx/compose/ui/e;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
